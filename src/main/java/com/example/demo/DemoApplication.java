package com.example.demo;

import com.example.demo.config.CustomerDto;
import com.example.demo.testing.SetVehicleLimitDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import io.github.millij.poi.ss.reader.XlsReader;
import jdk.nashorn.internal.parser.JSONParser;
import org.apache.poi.POIXMLProperties;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("application started");
	}

	@Override
	public void run(String... args) throws Exception {

		/*JSONObject json = new JSONObject();
		json.put("customerId", "c123");
		json.put("walletId", "w123");

		JSONArray jsonArray = new JSONArray();
		for (int i=0; i<2; i++){
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("vehicleId", "12");
			jsonObject.put("usageLimit", "12000");
			jsonObject.put("minLimit", "200");
			jsonObject.put("usageLimitFlag", "1");
			jsonArray.put(jsonObject);
		}

		json.put("vehicleUsageLimit", jsonArray);

		ObjectMapper mapper = new ObjectMapper();
		SetVehicleLimitDTO setVehicleLimitDTO = mapper.readValue(new File("/home/webwerks/Desktop/test.json"), SetVehicleLimitDTO.class);
		System.out.println("pojo==="+setVehicleLimitDTO);*/

		/*File file = new File("/home/webwerks/Desktop/sandip1.csv");
		FileReader reader = new FileReader(file);
		CsvToBean<CustomerDto> csvToBean = new CsvToBeanBuilder(reader).withType(CustomerDto.class)
				.withIgnoreLeadingWhiteSpace(true).build();
		for (CustomerDto customerDto : csvToBean) {
			System.out.println("POJO===" + customerDto);
		}*/

		/*OPCPackage pkg = OPCPackage.open(new File("src/main/resources/Bank_Non-Bank_Customer.xlsx"));
		POIXMLProperties props = new POIXMLProperties(pkg);

		final File xlsxFile = new File("src/main/resources/Bank_Non-Bank_Customer.xlsx");
		System.out.println(xlsxFile);
		final XlsReader reader = new XlsReader();
		List<CustomerDto> employees = reader.read(CustomerDto.class, xlsxFile);

		for (CustomerDto customerDto : employees){
			System.out.println("-=========customer="+customerDto);
		}*/

		/*String moveDocument = SFTPUtil.moveDocument("customer1/abc.jpg", "test/temp/customer1/abc.jpg");
		System.out.println("movedocument ==="+moveDocument);*/

		/*File bulkCustomersAddFile = new File("src/main/resources/test.csv");
		Reader reader = new FileReader(bulkCustomersAddFile);
		CSVReader csvReader = new CSVReader(reader);
		String[] header = csvReader.readNext(); // assuming first read
		if (header != null) {                     // and there is a (header) line
			int columnCount = header.length;       // get the column count
			System.out.println(columnCount);
		}*/
		//sendGet();
		/*System.out.println("new Date="+new Date().getTime());
		System.out.println("current millis="+System.currentTimeMillis());
		System.out.println(new Date().getTime() == System.currentTimeMillis());*/
		//System.out.println(isValidUsername("shailesh@gmail.com"));
		//System.out.println(validateDate("24 10 2020"));

		/*double dbl=10500.3245;
		NumberFormat formatter=NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		String currency=formatter.format(dbl);
		System.out.println(currency+" for the locale "+Locale.US);*/

		/*Calendar calendar = Calendar.getInstance();
		calendar.set(2020, 10,30);
		System.out.println("Day of week:"+calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase());*/

		/*BigInteger a = BigInteger.valueOf(1234);
		BigInteger b = BigInteger.valueOf(20);
		BigInteger addition = a.add(b);
		BigInteger multiplication = a.multiply(b);
		System.out.println("addition="+addition);
		System.out.println("multiplication="+multiplication);*/

		/*final Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);

		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat actualDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = dateFormat.format(cal.getTime());
		String startDate = date + " 00:00:00";
		String endDate = date + " 11:59:59";
		System.out.println(actualDateFormat.parse(startDate));*/
		/*String tranid = "sha_310321-5318";

		System.out.println(tranid.substring(0, tranid.lastIndexOf("-")));
		System.out.println(tranid.contains("-"));*/

		//System.out.println(UUID.randomUUID().toString().replace("-", ""));

		/*String xmlData = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?> <VerifyOutput MerchantID=\"119651\" " +
				"MerchantTxnID=\"1012118313140206549\" AMT=\"5009.44\" VERIFIED=\"SUCCESS\" BID=\"5034900\" " +
				"bankname=\"Punjab & Sind Bank\" atomtxnId=\"11000031013815\" discriminator=\"NB\" surcharge=\"0.00\" " +
				"CardNumber=\"\" TxnDate=\"2021-07-02 13:14:43\" UDF9=\"null\" reconstatus=\"NRNS\" sdt=\"null\" />\n";
		xmlData = validateResp(xmlData);
		System.out.println(xmlData);
		System.out.println(getAttributes(xmlData, "VerifyOutput", "VERIFIED"));*/

		//System.out.println(ValidationUtil.validateAlphaNumWithSplChars("sh= ailesh_==="));

		/*int[] a = new int[]{15, 5, 6, 24, 11, 7, 22};
		int max=a[0], secondMax=a[1];
		for (int i=1; i< a.length; i++){
			if(max < a[i]){
				secondMax = max;
				max = a[i];
			}else if(max != a[i] && secondMax < a[i]){
				secondMax = a[i];
			}
		}
		System.out.println("max="+max+"|sencondMax ="+secondMax);*/


		/*BigDecimal a = new BigDecimal("0.12");
		BigDecimal b = new BigDecimal(".12");
		System.out.println(a.compareTo(b));*/


		/*List<SetVehicleLimitDTO> list = new ArrayList<>();
		SetVehicleLimitDTO setVehicleLimitDTO = new SetVehicleLimitDTO();
		setVehicleLimitDTO.setCustomerId("12");
		setVehicleLimitDTO.setWalletId("32");
		SetVehicleLimitDTO setVehicleLimitDTO1 = new SetVehicleLimitDTO();
		setVehicleLimitDTO1.setCustomerId("13");
		setVehicleLimitDTO1.setWalletId("33");
		list.add(setVehicleLimitDTO1);
		list.add(setVehicleLimitDTO);

		if (list.stream().anyMatch(a -> a.getCustomerId().equals("13"))){
			System.out.println("hello");
		}*/


		/*List<Integer> integers = new ArrayList<>();
		integers.add(3);
		integers.add(6);
		integers.add(7);
		List<Integer> result = integers.stream().filter(integer -> integer%2 != 0).collect(Collectors.toCollection(ArrayList::new));
		result.forEach(System.out::print);*/

		/*DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime date = LocalDateTime.now().minusDays(2);
		System.out.println(date.format(dateTimeFormatter));*/

//		List<Integer> arr = Arrays.asList(256741038,623958417,467905213,714532089,938071625);
//		//plusMinus(arr);
//		//miniMaxSum(arr);
//		timeConversion("07:05:45PM");
		//System.out.println(SFTPUtil.sendFile("",""));
		System.out.println("Test".split(" ")[0]+"@2019");
	}

	private static Date addMinutesToDate(int hours, int minutes, Date beforeTime){
		final long ONE_MINUTE_IN_MILLIS = 60000;//millisecs
		long curTimeInMs = beforeTime.getTime();
		if (hours > 0) {
			return new Date(curTimeInMs + (hours * minutes * ONE_MINUTE_IN_MILLIS));
		}else{
			return new Date(curTimeInMs + (minutes * ONE_MINUTE_IN_MILLIS));
		}
	}

	public static boolean isValidUsername(String name)
	{
		// Regex to check valid username.
		//String regex = "^[a-zA-Z]+( [a-zA-z]+)*$";
		String regex = "^[a-z]+@[a-z]+\\.[a-z]+$";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the username is empty
		// return false
		if (name == null) {
			return false;
		}

		// Pattern class contains matcher() method
		// to find matching between given username
		// and regular expression.
		Matcher m = p.matcher(name.trim());

		// Return if the username
		// matched the ReGex
		return m.matches();
	}

	public boolean validateDate(String date){
		DateFormat sdf = new SimpleDateFormat("dd MM yyyy");
		try {
			Date parsedDate = sdf.parse(date);
			System.out.println(parsedDate);
			System.out.println(parsedDate.getDate());
			if (parsedDate.before(new Date())){
				return true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return false;
	}

	public String getAttributes(String data,String tagName,String attributeName)
	{
		String result = null;
		DocumentBuilder documentBuilder;
		try {
			documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			InputSource inputSource = new InputSource();
			inputSource.setCharacterStream(new StringReader(data));
			Document doc = documentBuilder.parse(inputSource);
			NodeList dataTag = doc.getElementsByTagName(tagName);
			for (int temp = 0; temp < dataTag.getLength(); temp++) {
				Node nNode = dataTag.item(temp);

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					result = eElement.getAttribute(attributeName);
					System.out.println(result);
				}
			}
		} catch (ParserConfigurationException | IOException | SAXException e) {
			e.printStackTrace();
			System.out.println("error message"+e.getMessage());
		}
		return result;
	}

	public static void plusMinus(List<Integer> arr) {
		double positive=0, negative=0, zeros=0;
		for (int number : arr){
			if (number > 0) positive++;
			else if (number < 0) negative++;
			else zeros++;
		}
		System.out.printf("%.6f\n",positive/arr.size());
		System.out.printf("%.6f\n", negative/arr.size());
		System.out.printf("%.6f\n", zeros/arr.size());
	}

	public static void miniMaxSum(List<Integer> arr) {
		int min=arr.get(0);
		int max=min;
		long sum = 0;
		for (int number : arr){
			sum+=number;
			if (number < min)min = number;
			else if (number > max)max = number;
		}
		System.out.println(max+" "+min+" "+sum);
		System.out.println("min sum="+(sum-max) +"| max sum="+(sum-min));
	}

	public static String timeConversion(String s) {
		String convertedTime = null;
		int hour = Integer.parseInt(s.substring(0,2));
		String day = s.substring(s.length()-2);
		if (hour == 12){
			if (day.equals("AM")) convertedTime = "00";
			else convertedTime = "12";
		}
		if (day.equals("PM") && hour != 12){
			hour+=12;
			convertedTime = Integer.toString(hour);
		}
		convertedTime += s.substring(2, s.length()-2);
		System.out.println(convertedTime);
		return convertedTime;
	}

	private String validateResp(String resp) {
		if(resp.contains("&")) {
			resp = resp.replaceAll("&", "&amp;");
		}
		return resp;
	}
}

class Scaler
{
	static int i;

	static
	{
		System.out.println("a");

		i = 100;
	}
}

class StaticBlock
{
	static
	{
		System.out.println("b");
	}

	public static void main(String[] args)
	{
		System.out.println("c");

		System.out.println(Scaler.i);
	}
}
