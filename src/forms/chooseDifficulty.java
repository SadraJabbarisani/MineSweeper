package forms;

public class chooseDifficulty extends javax.swing.JFrame {
    
    public chooseDifficulty() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title_lable = new javax.swing.JLabel();
        easyBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mediumBtn = new javax.swing.JButton();
        hardBtn = new javax.swing.JButton();
        JustLikeLivingInIranBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mine Sweeper");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        Title_lable.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Title_lable.setForeground(new java.awt.Color(255, 255, 255));
        Title_lable.setText("Mine Sweeper");

        easyBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        easyBtn.setForeground(new java.awt.Color(0, 204, 51));
        easyBtn.setText("Easy");
        easyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Choose difficulty:");

        mediumBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mediumBtn.setForeground(new java.awt.Color(0, 102, 204));
        mediumBtn.setText("Medium");

        hardBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hardBtn.setForeground(new java.awt.Color(204, 0, 0));
        hardBtn.setText("Hard");

        JustLikeLivingInIranBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JustLikeLivingInIranBtn.setForeground(new java.awt.Color(153, 0, 153));
        JustLikeLivingInIranBtn.setText("JustLikeLivingInIran");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mediumBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(easyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JustLikeLivingInIranBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Title_lable))
                        .addGap(53, 53, 53))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(Title_lable)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(easyBtn)
                .addGap(30, 30, 30)
                .addComponent(mediumBtn)
                .addGap(30, 30, 30)
                .addComponent(hardBtn)
                .addGap(30, 30, 30)
                .addComponent(JustLikeLivingInIranBtn)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void easyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easyBtnActionPerformed
        new EasyMode().setVisible(true);
        dispose();
    }//GEN-LAST:event_easyBtnActionPerformed

    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(chooseDifficulty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chooseDifficulty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chooseDifficulty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chooseDifficulty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chooseDifficulty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JustLikeLivingInIranBtn;
    private javax.swing.JLabel Title_lable;
    private javax.swing.JButton easyBtn;
    private javax.swing.JButton hardBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mediumBtn;
    // End of variables declaration//GEN-END:variables
}
