public interface PayD {
    public String getCreditCardNo();
    public String getCustomerName();
    public String getCardExpMonth();
    public String getCardExpYear();
    public int getCardCVVNo();
    public Double getAmount();
    public void setCreditCardNo(String creditCardNo);
    public void setCustomerName(String customerName);
    public void setCardExpMonth(String cardExpMonth);
    public void setCardExpYear(String cardExpYear);
    public void setCardCVVNo(Integer cardCVVNo);
    public void setAmount(Double amount);

}
