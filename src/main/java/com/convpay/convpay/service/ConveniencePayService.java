package com.convpay.convpay.service;

import com.convpay.convpay.dto.PayRequest;
import com.convpay.convpay.dto.PayResponse;
import com.convpay.convpay.dto.PayResult;

public class ConveniencePayService {
    public PayResponse pay(PayRequest payRequest) {
        return new PayResponse(PayResult.SUCCESS,100);
    }

    public void payCancel() {

    }

}
