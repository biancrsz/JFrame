package jframemabi;

import java.awt.Color;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    String CADASTRO[][] = new String[10][3];
    int i = 0, x = 0;


    public NewJFrame() {
        initComponents();
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cadnom = new javax.swing.JTextField();
        cadcid = new javax.swing.JTextField();
        jLabelcidade = new javax.swing.JLabel();
        jLabelnome = new javax.swing.JLabel();
        cadest = new javax.swing.JTextField();
        jLabelestado = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cadnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadnomActionPerformed(evt);
            }
        });
        jPanel1.add(cadnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 280, -1));

        cadcid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadcidActionPerformed(evt);
            }
        });
        jPanel1.add(cadcid, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 130, -1));

        jLabelcidade.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelcidade.setForeground(new java.awt.Color(204, 0, 102));
        jLabelcidade.setText("Cidade:");
        jPanel1.add(jLabelcidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 20));

        jLabelnome.setBackground(new java.awt.Color(255, 255, 255));
        jLabelnome.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelnome.setForeground(new java.awt.Color(204, 0, 102));
        jLabelnome.setText("Nome:");
        jPanel1.add(jLabelnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 50, 20));

        cadest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadestActionPerformed(evt);
            }
        });
        jPanel1.add(cadest, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 60, 20));

        jLabelestado.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelestado.setForeground(new java.awt.Color(204, 0, 102));
        jLabelestado.setText("Estado:");
        jPanel1.add(jLabelestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, 20));

        jButton1.setBackground(new java.awt.Color(204, 0, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 102));
        jButton1.setText("CADASTRAR");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 90, 30));

        jButton2.setBackground(new java.awt.Color(204, 0, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 102));
        jButton2.setText("IMPRIMIR");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 90, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jframemabi/tela cadastro.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 436, 300));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(204, 0, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 102));
        jButton3.setText("QUERO ME CADASTRAR");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setIconTextGap(3);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 150, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jframemabi/tela inicial.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, -1, 330));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadcidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadcidActionPerformed

    }//GEN-LAST:event_cadcidActionPerformed

    private void cadestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadestActionPerformed

    }//GEN-LAST:event_cadestActionPerformed

    private void cadnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadnomActionPerformed

    }//GEN-LAST:event_cadnomActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cadnom.requestFocus();
        if (cadnom.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ERRO! Por favor, informe o seu nome.");
            cadnom.requestFocus();
            cadnom.setForeground(Color.red);
            jLabelnome.setForeground(Color.red);

        } else if (cadcid.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ERRO! Por favor, informe a sua cidade.");
            cadcid.requestFocus();
            cadcid.setForeground(Color.red);
            jLabelcidade.setForeground(Color.red);

        } else if (cadest.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ERRO! Por favor, informe o seu estado.");
            cadest.requestFocus();
            cadest.setForeground(Color.red);
            jLabelestado.setForeground(Color.red);

        } else {
            CADASTRO[i][x] = cadnom.getText();
            x++;
            CADASTRO[i][x] = cadcid.getText();
            x++;
            CADASTRO[i][x] = cadest.getText();
            x = 0;
            i++;
            JOptionPane.showMessageDialog(this, "Cadastro concluído com sucesso!");
            cadnom.setText(null);
            cadcid.setText(null);
            cadest.setText(null);
            cadnom.setForeground(Color.black);
            cadnom.setForeground(Color.black);
            cadnom.setForeground(Color.black);

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jPanel1.setVisible(true);
        jPanel2.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String todos_cadastros = "";
        for (int a = 0; a < i; a++) {
            todos_cadastros += "Nome: " + CADASTRO[a][0] + "\nCidade: " + CADASTRO[a][1] + "\nEstado: " + CADASTRO[a][2] + "\n\n";
        }
        JOptionPane.showMessageDialog(null, todos_cadastros);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new NewJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cadcid;
    private javax.swing.JTextField cadest;
    private javax.swing.JTextField cadnom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelcidade;
    private javax.swing.JLabel jLabelestado;
    private javax.swing.JLabel jLabelnome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
