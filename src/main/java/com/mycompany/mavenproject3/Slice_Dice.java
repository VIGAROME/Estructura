/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.mycompany.mavenproject3;

import TDAs.TreeMap;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Rectangle;
import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 *
 * @author garci
 */
public class Slice_Dice extends javax.swing.JFrame {
    
    private TreeMap map;
    
    
    
    /** Creates new form Slice_Dice */
    public Slice_Dice() {
        initComponents();
    }
    
    public Slice_Dice(TreeMap map) {
        //this();
        this.map=map;
        initComponents(particiones(map,500,660,true));
        //initComponents(crearPanel(500, 660, "Directorio Principal", 800.00));
        
    }

    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jlb_SC = new javax.swing.JLabel();
        btn_regresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlb_SC.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jlb_SC.setText("Slice&Dice");
        jlb_SC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb_SCMouseClicked(evt);
            }
        });

        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_regresar)
                .addGap(124, 124, 124))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jlb_SC, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlb_SC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(btn_regresar)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(306, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void initComponents( javax.swing.JPanel jPanel1) {

        
        Ventana v1 = new Ventana();
        
        v1.setLocationRelativeTo(null);
        v1.addPanel(jPanel1);
        v1.setVisible(true);
        //pack();
    }// </editor-fold>                        

    
    
    
    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void jTextArea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseClicked
        
    }//GEN-LAST:event_jTextArea1MouseClicked

    private void jlb_SCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb_SCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlb_SCMouseClicked

    private void jlb_SCMouseClicked(java.awt.event.MouseEvent evt, TreeMap mp) throws IOException {                                    
        Desktop d = Desktop.getDesktop();
        File f= new File(map.getRoot().getPath());
        d.open(f);
    }                                   

    private void jTextArea1MouseClicked(java.awt.event.MouseEvent evt, TreeMap m) throws IOException {                                        
        
        Desktop d = Desktop.getDesktop();
        File f= new File(map.getRoot().getPath()+"\\"+m.getRoot().getName());
        d.open(f);
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Slice_Dice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Slice_Dice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Slice_Dice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Slice_Dice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Slice_Dice().setVisible(true);
            }
        });
    }
    public JPanel particiones(TreeMap map, int width,int height, boolean isVertical ){
        if(map!=null){
            JPanel jPrincipal = crearJPanel(height, width, map);
            if(map.isDirectory()){
                // boolean isVertical=true; por defecto is true
                Stack<TreeMap> s = new Stack<>();
                int Num_Children = map.getChildren().size();
                double tamnio_totalMb= map.getWeight();
                for(TreeMap tm: map.getChildren()){
                    s.push(tm);
                }
                double porc_taminio;
                int punteroV=0;
                int punteroH=40;
                while (!s.isEmpty()) {
                    JPanel jsub=null;
                    TreeMap tm2 = s.pop();
                    porc_taminio= tm2.getWeight()/tamnio_totalMb;
                    if (tm2.isFile()){
                        JTextArea txtArchivo= crearJTextArea(height,(int)(width*porc_taminio), tm2);
                        txtArchivo.setLocation(punteroV, 40);
                        punteroV+=(int)(width*porc_taminio);
                        if (porc_taminio > 0.75){
                            txtArchivo.setRows(20);
                            txtArchivo.setColumns(20);
                        }else if (porc_taminio > 0.50){
                            txtArchivo.setRows(10);
                            txtArchivo.setColumns(20);
                        }else if (porc_taminio > 0.25){
                            txtArchivo.setRows(10);
                            txtArchivo.setColumns(10);
                        }else{
                            txtArchivo.setRows(5);
                            txtArchivo.setColumns(5);
                        }
                        jPrincipal.add(txtArchivo);
                        txtArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        try {
                                            jTextArea1MouseClicked(evt,tm2);
                                        } catch (IOException ex) {
                                            Logger.getLogger(Slice_Dice.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }
                                });
                        
                    }else{
                        JButton b =crearJButton(height, (int)(width*porc_taminio), tm2);
                        if (porc_taminio > 0.75){
                            
                            Dimension dim = new Dimension(320,320);
                            b.setPreferredSize(dim);
                            
                        }else if (porc_taminio > 0.50){
                            
                            Dimension dim = new Dimension(180,160);
                            b.setPreferredSize(dim);
                        }else if (porc_taminio > 0.25){
                            
                            Dimension dim = new Dimension(180,80);
                            b.setPreferredSize(dim);
                        }
                        
                        jPrincipal.add(b,3);
                       
                        
                        b.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_selectActionPerformed(evt,tm2);
                            }
                        });
                        
                    }
                    
                    
                }
            }
            
            
            return jPrincipal;
        }
        
        return null;
    }
    
    private void btn_selectActionPerformed(java.awt.event.ActionEvent evt,TreeMap map) {
        Slice_Dice sc = new Slice_Dice(map);
    }                                           

    private JTextArea crearJTextArea(int height, int width,TreeMap tm){
        JTextArea txt_Area=new JTextArea();
        txt_Area.setColumns(10);
        txt_Area.setRows(0);
        txt_Area.setBackground(Color.LIGHT_GRAY);//Color de Defautl
        String s =tm.getRoot().getName();
        String type_file = s.substring(s.length()-3, s.length());
        System.out.println(type_file);
        if(type_file.equals("lsx")){
            System.out.println("Ingreso lsx");
            txt_Area.setBackground(Color.green);
        }else if(type_file.equals("ocx")){
            txt_Area.setBackground(new Color(102, 153, 250));
        }else if(type_file.equals("ptm")){
            txt_Area.setBackground(Color.RED);
        }else if (type_file.equals("zip") || type_file.equals("rar")){
            txt_Area.setBackground(Color.yellow);
        }else if(type_file.equals("png") || type_file.equals("jpg")){
            txt_Area.setBackground(Color.ORANGE);
        }else if (type_file.equals("pdf")){
            txt_Area.setBackground(Color.PINK);
        }
        txt_Area.setText(tm.getRoot().getName()+'\n'+tm.getRoot().getWeightString());
        txt_Area.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtA_ArchivoMouseClicked(evt);
            }
        });
        //txt_Area.setBounds(0, 0, width, height);
        return txt_Area;
    }
    private JButton crearJButton(int height, int width,TreeMap tm){
        JButton b= new JButton();
        b.setBackground(Color.CYAN);
        b.setText(tm.getRoot().getName()+"->"+tm.getRoot().getWeightString());
        //b.setBounds(0, 0, width, height);
        
        
        return b;
    }
            
    
    private JPanel crearJPanel(int height, int width,TreeMap tm){
        JButton stageCloseButton = new JButton("<_");
        stageCloseButton.setBackground(Color.WHITE);
        stageCloseButton.setBounds(0, 0, 5, 5);
        Rectangle aa = new Rectangle(0,0,10,10);
        JPanel jp = new JPanel();
        jp.setBackground(Color.white);
        jp.setSize(width, height);
        jp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null));
        JLabel lbl_nameFile= new JLabel(tm.getRoot().getName());
        lbl_nameFile.setBounds(0,0,15, 15);
        JLabel lbl_weightFile= new JLabel(tm.getRoot().getWeightString());
        lbl_weightFile.setBounds(0,0,50,30);
        lbl_nameFile.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    jlb_SCMouseClicked(evt, tm);
                } catch (IOException ex) {
                    Logger.getLogger(Slice_Dice.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        stageCloseButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            Window win = SwingUtilities.getWindowAncestor(jp);
                            win.dispose();
                            }
                            });
        jp.add(lbl_nameFile, 0);
        jp.add(lbl_weightFile,1);
        jp.add(stageCloseButton);
        
        stageCloseButton.setLocation(0, 0);
        return jp;
    }
    
    private JPanel crearJPanel(int height, int width, String nameFile, double weight){
        JPanel jp = new JPanel();
        jp.setBackground(Color.red);
        jp.setSize(width, height);
        jp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null));
        JLabel lbl_nameFile= new JLabel(nameFile);
        lbl_nameFile.setBounds(0,0,120, 30);
        JLabel lbl_weightFile= new JLabel(Double.toString(weight)+" MB");
        lbl_weightFile.setBounds((int)weight-30,0,50,30);
        jp.add(lbl_nameFile, 0);
        jp.add(lbl_weightFile,1);
        return jp;
    }
    
    private void txtA_ArchivoMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
    } 
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_regresar;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlb_SC;
    // End of variables declaration//GEN-END:variables

}
