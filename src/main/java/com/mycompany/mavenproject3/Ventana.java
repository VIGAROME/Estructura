/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

import java.awt.BorderLayout;
import java.awt.Color;
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
        UnitComponet();
    }
    
    private void UnitComponet(){
        int wigth=900;
        int height=800;
        String nameFile="Directorio Principal";
        double weight=800.00;
        JPanel jP= crearPanel(wigth, height, nameFile, weight);
        JPanel jp1= crearPanel(wigth,(int)(height*(150/800)),"Archivo1",150.00);
        jp1.setBackground(Color.BLUE);
        jp1.setLocation(100, 40);
        jP.add(jp1,BorderLayout.CENTER,1);
        //
        JPanel jp2= crearPanel(wigth,(int)(height*(150/800)),"Archivo2",150.00);
        jP.add(jp2, BorderLayout.CENTER );
        JPanel jp3= crearPanel(wigth,(int)(height*(100/800)),"Archivo3",100.00);
        jP.add(jp3, BorderLayout.CENTER );
        JPanel jpsub= crearPanel(wigth,(int)(height*(400/800)),"SubDirectorio",400.00);
        JPanel jpsub1= crearPanel((int)(wigth*(100/400)),(int)(height*(400/800)),"Archivo4",100.00);
        jpsub.add(jpsub1, BorderLayout.CENTER );
        JPanel jpsub2= crearPanel(wigth,(int)(height*(300/400)),"Archivo5",300.00);
        jpsub.add(jpsub2, BorderLayout.CENTER );
        jP.add(jpsub, BorderLayout.CENTER );//
        
        this.getContentPane().add(jP);
    }
    
    private JPanel crearPanel(int wigth, int height,String nameFile,double weight){
        JPanel jp= new JPanel();
        jp.setLayout(null);
        jp.setBackground(Color.red);
        jp.setBounds(0,0,wigth, height);
        JLabel lbl_nameFile = new JLabel(nameFile);
        lbl_nameFile.setBounds(0,0,120, 30);
        JLabel lbl_weight_File = new JLabel(Double.toString(weight)+"MB");
        lbl_weight_File.setBounds(wigth-65,0,50,30);
        jp.add(lbl_nameFile);
        jp.add(lbl_weight_File);
        return jp;
    }
    
    
    
}
