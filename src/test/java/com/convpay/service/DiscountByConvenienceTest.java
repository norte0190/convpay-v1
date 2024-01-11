package com.convpay.service;

import com.convpay.dto.PayRequest;
import com.convpay.type.ConvenienceType;
import com.convpay.type.PayMethodType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiscountByConvenienceTest {

    DiscountByConvenience discountByConvenience = new DiscountByConvenience();
    @Test
    void discountTest() {
        //given
        PayRequest payRequestGS25 =
                new PayRequest(PayMethodType.MONEY, ConvenienceType.GS25, 1000);
        PayRequest payRequestCU =
                new PayRequest(PayMethodType.MONEY, ConvenienceType.CU, 1000);
        PayRequest payRequestSEVEN =
                new PayRequest(PayMethodType.MONEY, ConvenienceType.SEVEN, 1000);
        //when

        Integer discountAmountGS25 = discountByConvenience.getDiscountAmount(payRequestGS25);
        Integer discountAmountCU = discountByConvenience.getDiscountAmount(payRequestCU);
        Integer discountAmountSEVEN = discountByConvenience.getDiscountAmount(payRequestSEVEN);

        //then
        assertEquals(800, discountAmountGS25);
        assertEquals(900, discountAmountCU);
        assertEquals(1000, discountAmountSEVEN);
    }
}