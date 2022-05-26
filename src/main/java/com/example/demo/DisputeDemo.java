package com.example.demo;

import com.example.demo.config.DisputeFileDto;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Iterator;

public class DisputeDemo {

    public static void main(String[] args) throws FileNotFoundException {
        File disputeFile = new File("/home/webwerks/Desktop/All_Disputes0062222510101000.csv");
        Reader reader = new FileReader(disputeFile);

        CsvToBean<DisputeFileDto> csvToBean = new CsvToBeanBuilder(reader).withType(DisputeFileDto.class)
                .withIgnoreLeadingWhiteSpace(true).build();

        System.out.println("Mapping done in the respective POJO");

        Iterator<DisputeFileDto> iterator = csvToBean.iterator();
        while (iterator.hasNext()) {
            DisputeFileDto disputeFileDto = iterator.next();
            System.out.println(disputeFileDto);

            System.out.println("After successfully inserting dispute adjustment table..");

        }
    }
}
