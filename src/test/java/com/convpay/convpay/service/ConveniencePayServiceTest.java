package com.convpay.convpay.service;

import com.convpay.convpay.dto.ConvenienceType;
import com.convpay.convpay.dto.PayRequest;
import com.convpay.convpay.dto.PayResponse;
import com.convpay.convpay.dto.PayResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConveniencePayServiceTest {
    ConveniencePayService conveniencePayService = new ConveniencePayService();

    @Test
    void pay_success(){
        //given
        PayRequest payRequest = new PayRequest(ConvenienceType.GS25,100);

        //when
        PayResponse payResponse = conveniencePayService.pay(payRequest);

        //then
        assertEquals(PayResult.SUCCESS, payResponse.getPayResult());
        assertEquals(100, payResponse.getPaidAmount());
    }
}