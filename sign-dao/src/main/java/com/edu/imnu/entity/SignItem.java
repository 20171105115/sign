package com.edu.imnu.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SignItem {
    private Integer signItemId;

    private Integer signId;

    private String status;

    private Integer signInId;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm")
    private Date signInTime;

    private Staff signor;

    public Staff getSignor() {
        return signor;
    }

    public void setSignor(Staff signor) {
        this.signor = signor;
    }

    public Integer getSignItemId() {
        return signItemId;
    }

    public void setSignItemId(Integer signItemId) {
        this.signItemId = signItemId;
    }

    public Integer getSignId() {
        return signId;
    }

    public void setSignId(Integer signId) {
        this.signId = signId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSignInId() {
        return signInId;
    }

    public void setSignInId(Integer signInId) {
        this.signInId = signInId;
    }

    public Date getSignInTime() {
        return signInTime;
    }

    public void setSignInTime(Date signInTime) {
        this.signInTime = signInTime;
    }
}
