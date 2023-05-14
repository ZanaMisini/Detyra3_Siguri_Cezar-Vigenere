
package exec;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
public class Vigenere extends javax.swing.JFrame {
    public Vigenere() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ft2 = new javax.swing.JTextField();
        ft1 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ft3 = new javax.swing.JTextField();
        ft5 = new javax.swing.JTextField();
        b3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Console", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Vigenere cipher");

        jLabel2.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Sentence :");

        jLabel5.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Write file path :");

        jLabel3.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Keyword :");

        ft2.setBackground(new java.awt.Color(0, 0, 0));
        ft2.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        ft2.setForeground(new java.awt.Color(255, 255, 255));

        ft1.setBackground(new java.awt.Color(0, 0, 0));
        ft1.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        ft1.setForeground(new java.awt.Color(255, 255, 255));

        ft5.setBackground(new java.awt.Color(0, 0, 0));
        ft5.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        ft5.setForeground(new java.awt.Color(255, 255, 255));

        b1.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        b1.setForeground(new java.awt.Color(0, 0, 51));
        b1.setText("Decrypt");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        b2.setForeground(new java.awt.Color(0, 0, 51));
        b2.setText("Encrypt");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Result :");

        ft3.setBackground(new java.awt.Color(0, 0, 0));
        ft3.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        ft3.setForeground(new java.awt.Color(255, 255, 255));

        b3.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        b3.setForeground(new java.awt.Color(0, 0, 51));
        b3.setText("Reset");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(372, 372, 372)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(109, 109, 109)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel5)
                                                )
                                                .addGap(49, 49, 49)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ft3, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(ft1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(ft5, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(b2)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(b1)
                                                                        .addGap(98, 98, 98)))
                                                        .addComponent(ft2, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(65, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(b3)
                                .addGap(325, 325, 325))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1)
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(ft1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(ft5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(ft3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(b2)
                                        .addComponent(b1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ft2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addGap(55, 55, 55)
                                .addComponent(b3)
                                .addGap(22, 22, 22))
        );

        pack();
    }

    public static String decryptVig(String str2, String key) {
        for (int i = 0; ; i++)
        {
            if (key.length() == str2.length())
            {
                break;
            }
            else
            {
                key+=(key.charAt(i));
            }
        }

        str2=str2.toUpperCase();
        key=key.toUpperCase();
        String original_text="";
        for (int i = 0; i < str2.length(); i++)
        {
            int x = (str2.charAt(i) - key.charAt(i)+26) %26;
            x += 'A';
            original_text+=(char)(x);
        }
        return original_text;
    }
    public static String encryptVig(String str, String key) {
        for (int i = 0; ; i++)
        {
            if (key.length() == str.length())
            {
                break;
            }
            else
            {
                key+=(key.charAt(i));
            }
        }

        str=str.toUpperCase();
        key=key.toUpperCase();
        String cipher_text="";
        for (int i = 0; i < str.length(); i++)
        {
            int x = (str.charAt(i) + key.charAt(i)) %26;
            x += 'A';
            cipher_text+=(char)(x);
        }
        return cipher_text;
    }
    //deencode
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("Decrypt");

        String str2=ft1.getText();
        String key=ft3.getText();
        String path = ft5.getText();
        String plainText = "";

        if(str2.startsWith("file:")) {
            System.out.println("Looking for file...");
            String[] fstr = str2.split(": ", 2);
            try {
                File file = new File(fstr[1]);
                file.setReadable(true);
                Scanner myReader = new Scanner(file);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    str2 = data;
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("File wasn't found!");
            }

            System.out.println("File found!");
            plainText = decryptVig(str2,key);
            try {
                File myObj = new File(path);
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());

                    FileWriter myWriter = new FileWriter(path);
                    myWriter.write(plainText);
                    myWriter.close();
                } else {
                    System.out.println("Location not found!");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");

            }
            plainText = "File created at: " + path;
            ft2.setText(plainText);
        }
        else {

            ft2.setText(decryptVig(str2,key));
        }
    }
    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {
        ft1.setText("");
        ft2.setText("");
        ft3.setText("");
    }
    //encode
    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("Encrypt");
        String str=ft1.getText();
        String key=ft3.getText();
        String path = ft5.getText();

        String newtext = "";

        if(str.startsWith("file:")) {
            System.out.println("Looking for file...");

            String[] fstr = str.split(": ", 2);

            try {
                File file = new File(fstr[1]);
                file.setReadable(true);
                Scanner myReader = new Scanner(file);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    str = data;
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("File wasn't found!");
            }
            System.out.println("File found!");
            newtext = encryptVig(str,key);
            try {
                File myObj = new File(path);
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());

                    FileWriter myWriter = new FileWriter(path);
                    myWriter.write(newtext);
                    myWriter.close();

                } else {
                    System.out.println("Location not found!");

                }
            } catch (IOException e) {
                System.out.println("An error occurred.");

            }
            newtext = "File created at: " + path;
            ft2.setText(newtext);
        }
        else {
            ft2.setText(encryptVig(str,key));
        }
    }


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vigenere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vigenere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vigenere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vigenere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new c2().setVisible(true);
            }
        });

    }

    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JTextField ft1;
    private javax.swing.JTextField ft2;
    private javax.swing.JTextField ft3;
    private javax.swing.JTextField ft5;

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;


}
