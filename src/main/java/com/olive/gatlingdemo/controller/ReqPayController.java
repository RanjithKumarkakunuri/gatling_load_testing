//package com.olive.gatlingdemo.controller;
//
//import java.net.URI;
//import java.util.Arrays;
//import java.util.List;
//import java.util.UUID;
//import java.util.concurrent.ThreadLocalRandom;
//
//import org.apache.commons.lang3.RandomStringUtils;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.util.UriComponentsBuilder;
//
//import com.olive.gatlingdemo.model.ReqPay;
//
//@RestController
//public class ReqPayController {
//	
//	@PostMapping(path = "/upi/txns/",consumes = { MediaType.APPLICATION_JSON_VALUE })
//	public ResponseEntity<Void> reqPay(@RequestBody ReqPay request, UriComponentsBuilder uriComponentsBuilder) {
//	    URI location = uriComponentsBuilder.path("/upi/txns/{id}")
//	      .buildAndExpand("99")
//	      .toUri();
//	    return ResponseEntity.created(location)
//	      .build();
//	}
//	
//	@GetMapping("/{id}")
//	public ReqPay getTxnWithId(@PathVariable("id") Long id) {
//	    List<ReqPay> allTxns = createTxns();
//	    return allTxns.get(ThreadLocalRandom.current()
//	      .nextInt(0, allTxns.size()));
//		 
//	}
//	
//	private List<ReqPay> createTxns() {
//
//      
//
//        ReqPay reqPay1 = ReqPay.builder()
//          .txnId(UUID.randomUUID()
//            .toString())
//          .remiAcct("123456")
//          .beneAcct("345677")
//          
//          .build();
//
//        ReqPay reqPay2 = ReqPay.builder()
//                .txnId(UUID.randomUUID()
//                  .toString())
//                .remiAcct("564321")
//                .beneAcct("7839984")
//                
//                .build();
//
//        ReqPay reqPay3 = ReqPay.builder()
//                .txnId(UUID.randomUUID()
//                  .toString())
//                .remiAcct("4758948")
//                .beneAcct("8346899")
//                
//                .build();
//
//        return Arrays.asList(reqPay1, reqPay2, reqPay3);
//
//    }
//	
//	@PostMapping(path = "/upi/txns/login",consumes = { MediaType.APPLICATION_JSON_VALUE })
//	public String login(String loginId) {
//		String strlogIn = RandomStringUtils.randomAlphanumeric(10);
//		System.out.println(strlogIn);
//	    return strlogIn;
//	}
//	
//	@PostMapping(path = "/upi/txns/pay",consumes = { MediaType.APPLICATION_JSON_VALUE })
//	public void postPay(@RequestBody ReqPay request) {
//	    System.out.println(request.getTxnId());
//	}
//	
//
//}
