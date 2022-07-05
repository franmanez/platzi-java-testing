
package com.platzi.javatests.payments;

import com.platzi.javatests.payments.PaymentRequest;
import com.platzi.javatests.payments.PaymentResponse;


public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}
