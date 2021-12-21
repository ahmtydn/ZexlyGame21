/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaproje2021;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author HP Pavilion Gaming
 */
public class squidgameCAM extends javax.swing.JFrame {

    /**
     * Creates new form squidgameCAM
     */
    
    
    
    Border siyah_sınır=BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
    String basariliAdim = "\\/resimler/foot2.png";
    String adimyok = "\\/resimler/adım-yok.png";
    String kirikcam = "\\/resimler/kırık-cam.png";
    Component [] comp1;
   Component [] comp2;
  
   Random random=new Random();
   
   
   String randomResim;
   JLabel[][] labels;
   String[][] imagesOrder=new String[6][2];
    ArrayList<String>list = new ArrayList<>();
    
    int sayac=0;
    boolean kazandin=true;
    
    public squidgameCAM() {
        initComponents();
        
        
         //formu ortalama
        
        this.setLocationRelativeTo(null);
        
                LabelKapatma();

        //sınır tanımlama
        
        jPanel_Baslangic.setBorder(siyah_sınır);
        jPanel_Bitis.setBorder(siyah_sınır);
        jLabel_Oyuncu_basla.setBorder(siyah_sınır);
        jLabel_Oyuncu_Bitis.setBorder(siyah_sınır);
        
        resimGoster(basariliAdim, jLabel_Oyuncu_basla);
        
        labels=new JLabel[][]{{jLabel1_1,jLabel1_2},{jLabel2_1,jLabel2_2},
                              {jLabel3_1,jLabel3_2},{jLabel4_1,jLabel4_2},
                              {jLabel5_1,jLabel5_2},{jLabel6_1,jLabel6_2}
   };
        
        //tüm labelları devredışı bırakma
        for(JLabel[] lbls: labels)
        {
            lbls[0].setEnabled(false);
            lbls[1].setEnabled(false);
        }
    
    list.add(basariliAdim);
    list.add(kirikcam);
  
    comp1=jPanel12.getComponents();
    comp2=jPanel13.getComponents();
    randomResim();
    HareketEkle();
    }
    
    
     public void LabelEtkinlestirme(int index)
    {
        if (index<=labels.length-1) {
            JLabel[] lbls = labels[index];
            lbls[0].setEnabled(true);
            lbls[1].setEnabled(true);
        }
    }
     public void LabelKapatma()
     {
        jLabel2_1.setEnabled(false);
        jLabel2_2.setEnabled(false);
        jLabel3_1.setEnabled(false);
        jLabel3_2.setEnabled(false);
        jLabel4_1.setEnabled(false);
        jLabel4_2.setEnabled(false);
        jLabel5_1.setEnabled(false);
        jLabel5_2.setEnabled(false);
        jLabel6_1.setEnabled(false);
        jLabel6_2.setEnabled(false);
        
        
     }
     
      public void randomResim()
 {
     for(int i = 0 ; i<labels.length;i++)
        {
            randomResim=list.get(random.nextInt(list.size()));
            imagesOrder[i][0]=randomResim;
            
            if(randomResim.equals(basariliAdim))
            {
                imagesOrder[i][1]=kirikcam;
            }
            else
            {
                imagesOrder[i][1]=basariliAdim;
                
            }
            System.out.println(imagesOrder[i][1]);
            System.out.println(imagesOrder[i][0]);
            System.out.println("--------------");
        }
     System.out.println("--------------");
     System.out.println("--------------");
 }
    public void HareketEkle()
    {
        LabelEtkinlestirme(sayac);
        for(Component comp : comp1)
        {
            if (comp instanceof JLabel) 
            {
                JLabel label=(JLabel) comp;
                label.addMouseListener(new java.awt.event.MouseAdapter() {
                     @Override
                     public void mouseClicked(java.awt.event.MouseEvent evt)
                     {
                         if (label.isEnabled()) {
                             resimGoster(imagesOrder[sayac][1], label);
                             
                             if (imagesOrder[sayac][1].equals(kirikcam))
                             {
                                 kazandin=false;
                             }
                             label.setEnabled(false);
                             JLabel label=(JLabel) comp2[sayac];
                             label.setEnabled(false);
                             if (sayac==imagesOrder.length-1&& kazandin==true) 
                             {
                                 resimGoster(basariliAdim, jLabel_Oyuncu_Bitis);
                                 jLabel_Sonuc.setText("Oyuncu 456 oyunu Kazandın. Tebrikler!!!");
                             }
                             else if(kazandin==false)
                             {
                                 jLabel_Sonuc.setText("Oyuncu 456 Elendin!!!");
                             }
                             sayac++;
                             LabelEtkinlestirme(sayac);
                         }
                         
                     }

                });
                
                
                
            }
            
        }
           //jPanel3
        for(Component comp : comp2)
        {
            if (comp instanceof JLabel) 
            {
                JLabel label=(JLabel) comp;
                label.addMouseListener(new java.awt.event.MouseAdapter() {
                     @Override
                     public void mouseClicked(java.awt.event.MouseEvent evt)
                     {
                         if (label.isEnabled()) {
                         
                             resimGoster(imagesOrder[sayac][0], label);
                             if (imagesOrder[sayac][0].equals(kirikcam))
                             {
                                 kazandin=false;
                                 
                             }
                             label.setEnabled(false);
                             JLabel label=(JLabel) comp1[sayac];
                             label.setEnabled(false);
                             if (sayac==imagesOrder.length-1&& kazandin==true) 
                             {
                                 resimGoster(basariliAdim, jLabel_Oyuncu_Bitis);
                                 jLabel_Sonuc.setText("Oyuncu 456 oyunu Kazandın. Tebrikler!!!");
                             }
                             else if(kazandin==false)
                             {
                                 jLabel_Sonuc.setText("Oyuncu 456 Elendin!!!");
                             }
                             sayac++;
                             LabelEtkinlestirme(sayac);
                         }
                             
                         
                         
                     }

                });
                
                
                
            }
            
        }
        
    }
    
    public void resimGoster(String imgPath,JLabel label)
    {
        ImageIcon imgIco = new ImageIcon(getClass().getResource(imgPath));
        Image image = imgIco.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(image));
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
        jPanel_Baslangic = new javax.swing.JPanel();
        jLabel_Oyuncu_basla = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel4_1 = new javax.swing.JLabel();
        jLabel3_1 = new javax.swing.JLabel();
        jLabel5_1 = new javax.swing.JLabel();
        jLabel1_1 = new javax.swing.JLabel();
        jLabel6_1 = new javax.swing.JLabel();
        jLabel2_1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel2_2 = new javax.swing.JLabel();
        jLabel3_2 = new javax.swing.JLabel();
        jLabel4_2 = new javax.swing.JLabel();
        jLabel5_2 = new javax.swing.JLabel();
        jLabel6_2 = new javax.swing.JLabel();
        jLabel1_2 = new javax.swing.JLabel();
        jPanel_Bitis = new javax.swing.JPanel();
        jLabel_Oyuncu_Bitis = new javax.swing.JLabel();
        jLabel_Sonuc = new javax.swing.JLabel();
        jButton_Tekrar_Oyna = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Baslangic.setBackground(new java.awt.Color(204, 77, 82));

        jLabel_Oyuncu_basla.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel_BaslangicLayout = new javax.swing.GroupLayout(jPanel_Baslangic);
        jPanel_Baslangic.setLayout(jPanel_BaslangicLayout);
        jPanel_BaslangicLayout.setHorizontalGroup(
            jPanel_BaslangicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BaslangicLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel_Oyuncu_basla, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel_BaslangicLayout.setVerticalGroup(
            jPanel_BaslangicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BaslangicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Oyuncu_basla, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel_Baslangic, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 802, 250, -1));

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4_1.setOpaque(true);
        jLabel4_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4_1MouseClicked(evt);
            }
        });

        jLabel3_1.setOpaque(true);
        jLabel3_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3_1MouseClicked(evt);
            }
        });

        jLabel5_1.setOpaque(true);
        jLabel5_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5_1MouseClicked(evt);
            }
        });

        jLabel1_1.setOpaque(true);
        jLabel1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1_1MouseClicked(evt);
            }
        });

        jLabel6_1.setOpaque(true);
        jLabel6_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6_1MouseClicked(evt);
            }
        });

        jLabel2_1.setOpaque(true);
        jLabel2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2_1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel1_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 139, -1, -1));

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2_2.setOpaque(true);
        jLabel2_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2_2MouseClicked(evt);
            }
        });

        jLabel3_2.setOpaque(true);
        jLabel3_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3_2MouseClicked(evt);
            }
        });

        jLabel4_2.setOpaque(true);
        jLabel4_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4_2MouseClicked(evt);
            }
        });

        jLabel5_2.setOpaque(true);
        jLabel5_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5_2MouseClicked(evt);
            }
        });

        jLabel6_2.setOpaque(true);
        jLabel6_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6_2MouseClicked(evt);
            }
        });

        jLabel1_2.setOpaque(true);
        jLabel1_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1_2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6_2, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 139, -1, 650));

        jPanel_Bitis.setBackground(new java.awt.Color(0, 132, 137));

        javax.swing.GroupLayout jPanel_BitisLayout = new javax.swing.GroupLayout(jPanel_Bitis);
        jPanel_Bitis.setLayout(jPanel_BitisLayout);
        jPanel_BitisLayout.setHorizontalGroup(
            jPanel_BitisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BitisLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel_Oyuncu_Bitis, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel_BitisLayout.setVerticalGroup(
            jPanel_BitisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BitisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Oyuncu_Bitis, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel_Bitis, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 230, -1));

        jLabel_Sonuc.setBackground(new java.awt.Color(0, 132, 137));
        jLabel_Sonuc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_Sonuc.setForeground(new java.awt.Color(255, 255, 0));
        jLabel_Sonuc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Sonuc.setAutoscrolls(true);
        jLabel_Sonuc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel_Sonuc.setOpaque(true);
        jPanel1.add(jLabel_Sonuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 349, 347, 77));

        jButton_Tekrar_Oyna.setBackground(new java.awt.Color(255, 51, 51));
        jButton_Tekrar_Oyna.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton_Tekrar_Oyna.setText("TIKLA");
        jButton_Tekrar_Oyna.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Tekrar_Oyna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Tekrar_OynaActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Tekrar_Oyna, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 458, 347, 74));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Tekrar Oyna    :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 444, -1, 88));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 51));
        jLabel2.setText("Oyun Sonucu :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 338, -1, 88));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaproje2021/resimler/squid game_840x940.jpg"))); // NOI18N
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 940));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 940));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Tekrar_OynaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Tekrar_OynaActionPerformed
        LabelKapatma();
        // populate table with images in random order
        randomResim();
        // remove images from the jlabels
        for(JLabel[] lbls : labels)
        {
            lbls[0].setIcon(null);
            lbls[1].setIcon(null);
        }
        jLabel_Oyuncu_Bitis.setIcon(null);
        sayac = 0;
        kazandin = true;
        jLabel_Sonuc.setText("");
        LabelEtkinlestirme(sayac);

    }//GEN-LAST:event_jButton_Tekrar_OynaActionPerformed

    private void jLabel1_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_2MouseClicked
        jLabel1_1.setEnabled(false);
        jLabel2_1.setEnabled(true);
        jLabel2_2.setEnabled(true);
    }//GEN-LAST:event_jLabel1_2MouseClicked

    private void jLabel6_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6_2MouseClicked
        jLabel6_1.setEnabled(false);
    }//GEN-LAST:event_jLabel6_2MouseClicked

    private void jLabel5_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5_2MouseClicked
        jLabel5_1.setEnabled(false);
        jLabel6_1.setEnabled(true);
        jLabel6_2.setEnabled(true);
    }//GEN-LAST:event_jLabel5_2MouseClicked

    private void jLabel4_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4_2MouseClicked
        jLabel4_1.setEnabled(false);
        jLabel5_1.setEnabled(true);
        jLabel5_2.setEnabled(true);
    }//GEN-LAST:event_jLabel4_2MouseClicked

    private void jLabel3_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3_2MouseClicked
        jLabel3_1.setEnabled(false);
        jLabel4_1.setEnabled(true);
        jLabel4_2.setEnabled(true);
    }//GEN-LAST:event_jLabel3_2MouseClicked

    private void jLabel2_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_2MouseClicked
        jLabel2_1.setEnabled(false);
        jLabel3_1.setEnabled(true);
        jLabel3_2.setEnabled(true);
    }//GEN-LAST:event_jLabel2_2MouseClicked

    private void jLabel2_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_1MouseClicked
        jLabel2_2.setEnabled(false);
        jLabel3_1.setEnabled(true);
        jLabel3_2.setEnabled(true);
    }//GEN-LAST:event_jLabel2_1MouseClicked

    private void jLabel6_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6_1MouseClicked
        jLabel6_2.setEnabled(false);

    }//GEN-LAST:event_jLabel6_1MouseClicked

     //label mouse click disable etme kodları 
    private void jLabel1_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_1MouseClicked
        jLabel1_2.setEnabled(false);
        jLabel2_1.setEnabled(true);
        jLabel2_2.setEnabled(true);

    }//GEN-LAST:event_jLabel1_1MouseClicked

    private void jLabel5_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5_1MouseClicked
        jLabel5_2.setEnabled(false);
        jLabel6_1.setEnabled(true);
        jLabel6_2.setEnabled(true);
    }//GEN-LAST:event_jLabel5_1MouseClicked

    private void jLabel3_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3_1MouseClicked
        jLabel3_2.setEnabled(false);
        jLabel4_1.setEnabled(true);
        jLabel4_2.setEnabled(true);
    }//GEN-LAST:event_jLabel3_1MouseClicked

    private void jLabel4_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4_1MouseClicked
        jLabel4_2.setEnabled(false);
        jLabel5_1.setEnabled(true);
        jLabel5_2.setEnabled(true);
    }//GEN-LAST:event_jLabel4_1MouseClicked
      
    
   
                
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
            java.util.logging.Logger.getLogger(squidgameCAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(squidgameCAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(squidgameCAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(squidgameCAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new squidgameCAM().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Tekrar_Oyna;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_1;
    private javax.swing.JLabel jLabel1_2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2_1;
    private javax.swing.JLabel jLabel2_2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel3_1;
    private javax.swing.JLabel jLabel3_2;
    private javax.swing.JLabel jLabel4_1;
    private javax.swing.JLabel jLabel4_2;
    private javax.swing.JLabel jLabel5_1;
    private javax.swing.JLabel jLabel5_2;
    private javax.swing.JLabel jLabel6_1;
    private javax.swing.JLabel jLabel6_2;
    private javax.swing.JLabel jLabel_Oyuncu_Bitis;
    private javax.swing.JLabel jLabel_Oyuncu_basla;
    private javax.swing.JLabel jLabel_Sonuc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel_Baslangic;
    private javax.swing.JPanel jPanel_Bitis;
    // End of variables declaration//GEN-END:variables
}
