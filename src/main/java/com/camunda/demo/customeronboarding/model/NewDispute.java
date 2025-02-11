package com.camunda.demo.customeronboarding.model;

import java.util.Calendar;

public class NewDispute {

    private String disputeNumber;

    private String accountNumber;
    private String transactionId;
    private String reportDetails;
    
    private String uiBaseUrl;

    public static int counter = 0;

    public static String generateUUID() {
        // for demo reasons we generate something readable
        if (counter == 0) {
            counter = Calendar.getInstance().get(Calendar.MINUTE) + Calendar.getInstance().get(Calendar.SECOND);
        } else {
            counter++;
        }
        String result = "A-" + Calendar.getInstance().get(Calendar.DAY_OF_YEAR) + counter;
        return result;
    }

    public NewDispute() {
        disputeNumber = generateUUID();
    }

    public NewDispute(String applicationNumber) {
        super();
        this.disputeNumber = applicationNumber;
    }

    public void setUiBaseUrl(String uiBaseUrl) {
        this.uiBaseUrl = uiBaseUrl;
    }

    public String getDisputeNumber() {
        return disputeNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getReportDetails() {
        return reportDetails;
    }
}
