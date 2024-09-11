public class Main {

    public static void testPayD(PayD payD) {
        System.out.println(payD.getCreditCardNo());
        System.out.println(payD.getCustomerName());
        System.out.println(payD.getCardExpMonth());
        System.out.println(payD.getCardExpYear());
        System.out.println(payD.getCardCVVNo());
        System.out.println(payD.getAmount());
    }
    public static void main(String[] args) {
        Xpay xpay = new XplayImpl();
        xpay.setCreditCardNo("4789565874102365");     
        xpay.setCustomerName("Somchai Jaidee"); 
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25"); 
        xpay.setCardCVVNo( 235); 
        xpay.setAmount(2565.23);
        PayD payD = new XpayToPayDAdapter(xpay);

        testPayD(payD);

    }
    
}