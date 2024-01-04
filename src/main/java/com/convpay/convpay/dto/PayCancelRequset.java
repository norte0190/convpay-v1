package com.convpay.convpay.dto;

import com.convpay.convpay.type.ConvenienceType;

public class PayCancelRequset {
    //편의점 종류
    ConvenienceType convenienceType;

    //결제 취소 금액
    Integer payCancelAmount;


    public PayCancelRequset(ConvenienceType convenienceType, Integer payCancelAmount) {
        this.convenienceType = convenienceType;
        this.payCancelAmount = payCancelAmount;
    }

    public ConvenienceType getConvenienceType() {
        return convenienceType;
    }

    public void setConvenienceType(ConvenienceType convenienceType) {
        this.convenienceType = convenienceType;
    }

    public Integer getPayCancelAmount() {
        return payCancelAmount;
    }

    public void setPayCancelAmount(Integer payCancelAmount) {
        this.payCancelAmount = payCancelAmount;
    }
}
