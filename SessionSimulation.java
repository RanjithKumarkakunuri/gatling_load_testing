//package com.olive.gatlingdemo;
//
//
//
//
//
//import static io.gatling.javaapi.core.CoreDsl.StringBody;
//import static io.gatling.javaapi.core.CoreDsl.bodyString;
//import static io.gatling.javaapi.core.CoreDsl.global;
//import static io.gatling.javaapi.core.CoreDsl.rampUsersPerSec;
//import static io.gatling.javaapi.http.HttpDsl.http;
//import static io.gatling.javaapi.http.HttpDsl.status;
//
//import java.time.Duration;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.UUID;
//import java.util.stream.Stream;
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
//
//public class SessionSimulation extends Simulation {
//
//    private static final HttpProtocolBuilder HTTP_PROTOCOL_BUILDER = setupProtocolForSimulation();
//
//    private static final Iterator<Map<String, Object>> FEED_DATA = setupTestFeedData();
//
//    private static final ScenarioBuilder POST_SCENARIO_BUILDER = buildPostScenario();
//
//    public SessionSimulation() {
//
//        setUp(POST_SCENARIO_BUILDER.injectOpen(postEndpointInjectionProfile())
//          .protocols(HTTP_PROTOCOL_BUILDER)).assertions(global().responseTime()
//          .max()
//          .lte(10000), global().successfulRequests()
//          .percent()
//          .gt(90d));
//    }
//
//    private RampRateOpenInjectionStep postEndpointInjectionProfile() {
//        int totalDesiredUserCount = 1;
//        double userRampUpPerInterval = 5;
//        double rampUpIntervalSeconds = 30;
//
//        int totalRampUptimeSeconds = 120;
//        int steadyStateDurationSeconds = 300;
//        return rampUsersPerSec(userRampUpPerInterval / (rampUpIntervalSeconds / 60)).to(totalDesiredUserCount)
//          .during(Duration.ofSeconds(totalRampUptimeSeconds + steadyStateDurationSeconds));
//    }
//
//    private static HttpProtocolBuilder setupProtocolForSimulation() {
//        return HttpDsl.http.baseUrl("http://localhost:8080")
//          .acceptHeader("application/json")
//          .maxConnectionsPerHost(10)
//          .userAgentHeader("Gatling/Performance Test");
//    }
//
//    private static Iterator<Map<String, Object>> setupTestFeedData() {
//        Iterator<Map<String, Object>> iterator;
//        iterator = Stream.generate(() -> {
//              Map<String, Object> stringObjectMap = new HashMap<>();
//              stringObjectMap.put("txnId", UUID.randomUUID()
//                      .toString());
//              return stringObjectMap;
//          })
//          .iterator();
//        return iterator;
//    }
//
//    private static ScenarioBuilder buildPostScenario() {
//        return CoreDsl.scenario("Load Test Creating User")
//        		
//          .feed(FEED_DATA)
//          .exec(http("Login").post("/upi/txns/login")
//            .header("Content-Type", "application/json")
//           .body(StringBody("{ \"loginId\": \""+"chava"+ "\" }"))
//            .check(status().is(200))
//            .check(bodyString().saveAs("payID"))
//            )
//         .exec( http("PayReq").post("/upi/txns/pay")
//        		 .header("Content-Type", "application/json")
//          .body(StringBody(session -> "{ \"txnId\": \"" + session.getString("payID") + "\" }"))
//            .check(status().is(200)));
//        
//    }
//    
//    
//}