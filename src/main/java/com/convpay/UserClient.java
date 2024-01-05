package com.convpay;

import com.convpay.dto.PayCancelRequest;
import com.convpay.dto.PayCancelResponse;
import com.convpay.dto.PayRequest;
import com.convpay.dto.PayResponse;
import com.convpay.service.ConveniencePayService;
import com.convpay.type.ConvenienceType;

public class UserClient {
    public static void main(String[] args) {

        ConveniencePayService conveniencePayService = new ConveniencePayService();

        //GS25, 결제 1000원
        PayRequest payRequest = new PayRequest(ConvenienceType.GS25, 1000);
        PayResponse payResponse = conveniencePayService.pay(payRequest);

        System.out.println(payResponse);

        //GS25, 취소 500원
        PayCancelRequest payCancelRequest = new PayCancelRequest(ConvenienceType.GS25, 500);
        PayCancelResponse payCancelResponse = conveniencePayService.payCancel(payCancelRequest);

        System.out.println(payCancelResponse);

    }
}
