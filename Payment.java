public class Payment {
   public enum payment_methods{
       cod,
       card,
       upi,
       rozerpay
   }
    public double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
