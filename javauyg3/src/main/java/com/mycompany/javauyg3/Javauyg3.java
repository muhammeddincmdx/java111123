/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javauyg3;


import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

/**
 *
 * @author LENOVO
 */
public class Javauyg3 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JTextField textFileId = new JTextField(20);
        panel.add(textFileId);
        JButton button = new JButton();
        button.setText("Print text");
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                    System.out.println(textFileId.getText());
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        panel.add(button);
        frame.add(panel,BorderLayout.CENTER);
        frame.setVisible(true);
        
    }
}
