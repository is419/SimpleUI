import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {

    JButton but1=new JButton("Press me");
    JButton but2=new JButton("No Press me");
    JCheckBox but3= new JCheckBox("I'm a checkbox");
    JRadioButton but4= new JRadioButton("I'm a radio button");

    public ButtonPanel() {
        setLayout(new GridLayout(4,5));
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hi I'm printing something..");
            }
        });
        add(but1);

        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hi I'm printing a new thing..");
            }
        });
        add(but2);

        but3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed the checkbox");
            }
        });
        add(but3);

        but4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed the radio button");
            }
        });
        add(but4);
    }
}
