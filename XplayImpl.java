public class XplayImpl implements Xpay {
    private String creditCardNo;
    private String customerName;
    private String cardExpMonth;
    private String cardExpYear;
    private Integer cardCVVNo;
    private Double amount;
    
    public String getCreditCardNo() {
        return creditCardNo;
    }
    
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }
    
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCardExpMonth() {
        return cardExpMonth;
    }

    public void setCardExpMonth(String cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }

    public String getCardExpYear() {
        return cardExpYear;
    }

    public void setCardExpYear(String cardExpYear) {
        this.cardExpYear = cardExpYear;
    }

    
    public void setCardCVVNo(Integer cardCVVNo) {
        this.cardCVVNo = cardCVVNo;
    }
    
    public int getCardCVVNo() {
        return cardCVVNo;

    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }
}
