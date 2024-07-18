package forms;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import MineSweeper.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

public class EasyMode extends javax.swing.JFrame {
    
    Game game;
    MineTile[][] mineBoard;

    public EasyMode() {
        initComponents();
        loseLbl.show(false);
        game = new Game(Difficulty.Easy);    
        mineBoard = new MineTile[game.i][game.j];
        addTile ();
        buttonPresd();
    }
    
    private void addTile () {
        boardPnl.setLayout(new GridLayout(game.i, game.j));
        for (int i = 0; i < game.i; i++){
            for (int j = 0; j < game.j; j++){
                MineTile tile = new MineTile(i, j);
                mineBoard[i][j] = tile;
                tile.setFocusable(false);
                tile.setMargin(new Insets(0,0,0,0));
                tile.setFont(new Font("Seoge UI",Font.BOLD, 12));
                tile.setText(" ");
                
                boardPnl.add(tile);
            }
        }
    }
    
    private void setTiles(){
        for (int i = 0; i < game.i; i++){
            for (int j = 0; j < game.j; j++){
                Cell currentCell = game.cell[i][j];
                MineTile tile = mineBoard[i][j];
                
                switch (currentCell.cellState()){
                    case Flag:
                        tile.setText("🚩");
                        break;
                    case Hide:
                        tile.setText(" ");
                        break;
                    case Number:
                        tile.setFont(new Font("Seoge UI",Font.BOLD, 20));
                        switch (currentCell.bombAround){
                            case 1:
                                tile.setForeground(Color.BLUE);
                                tile.setText(String.valueOf(currentCell.bombAround));
                                break;
                            case 2:
                                tile.setForeground(Color.MAGENTA);
                                tile.setText(String.valueOf(currentCell.bombAround));
                                break;
                            case 3:
                                tile.setForeground(Color.RED);
                                tile.setText(String.valueOf(currentCell.bombAround));
                                break;
                            case 4:
                                tile.setForeground(Color.ORANGE);
                                tile.setText(String.valueOf(currentCell.bombAround));
                                tile.getGraphics().setColor(Color.BLACK);
                                break;
                            case 5:
                                tile.setForeground(Color.RED);
                                tile.setText(String.valueOf(currentCell.bombAround));
                                tile.getGraphics().setColor(Color.BLACK);
                                break;
                            default:
                                tile.getGraphics().setColor(Color.BLACK);
                                tile.setText(String.valueOf(currentCell.bombAround));
                                tile.getGraphics().setColor(Color.BLACK);
                                break;
                        }
                        tile.setFont(new Font("Seoge UI",Font.BOLD, 12));
                        break;
                    case Empty:
                        tile.setVisible(false);
                        break;
                    case Bomb:
                        tile.setText("💣");
                        break;
                    case Explosion:
                        tile.setText("💥");
                        break;
                        
                }
            }
        }
    }
    
    private void buttonPresd(){
        for (int i = 0; i < game.i; i++){
            for (int j = 0; j < game.j; j++){
                mineBoard[i][j].addMouseListener(new MouseAdapter() {
                    
                    public void mousePressed(MouseEvent evt){
                        MineTile tile = (MineTile)evt.getSource();
                        
                        if (evt.getButton() == MouseEvent.BUTTON1){
                            game.click(tile.row, tile.col);
                            setTiles();
                            
                            if(game.isLoose()){
                                loseLbl.show(true);
                                System.out.println("lost");
                            }else if(game.isWin()){
                                YouWon yw = new YouWon();
                                yw.setLables(Difficulty.Easy);
                                yw.setVisible(true);
                                dispose();
                                System.out.println("win!");
                            }
                        }
                        
                        
                        if (evt.getButton() == MouseEvent.BUTTON3){
                            game.putFlag(tile.row, tile.col);
                            setTiles();
                                
                            
                            if(game.isWin()){
                                YouWon yw = new YouWon();
                                yw.setLables(Difficulty.Easy);
                                yw.setVisible(true);
                                dispose();
                                System.out.println("win!");
                            }
                        }
                    }
                });
            }
        }
    }
    
    private void showWinPnl(){
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backGroundPnl = new javax.swing.JPanel();
        boardPnl = new javax.swing.JPanel();
        Mine_Sweeper_Lable = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        retryBtn = new javax.swing.JButton();
        loseLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backGroundPnl.setBackground(new java.awt.Color(51, 51, 51));
        backGroundPnl.setEnabled(false);

        boardPnl.setBackground(new java.awt.Color(204, 204, 204));
        boardPnl.setPreferredSize(new java.awt.Dimension(334, 334));

        javax.swing.GroupLayout boardPnlLayout = new javax.swing.GroupLayout(boardPnl);
        boardPnl.setLayout(boardPnlLayout);
        boardPnlLayout.setHorizontalGroup(
            boardPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        boardPnlLayout.setVerticalGroup(
            boardPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 334, Short.MAX_VALUE)
        );

        Mine_Sweeper_Lable.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Mine_Sweeper_Lable.setForeground(new java.awt.Color(204, 204, 204));
        Mine_Sweeper_Lable.setText("Mine Sweeper");

        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        retryBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        retryBtn.setText("Retry");
        retryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retryBtnActionPerformed(evt);
            }
        });

        loseLbl.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        loseLbl.setForeground(new java.awt.Color(204, 0, 0));
        loseLbl.setText(" *You Lost*");

        javax.swing.GroupLayout backGroundPnlLayout = new javax.swing.GroupLayout(backGroundPnl);
        backGroundPnl.setLayout(backGroundPnlLayout);
        backGroundPnlLayout.setHorizontalGroup(
            backGroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundPnlLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(Mine_Sweeper_Lable)
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(backGroundPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backGroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boardPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                    .addGroup(backGroundPnlLayout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(18, 18, 18)
                        .addComponent(loseLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(retryBtn)))
                .addContainerGap())
        );
        backGroundPnlLayout.setVerticalGroup(
            backGroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backGroundPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Mine_Sweeper_Lable)
                .addGap(18, 18, 18)
                .addGroup(backGroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(backGroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loseLbl))
                    .addComponent(retryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(boardPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(backGroundPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGroundPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void retryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retryBtnActionPerformed
        new EasyMode().setVisible(true);
        dispose();
    }//GEN-LAST:event_retryBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new chooseDifficulty().setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(EasyMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EasyMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EasyMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EasyMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EasyMode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mine_Sweeper_Lable;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel backGroundPnl;
    private javax.swing.JPanel boardPnl;
    private javax.swing.JLabel loseLbl;
    private javax.swing.JButton retryBtn;
    // End of variables declaration//GEN-END:variables
}
