package fju.com.cus;

public class PlatinumCustomer extends Customer{
    public PlatinumCustomer (String id, int amount){
        super(id, amount);
    }
    float discount = 0.3f;
    public float dis(){
        return amount*discount;
    }
    public float back(){
        return (int) ((amount/1000)*0.2*1000);
    }
    public void println(){
        System.out.println(id+"\t"+amount+"\t"+(amount-dis())+"\t"+back());
    }
}
