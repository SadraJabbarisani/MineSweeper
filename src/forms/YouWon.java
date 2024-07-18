package forms;

import MineSweeper.Difficulty;

public class YouWon extends javax.swing.JFrame {
    Difficulty difficulty;

    public YouWon() {
        
        initComponents();
    }
    
    public void setLables(Difficulty d){
        showDifficultyLbl.setText(d.name());
        bombNumLbl.setText(bombOfDifficulty(d));
        showTimeLbl.setText("on developing");
    }
    
    private String bombOfDifficulty(Difficulty difficulty){
        this.difficulty = difficulty;
        switch(difficulty){
            case Easy:
                return "10";
            case Medium:
                return "40";
            case Hard:
                return "99";
            case JustLikeLivingInIran:
                return "150";
        }
        return "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPnl = new javax.swing.JPanel();
        You_Won_Lbl = new javax.swing.JLabel();
        difficultyLbl = new javax.swing.JLabel();
        showDifficultyLbl = new javax.swing.JLabel();
        bombAmountLbl = new javax.swing.JLabel();
        bombNumLbl = new javax.swing.JLabel();
        showTimeLbl = new javax.swing.JLabel();
        timeLbl = new javax.swing.JLabel();
        MainMenuBtn = new javax.swing.JButton();
        difficultyBtn1 = new javax.swing.JButton();
        playAganeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPnl.setBackground(new java.awt.Color(102, 102, 102));

        You_Won_Lbl.setBackground(new java.awt.Color(0, 0, 0));
        You_Won_Lbl.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        You_Won_Lbl.setForeground(new java.awt.Color(51, 255, 0));
        You_Won_Lbl.setText("You Won!");

        difficultyLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        difficultyLbl.setText("Difficulty: ");

        showDifficultyLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        showDifficultyLbl.setText("jLabel3");

        bombAmountLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bombAmountLbl.setText("Bomb amount: ");

        bombNumLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bombNumLbl.setText("jLabel3");

        showTimeLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        showTimeLbl.setText("jLabel3");

        timeLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        timeLbl.setText("Time: ");

        MainMenuBtn.setText("Main menu");
        MainMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuBtnActionPerformed(evt);
            }
        });

        difficultyBtn1.setText("Choose difficulty");
        difficultyBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficultyBtn1ActionPerformed(evt);
            }
        });

        playAganeBtn.setText("Play agane");
        playAganeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAganeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundPnlLayout = new javax.swing.GroupLayout(backgroundPnl);
        backgroundPnl.setLayout(backgroundPnlLayout);
        backgroundPnlLayout.setHorizontalGroup(
            backgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPnlLayout.createSequentialGroup()
                .addGroup(backgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPnlLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(backgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPnlLayout.createSequentialGroup()
                                .addComponent(difficultyLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showDifficultyLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(backgroundPnlLayout.createSequentialGroup()
                                .addComponent(bombAmountLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bombNumLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                            .addGroup(backgroundPnlLayout.createSequentialGroup()
                                .addComponent(timeLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showTimeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(backgroundPnlLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(You_Won_Lbl)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(backgroundPnlLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(MainMenuBtn)
                .addGap(18, 18, 18)
                .addComponent(difficultyBtn1)
                .addGap(18, 18, 18)
                .addComponent(playAganeBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundPnlLayout.setVerticalGroup(
            backgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPnlLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(You_Won_Lbl)
                .addGap(57, 57, 57)
                .addGroup(backgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(difficultyLbl)
                    .addComponent(showDifficultyLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bombAmountLbl)
                    .addComponent(bombNumLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLbl)
                    .addComponent(showTimeLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(backgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MainMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(difficultyBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playAganeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuBtnActionPerformed
        new MainMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_MainMenuBtnActionPerformed

    private void difficultyBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficultyBtn1ActionPerformed
        new chooseDifficulty().setVisible(true);
        dispose();
    }//GEN-LAST:event_difficultyBtn1ActionPerformed

    private void playAganeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAganeBtnActionPerformed
        switch (difficulty){
            case Easy:
                new EasyMode().setVisible(true);
                dispose();
                break;
            case Medium:
                
            case Hard:
                
            case JustLikeLivingInIran:
        }
    }//GEN-LAST:event_playAganeBtnActionPerformed

    /*public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(YouWon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YouWon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YouWon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YouWon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YouWon().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MainMenuBtn;
    private javax.swing.JLabel You_Won_Lbl;
    private javax.swing.JPanel backgroundPnl;
    private javax.swing.JLabel bombAmountLbl;
    private javax.swing.JLabel bombNumLbl;
    private javax.swing.JButton difficultyBtn1;
    private javax.swing.JLabel difficultyLbl;
    private javax.swing.JButton playAganeBtn;
    private javax.swing.JLabel showDifficultyLbl;
    private javax.swing.JLabel showTimeLbl;
    private javax.swing.JLabel timeLbl;
    // End of variables declaration//GEN-END:variables
}
