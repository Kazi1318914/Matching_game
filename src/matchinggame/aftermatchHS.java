/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchinggame;

import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YorickDigsGraves
 */
class waitt {

}

public class aftermatchHS extends javax.swing.JFrame {

    /**
     * Creates new form aftermatchHS
     */
    FileInputStream fis;
    ObjectInputStream ois;

    FileOutputStream fos;
    ObjectOutputStream oos;

    ArrayList<PlayerInfo> holdplayer = new ArrayList<>();

    String sc = "", se = "";

    public aftermatchHS() throws Exception {
        initComponents();

        showPlayerList();


    }

    void showPlayerList() throws IOException, ClassNotFoundException, InterruptedException {

        fis = new FileInputStream("playerinfo.txt");
        ois = new ObjectInputStream(fis);

        holdplayer = (ArrayList<PlayerInfo>) ois.readObject();

        fis.close();
        ois.close();

        for(int j = 0; j < holdplayer.size() - 1; j++)
        {
            for(int k = j+1; k < holdplayer.size(); k++)
            {
                if(holdplayer.get(j).point < holdplayer.get(k).point)
                {
                    PlayerInfo temp = new PlayerInfo();
                    temp.pName = holdplayer.get(j).pName;
                    temp.key = holdplayer.get(j).key;
                    temp.point = holdplayer.get(j).point;
                    temp.sec = holdplayer.get(j).sec;
                    
                    holdplayer.get(j).pName = holdplayer.get(k).pName;
                    holdplayer.get(j).key = holdplayer.get(k).key;
                    holdplayer.get(j).point = holdplayer.get(k).point;
                    holdplayer.get(j).sec = holdplayer.get(k).sec;
                    
                    holdplayer.get(k).pName = temp.pName;
                    holdplayer.get(k).key = temp.key;
                    holdplayer.get(k).point = temp.point;
                    holdplayer.get(k).sec = temp.sec;
                    
                    
                    
                }
            }
        }
        
        
        
        for (int j = 0; j < holdplayer.size(); j++) {
            if (holdplayer.get(j).key == 1) {
                sc = Integer.toString(holdplayer.get(j).point);
                se = Integer.toString(holdplayer.get(j).sec);
                if (holdplayer.get(j).pName.length() == 1) {
                    jTextArea1.append(holdplayer.get(j).pName + "                       " + "Finished the game in " + se + "second(s)" + "                " + "; Score is = " + sc + " <=== " + "\n\n");
                } else if (holdplayer.get(j).pName.length() == 2) {
                    jTextArea1.append(holdplayer.get(j).pName + "                      " + "Finished the game in " + se + "second(s)" + "                " + "; Score is = " + sc + " <=== " + "\n\n");
                } else if (holdplayer.get(j).pName.length() == 3) {
                    jTextArea1.append(holdplayer.get(j).pName + "                     " + "Finished the game in " + se + "second(s)" + "                " + "; Score is = " + sc + " <=== " + "\n\n");
                } else if (holdplayer.get(j).pName.length() == 4) {
                    jTextArea1.append(holdplayer.get(j).pName + "                    " + "Finished the game in " + se + "second(s)" + "                " + "; Score is = " + sc + " <=== " + "\n\n");
                } else if (holdplayer.get(j).pName.length() == 5) {
                    jTextArea1.append(holdplayer.get(j).pName + "                   " + "Finished the game in " + se + "second(s)" + "                " + "; Score is = " + sc + " <=== " + "\n\n");
                } else if (holdplayer.get(j).pName.length() == 6) {
                    jTextArea1.append(holdplayer.get(j).pName + "                  " + "Finished the game in " + se + "second(s)" + "                " + "; Score is = " + sc + " <=== " + "\n\n");
                } else if (holdplayer.get(j).pName.length() == 7) {
                    jTextArea1.append(holdplayer.get(j).pName + "                 " + "Finished the game in " + se + "second(s)" + "                " + "; Score is = " + sc + " <=== " + "\n\n");
                } else {
                    jTextArea1.append(holdplayer.get(j).pName + "                " + "Finished the game in " + se + "second(s)" + "                " + "; Score is = " + sc + " <=== " + "\n\n");
                }
                holdplayer.get(j).key = 0;
            } else {
                sc = Integer.toString(holdplayer.get(j).point);
                se = Integer.toString(holdplayer.get(j).sec);
                if (holdplayer.get(j).pName.length() == 1) {
                    jTextArea1.append(holdplayer.get(j).pName + "                       " + "Finished the game in " + se + "second(s)" + "                " + "; Score is = " + sc + "\n\n");
                } else if (holdplayer.get(j).pName.length() == 2) {
                    jTextArea1.append(holdplayer.get(j).pName + "                      " + "Finished the game in " + se + "second(s)" + "                " + "; Score is = " + sc + "\n\n");
                } else if (holdplayer.get(j).pName.length() == 3) {
                    jTextArea1.append(holdplayer.get(j).pName + "                     " + "Finished the game in " + se + "second(s)" + "                " + "; Score is = " + sc + "\n\n");
                } else if (holdplayer.get(j).pName.length() == 4) {
                    jTextArea1.append(holdplayer.get(j).pName + "                    " + "Finished the game in " + se + "second(s)" + "                " + "; Score is = " + sc + "\n\n");
                } else if (holdplayer.get(j).pName.length() == 5) {
                    jTextArea1.append(holdplayer.get(j).pName + "                   " + "Finished the game in " + se + "second(s)" + "                " + "; Score is = " + sc + "\n\n");
                } else if (holdplayer.get(j).pName.length() == 6) {
                    jTextArea1.append(holdplayer.get(j).pName + "                  " + "Finished the game in " + se + "second(s)" + "                " + "; Score is = " + sc + "\n\n");
                } else if (holdplayer.get(j).pName.length() == 7) {
                    jTextArea1.append(holdplayer.get(j).pName + "                 " + "Finished the game in " + se + "second(s)" + "                " + "; Score is = " + sc + "\n\n");
                } else {
                    jTextArea1.append(holdplayer.get(j).pName + "                " + "Finished the game in " + se + "second(s)" + "                " + "; Score is = " + sc + "\n\n");
                }
            }
        }

        fos = new FileOutputStream("playerinfo.txt");
        oos = new ObjectOutputStream(fos);
        oos.writeObject(holdplayer);
        oos.flush();
        oos.close();
        fos.close();

        System.out.println("baaaaal");

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LeaderBoard");

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MENU gad = new MENU();
        gad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(aftermatchHS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aftermatchHS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aftermatchHS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aftermatchHS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new aftermatchHS().setVisible(true);

                } catch (Exception ex) {
                    Logger.getLogger(aftermatchHS.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
