package RUPP.StudentInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Professor {
    static JTextField t;
    static JFrame f;
    static JLabel l;

    public Professor() {

    }
    public static void main(String[] args) {
        f = new JFrame("Professor's Information");
        l = new JLabel("nothing entered");
        Professor professor = new Professor();

        t = new JTextField(10);
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.add(t);
        p.add(l);
        f.add(p);
        f.setSize(350, 600);
        f.setVisible(true);

        // Add ActionListener to the text field
        t.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the entered text from the text field
                String enteredText = t.getText();
                // Set the entered text as the label's text
                l.setText(enteredText);
            }
        });
    }
}