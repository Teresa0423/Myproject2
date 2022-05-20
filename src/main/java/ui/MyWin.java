package ui;

import javax.swing.*;

public class MyWin {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        //設定高度、寬度
        frame.setSize(600,400);
        frame.setLocation(300,200);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // add component
        JButton button = new JButton("OK!");
        //add button to frame
        frame.add(button);
        //顯示JFrame
        frame.setVisible(true);
        System.out.println("End?");
    }
}
