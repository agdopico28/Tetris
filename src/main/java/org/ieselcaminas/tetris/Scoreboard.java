/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.ieselcaminas.tetris;

/**
 *
 * @author victor
 */
public class Scoreboard extends javax.swing.JPanel implements Incrementer{
    private int score;
    /**
     * Creates new form Scoreboard
     */
    public Scoreboard() {
        initComponents();
        myInits();
    }
    
    private void myInits() {
        resetScore();
    }
    
     private void resetScore() {
        score = 0; 
        labelScore.setText("0");
    }
     
    public void incrementScore(int increment){
        score += increment;
        labelScore.setText(""+ score);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelScore = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 102));

        labelScore.setText("jLabel1");
        add(labelScore);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelScore;
    // End of variables declaration//GEN-END:variables

   

    
}