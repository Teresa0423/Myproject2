package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(600,400);
        frame.setLocation(300,200);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // add component
        JButton button = new JButton("OK!");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Haha~");
            }
        });
        /*MyActionListenre Listener = new MyActionListenre();
        button.addActionListener(Listener);*/
        //add button to frame
        frame.add(button);

        frame.setLayout(new FlowLayout());
        //show JFrame
        frame.setVisible(true);
        System.out.println("End?");
    }
}
