package com.convpay.convpay.service;

import com.convpay.convpay.dto.*;
import com.convpay.convpay.type.MoneyUseResult;
import com.convpay.convpay.type.PayResult;

public class ConveniencePayService {
    private final MoneyAdapter moneyAdapter = new MoneyAdapter();

    public PayResponse pay(PayRequest payRequest) {
        MoneyUseResult moneyUseResult =
                moneyAdapter.use(payRequest.getPayAmount());

        if (moneyUseResult == MoneyUseResult.USE_FAIL) {
            return new PayResponse(PayResult.FAIL, 0);
        }

        // Success Case
        return new PayResponse(PayResult.SUCCESS, payRequest.getPayAmount());
    }

    public PayCancelResponse payCancel(PayCancelRequset payCancelRequset) {
        moneyAdapter.useCancle(payCancelRequset.getPayCancelAmount());

        return new PayCancelResponse(); // 임시
    }

}
