package model;

public class Payment {

    private String paymentId;
    private double amount;
    private String paymentMode;
    private String status;

    public Payment(String paymentId,
                   double amount,
                   String paymentMode,
                   String status) {

        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.status = status;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {

        return "Payment ID : " + paymentId +
                "\nAmount : ₹" + amount +
                "\nMode : " + paymentMode +
                "\nStatus : " + status;
    }
}