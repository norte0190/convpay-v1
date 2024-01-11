package com.convpay.service;

import com.convpay.dto.PayCancelRequest;
import com.convpay.dto.PayCancelResponse;
import com.convpay.dto.PayRequest;
import com.convpay.dto.PayResponse;
import com.convpay.type.*;

public class ConveniencePayService {
    private final MoneyAdapter moneyAdapter = new MoneyAdapter();
    private final CardAdapter cardAdapter = new CardAdapter();
    private final DiscountInterface discountInterface = new DiscountByPayMethod(); //수단

    public PayResponse pay(PayRequest payRequest) {
        PaymentInterface paymentInterface;
        if (payRequest.getPayMethodType() == PayMethodType.CARD) {
            paymentInterface = cardAdapter;
        } else {
            paymentInterface = moneyAdapter;
        }

        Integer discountAmount = discountInterface.getDiscountAmount(payRequest);
        PaymentResult payment = paymentInterface.payment(discountAmount);


        if (payment == PaymentResult.PAYMENT_FAIL) {
            return new PayResponse(PayResult.FAIL, 0);
        }

        // Success Case
        return new PayResponse(PayResult.SUCCESS, discountAmount);
    }

    public PayCancelResponse payCancel(PayCancelRequest payCancelRequest) {
        PaymentInterface paymentInterface;

        if (payCancelRequest.getPayMethodType() == PayMethodType.CARD) {
            paymentInterface = cardAdapter;
        } else {
            paymentInterface = moneyAdapter;
        }


        CancelPaymentResult cancelPaymentResult = paymentInterface.cancelPayment(payCancelRequest.getPayCancelAmount());

        if (cancelPaymentResult == CancelPaymentResult.CANCEL_PAYMENT_FAIL) {
            return new PayCancelResponse(PayCancelResult.PAY_CANCEL_FAIL, 0);
        }

        // Success Case
        return new PayCancelResponse(PayCancelResult.PAY_CANCEL_SUCCESS, payCancelRequest.getPayCancelAmount());

    }

}
