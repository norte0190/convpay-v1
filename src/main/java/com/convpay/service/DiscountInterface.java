package com.convpay.service;

import com.convpay.dto.PayRequest;

public interface DiscountInterface {
    Integer getDiscountAmount(PayRequest payRequest);
}
