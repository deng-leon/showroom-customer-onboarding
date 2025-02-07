package com.camunda.demo.customeronboarding.adapter;

import org.springframework.stereotype.Component;

import com.camunda.demo.customeronboarding.model.NewApplication;

import io.camunda.zeebe.spring.client.annotation.ZeebeVariablesAsType;
import io.camunda.zeebe.spring.client.annotation.ZeebeWorker;

@Component
public class DummyWorker {

	@ZeebeWorker(type = "dummyWorker", autoComplete = true)
	public void calculateScore() {
	}
}
