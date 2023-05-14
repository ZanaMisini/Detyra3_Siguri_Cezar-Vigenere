package exec;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Ceasar extends javax.swing.JFrame {
    public Ceasar() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        t3 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        b3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Console", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("caesar cipher");

        jLabel2.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Key :");

        jLabel3.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Sentence :");

        jLabel6.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Write file path :");

        t1.setBackground(new java.awt.Color(0, 0, 0));
        t1.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 255, 255));

        t6.setBackground(new java.awt.Color(0, 0, 0));
        t6.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        t6.setForeground(new java.awt.Color(255, 255, 255));

        t2.setBackground(new java.awt.Color(0, 0, 0));
        t2.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 255, 255));
        b1.setBackground(new java.awt.Color(204, 204, 204));
        b1.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        b1.setForeground(new java.awt.Color(0, 0, 51));
        b1.setText("Encrypt");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(204, 204, 204));
        b2.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        b2.setForeground(new java.awt.Color(0, 0, 51));
        b2.setText("Decrypt");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        t3.setFont(new java.awt.Font("Lucida Console", 3, 24)); // NOI18N
        t3.setForeground(new java.awt.Color(0, 0, 51));

        jLabel5.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Result :");

        b3.setBackground(new java.awt.Color(204, 204, 204));
        b3.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        b3.setForeground(new java.awt.Color(0, 0, 51));
        b3.setText("Reset");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

     
                 
     
                                       
       

