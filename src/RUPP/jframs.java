package RUPP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class jframs {
    JFrame f;
    JButton btnNext, btnPrevious;
    JLabel labelCardOne, labelCardTwo;
    JPanel panelCards, panelOne, panelTwo, pButton;
    CardLayout cl;

    public jframs(){
        f = new JFrame("Testing CardLayout");
        f.setSize(500,200);
        f.setLayout(new BorderLayout(10,10));

        cl = new CardLayout();

        panelCards = new JPanel(cl);
        panelOne = new JPanel(new FlowLayout());
        panelTwo = new JPanel(new FlowLayout());
        pButton = new JPanel(new FlowLayout());

        labelCardOne = new JLabel("This is Card One");
        labelCardTwo = new JLabel("This is Card Two");

        btnPrevious = new JButton("Previous");
        btnNext = new JButton("Next");

        panelCards.add(panelOne,"card1");
        panelCards.add(panelTwo,"card2");

        panelOne.add(labelCardOne);

        panelTwo.add(labelCardTwo);

        pButton.add(btnPrevious);
        pButton.add(btnNext);

        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.next(panelCards);
            }
        });

        btnPrevious.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.previous(panelCards);
            }
        });

        f.add(panelCards, BorderLayout.CENTER);
        f.add(pButton, BorderLayout.SOUTH);


        f.setVisible(true);
    }
    public static void main(String[] args){
        new  jframs();
        
    }

}
