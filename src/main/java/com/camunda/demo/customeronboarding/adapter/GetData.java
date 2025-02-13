package com.camunda.demo.customeronboarding.adapter;

import org.springframework.stereotype.Component;
import io.camunda.zeebe.spring.client.annotation.ZeebeWorker;

import java.util.HashMap;
import java.util.Map;

@Component
public class GetData {

    @ZeebeWorker(type = "getData", autoComplete = true)
    public Map<String, Object> calculateScore() {
        // Create a map with the variables you want to return
        Map<String, Object> variables = new HashMap<>();
        variables.put("customerName", "Max Maximus");
        variables.put("geolocationPayment", "Las Vegas");
        variables.put("amount", 100);
        variables.put("transactionType", "transfer");

        return variables; // Return the map with the new variables
    }
}