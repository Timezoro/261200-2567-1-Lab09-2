public class XpayToPayDAdapter implements PayD{
    private final Xpay xpay;

    public XpayToPayDAdapter(Xpay xPay) {
        this.xpay = xPay;
    }

    public String getCustomerName() {
        return xpay.getCustomerName();
    }   

    public String getCreditCardNo() {
        return xpay.getCreditCardNo();
    }
    
    public String getCardExpMonth() {
        return xpay.getCardExpMonth() + "/" + xpay.getCardExpYear();
    }
    
    public String getCardExpYear() {
        return xpay.getCardExpYear();
    }
    
    public int getCardCVVNo() {
        return xpay.getCardCVVNo();
    }
    
    public Double getAmount() {
        return xpay.getAmount();
    }

    public void setCustomerName(String custName) {
        xpay.setCustomerName(custName);
    }

    public void setCreditCardNo(String creditCardNo) {
        xpay.setCreditCardNo(creditCardNo);
    }

    public void setCardExpMonth(String cardExpMonthDate) {
        String[] parts = cardExpMonthDate.split("/");
        xpay.setCardExpMonth(parts[0]);
        xpay.setCardExpYear(parts[1]);
    }

    public void setCardExpYear(String cardExpYear) {
        xpay.setCardExpYear(cardExpYear);
    }

    public void setCardCVVNo(Integer cVVNo) {
        xpay.setCardCVVNo(cVVNo);
    }

    public void setAmount(Double totalAmount) {
        xpay.setAmount(totalAmount);
    }


    
    
}
