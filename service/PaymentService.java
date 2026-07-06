package service;

import model.Payment;

public class PaymentService {

    public Payment makePayment(double amount,String mode){

        String paymentId = "PAY" + System.currentTimeMillis()%100000;

        Payment payment =
                new Payment(
                        paymentId,
                        amount,
                        mode,
                        "SUCCESS"
                );

        System.out.println(payment);

        return payment;

    }

}