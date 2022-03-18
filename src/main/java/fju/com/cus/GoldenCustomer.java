package fju.com.cus;

public class GoldenCustomer extends SileCustomer{
    public GoldenCustomer(String id,int amount,float backmoney){
        super(id, amount);
        discount = 0.2f;
    }
}
