/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Okumura Rinzler
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    private int players = 0;
    public Game() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        J1 = new javax.swing.JLabel();
        J2 = new javax.swing.JLabel();
        J3 = new javax.swing.JLabel();
        J4 = new javax.swing.JLabel();
        Dado = new javax.swing.JLabel();
        J1Score = new javax.swing.JLabel();
        J2Score = new javax.swing.JLabel();
        J3Score = new javax.swing.JLabel();
        J4Score = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 450));
        setPreferredSize(new java.awt.Dimension(420, 350));
        setResizable(false);

        J1.setText("J1");

        J2.setText("J2");

        J3.setText("J3");

        J4.setText("J4");

        Dado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/misojos.jpg"))); // NOI18N

        J1Score.setText("J1 Score");

        J2Score.setText("J2 Score");

        J3Score.setText("J3 Score");

        J4Score.setText("J4 Score");

        jLabel1.setText("Question");

        Next.setText("Siguiente!");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(J1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(J1Score))
                                .addGap(114, 114, 114)
                                .addComponent(Dado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(J3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J3Score)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(J4Score)
                                .addGap(131, 131, 131)
                                .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J2Score))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Dado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(J1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J1Score)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(J2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J2Score))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(43, 43, 43)
                .addComponent(J3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(J3Score)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(J4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(J4Score)
                    .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NextActionPerformed

    
    public void setPlayers(int p){
        this.players = p;
    }
    public void setPlayersName(String [] playName){
        switch(this.players){
            case 2:
                J1.setText(playName[0]);
                J1Score.setText("0");
                J2.setText(playName[1]);
                J2Score.setText("0");
                J3.setVisible(false);
                J3Score.setVisible(false);
                J4.setVisible(false);
                J4Score.setVisible(false);
                break;
            case 3:
                J1.setText(playName[0]);
                J1Score.setText("0");
                J2.setText(playName[1]);
                J2Score.setText("0");
                J3.setText(playName[2]);
                J3Score.setText("0");
                J4.setVisible(false);
                J4Score.setVisible(false);
                break;
            case 4:
                J1.setText(playName[0]);
                J1Score.setText("0");
                J2.setText(playName[1]);
                J2Score.setText("0");
                J3.setText(playName[2]);
                J3Score.setText("0");
                J4.setText(playName[3]);
                J4Score.setText("0");
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dado;
    private javax.swing.JLabel J1;
    private javax.swing.JLabel J1Score;
    private javax.swing.JLabel J2;
    private javax.swing.JLabel J2Score;
    private javax.swing.JLabel J3;
    private javax.swing.JLabel J3Score;
    private javax.swing.JLabel J4;
    private javax.swing.JLabel J4Score;
    private javax.swing.JButton Next;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}