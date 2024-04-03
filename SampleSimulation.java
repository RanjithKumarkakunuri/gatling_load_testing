//package com.olive.gatlingdemo;
//
//
//
//import static io.gatling.javaapi.core.CoreDsl.StringBody;
//import static io.gatling.javaapi.core.CoreDsl.global;
//import static io.gatling.javaapi.core.CoreDsl.rampUsersPerSec;
//import static io.gatling.javaapi.http.HttpDsl.http;
//import static io.gatling.javaapi.http.HttpDsl.status;
//
//import java.time.Duration;
//import java.util.Random;
//
////import com.github.javafaker.Faker;
//
//import io.gatling.javaapi.core.CoreDsl;
//import io.gatling.javaapi.core.OpenInjectionStep.RampRate.RampRateOpenInjectionStep;
//import io.gatling.javaapi.core.ScenarioBuilder;
//import io.gatling.javaapi.core.Simulation;
//import io.gatling.javaapi.http.HttpDsl;
//import io.gatling.javaapi.http.HttpProtocolBuilder;
//
//public class SampleSimulation extends Simulation {
//	private static String cachedRRN = null;
//    private static final HttpProtocolBuilder HTTP_PROTOCOL_BUILDER = setupProtocolForSimulation();
//
//   // private static final Iterator<Map<String, Object>> FEED_DATA = setupTestFeedData();
//
//    private static final ScenarioBuilder POST_SCENARIO_BUILDER = buildPostScenario();
//    
//  //  private static String rrn=DateUtil.generaterrn();
//  //  private String rrn;
//    
//    
//    public SampleSimulation() {
//    	 //this.rrn = DateUtil.generaterrn();
//           setUp(POST_SCENARIO_BUILDER.injectOpen(postEndpointInjectionProfile())
//          .protocols(HTTP_PROTOCOL_BUILDER)).assertions(global().responseTime()
//          .max()
//          .lte(1000000), global().successfulRequests()
//          .percent()
//          .gt(90d));
//    }
//
//    private RampRateOpenInjectionStep postEndpointInjectionProfile() {
//        int totalDesiredUserCount = 100; // Total desired users set to match the desired TPS
//        double rampUpIntervalSeconds = 1; // Ramp up interval set to 1 second
//
//        double usersPerSecond = calculateUsersPerSecond(totalDesiredUserCount, rampUpIntervalSeconds);
//
//        return rampUsersPerSec(usersPerSecond).to(totalDesiredUserCount)
//                .during(Duration.ofMinutes(5)); // Duration adjusted as needed
//    }
//
//    private double calculateUsersPerSecond(int totalDesiredUserCount, double rampUpIntervalSeconds) {
//        return totalDesiredUserCount / rampUpIntervalSeconds;
//    }
//
//
//    private static HttpProtocolBuilder setupProtocolForSimulation() {
//        return HttpDsl.http.baseUrl("https://localhost:8123")
//    	//return HttpDsl.http.baseUrl("http://localhost:8081")
//          .acceptHeader("application/xml")
//          .maxConnectionsPerHost(500)
//          .userAgentHeader("Gatling/Performance Test AuthRequest");
//    }
//    
//    
//    
//
////    private static Iterator<Map<String, Object>> setupTestFeedData() {
////        Iterator<Map<String, Object>> iterator;
////        iterator = Stream.generate(() -> {
////              Map<String, Object> stringObjectMap = new HashMap<>();
////          	String generaterrn = DateUtil.generaterrn();
////              stringObjectMap.put("generaterrn", generaterrn);
////              return stringObjectMap;
////          })
////          .iterator();
////        return iterator;
////    }
//
//    
//    
//    private static ScenarioBuilder buildPostScenario() {
//       
//						return CoreDsl.scenario("Load Test Creating User")
//						//  .feed(FEED_DATA)
//						  //.exec(http("create-txn-request").post("/xml")
//								  .exec(http("create-txn-request").post("/aeps/Onus/BalanceEnquiry")
//						    .header("Content-Type", "application/xml")
//						    //.body(StringBody("<SampleXMLRequest><name>John</name></SampleXMLRequest>"))
//						    .body(StringBody(authRequestProcess()))
//						    .check(status().is(200)));
//						
//						
//				
//    }
//
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
////    public static String testCase() {
////		int[] numbers = {000013, 000014, 000015}; // Example sequence of numbers
////		String paddedNumber=null;
////        // Loop through the array and print each value
////        for (int i = 0; i < numbers.length; i++) {
////            // Pad the value with leading zeros if needed
////             paddedNumber = String.format("%06d", numbers[i]);
////            System.out.println(paddedNumber);
////            
////        }
////        return paddedNumber;
////		
////	}
//	public static String authRequestProcess() {
//		//String generaterrn = DateUtil.generaterrn();
////		String stan = String.valueOf(System.currentTimeMillis() % 1000000);
////		Date date=new Date();
////		String jd=ISODate.getJulianDate(date);
////		String gmt =  ISODate.getDateTime(date,TimeZone.getTimeZone("IST") ) ;
////		String rrn= jd+gmt.substring(4,6)+ISOUtil.zeropad(stan,6);
//		String authRequest="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\r\n"
//				+ "<AuthRequest>\r\n"
//				+ "    <TransactionInfo>\r\n"
//				+ "        <Pan>00001329152182911025555</Pan>\r\n"
//				+ "        <Proc_Code>310000</Proc_Code>\r\n"
//				+ "        <Amount>000000000000</Amount>\r\n"
//				+ "        <Transm_Date_time>0401092814</Transm_Date_time>\r\n"
//				+ "        <Stan>"+generateRRN()+"</Stan>\r\n"
//				+ "        <Local_Trans_Time>145814</Local_Trans_Time>\r\n"
//				+ "        <Local_date>0401</Local_date>\r\n"
//				+ "        <Mcc>6012</Mcc>\r\n"
//				+ "        <Pos_entry_mode>019</Pos_entry_mode>\r\n"
//				+ "        <Pos_code>05</Pos_code>\r\n"
//				+ "        <AcqId>202020</AcqId>\r\n"
//				+ "        <RRN>409412"+generateRRN()+"</RRN>\r\n"
//				+ "        <Iin>607198</Iin>\r\n"
//				+ "        <CA_Tid>register</CA_Tid>\r\n"
//				+ "        <CA_ID>KTK000008050102</CA_ID>\r\n"
//				+ "        <CA_TA>FINGPAY00000005                        1</CA_TA>\r\n"
//				+ "        <Vendor_Code>FPY</Vendor_Code>\r\n"
//				+ "        <Txn_Type>Balance Enquiry</Txn_Type>\r\n"
//				+ "        <Consent>Y</Consent>\r\n"
//				+ "        <ConsentVer>V_1.1</ConsentVer>\r\n"
//				+ "        <Checksum>2224032903</Checksum>\r\n"
//				+ "        <Source_IP>10.10.10.10</Source_IP>\r\n"
//				+ "    </TransactionInfo>\r\n"
//				+ "    <Auth>\r\n"
//				+ "        <Uses pi=\"N\" pa=\"N\" pfa=\"N\" bio=\"Y\" bt=\"FMR,FIR\" pin=\"N\" otp=\"N\" lot=\"P\" lov=\"500010\" apc=\"31\" apa=\"000000000000\" version=\"2.5\" vid=\"9152182911025555\"/>\r\n"
//				+ "        <Meta udc=\"KTK000008050102\" dpId=\"MANTRA.MSIPL\" rdsId=\"MANTRA.WIN.001\" rdsVer=\"1.0.8\" dc=\"4788310e-18b3-48a1-9926-7b12855ba355\" mi=\"MFS100\" mc=\"MIIEGDCCAwCgAwIBAgIEAOThwDANBgkqhkiG9w0BAQsFADCB6jEqMCgGA1UEAxMhRFMgTUFOVFJBIFNPRlRFQ0ggSU5ESUEgUFZUIExURCAzMVUwUwYDVQQzE0xCLTIwMyBTaGFwYXRoIEhleGEgT3Bwb3NpdGUgR3VqYXJhdCBIaWdoIENvdXJ0IFMuRyBIaWdod2F5IEFobWVkYWJhZCAtMzgwMDYwMRIwEAYDVQQJEwlBSE1FREFCQUQxEDAOBgNVBAgTB0dVSkFSQVQxCzAJBgNVBAsTAklUMSUwIwYDVQQKExxNQU5UUkEgU09GVEVDSCBJTkRJQSBQVlQgTFREMQswCQYDVQQGEwJJTjAeFw0yMzEyMTkxMjAwMjJaFw0yMzEyMjgxMTM2MTVaMIGwMSUwIwYDVQQDExxNYW50cmEgU29mdGVjaCBJbmRpYSBQdnQgTHRkMR4wHAYDVQQLExVCaW9tZXRyaWMgTWFudWZhY3R1cmUxDjAMBgNVBAoTBU1TSVBMMRIwEAYDVQQHEwlBSE1FREFCQUQxEDAOBgNVBAgTB0dVSkFSQVQxCzAJBgNVBAYTAklOMSQwIgYJKoZIhvcNAQkBFhVzdXBwb3J0QG1hbnRyYXRlYy5jb20wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDkH8Uz+CMw6OXGjuAnhw6yaUUfqFqCMt39NzWb0dZeopBX3nE9enpG+Bmm7fABAWF4yEx9QbcudXiSbAEZlHX1PEQNjJgTh82XHcINR+iPLLxALe0PdLlkEVUs1e6Sv7ZHf9jVbJ0lQdgC4mlfI/LBeKOvCUukO4eqpUurEWLN5Vfjo8LFQMnVfxt0eCNX2CWN47BacYHeRf9HPVz8gF4aQe5Jx4hCoxyH9bIdTHBQxoHHIGVTJyoI+TnsYbcsEZX9Ub/I8ya060dP4g3aEmCdPMeX6tE80VcoPXNIef6AQbZQkX1i5YYdPYR6sPMKqy/oJ6PutgycPzx2l3yEiei7AgMBAAEwDQYJKoZIhvcNAQELBQADggEBADrWMt+rM+tp0VA9J5Y118ePLzw2Fbj62hzo91PfWUNfiGermp00Q3AyFXpymzzjdFE7Is8DeuxEOvRAbUw9QYAYRGKBuHcrOKWJly9u5lK6wd0EOb6CDgge3cJKNIWbEoO0fN0eKUPpuJaJlT6tWIRg4Nplk/tluhtzVJMT/ucFQwUlsdSu0WJEni2qj48Fp6LaCVwK1Y7yiGQdPRinLE503B9SVlUIBQgmZfBEtzSfHM7Q9tlm6VEfGMNCgfUrdoW4RSg2f8GrL4WAUf1AwF0krco/k9mSVObF/vajdx9swtAZeUJcNLIc2OwVrlbtqptx27FqA/Q8BxQLWq3s5BE=\"/>\r\n"
//				+ "        <Skey ci=\"20250929\">aHWW4IapV2WfgG4V0Yku6zficVPBuaISnWzkBX1rZiJOal30Us4KP3UvTq8MwWXPJhP00d5ddS0HkYHr3JqQ4A7Yw9iyylA0lHcyJDGeA0Hb+uartRxvrgfJF7jQjHEN6oxudTLUgciA7FYdxHVbBzYI3gqhurCgDlBTzp1emCjrLK2yOXZkDCcF9+jJmC0RUM88fhE1YzSDmnZHjeIBD0SrdO2ouKUqQjauXsnZRjhW3FyXbz5KnG1Hg8W6IkvzfX9KSqMWklbqYF4wpziTdguwH4HCyZPU13r40zUTjIbJ2Pe44qFX9nOOi+nVE3pOhTsjYgND/rLqGD2aYX8kyw==</Skey>\r\n"
//				+ "        <Data type=\"X\">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</Data>\r\n"
//				+ "        <Hmac>duGbWrTRh93A6k5C9Li02vevwgATYJmgqsEPRwRxKfHQkdXwk9JnyKko6wvFTc+s</Hmac>\r\n"
//				+ "    </Auth>\r\n"
//				+ "</AuthRequest>";
//		// TODO Auto-generated method stub
//		return authRequest;
//	}
//	
//	public static String generateRRN() {
//        // If the RRN has already been generated, return the cached value
//        if (cachedRRN != null) {
//            return cachedRRN;
//        }
//        
//        // Generate a new RRN if it hasn't been generated yet
//        Random random = new Random();
//        int randomNumber = random.nextInt(900000) + 100000; // Generates a random number between 100000 and 999999
//        cachedRRN = String.valueOf(randomNumber);
//        System.out.println("Generated RRN: " + cachedRRN);
//        return cachedRRN;
//    }
//
//}