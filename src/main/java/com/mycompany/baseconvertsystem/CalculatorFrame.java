package com.mycompany.baseconvertsystem;

import java.awt.*;
//import java.awt.Image;
import java.awt.event.*;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
import javax.swing.*;

import javax.swing.event.*;
//import javax.swing.event.DocumentListener;

@SuppressWarnings("serial")
public class CalculatorFrame  extends JFrame{
    public JComboBox<String> comboBox, operators;
    public JTextField num1, num2, result1, result2, result3, result4, baseNum1, baseNum2, baseNum3, baseNum4;
    public JButton convertBtn, resetBtn, converterBtn;
    //private JLabel label1, label2, label3, label4, label5;
    public CalculatorFrame(){
        this.setSize(515, 640);
        this.setLocationRelativeTo(null);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);  
        this.setTitle("BaseConvert System//Calculator");
        this.getContentPane().setBackground(new java.awt.Color(80, 80, 80));
        Image logo = new ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\BaseConvertSystem\\src\\main\\java\\com\\mycompany\\baseconvertsystem\\BCSLOGO (2).png").getImage();
        this.setIconImage(logo);

        String option[] = {"Decimal" , "Binary", "Hexa", "Octal"};
        comboBox = new JComboBox<String>(option);
        comboBox.setSelectedItem("Decimal");
        comboBox.setBounds(30, 30, 190, 35);
        comboBox.setBackground(new java.awt.Color(255, 153, 51));
        comboBox.setFont(new java.awt.Font("Segoe UI", 1, 14));
        comboBox.setForeground(new java.awt.Color(255, 255, 255));
        comboBox.setRenderer(new javax.swing.DefaultListCellRenderer() { 
            @Override
            public java.awt.Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

                java.awt.Component comp = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                comp.setBackground(isSelected ? new java.awt.Color(255, 153, 51) : java.awt.Color.WHITE);
                comp.setForeground(isSelected ? java.awt.Color.WHITE : new java.awt.Color(0, 0, 0));
                comp.setFont(new java.awt.Font("Segoe UI", 1, 14));

                return comp;
            }
        });

		
        String operator[] = {"   +" , "   -", "   *", "   /"};
        operators = new JComboBox<String>(operator);
        operators.setBounds(220,105,60,35);  
        operators.setBackground(new java.awt.Color(255, 153, 51));
        operators.setRenderer(new javax.swing.DefaultListCellRenderer() { 
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
        
        JLabel label1 = new JLabel("Enter decimal number:");
        label1.setBounds(30, 75, 160, 30);
        label1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        label1.setForeground(new java.awt.Color(255, 255, 255));

        JLabel label2 = new JLabel("Result in Decimal:");
        label2.setBounds(30, 220, 160, 30);
        label2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        label2.setForeground(new java.awt.Color(255, 255, 255));

        JLabel label3 = new JLabel("Result in Binary:");
        label3.setBounds(30, 285, 160, 30);
        label3.setFont(new java.awt.Font("Segoe UI", 1, 14));
        label3.setForeground(new java.awt.Color(255, 255, 255));

        JLabel label4 = new JLabel("Result in Hexa:");
        label4.setBounds(30, 350, 160, 30);
        label4.setFont(new java.awt.Font("Segoe UI", 1, 14));
        label4.setForeground(new java.awt.Color(255, 255, 255));

        JLabel label5 = new JLabel("Result in Octal:");
        label5.setBounds(30, 415, 160, 30);
        label5.setFont(new java.awt.Font("Segoe UI", 1, 14));
        label5.setForeground(new java.awt.Color(255, 255, 255));

        num1 = new JTextField();    
        num1.setBounds(30,105,170,35);  
        num1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        num1.setBorder(BorderFactory.createEmptyBorder());

        num2 = new JTextField();    
        num2.setBounds(300,105,170,35);  
        num2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        num2.setBorder(BorderFactory.createEmptyBorder());

        convertBtn = new JButton("Convert"); 
        convertBtn.setFocusable(false);
        convertBtn.setBounds(30, 157,130,35);  
        convertBtn.setBackground(new java.awt.Color(0, 102, 204));
        convertBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        convertBtn.setForeground(new java.awt.Color(255, 255, 255));

        resetBtn = new JButton("Reset");  
        resetBtn.setFocusable(false);
        resetBtn.setBounds(340, 157,130,35);  
        resetBtn.setBackground(new java.awt.Color(255, 51, 51));
        resetBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        resetBtn.setForeground(new java.awt.Color(255, 255, 255));

        result1 = new JTextField();    
        result1.setBounds(30, 250, 403, 35);
        result1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        result1.setEditable(false);

        baseNum1 = new JTextField("10");    
        baseNum1.setBounds(435, 250, 35, 35);
        baseNum1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        baseNum1.setHorizontalAlignment(SwingConstants.CENTER);
        baseNum1.setEditable(false);

        result2 = new JTextField();    
        result2.setBounds(30, 315, 403, 35);
        result2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        result2.setEditable(false);

        baseNum2 = new JTextField("2");    
        baseNum2.setBounds(435, 315, 35, 35);
        baseNum2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        baseNum2.setHorizontalAlignment(SwingConstants.CENTER);
        baseNum2.setEditable(false);

        result3 = new JTextField();    
        result3.setBounds(30, 380, 403, 35);
        result3.setFont(new java.awt.Font("Segoe UI", 1, 14));
        result3.setEditable(false);

        baseNum3 = new JTextField("16");    
        baseNum3.setBounds(435, 380, 35, 35);
        baseNum3.setFont(new java.awt.Font("Segoe UI", 1, 14));
        baseNum3.setHorizontalAlignment(SwingConstants.CENTER);
        baseNum3.setEditable(false);

        result4 = new JTextField();    
        result4.setBounds(30, 445, 403, 35);
        result4.setFont(new java.awt.Font("Segoe UI", 1, 14));
        result4.setEditable(false);

        baseNum4 = new JTextField("8");    
        baseNum4.setBounds(435, 445, 35, 35);
        baseNum4.setFont(new java.awt.Font("Segoe UI", 1, 14));
        baseNum4.setHorizontalAlignment(SwingConstants.CENTER);
        baseNum4.setEditable(false);

        converterBtn = new JButton("Converter");
        converterBtn.setFocusable(false);
        converterBtn.setBounds(340, 535,130,35);  
        converterBtn.setBackground(new java.awt.Color(255, 153, 51));
        converterBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        converterBtn.setForeground(new java.awt.Color(255, 255, 255));
	    	
        this.add(comboBox); this.add(this.operators); this.add(num1); this.add(num2); this.add(convertBtn); 
        this.add(resetBtn); this.add(result1); this.add(result2); this.add(result3); this.add(result4);
        this.add(label1);  this.add(label2); this.add(label3); this.add(baseNum1); this.add(baseNum2); 
        this.add(baseNum3); this.add(baseNum4); this.add(label4); this.add(label5); this.add(converterBtn);
        this.add(logo2); this.setVisible(false);
		
        comboBox.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText("Enter " + comboBox.getSelectedItem() + " number");
                label2.setText("Result in " + comboBox.getSelectedItem());

                if(comboBox.getSelectedItem()=="Decimal") {
                    baseNum1.setText("10");
                    label3.setText("Result in Binary");
                    baseNum2.setText("2");
                    label4.setText("Result in Hexa");
                    baseNum3.setText("16");
                    label5.setText("Result in Octal");
                    baseNum4.setText("8");
                } else if(comboBox.getSelectedItem()=="Binary") {
                    baseNum1.setText("2");
                    label3.setText("Result in Decimal");
                    baseNum2.setText("10");
                    label4.setText("Result in Hexa");
                    baseNum3.setText("16");
                    label5.setText("Result in Octal");
                    baseNum4.setText("8");
                } else if(comboBox.getSelectedItem()=="Hexa") {
                    baseNum1.setText("16");
                    label3.setText("Result in Decimal");
                    baseNum2.setText("10");
                    label4.setText("Result in Binary");
                    baseNum3.setText("2");
                    label5.setText("Result in Octal");
                    baseNum4.setText("8");
                } else {
                    baseNum1.setText("8");
                    label3.setText("Result in Decimal");
                    baseNum2.setText("10");
                    label4.setText("Result in Binary");
                    baseNum3.setText("2");
                    label5.setText("Result in Hexa");
                    baseNum4.setText("16");
                }
            }
        });
		
        num1.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) { onChange(); }

            @Override
            public void removeUpdate(DocumentEvent e) { onChange(); }

            @Override
            public void changedUpdate(DocumentEvent e) { onChange(); }

            private void onChange() {
                if(comboBox.getSelectedItem()=="Decimal") { 
                    ch("^-?[0-9]+$");
                } else if(comboBox.getSelectedItem()=="Binary") {
                    ch("^-?[01]+$");
                } else if(comboBox.getSelectedItem()=="Hexa") {
                    ch("^-?[0-9A-F]+$");
                } else if(comboBox.getSelectedItem()=="Octal") {
                    ch("^-?[0-7]+$");
                } else {
                    System.out.println("invalid");
                }
            }

            private void ch(String i) {
                if(num1.getText().toUpperCase().matches(i)) {
                    convertBtn.setEnabled(true);
                    num1.setBackground(Color.white);
                } else {
                    num1.setBackground(Color.red);
                    convertBtn.setEnabled(false);
                }
            }	
        });
		
        num2.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) { onChange(); }

                @Override
                public void removeUpdate(DocumentEvent e) { onChange(); }

                @Override
                public void changedUpdate(DocumentEvent e) { onChange(); }

                private void onChange() {
                    if(comboBox.getSelectedItem()=="Decimal") {
                        ch("^-?[0-9]+$");
                    } else if(comboBox.getSelectedItem()=="Binary") {
                        ch("^-?[01]+$");
                    } else if(comboBox.getSelectedItem()=="Hexa") {
                        ch("^-?[0-9A-F]+$");
                    } else if(comboBox.getSelectedItem()=="Octal") {
                        ch("^-?[0-7]+$");
                    } else {
                        System.out.println("invalid");
                    }
                }

                private void ch(String i) {
                    if(num2.getText().toUpperCase().matches(i)) {
                        convertBtn.setEnabled(true);
                        num2.setBackground(Color.white);
                    } else {
                        convertBtn.setEnabled(false);
                        num2.setBackground(Color.red);
                    }
                }

        });

        resetBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            num1.setText(""); num2.setText(""); result1.setText(""); result2.setText("");  result3.setText("");  result4.setText("");
            
            }
        });
			
		
    }
}
