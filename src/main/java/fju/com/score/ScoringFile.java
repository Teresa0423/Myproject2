package fju.com.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFile {
    public void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("score.text");
            BufferedReader reader = new BufferedReader(fileReader);
            //Jack 80 50
            String line = reader.readLine();
            while(line != null){
                System.out.println(line);
                String[] token = line.split(",");
                String name = token[0];
                int english = Integer.parseInt(token[1]);
                int math = Integer.parseInt(token[2]);
                Student stu = new Student(name,english,math);
                stu.print();
            }
            System.out.println(line);
            /*int data = fileReader.read();
            while(data != -1){
                System.out.print((char)data);
                data = fileReader.read();
            }*/
            /*System.out.println(data);
            data = fileReader.read();
            System.out.println(data);*/

        }catch (FileNotFoundException e){
            System.out.println("檔案讀取失敗。");
        }catch (IOException e){
            System.out.println("資料讀取失敗。");
        }
    }
}
