package com.quest.CaseStudyTSMS;

import java.io.Serializable;
import java.time.LocalDateTime;

public class CallDetails implements Serializable {
    private String callerId;
    private String callType;
    private int callDuration;
    private LocalDateTime timestamp;

    public CallDetails(String callerId, String callType, int callDuration, LocalDateTime timestamp) {
        this.callerId = callerId;
        this.callType = callType;
        this.callDuration = callDuration;
        this.timestamp = timestamp;
    }

    public String getCallerId() {
        return callerId;
    }

    public void setCallerId(String callerId) {
        this.callerId = callerId;
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public int getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(int callDuration) {
        this.callDuration = callDuration;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "CallDetails{" + "subscriberId=" + callerId + ", callType=" + callType+", duration=" + callDuration + ", timestamp=" + timestamp + '}';
    }
}
