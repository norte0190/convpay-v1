package com.convpay.convpay.service;

import com.convpay.convpay.type.MoneyUseCancelResult;
import com.convpay.convpay.type.MoneyUseResult;

public class MoneyAdapter {
    public MoneyUseResult use(Integer payAmount){
        System.out.println("MoneyAdapter.use : " + payAmount);

        if(payAmount > 1000_000){
            return MoneyUseResult.USE_FAIL;

        }
        return MoneyUseResult.USE_SUCCESS;
    }
    public MoneyUseCancelResult useCancle(Integer payCancelAmount){
        System.out.println("MoneyAdapter.useCancle : " + payCancelAmount);

        if(payCancelAmount < 100){
            return MoneyUseCancelResult.MONEY_USE_CANCEL_FAIL;
        }
        return MoneyUseCancelResult.MONEY_USE_CANCEL_SUCCESS;
    }


}
