package fju.com.cus;

public class DiscountCustomer extends  Customer{
    public DiscountCustomer (String id, int amount){
        super(id, amount);
    }
    float discount = 0.1f;
    public float discountmoney(){
        return amount*discount;
    }
    public void println(){
        System.out.println
                (id+"\t"+amount+"\t"+(amount-discountmoney()));
    }
}
