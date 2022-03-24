package fju.com.cus;

//  一般客戶 - 滿千送百
//  銀級客戶 - 滿千送百, 再送百元還元金
//  金級客戶 - 滿千送二百，再送二百還元金



public class Tester {
    public static void main(String[] args){
        Customer c1 = new Customer("0001",2000);
        c1.println();
        //System.out.println(c1.id +"\t"+ c1.amount+"\t"+ c1.backmoney());
    }
}
