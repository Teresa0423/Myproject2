package fju.com;

public class NG {
    public static void main(String[] args){
        String names[] = {"Hank", "Tom", "Mary", "Teresa", "Mark"};
        int English[] = {40,60,70,80,50};
        int Math[] = {70,60,60,20,40};
        for (int i = 0; i < 5; i++) {
            System.out.println
                    (names[i] + "\t" + English[i] + "\t" + Math[i] + "\t" + (English[i]+Math[i])/2);
        }
    }
}
