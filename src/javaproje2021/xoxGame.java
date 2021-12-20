/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaproje2021;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HP Pavilion Gaming
 */
public class xoxGame extends javax.swing.JFrame {

    private String OyunBasla = "X";
    private int xCount=0;
    private int oCount=0;
    boolean kontrol;
    int hamlesayisi=0;
    
    
    
    public xoxGame() {
        initComponents();
    }

    private void oyunSkoru()
    {
        jLabelOyuncu_X.setText(String.valueOf(xCount));
        jLabelOyuncu_O.setText(String.valueOf(oCount));
    }
    
    private void OyuncuSecme()
    {
        if(OyunBasla.equalsIgnoreCase("X"))
        {
            OyunBasla="O";
        }
        else
        {
            OyunBasla="X";
        }
    }
    private void OyunuKazandı()
    {
        String z1=jbtnXOX1.getText();
        String z2=jbtnXOX2.getText();
        String z3=jbtnXOX3.getText();
        String z4=jbtnXOX4.getText();
        String z5=jbtnXOX5.getText();
        String z6=jbtnXOX6.getText();
        String z7=jbtnXOX7.getText();
        String z8=jbtnXOX8.getText();
        String z9=jbtnXOX9.getText();
        
        if(z1==("X")&& z2==("X")&& z3==("X"))
        {
            boyaci();
            hamlesayisi=0;
            jbtnXOX1.setBackground(Color.RED);
            jbtnXOX2.setBackground(Color.RED);
            jbtnXOX3.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this,"Oyuncu X Kazandı","XoX" ,JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            oyunSkoru();
        } 
       if(z4==("X")&& z5==("X")&& z6==("X"))
        {
            boyaci();
            hamlesayisi=0;
            jbtnXOX4.setBackground(Color.RED);
            jbtnXOX5.setBackground(Color.RED);
            jbtnXOX6.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this,"Oyuncu X Kazandı","XoX" ,JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            oyunSkoru();
        } 
       if(z7==("X")&& z8==("X")&& z9==("X"))
        {
            boyaci();
            hamlesayisi=0;
            jbtnXOX7.setBackground(Color.RED);
            jbtnXOX8.setBackground(Color.RED);
            jbtnXOX9.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this,"Oyuncu X Kazandı","XoX" ,JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            oyunSkoru();
        } 
        //çapraz
      if(z1==("X")&& z4==("X")&& z7==("X"))
        {
            boyaci();
            hamlesayisi=0;
            jbtnXOX1.setBackground(Color.RED);
            jbtnXOX4.setBackground(Color.RED);
            jbtnXOX7.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this,"Oyuncu X Kazandı","XoX" ,JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            oyunSkoru();
        } 
       if(z2==("X")&& z5==("X")&& z8==("X"))
        {
            boyaci();
            hamlesayisi=0;
            jbtnXOX2.setBackground(Color.RED);
            jbtnXOX5.setBackground(Color.RED);
            jbtnXOX9.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this,"Oyuncu X Kazandı","XoX" ,JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            oyunSkoru();
        } 
       if(z3==("X")&& z6==("X")&& z9==("X"))
        {
            boyaci();
            hamlesayisi=0;
            jbtnXOX3.setBackground(Color.RED);
            jbtnXOX6.setBackground(Color.RED);
            jbtnXOX9.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this,"Oyuncu X Kazandı","XoX" ,JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            oyunSkoru();
        } 
      if(z1==("X")&& z5==("X")&& z9==("X"))
        {
            boyaci();
            hamlesayisi=0;
            jbtnXOX1.setBackground(Color.RED);
            jbtnXOX5.setBackground(Color.RED);
            jbtnXOX9.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this,"Oyuncu X Kazandı","XoX" ,JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            oyunSkoru();
        } 
      if(z3==("X")&& z5==("X")&& z7==("X"))
        {
            hamlesayisi=0;
            jbtnXOX3.setBackground(Color.RED);
            jbtnXOX5.setBackground(Color.RED);
            jbtnXOX7.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this,"Oyuncu X Kazandı","XoX" ,JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            oyunSkoru();
        } 
        
        //O oyuncu için :
        
       if(z1==("O")&& z2==("O")&& z3==("O"))
        {
            boyaci();
            hamlesayisi=0;
            jbtnXOX1.setBackground(Color.GREEN);
            jbtnXOX2.setBackground(Color.GREEN);
            jbtnXOX3.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,"Oyuncu O Kazandı","XoX" ,JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            oyunSkoru();
        } 
      if(z4==("O")&& z5==("O")&& z6==("O"))
        {
            boyaci();
            hamlesayisi=0;
            jbtnXOX4.setBackground(Color.GREEN);
            jbtnXOX5.setBackground(Color.GREEN);
            jbtnXOX6.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,"Oyuncu O Kazandı","XoX" ,JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            oyunSkoru();
        } 
       if(z7==("O")&& z8==("O")&& z9==("O"))
        {
            
            boyaci();
            hamlesayisi=0;
            jbtnXOX7.setBackground(Color.GREEN);
            jbtnXOX8.setBackground(Color.GREEN);
            jbtnXOX9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,"Oyuncu O Kazandı","XoX" ,JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            oyunSkoru();
        } 
        
        //çapraz
       if(z1==("O")&& z4==("O")&& z7==("O"))
        {
            boyaci();
            hamlesayisi=0;
            jbtnXOX1.setBackground(Color.GREEN);
            jbtnXOX4.setBackground(Color.GREEN);
            jbtnXOX7.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,"Oyuncu O Kazandı","XoX" ,JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            oyunSkoru();
        } 
       if(z2==("O")&& z5==("O")&& z8==("O"))
        {
            boyaci();
            hamlesayisi=0;
            jbtnXOX2.setBackground(Color.GREEN);
            jbtnXOX5.setBackground(Color.GREEN);
            jbtnXOX8.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,"Oyuncu O Kazandı","XoX" ,JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            oyunSkoru();
        } 
       if(z3==("O")&& z6==("O")&& z9==("O"))
        {
            boyaci();
            hamlesayisi=0;
            jbtnXOX3.setBackground(Color.GREEN);
            jbtnXOX6.setBackground(Color.GREEN);
            jbtnXOX9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,"Oyuncu O Kazandı","XoX" ,JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            oyunSkoru();
        } 
       if(z1==("O")&& z5==("O")&& z9==("O"))
        {
            boyaci();
            jbtnXOX1.setBackground(Color.GREEN);
            jbtnXOX5.setBackground(Color.GREEN);
            jbtnXOX9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,"Oyuncu O Kazandı","XoX" ,JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            oyunSkoru();
            hamlesayisi=0;
        } 
       if(z3==("O")&& z5==("O")&& z7==("O"))
        {
            boyaci();
            jbtnXOX3.setBackground(Color.GREEN);
            jbtnXOX5.setBackground(Color.GREEN);
            jbtnXOX7.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,"Oyuncu O Kazandı","XoX" ,JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            oyunSkoru();
            hamlesayisi=0;
        }
       
       hamlesayisi++;
       
       if(hamlesayisi==9)
       {
           berabere();
           
       }
     
      
         
    }
    
    private void boyaci()
    {
        jbtnXOX1.setEnabled(true);
        jbtnXOX2.setEnabled(true);
        jbtnXOX3.setEnabled(true);
        jbtnXOX4.setEnabled(true);
        jbtnXOX5.setEnabled(true);
        jbtnXOX6.setEnabled(true);
        jbtnXOX7.setEnabled(true);
        jbtnXOX8.setEnabled(true);
        jbtnXOX9.setEnabled(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelOyuncu_O = new javax.swing.JLabel();
        jLabelOyuncu_X = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbtnXOX1 = new javax.swing.JButton();
        jbtnXOX2 = new javax.swing.JButton();
        jbtnXOX3 = new javax.swing.JButton();
        jbtnXOX4 = new javax.swing.JButton();
        jbtnXOX5 = new javax.swing.JButton();
        jbtnXOX6 = new javax.swing.JButton();
        jbtnXOX7 = new javax.swing.JButton();
        jbtnXOX8 = new javax.swing.JButton();
        jbtnXOX9 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(95, 158, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton1.setText("Yeni Oyuna Başla");
        jButton1.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton1.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton1.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 690, 130));

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton11.setText("Yenile");
        jButton11.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton11.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton11.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 350, 110));

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton12.setText("Çıkış");
        jButton12.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton12.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton12.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 330, 110));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 730, 300));

        jPanel5.setBackground(new java.awt.Color(95, 158, 160));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 65)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 51));
        jLabel1.setText("Oyuncu O :");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 350, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Oyuncu X :");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 90));

        jLabelOyuncu_O.setFont(new java.awt.Font("Segoe UI", 1, 65)); // NOI18N
        jLabelOyuncu_O.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelOyuncu_O.setText("0");
        jLabelOyuncu_O.setOpaque(true);
        jPanel5.add(jLabelOyuncu_O, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 350, 90));

        jLabelOyuncu_X.setFont(new java.awt.Font("Segoe UI", 1, 65)); // NOI18N
        jLabelOyuncu_X.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelOyuncu_X.setText("0");
        jLabelOyuncu_X.setOpaque(true);
        jPanel5.add(jLabelOyuncu_X, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 350, 90));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 730, 240));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 770, 600));

        jPanel4.setBackground(new java.awt.Color(95, 158, 160));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnXOX1.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnXOX1.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnXOX1.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnXOX1.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnXOX1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXOX1ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnXOX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 170, 160));

        jbtnXOX2.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnXOX2.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnXOX2.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnXOX2.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnXOX2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXOX2ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnXOX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 170, 160));

        jbtnXOX3.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnXOX3.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnXOX3.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnXOX3.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnXOX3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXOX3ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnXOX3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 170, 160));

        jbtnXOX4.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnXOX4.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnXOX4.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnXOX4.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnXOX4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXOX4ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnXOX4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 170, 160));

        jbtnXOX5.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnXOX5.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnXOX5.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnXOX5.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnXOX5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXOX5ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnXOX5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 170, 160));

        jbtnXOX6.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnXOX6.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnXOX6.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnXOX6.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnXOX6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXOX6ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnXOX6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 170, 160));

        jbtnXOX7.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnXOX7.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnXOX7.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnXOX7.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnXOX7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXOX7ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnXOX7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 170, 160));

        jbtnXOX8.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnXOX8.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnXOX8.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnXOX8.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnXOX8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXOX8ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnXOX8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 170, 160));

        jbtnXOX9.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnXOX9.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnXOX9.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnXOX9.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnXOX9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXOX9ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnXOX9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 170, 160));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 690, 600));

        jPanel6.setBackground(new java.awt.Color(95, 158, 160));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("XoX Game Design by Zexly");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 1170, 90));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1480, 130));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   private JFrame frame;
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Çıkış yapılacak,emin misiniz ?","XoX",
               JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION)
        {
          setVisible(false); //you can't see me!
dispose();
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        hamlesayisi=0;
        jbtnXOX1.setEnabled(true);
        jbtnXOX2.setEnabled(true);
        jbtnXOX3.setEnabled(true);
        jbtnXOX4.setEnabled(true);
        jbtnXOX5.setEnabled(true);
        jbtnXOX6.setEnabled(true);
        jbtnXOX7.setEnabled(true);
        jbtnXOX8.setEnabled(true);
        jbtnXOX9.setEnabled(true);
        
        
        jbtnXOX1.setText("");
        jbtnXOX2.setText("");
        jbtnXOX3.setText("");
        jbtnXOX4.setText("");
        jbtnXOX5.setText("");
        jbtnXOX6.setText("");
        jbtnXOX7.setText("");
        jbtnXOX8.setText("");
        jbtnXOX9.setText("");
        
        jbtnXOX1.setBackground(Color.LIGHT_GRAY);
        jbtnXOX2.setBackground(Color.LIGHT_GRAY);
        jbtnXOX3.setBackground(Color.LIGHT_GRAY);
        jbtnXOX4.setBackground(Color.LIGHT_GRAY);
        jbtnXOX5.setBackground(Color.LIGHT_GRAY);
        jbtnXOX6.setBackground(Color.LIGHT_GRAY);
        jbtnXOX7.setBackground(Color.LIGHT_GRAY);
        jbtnXOX8.setBackground(Color.LIGHT_GRAY);
        jbtnXOX9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        xCount=0;
        oCount=0;
        hamlesayisi=0;
        jbtnXOX1.setEnabled(true);
        jbtnXOX2.setEnabled(true);
        jbtnXOX3.setEnabled(true);
        jbtnXOX4.setEnabled(true);
        jbtnXOX5.setEnabled(true);
        jbtnXOX6.setEnabled(true);
        jbtnXOX7.setEnabled(true);
        jbtnXOX8.setEnabled(true);
        jbtnXOX9.setEnabled(true);
        
        jLabelOyuncu_O.setText("0");
        jLabelOyuncu_X.setText("0");
        
        jbtnXOX1.setText("");
        jbtnXOX2.setText("");
        jbtnXOX3.setText("");
        jbtnXOX4.setText("");
        jbtnXOX5.setText("");
        jbtnXOX6.setText("");
        jbtnXOX7.setText("");
        jbtnXOX8.setText("");
        jbtnXOX9.setText("");
        
        jbtnXOX1.setBackground(Color.LIGHT_GRAY);
        jbtnXOX2.setBackground(Color.LIGHT_GRAY);
        jbtnXOX3.setBackground(Color.LIGHT_GRAY);
        jbtnXOX4.setBackground(Color.LIGHT_GRAY);
        jbtnXOX5.setBackground(Color.LIGHT_GRAY);
        jbtnXOX6.setBackground(Color.LIGHT_GRAY);
        jbtnXOX7.setBackground(Color.LIGHT_GRAY);
        jbtnXOX8.setBackground(Color.LIGHT_GRAY);
        jbtnXOX9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtnXOX1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXOX1ActionPerformed
       jbtnXOX1.setText(OyunBasla);
       
       if(OyunBasla.equalsIgnoreCase("X"))
       {
          kontrol=false;
          
       }
       else
       {
           kontrol=true;
       }
       jbtnXOX1.setEnabled(false);
       OyuncuSecme();
       OyunuKazandı(); 
       
    }//GEN-LAST:event_jbtnXOX1ActionPerformed

    private void berabere()
    {
     
           JOptionPane.showMessageDialog(this,"Oyun Berabere","XoX" ,JOptionPane.INFORMATION_MESSAGE);
           hamlesayisi=0;
             jbtnXOX1.setEnabled(true);
             jbtnXOX2.setEnabled(true);
             jbtnXOX3.setEnabled(true);
             jbtnXOX4.setEnabled(true);
             jbtnXOX5.setEnabled(true);
             jbtnXOX6.setEnabled(true);
             jbtnXOX7.setEnabled(true);
             jbtnXOX8.setEnabled(true);
             jbtnXOX9.setEnabled(true);
        
        
        jbtnXOX1.setText("");
        jbtnXOX2.setText("");
        jbtnXOX3.setText("");
        jbtnXOX4.setText("");
        jbtnXOX5.setText("");
        jbtnXOX6.setText("");
        jbtnXOX7.setText("");
        jbtnXOX8.setText("");
        jbtnXOX9.setText("");
        
        jbtnXOX1.setBackground(Color.LIGHT_GRAY);
        jbtnXOX2.setBackground(Color.LIGHT_GRAY);
        jbtnXOX3.setBackground(Color.LIGHT_GRAY);
        jbtnXOX4.setBackground(Color.LIGHT_GRAY);
        jbtnXOX5.setBackground(Color.LIGHT_GRAY);
        jbtnXOX6.setBackground(Color.LIGHT_GRAY);
        jbtnXOX7.setBackground(Color.LIGHT_GRAY);
        jbtnXOX8.setBackground(Color.LIGHT_GRAY);
        jbtnXOX9.setBackground(Color.LIGHT_GRAY);
       
    }
    private void jbtnXOX2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXOX2ActionPerformed
        jbtnXOX2.setText(OyunBasla);
       
       if(OyunBasla.equalsIgnoreCase("X"))
       {
          kontrol=false;
          
       }
       else
       {
           kontrol=true;
       }
       jbtnXOX2.setEnabled(false);
       OyuncuSecme();
       OyunuKazandı(); 
       
    }//GEN-LAST:event_jbtnXOX2ActionPerformed

    private void jbtnXOX3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXOX3ActionPerformed
       jbtnXOX3.setText(OyunBasla);
       
       if(OyunBasla.equalsIgnoreCase("X"))
       {
          kontrol=false;
          
       }
       else
       {
           kontrol=true;
       }
       jbtnXOX3.setEnabled(false);
       OyuncuSecme();
       OyunuKazandı(); 
    }//GEN-LAST:event_jbtnXOX3ActionPerformed

    private void jbtnXOX4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXOX4ActionPerformed
        jbtnXOX4.setText(OyunBasla);
       
       if(OyunBasla.equalsIgnoreCase("X"))
       {
          kontrol=false;
          
       }
       else
       {
           kontrol=true;
       }
       jbtnXOX4.setEnabled(false);
       OyuncuSecme();
       OyunuKazandı(); 
    }//GEN-LAST:event_jbtnXOX4ActionPerformed

    private void jbtnXOX5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXOX5ActionPerformed
        jbtnXOX5.setText(OyunBasla);
       
       if(OyunBasla.equalsIgnoreCase("X"))
       {
          kontrol=false;
          
       }
       else
       {
           kontrol=true;
       }
       jbtnXOX5.setEnabled(false);
       OyuncuSecme();
       OyunuKazandı(); 
    }//GEN-LAST:event_jbtnXOX5ActionPerformed

    private void jbtnXOX6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXOX6ActionPerformed
        jbtnXOX6.setText(OyunBasla);
       
       if(OyunBasla.equalsIgnoreCase("X"))
       {
          kontrol=false;
          
       }
       else
       {
           kontrol=true;
       }
       jbtnXOX6.setEnabled(false);
       OyuncuSecme();
       OyunuKazandı(); 
    }//GEN-LAST:event_jbtnXOX6ActionPerformed

    private void jbtnXOX7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXOX7ActionPerformed
       jbtnXOX7.setText(OyunBasla);
       
       if(OyunBasla.equalsIgnoreCase("X"))
       {
          kontrol=false;
          
       }
       else
       {
           kontrol=true;
       }
       jbtnXOX7.setEnabled(false);
       OyuncuSecme();
       OyunuKazandı(); 
    }//GEN-LAST:event_jbtnXOX7ActionPerformed

    private void jbtnXOX8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXOX8ActionPerformed
        jbtnXOX8.setText(OyunBasla);
       
       if(OyunBasla.equalsIgnoreCase("X"))
       {
          kontrol=false;
          
       }
       else
       {
           kontrol=true;
       }
       jbtnXOX8.setEnabled(false);
       OyuncuSecme();
       OyunuKazandı(); 
    }//GEN-LAST:event_jbtnXOX8ActionPerformed

    private void jbtnXOX9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXOX9ActionPerformed
        jbtnXOX9.setText(OyunBasla);
       
       if(OyunBasla.equalsIgnoreCase("X"))
       {
          kontrol=false;
          
       }
       else
       {
           kontrol=true;
       }
       jbtnXOX9.setEnabled(false);
       OyuncuSecme();
       OyunuKazandı(); 
    }//GEN-LAST:event_jbtnXOX9ActionPerformed

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
            java.util.logging.Logger.getLogger(xoxGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(xoxGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(xoxGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(xoxGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new xoxGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelOyuncu_O;
    private javax.swing.JLabel jLabelOyuncu_X;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jbtnXOX1;
    private javax.swing.JButton jbtnXOX2;
    private javax.swing.JButton jbtnXOX3;
    private javax.swing.JButton jbtnXOX4;
    private javax.swing.JButton jbtnXOX5;
    private javax.swing.JButton jbtnXOX6;
    private javax.swing.JButton jbtnXOX7;
    private javax.swing.JButton jbtnXOX8;
    private javax.swing.JButton jbtnXOX9;
    // End of variables declaration//GEN-END:variables
}
