package ui;

import javax.swing.*;

public class GuessFrame {
    JButton button = new JButton("Hi!");
    JLabel label = new JLabel("zzz...");

    public GuessFrame(){
        super();
        setSzie(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Hello!");
            }
        });
        setLayout(new FlowLayout());
        add(button);
        add(label);
        setVisible(true);
    }
    //Methods

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
//        guessFrame.setSize(600, 400);
//        guessFrame.setVisible(true);
    }
}
