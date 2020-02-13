package app;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class App {

    public static JFrame j;
    public static JTextArea manifestcontent;
    public static JTextField jarfilename;
    public static JTextField classfiles;
    public static JButton closeButton;
    public static JButton createButton;
    public static JLabel jarfilenamejlabel;
    public static JLabel manifestfilenamejlabel;
    public static JLabel title;
    public static JLabel marquedefabrique;
    public static JFileChooser filechooser;
    public static Font normalFont;

    public static void main(String[] args) throws Exception {
        //Instantiate the Objects
        j = new JFrame("Java Compiler for simple classes");
        jarfilename = new JTextField();
        closeButton = new JButton("Close this app");
        createButton = new JButton("Create the executable jarfile");
        jarfilenamejlabel = new JLabel("Input here the jarfile name", SwingConstants.CENTER);
        title = new JLabel();
        marquedefabrique = new JLabel();
        filechooser = new JFileChooser();
        normalFont = new Font("Sherif", Font.BOLD, 12);

        //JarFileName
        jarfilename = new JTextField();
        jarfilename.setBounds(50, 50, 200, 25);
        jarfilename.setFont(normalFont);
        j.add(jarfilename);

        //manifestcontent
        manifestcontent = new JTextArea();
        manifestcontent.setBounds(50, 200, 200, 100);
        manifestcontent.setFont(normalFont);
        j.add(manifestcontent);

        //closeButton
        closeButton.setBounds(50, 400, 200, 50);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                close(0);
            }
        });
        j.add(closeButton);

        //createButton
        createButton.setBounds(750, 332, 200, 50);
        createButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                create(jarfilename.getText(), manifestcontent.getText(), classfiles.getText());
            }
        });
        j.add(createButton);

        //jarfilenamejlabel
        jarfilenamejlabel.setBounds(50, 10, 200, 40);
        jarfilenamejlabel.setFont(normalFont);
        j.add(jarfilenamejlabel);
        
        //jarfilenamejlabel
       jarfilenamejlabel.setBounds(50, 10, 200, 40);
       jarfilenamejlabel.setFont(normalFont);   
       j.add(jarfilenamejlabel);

        //JFrame
        j.setSize(1000, 500);
        j.setResizable(false);
        j.setLocationRelativeTo(null);
        j.setBackground(Color.black);
        j.setLayout(null);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);


        
    }   

    public static void close(int exitvalue){
        System.exit(exitvalue);
    }

    public static void create(String jarfilename, String manifestcontent, String classfiles){

    }
}