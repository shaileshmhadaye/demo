package com.example.demo;

import com.jcraft.jsch.*;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SFTPUtil {

    public static File getFile(String filename, String filepath) {
        String LOCAL_DIRECTORY = "src/main/resources/remoteFiles/";
        ChannelSftp channelSftp = null;
        File targetFile;
        try {
            channelSftp = setupJsch();
            channelSftp.connect();
            String remoteDocPath;
            remoteDocPath = filepath + "/" + filename;
            channelSftp.get(remoteDocPath, LOCAL_DIRECTORY + filename);
            targetFile = new File(LOCAL_DIRECTORY + filename);
            return targetFile;

        } catch (JSchException | SftpException e){
            e.printStackTrace();
            return null;
        } finally {
            channelSftp.exit();
        }
    }

    private static ChannelSftp setupJsch() throws JSchException {
        String HOST_NAME = PropertyReader.getUrlString("sftp.hostName");
        String USER_NAME = PropertyReader.getUrlString("sftp.userName");
        String PASSWORD = PropertyReader.getUrlString("sftp.password");
        System.out.println("host name="+HOST_NAME);
        System.out.println("username - "+USER_NAME);
        System.out.println("password="+PASSWORD);
        JSch jsch = new JSch();
//        jsch.setKnownHosts("src/main/resources/known_hosts");
        Session jschSession = jsch.getSession(USER_NAME, HOST_NAME);
        jschSession.setPassword(PASSWORD);
        jschSession.setConfig("StrictHostKeyChecking", "no");
        jschSession.setPort(990);
        jschSession.connect();
        return (ChannelSftp) jschSession.openChannel("sftp");
    }

    public static String moveDocument(String fileName, String filePath) throws IOException {

        String PERMANENT_DIRECTORY = "test/permanent/";
        String TEMP_LOCAL_DIRECTORY = "src/main/resources/remoteFiles/";

        String[] folders = fileName.split("/");
        String actualFolder = folders[0];
        Files.createDirectories(Paths.get(TEMP_LOCAL_DIRECTORY+actualFolder));
        File file = new File(TEMP_LOCAL_DIRECTORY+actualFolder);

        System.out.println("fileName===="+fileName);
        System.out.println("filePath===="+filePath);
        ChannelSftp channelSftp = null;

        try {
            channelSftp = setupJsch();
            channelSftp.connect();
            if (channelSftp.get(filePath) != null){

                /*channelSftp.rename(PERMANENT_DIRECTORY + "temp/" + fileName ,
                        PERMANENT_DIRECTORY +"permanent/" +fileName );
                channelSftp.cd(PERMANENT_DIRECTORY);*/
                //channelSftp.rm(existingfile );
                channelSftp.get(filePath, TEMP_LOCAL_DIRECTORY + fileName);
                File file1 = new File(TEMP_LOCAL_DIRECTORY + fileName);
                System.out.println(file1);
                channelSftp.cd(PERMANENT_DIRECTORY);
                try {
                    channelSftp.cd(actualFolder);
                    channelSftp.cd("..");
                } catch (SftpException e) {
                    channelSftp.mkdir(actualFolder);
                }

                channelSftp.cd("..");
                channelSftp.cd("..");
                System.out.println(channelSftp.lpwd()+" "+channelSftp.pwd());

                System.out.println("source path==="+TEMP_LOCAL_DIRECTORY + fileName);
                System.out.println("destination path===="+PERMANENT_DIRECTORY + fileName);
                channelSftp.put(new FileInputStream(file1),
                        PERMANENT_DIRECTORY + fileName);
                channelSftp.cd(PERMANENT_DIRECTORY);
                return "1";
            }

        } catch (JSchException | SftpException | FileNotFoundException e){
            e.printStackTrace();
        } finally {
            channelSftp.exit();
            FileUtils.deleteDirectory(file);
        }
        return "document file not found";
    }


    public static String sendFile(String fileName, String filePath) throws IOException {

        String PERMANENT_DIRECTORY = "/home/";
        String TEMP_LOCAL_DIRECTORY = "/home/neosoft/";
        ChannelSftp channelSftp = null;
        fileName = "test.csv";
        System.out.println("started SFTP action----"+fileName);
        try {
            channelSftp = setupJsch();
            channelSftp.connect();
            File file1 = new File(TEMP_LOCAL_DIRECTORY + fileName);
            channelSftp.put(new FileInputStream(file1),
                    PERMANENT_DIRECTORY + fileName);
            channelSftp.cd(PERMANENT_DIRECTORY);
            System.out.println("file sent successfully");
            return "1";

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if (channelSftp != null) {
                channelSftp.exit();
            }
        }
        return "document file not found";
    }

}
