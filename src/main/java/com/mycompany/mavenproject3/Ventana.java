/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author garci
 */
public class Ventana extends JFrame{

    public Ventana() {
        this.setSize(900,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //UnitComponet();
    }
    public void addPanel(JPanel jP){
        this.getContentPane().add(jP);
    }
    
    /*
    private JPanel crearPanel(int wigth, int height,String nameFile,double weight){
        JLabel lbl_nameFile = new JLabel(nameFile);
        lbl_nameFile.setBounds(0,0,120, 30);
        JLabel lbl_weight_File = new JLabel(Double.toString(weight)+"MB");
        lbl_weight_File.setBounds((int)weight-30,0,50,30);
        
        
        JPanel jp= new JPanel();
        jp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        GroupLayout gl_jp=new GroupLayout(jp);
        jp.setLayout(gl_jp);
        jp.setBackground(Color.red);
        
        jp.setBounds(0,0,wigth, height);
        
        jp.add(lbl_nameFile);
        jp.add(lbl_weight_File);
        return jp;
    }
    */
    
    
}
