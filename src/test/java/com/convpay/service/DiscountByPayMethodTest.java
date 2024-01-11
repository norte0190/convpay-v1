package com.convpay.service;

import com.convpay.dto.PayRequest;
import com.convpay.type.ConvenienceType;
import com.convpay.type.PayMethodType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountByPayMethodTest {
    DiscountByPayMethod discountByPayMethod = new DiscountByPayMethod();

    @Test
    void discountSuccess(){
        //given
        PayRequest payRequstMoney = new PayRequest(PayMethodType.MONEY,
                ConvenienceType.GS25, 1000);
        PayRequest payRequstCard = new PayRequest(PayMethodType.CARD,
                ConvenienceType.GS25, 1000);

        //when
        Integer discountAmountMoney =
                discountByPayMethod.getDiscountAmount(payRequstMoney);
        Integer discountAmountCard =
                discountByPayMethod.getDiscountAmount(payRequstCard);
        //then
        assertEquals(700, discountAmountMoney);
        assertEquals(1000, discountAmountCard);
    }

}