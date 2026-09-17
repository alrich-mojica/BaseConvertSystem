package com.mycompany.baseconvertsystem;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

@SuppressWarnings("serial")
public class ConverterFrame extends JFrame{
    public JButton convertBtn, resetBtn, calculatorBtn;
    public JComboBox<String> comboBox1, comboBox2;
    public JTextField userInput, result1,result2,result3, baseNum1, baseNum2, baseNum3, baseNum4;
    public JLabel label5, label6;
    String baseNum[] = {"10" , "2", "16", "8"};
    public ConverterFrame(){
        this.setSize(515, 640);
        this.setLocationRelativeTo(null);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);  
        this.setTitle("BaseConvert System//Converter");
        this.getContentPane().setBackground(new java.awt.Color(80, 80, 80));

        Image logo = new ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\BaseConvertSystem\\src\\main\\java\\com\\mycompany\\baseconvertsystem\\BCSLOGO (2).png").getImage();
        this.setIconImage(logo);

        String option[] = {"Decimal" , "Binary", "Hexa", "Octal"};
        comboBox1 = new JComboBox<String>(option);
        comboBox1.setSelectedItem("Decimal");
        comboBox1.setBounds(30, 50, 190, 35);
        comboBox1.setBackground(new java.awt.Color(255, 153, 51));
        comboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        comboBox1.setForeground(new java.awt.Color(255, 255, 255));
        comboBox1.setRenderer(new javax.swing.DefaultListCellRenderer() { 
            @Override
            public java.awt.Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

                java.awt.Component comp = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                comp.setBackground(isSelected ? new java.awt.Color(255, 153, 51) : java.awt.Color.WHITE);
                comp.setForeground(isSelected ? java.awt.Color.WHITE : new java.awt.Color(0, 0, 0));
                comp.setFont(new java.awt.Font("Segoe UI", 1, 14));

                return comp;
            }
        });
	    
        comboBox2 = new JComboBox<String>(option);
        comboBox2.setSelectedItem("Binary");
        comboBox2.setBounds(280, 50, 190, 35);
        comboBox2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        comboBox2.setForeground(new java.awt.Color(255, 255, 255));
        comboBox2.setBackground(new java.awt.Color(255, 153, 51));
        comboBox2.setRenderer(new javax.swing.DefaultListCellRenderer() { 
            @Override
            public java.awt.Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

                java.awt.Component comp = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                comp.setBackground(isSelected ? new java.awt.Color(255, 153, 51) : java.awt.Color.WHITE);
                comp.setForeground(isSelected ? java.awt.Color.WHITE : new java.awt.Color(0, 0, 0));
                comp.setFont(new java.awt.Font("Segoe UI", 1, 14));

                return comp;
            }
        });
        
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\BaseConvertSystem\\src\\main\\java\\com\\mycompany\\baseconvertsystem\\bcslogo (3).png");
        JLabel logo2 = new JLabel(imageIcon);
        logo2.setBounds(30, 530, 40, 40);
        
        JLabel label1 = new JLabel("From:");
        label1.setBounds(30, 20, 40, 30);
        label1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        label1.setForeground(new java.awt.Color(255, 255, 255));

        JLabel label2 = new JLabel("To:");
        label2.setBounds(280, 20, 40, 30);
        label2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        label2.setForeground(new java.awt.Color(255, 255, 255));

        JLabel label3 = new JLabel("Enter decimal number:");
        label3.setBounds(30, 100, 160, 30);
        label3.setFont(new java.awt.Font("Segoe UI", 1, 14));
        label3.setForeground(new java.awt.Color(255, 255, 255));

        userInput = new JTextField();    
        userInput.setBounds(30, 130, 403, 35);
        userInput.setFont(new java.awt.Font("Segoe UI", 1, 14));
        userInput.setBorder(BorderFactory.createEmptyBorder());

        baseNum1 = new JTextField("10");   
        baseNum1.setHorizontalAlignment(SwingConstants.CENTER);
        baseNum1.setBounds(435, 130, 35, 35);
        baseNum1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        baseNum1.setEditable(false);

        convertBtn = new JButton("Convert");  
        convertBtn.setFocusable(false);
        convertBtn.setBounds(30, 182,130,35);  
        convertBtn.setBackground(new java.awt.Color(0, 102, 204));
        convertBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        convertBtn.setForeground(new java.awt.Color(255, 255, 255));

        resetBtn = new JButton("Reset");  
        resetBtn.setFocusable(false);
        resetBtn.setBounds(340, 182,130,35);  
        resetBtn.setBackground(new java.awt.Color(255, 51, 51));
        resetBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        resetBtn.setForeground(new java.awt.Color(255, 255, 255));

        JLabel label4 = new JLabel("Result in Binary:");
        label4.setBounds(30, 255, 160, 30);
        label4.setFont(new java.awt.Font("Segoe UI", 1, 14));
        label4.setForeground(new java.awt.Color(255, 255, 255));

        result1 = new JTextField();    
        result1.setBounds(30, 285, 403, 35);
        result1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        result1.setEditable(false);

        baseNum2 = new JTextField("2");   
        baseNum2.setHorizontalAlignment(SwingConstants.CENTER);
        baseNum2.setBounds(435, 285, 35, 35);
        baseNum2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        baseNum2.setEditable(false);

        label5 = new JLabel("Result in Hexa:");
        label5.setBounds(30, 335, 160, 30);
        label5.setFont(new java.awt.Font("Segoe UI", 1, 14));
        label5.setForeground(new java.awt.Color(255, 255, 255));

        result2 = new JTextField();    
        result2.setBounds(30, 365, 403, 35);
        result2.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        result2.setEditable(false);

        baseNum3 = new JTextField("16");   
        baseNum3.setHorizontalAlignment(SwingConstants.CENTER);
        baseNum3.setBounds(435, 365, 35, 35);
        baseNum3.setFont(new java.awt.Font("Segoe UI", 1, 14));
        baseNum3.setEditable(false);

        label6 = new JLabel("Result in Octal:");
        label6.setBounds(30, 415, 160, 30);
        label6.setFont(new java.awt.Font("Segoe UI", 1, 14));
        label6.setForeground(new java.awt.Color(255, 255, 255));

        result3 = new JTextField();    
        result3.setBounds(30, 445, 403, 35);
        result3.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        result3.setEditable(false);

        baseNum4 = new JTextField("8");   
        baseNum4.setHorizontalAlignment(SwingConstants.CENTER);
        baseNum4.setBounds(435, 445, 35, 35);
        baseNum4.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        baseNum4.setEditable(false);

        calculatorBtn = new JButton("Calculator");  
        calculatorBtn.setFocusable(false);
        calculatorBtn.setBounds(340, 535,130,35);  
        calculatorBtn.setBackground(new java.awt.Color(255, 153, 51));
        calculatorBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        calculatorBtn.setForeground(new java.awt.Color(255, 255, 255));


        this.add(comboBox1);  this.add(comboBox2); this.add(label1); this.add(label2); this.add(label3);
        this.add(userInput); this.add(convertBtn); this.add(label4); this.add(result1);  this.add(label5);
        this.add(result2);  this.add(label6); this.add(result3); this.add(resetBtn); this.add(calculatorBtn);
        this.add(baseNum1); this.add(baseNum2);  this.add(baseNum3); this.add(baseNum4);  
        this.add(logo2); this.setVisible(true); 
	    
        comboBox1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                label3.setText("Enter " + comboBox1.getSelectedItem() + " number");
                label4.setText("Result in " + comboBox2.getSelectedItem());
                baseNum1.setText(baseNum[comboBox1.getSelectedIndex()]);
                baseNum2.setText(baseNum[comboBox2.getSelectedIndex()]);
                for(int i=0;i<4; i++) {
                    int h = 0;
                    if(comboBox1.getSelectedIndex()!=i && comboBox2.getSelectedIndex()!=i) {
                    label5.setText("Result in "  + comboBox2.getItemAt(i));
                    baseNum3.setText(baseNum[i]);
                    h=i;
                        for(int l=0;l<4; l++) {
                            if(comboBox1.getSelectedIndex()!=l && comboBox2.getSelectedIndex()!=l &&  l!=h) {
                                label6.setText("Result in "  + comboBox2.getItemAt(l));
                                baseNum4.setText(baseNum[l]);
                            }
                        }
                    }	
                }
            }
        });
	    
        comboBox2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                label3.setText("Enter " + comboBox1.getSelectedItem() + " number");
                label4.setText("Result in " + comboBox2.getSelectedItem());
                baseNum1.setText(baseNum[comboBox1.getSelectedIndex()]);
                baseNum2.setText(baseNum[comboBox2.getSelectedIndex()]);
                for(int i=0;i<4; i++) {
                    int h = 0;
                    if(comboBox1.getSelectedIndex()!=i && comboBox2.getSelectedIndex()!=i) {
                    label5.setText("Result in "  + comboBox2.getItemAt(i));
                    baseNum3.setText(baseNum[i]);
                    h=i;
                    for(int l=0;l<4; l++) {
                        if(comboBox1.getSelectedIndex()!=l && comboBox2.getSelectedIndex()!=l &&  l!=h) {
                            label6.setText("Result in "  + comboBox2.getItemAt(l));
                            baseNum4.setText(baseNum[l]);
                        }
                    }
                    }

                }
            }
        });
	    
        userInput.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) { onChange(); }

            @Override
            public void removeUpdate(DocumentEvent e) { onChange(); }

            @Override
            public void changedUpdate(DocumentEvent e) { onChange(); }

            private void onChange() {
                if(comboBox1.getSelectedItem()=="Decimal") {
                    ch("^-?[0-9]+$");
                } else if(comboBox1.getSelectedItem()=="Binary") {
                    ch("^-?[01]+$");
                } else if(comboBox1.getSelectedItem()=="Hexa") {
                    ch("^-?[0-9A-F]+$");
                } else if(comboBox1.getSelectedItem()=="Octal") {
                    ch("^-?[0-7]+$");
                } else {
                    System.out.println("invalid");
                }
            }

            private void ch(String i) {
                if(userInput.getText().toUpperCase().matches(i)) {
                    convertBtn.setEnabled(true);
                    userInput.setBackground(Color.white);
                } else {
                    convertBtn.setEnabled(false);
                    userInput.setBackground(Color.red);
                }
            }

        });
	    
        resetBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                userInput.setText(""); result1.setText(""); result2.setText(""); result3.setText("");
            }
        });    
    }
}
