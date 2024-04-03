package com.olive.gatlingdemo;



import static io.gatling.javaapi.core.CoreDsl.StringBody;
import static io.gatling.javaapi.core.CoreDsl.global;
import static io.gatling.javaapi.core.CoreDsl.rampUsersPerSec;
import static io.gatling.javaapi.http.HttpDsl.http;
import static io.gatling.javaapi.http.HttpDsl.status;

import java.time.Duration;
import java.util.Random;

//import com.github.javafaker.Faker;

import io.gatling.javaapi.core.CoreDsl;
import io.gatling.javaapi.core.OpenInjectionStep.RampRate.RampRateOpenInjectionStep;
import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpDsl;
import io.gatling.javaapi.http.HttpProtocolBuilder;

public class OtpSimulation extends Simulation {
	private static String cachedRRN = null;
    private static final HttpProtocolBuilder HTTP_PROTOCOL_BUILDER = setupProtocolForSimulation();

   // private static final Iterator<Map<String, Object>> FEED_DATA = setupTestFeedData();

    private static final ScenarioBuilder POST_SCENARIO_BUILDER = buildPostScenario();
    
  //  private static String rrn=DateUtil.generaterrn();
  //  private String rrn;
    
    
    public OtpSimulation() {
    	 //this.rrn = DateUtil.generaterrn();
           setUp(POST_SCENARIO_BUILDER.injectOpen(postEndpointInjectionProfile())
          .protocols(HTTP_PROTOCOL_BUILDER)).assertions(global().responseTime()
          .max()
          .lte(1000000), global().successfulRequests()
          .percent()
          .gt(90d));
    }

    private RampRateOpenInjectionStep postEndpointInjectionProfile() {
        int totalDesiredUserCount = 100; // Total desired users set to match the desired TPS
        double rampUpIntervalSeconds = 1; // Ramp up interval set to 1 second

        double usersPerSecond = calculateUsersPerSecond(totalDesiredUserCount, rampUpIntervalSeconds);

        return rampUsersPerSec(usersPerSecond).to(totalDesiredUserCount)
                .during(Duration.ofMinutes(5)); // Duration adjusted as needed
    }

    private double calculateUsersPerSecond(int totalDesiredUserCount, double rampUpIntervalSeconds) {
        return totalDesiredUserCount / rampUpIntervalSeconds;
    }


    private static HttpProtocolBuilder setupProtocolForSimulation() {
        //return HttpDsl.http.baseUrl("https://localhost:8123")
    	return HttpDsl.http.baseUrl("http://localhost:8081")
          .acceptHeader("application/xml")
          .maxConnectionsPerHost(2000)
          .userAgentHeader("Gatling/Performance Test AuthRequest");
    }
    
    
    

//    private static Iterator<Map<String, Object>> setupTestFeedData() {
//        Iterator<Map<String, Object>> iterator;
//        iterator = Stream.generate(() -> {
//              Map<String, Object> stringObjectMap = new HashMap<>();
//          	String generaterrn = DateUtil.generaterrn();
//              stringObjectMap.put("generaterrn", generaterrn);
//              return stringObjectMap;
//          })
//          .iterator();
//        return iterator;
//    }

    
    
    private static ScenarioBuilder buildPostScenario() {
       
						return CoreDsl.scenario("Load Test Creating User")
						//  .feed(FEED_DATA)
						  //.exec(http("create-txn-request").post("/xml")
								  .exec(http("create-txn-request").post("/otp")
						    .header("Content-Type", "application/xml")
						    //.body(StringBody("<SampleXMLRequest><name>John</name></SampleXMLRequest>"))
						    .body(StringBody(otpRequest()))
						    .check(status().is(200)));
						
						
				
    }

    
    
    
    
    
    
    
    
    
    
    
//    public static String testCase() {
//		int[] numbers = {000013, 000014, 000015}; // Example sequence of numbers
//		String paddedNumber=null;
//        // Loop through the array and print each value
//        for (int i = 0; i < numbers.length; i++) {
//            // Pad the value with leading zeros if needed
//             paddedNumber = String.format("%06d", numbers[i]);
//            System.out.println(paddedNumber);
//            
//        }
//        return paddedNumber;
//		
//	}
	public static String otpRequest() {
		//String generaterrn = DateUtil.generaterrn();
//		String stan = String.valueOf(System.currentTimeMillis() % 1000000);
//		Date date=new Date();
//		String jd=ISODate.getJulianDate(date);
//		String gmt =  ISODate.getDateTime(date,TimeZone.getTimeZone("IST") ) ;
//		String rrn= jd+gmt.substring(4,6)+ISOUtil.zeropad(stan,6);
		String authRequest="<OtpReq uid=\"962530121967\" tid=\"23323\" ac=\"1222\" sa=\"122\" ver=\"1.0\" txn=\"auth:123\" lk=\"licenseKey\"> \r\n"
				+ "    <Opts ch=\"00\"/> \r\n"
				+ "    <Signature>Digital signature of AUA</Signature>\r\n"
				+ "  </OtpReq> ";
		// TODO Auto-generated method stub
		return authRequest;
	}
	
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

}