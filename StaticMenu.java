import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class StaticMenu extends JFrame implements ActionListener{
    JMenu file;
    JMenuBar mb;
    JMenuItem selectAll,copy,paste,exit;
    JTextArea area;
    public StaticMenu(){
        setSize(300,800);
        setTitle("Static Menu");
        area = new JTextArea();
        area.setBounds(300,300,300,250);
        add(area);
        mb = new JMenuBar();
        setJMenuBar(mb);
        file = new JMenu();
        mb.add(file);
        selectAll = new JMenuItem();
        file.add(selectAll);
        copy = new JMenuItem();
        file.add(copy);
        paste = new JMenuItem();
        file.add(paste);
        file.addSeparator();
        exit = new JMenuItem();
        file.add(exit);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        selectAll.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        exit.addActionListener(this);
        setLayout(null);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == selectAll){
            area.selectAll();
        }
        else if(e.getSource() == copy){
            area.copy();
        }
        else if(e.getSource() == paste){
            area.paste();
        }
        else{
            System.exit(0);
        }
    }
    public static void main(String[] args){
        new StaticMenu();
    }
    
}
