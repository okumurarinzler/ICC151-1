/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import javax.swing.JOptionPane;

/**
 *
 * @author Okumura Rinzler
 */
public class frameGame extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    private int players = 0;
    private final Game Mech = new Game();
    private final frameWinner endFrame = new frameWinner();
    
    
    private boolean dado_lock = true;
    private int turn = -1;
    
    public frameGame() {
        initComponents();
        Mech.armarPreguntas();
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
        J1Score = new javax.swing.JLabel();
        J2Score = new javax.swing.JLabel();
        J3Score = new javax.swing.JLabel();
        J4Score = new javax.swing.JLabel();
        Next = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Question = new javax.swing.JTextArea();
        Dado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 450));
        setPreferredSize(new java.awt.Dimension(420, 350));
        setResizable(false);

        J1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        J1.setText("J1");

        J2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        J2.setText("J2");

        J3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        J3.setText("J3");

        J4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        J4.setText("J4");

        J1Score.setText("J1 Score");

        J2Score.setText("J2 Score");

        J3Score.setText("J3 Score");

        J4Score.setText("J4 Score");

        Next.setText("Siguiente!");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        Question.setEditable(false);
        Question.setColumns(20);
        Question.setRows(5);
        Question.setWrapStyleWord(true);
        Question.setAutoscrolls(false);
        jScrollPane1.setViewportView(Question);

        Dado.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Dado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/misojos.jpg"))); // NOI18N
        Dado.setText("Dado");
        Dado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DadoActionPerformed(evt);
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
                            .addComponent(J2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J2Score, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(J3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(J3Score)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(J1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(J1Score))
                                .addGap(125, 125, 125)
                                .addComponent(Dado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(J4Score))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(J1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J1Score)
                        .addGap(30, 30, 30)
                        .addComponent(J2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J2Score)
                        .addGap(31, 31, 31)
                        .addComponent(J3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J3Score)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(J4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Dado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(J4Score)
                .addGap(32, 32, 32)
                .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        checkStateAndGoNext();

    }//GEN-LAST:event_NextActionPerformed

    private void DadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DadoActionPerformed
        dado_number();
    }//GEN-LAST:event_DadoActionPerformed

    
    public void setPlayers(int p){
        this.players = p;
    } 
    
    protected javax.swing.JButton Dado;
    protected javax.swing.JLabel J1;
    protected javax.swing.JLabel J1Score;
    protected javax.swing.JLabel J2;
    protected javax.swing.JLabel J2Score;
    protected javax.swing.JLabel J3;
    protected javax.swing.JLabel J3Score;
    protected javax.swing.JLabel J4;
    protected javax.swing.JLabel J4Score;
    protected javax.swing.JButton Next;
    protected javax.swing.JTextArea Question;
    protected javax.swing.JScrollPane jScrollPane1;


    private void dado_number() { //Simula el lanzamiento del dado, y muestra la accion en la ventana (ademas del numero del dado)
        if(dado_lock == false){
            int cara = (int)Math.floor(Math.random()*(1-6)+6);
            Dado.setText(Integer.toString(cara));
            Dado.setIcon(null);
            dado_lock = true;
            int pregunta = Mech.Players.get(turn).getScore() + cara;
            if(pregunta >= Mech.preguntas.size()){
                Question.setText("Usted Es un Gran DRUNK!");
            } else{
                Question.setText(Mech.preguntas.get(pregunta));
            }
        } else{
            JOptionPane.showMessageDialog(null, "ya lanzaste el dado!!!");
        }
    }

    private void next_turn() { //Avanza al siguiente turno, Resalta en rojo el nombre jugador del turno actual
        turn++;
        if(turn==players) turn = 0;
        
        Question.setText("");
        Dado.setVisible(true);
        dado_lock = false;
        
        J1.setForeground(new java.awt.Color(0, 0, 0));
        J2.setForeground(new java.awt.Color(0, 0, 0));
        J3.setForeground(new java.awt.Color(0, 0, 0));
        J4.setForeground(new java.awt.Color(0, 0, 0));
        
        switch(turn){
            case 0: J1.setForeground(new java.awt.Color(255, 0, 51));
                break;
            case 1: J2.setForeground(new java.awt.Color(255, 0, 51));
                break;
            case 2: J3.setForeground(new java.awt.Color(255, 0, 51));
                break;
            case 3: J4.setForeground(new java.awt.Color(255, 0, 51));
                break;
        }
        
    }

    private void score_update() { //Actualiza el Score del jugador actual.
    if (turn != -1){
        Players.get(turn).addScore(Integer.parseInt(Dado.getText()));
        switch(turn){
            case 0: J1Score.setText(Integer.toString(Players.get(turn).getScore()));
                break;
            case 1: J2Score.setText(Integer.toString(Players.get(turn).getScore()));
                break;
            case 2: J3Score.setText(Integer.toString(Players.get(turn).getScore()));
                break;
            case 3: J4Score.setText(Integer.toString(Players.get(turn).getScore()));
                break;
        }
        }
    }
    
    public void ScoreCheck(){ //Checkea el Score del Jugador actual, si supera el limite establecido, muestra la pantalla final.
        if(turn != -1){
        if((Players.get(turn).getScore()) > 39 ){
            endFrame.setWiner(Players.get(turn).getPlayerName());
            endFrame.setVisible(true);
            dispose();
        }
        }
    }

    private void checkStateAndGoNext() { //Checkea es estado de la partida, si el dado no fue lanzado no avanzara.
    if(dado_lock == false){
        JOptionPane.showMessageDialog(null,"Lanza el dado Primero!!!");
    } else{
        score_update();
        Dado.setText("");
        ScoreCheck();
        next_turn();
    }
    }
}
