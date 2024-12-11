package com.quest.CaseStudyTSMS;

import java.io.Serializable;

public class Subscribers implements Serializable {
    private String subscriberId;
    private String subscriberName;
    private String subscriberNumber;
    private String subscriberPlanType; //enum can be used
    private double subscriberBalance;

    public Subscribers(String subscriberId, String subscriberName, String subscriberNumber, String subscriberPlanType, double subscriberBalance) {
        this.subscriberId = subscriberId;
        this.subscriberName = subscriberName;
        this.subscriberNumber = subscriberNumber;
        this.subscriberPlanType = subscriberPlanType;
        this.subscriberBalance = subscriberBalance;
    }

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public String getSubscriberNumber() {
        return subscriberNumber;
    }

    public void setSubscriberNumber(String subscriberNumber) {
        this.subscriberNumber = subscriberNumber;
    }

    public String getSubscriberPlanType() {
        return subscriberPlanType;
    }

    public void setSubscriberPlanType(String subscriberPlanType) {
        this.subscriberPlanType = subscriberPlanType;
    }

    public double getSubscriberBalance() {
        return subscriberBalance;
    }

    public void setSubscriberBalance(double subscriberBalance) {
        this.subscriberBalance = subscriberBalance;
    }

    @Override
    public String toString() {
        return "Subscribers{" + "ID=" + subscriberId + ", name=" + subscriberName + ", phoneNumber=" + subscriberNumber+ ", planType=" + subscriberPlanType + ", balance=" + subscriberBalance + '}';
    }
}
