/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torneo;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

/**
 *
 * @author dam1
 */
public class Vista {
}

class TorneoFrame extends JFrame {

    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    JPanel jPanel3 = new JPanel();
    JPanel brujo1 = new JPanel();
    JPanel brujo2 = new JPanel();
    JPanel brujo3 = new JPanel();
    JPanel brujo4 = new JPanel();
    JLabel jLabelBrujo1 = new JLabel();
    JLabel jLabelBrujo2 = new JLabel();
    JLabel jLabelBrujo3 = new JLabel();
    JLabel jLabelBrujo4 = new JLabel();
    JButton jButtonBrujo1 = new JButton();
    JButton jButtonBrujo2 = new JButton();
    JButton jButtonBrujo3 = new JButton();
    JButton jButtonBrujo4 = new JButton();
    JButton jButtonFinale = new JButton();

    Data datos;
    
        public TorneoFrame() {
            
        }
    
    public TorneoFrame(Data data) {
        this.datos = data;
        Color green = new java.awt.Color(30, 130, 30);
        brujo3.setBackground(green);

        GroupLayout Brujo3Layout = new GroupLayout(brujo3);
        brujo3.setLayout(Brujo3Layout);
        Brujo3Layout.setHorizontalGroup(
                Brujo3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 182, Short.MAX_VALUE)
        );
        Brujo3Layout.setVerticalGroup(
                Brujo3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 166, Short.MAX_VALUE)
        );


        jPanel1.setBackground(new java.awt.Color(30, 30, 130));

        brujo1.setBackground(new java.awt.Color(30, 130, 30));

        jLabelBrujo1.setText("jLabel1");

        GroupLayout brujo1Layout = new GroupLayout(brujo1);
        brujo1.setLayout(brujo1Layout);
        brujo1Layout.setHorizontalGroup(
                brujo1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(brujo1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabelBrujo1)
                                .addContainerGap(79, Short.MAX_VALUE))
        );
        brujo1Layout.setVerticalGroup(
                brujo1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(brujo1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabelBrujo1)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        brujo2.setBackground(new java.awt.Color(30, 130, 30));

        jLabelBrujo2.setText("jLabel1");

        GroupLayout Brujo2Layout = new GroupLayout(brujo2);
        brujo2.setLayout(Brujo2Layout);
        Brujo2Layout.setHorizontalGroup(
                Brujo2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(Brujo2Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabelBrujo2)
                                .addContainerGap(74, Short.MAX_VALUE))
        );
        Brujo2Layout.setVerticalGroup(
                Brujo2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(Brujo2Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabelBrujo2)
                                .addContainerGap(65, Short.MAX_VALUE))
        );

        jButtonBrujo1.setText("GANA");
        jButtonBrujo1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBrujo1ActionPerformed(evt);
            }

            private void jButtonBrujo1ActionPerformed(ActionEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        jButtonBrujo2.setText("GANA");
        jButtonBrujo2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBrujo2ActionPerformed(evt);
            }

            private void jButtonBrujo2ActionPerformed(ActionEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(brujo1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jButtonBrujo1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                                .addComponent(jButtonBrujo2)
                                .addGap(30, 30, 30)
                                .addComponent(brujo2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(brujo1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(brujo2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(85, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonBrujo1)
                                        .addComponent(jButtonBrujo2))
                                .addGap(95, 95, 95))
        );

        jPanel2.setBackground(new java.awt.Color(130, 30, 30));

        brujo3.setBackground(new java.awt.Color(30, 130, 30));

        jLabelBrujo3.setText("jLabel1");

        GroupLayout brujo3Layout = new GroupLayout(brujo3);
        brujo3.setLayout(brujo3Layout);
        brujo3Layout.setHorizontalGroup(
                brujo3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(brujo3Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabelBrujo3)
                                .addContainerGap(74, Short.MAX_VALUE))
        );
        brujo3Layout.setVerticalGroup(
                brujo3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, brujo3Layout.createSequentialGroup()
                                .addContainerGap(58, Short.MAX_VALUE)
                                .addComponent(jLabelBrujo3)
                                .addGap(71, 71, 71))
        );

        brujo4.setBackground(new java.awt.Color(30, 130, 30));

        jLabelBrujo4.setText("jLabel1");

        GroupLayout Brujo4Layout = new GroupLayout(brujo4);
        brujo4.setLayout(Brujo4Layout);
        Brujo4Layout.setHorizontalGroup(
                Brujo4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, Brujo4Layout.createSequentialGroup()
                                .addContainerGap(74, Short.MAX_VALUE)
                                .addComponent(jLabelBrujo4)
                                .addGap(71, 71, 71))
        );
        Brujo4Layout.setVerticalGroup(
                Brujo4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, Brujo4Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelBrujo4)
                                .addGap(70, 70, 70))
        );

        jButtonBrujo3.setText("GANA");
        jButtonBrujo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBrujo3ActionPerformed(evt);
            }

            private void jButtonBrujo3ActionPerformed(ActionEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        jButtonBrujo4.setText("GANA");
        jButtonBrujo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBrujo4ActionPerformed(evt);
            }

            private void jButtonBrujo4ActionPerformed(ActionEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(brujo3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jButtonBrujo3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonBrujo4)
                                .addGap(31, 31, 31)
                                .addComponent(brujo4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(brujo4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(brujo3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(29, 29, 29))
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonBrujo3)
                                        .addComponent(jButtonBrujo4))
                                .addGap(95, 95, 95))
        );

        jPanel3.setBackground(new java.awt.Color(130, 130, 130));

        jButtonFinale.setText("LA FINAL");
        jButtonFinale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinaleActionPerformed(evt);
            }

            private void jButtonFinaleActionPerformed(ActionEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(302, 302, 302)
                                .addComponent(jButtonFinale, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonFinale, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setBounds(100, 100, 756, 525);
        setVisible(true);
    }
}
