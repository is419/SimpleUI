import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JMenuBar implements ActionListener {
    JMenu menu; // One menu
    JMenuItem item; // Which has one item
    JMenuItem item2;
    public MainMenu(){
    menu=new JMenu("The Menu");
    item=new JMenuItem("Item 1");
    item2=new JMenuItem("Item 2");
    item.addActionListener(this);
    item2.addActionListener(this);
    add(menu);
    menu.add(item);
    menu.add(item2);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
}