package fju.com.score;

public class Student implements Printtable{
    String name;
    int english;
    int math;
    public Student(String name,int english, int math){
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public void print(){
        System.out.println(name+"\t"+english+"\t"+math+"\t"
        +getAverage());

        if(getAverage()<60){
            System.out.print("*");
        }
    }
    public int getAverage(){
        return ((english+math)/2);
    }
}
