
import java.awt.*;
import java.awt.geom.Line2D;
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.Object;
//import java.util.Scanner;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author
 */
public class map_demo extends javax.swing.JFrame {

    JButton l1 = new JButton("");
    JButton l2 = new JButton("");
    JButton l3 = new JButton("");
    JButton l4 = new JButton("");
    int count = 0;
    int X1, Y1, X2, Y2, Node1, Node2;
    ArrayList<Integer> x = new ArrayList<Integer>();
    ArrayList<Integer> y = new ArrayList<Integer>();
    boolean condition = false;
    Graph gr = new Graph(153);
    Graph1 gr1 = new Graph1(153, 239);
    int temp1, temp2, temp3, temp4;
    double dist;

    /**
     * Creates new form map_demo
     */
    public void setRecord() {
        jLabel8.setVisible(false);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/map", "root", "");
            Statement stmt = conn.createStatement();
            String selectQuery = "SELECT name from coo WHERE name NOT LIKE \"\";";
            System.out.println(selectQuery);
            ResultSet rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                String temp = rs.getString("name");
                jComboBox1.addItem(temp);
                jComboBox2.addItem(temp);
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Exception ex = " + ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(map_demo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public map_demo() {
        initComponents();
        AutoCompleteDecorator.decorate(jComboBox1);
        AutoCompleteDecorator.decorate(jComboBox2);
        setRecord();
    }

    public String getString1() {
        String sel = jComboBox1.getSelectedItem().toString();
        return sel;
    }

    public String getString2() {
        String sel = jComboBox2.getSelectedItem().toString();
        return sel;
    }
//    public void point(Graphics g1,int x1,int x2,int y1,int y2){
//          g1.fillOval(x1, y1, 20, 20);
//           g1.fillOval(x2, y2, 20, 20);
//    }

    public void line(Graphics g, int x1, int y1, int x2, int y2, ArrayList<Integer> a, int flag) {

        if (flag == 1) {
            setBackground(Color.BLACK);
            setForeground(Color.red);
            if ((x1 == x2) && (y1 == y2)) {
                g.fillOval(x1, y1, 20, 20);
            } else {
                x1 -= 12;
                y1 -= 12;
                x2 -= 12;
                y2 -= 12;

                g.fillOval(temp1, temp2, 20, 20);

                g.fillOval(temp3, temp4, 20, 20);
                x1 += 10;
                x2 += 10;
                y1 += 10;
                y2 += 10;
                Graphics2D g2 = (Graphics2D) g;
                g2.setStroke(new BasicStroke(5));
                // g2.drawLine(...);

                g2.drawLine(x1, y1, x2, y2);
//            g.drawLine(x1 + 1, y1 + 1, x2 + 1, y2 + 1);
//            g.drawLine(x1 + 2, y1 + 2, x2 + 2, y2 + 2);
//            g.drawLine(x1 - 1, y1 - 1, x2 - 1, y2 - 1);
//            g.drawLine(x1 - 2, y1 - 2, x2 - 2, y2 - 2);
            }
        }
    }

    public void place() {
        //g.fillOval(temp3, temp4, 20, 20);
    }

    public void path(Graphics g, ArrayList<Integer> X, ArrayList<Integer> Y, int flag) {
        super.paint(g);
        if (X.size() == 1) {
            line(g, X.get(0), Y.get(0), X.get(0), Y.get(0), gr.ar, flag);
        } else {
            for (int i = 0; i < X.size() - 1; i++) {
                line(g, X.get(i), Y.get(i), X.get(i + 1), Y.get(i + 1), gr.ar, flag);
            }
        }
    }

    public void paint(Graphics g) {

        super.paint(g);
        int flag = 0;
        if (condition) {
            setBackground(Color.BLACK);
            setForeground(Color.red);
            flag = 1;
            path(g, x, y, flag);
            place();
        }
        x.clear();
        y.clear();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1045, 1100));
        setMaximumSize(new java.awt.Dimension(1045, 1100));
        setMinimumSize(new java.awt.Dimension(1045, 1100));
        setPreferredSize(new java.awt.Dimension(1045, 1100));

        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/map1.jpeg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 119, 1036, 860);

        jButton1.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 30, 50));
        jButton1.setText("Search");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(570, 70, 91, 31);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel3);
        jLabel3.setBounds(680, 10, 340, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Source");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 20, 90, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Destination");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 70, 140, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel6);
        jLabel6.setBounds(680, 50, 340, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel7);
        jLabel7.setBounds(680, 80, 340, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/line.png"))); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(670, 0, 10, 130);

        jComboBox1.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(150, 20, 407, 29);

        jComboBox2.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jComboBox2);
        jComboBox2.setBounds(150, 70, 407, 28);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1024, 140);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1027, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        jLabel8.setVisible(true);
        backend b = new backend();
        bellmanford br = new bellmanford();
        // bellmanford b1=new ballmanford();
        condition = false;
        repaint();
        String s1 = getString1();
        String s2 = getString2();
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/map", "root", "");
            Statement stmt = conn.createStatement();
            String s = "SELECT `x`, `y`, `node` FROM `coo` WHERE name = \"" + s1 + "\";";
            String t = "SELECT `x`, `y`, `node` FROM `coo` WHERE name = \"" + s2 + "\";";
            ResultSet rs1;
            rs1 = stmt.executeQuery(s);
            System.out.println(s);
            int x1 = 0, y1 = 0, node1 = 0, x2 = 0, y2 = 0, node2 = 0;
            while (rs1.next()) {
                X1 = rs1.getInt("x");
                temp1 = X1 - 12;
                Y1 = rs1.getInt("y");
                temp2 = Y1 - 12;
                Node1 = rs1.getInt("node");
            }
            x.add(X1);
            y.add(Y1);
            System.out.println("x1=" + X1 + "  y1=" + Y1 + "node1=" + Node1);
            ResultSet rs2;
            rs2 = stmt.executeQuery(t);
            System.out.println(t);
            while (rs2.next()) {
                X2 = rs2.getInt("x");
                temp3 = X2 - 12;
                Y2 = rs2.getInt("y");
                temp4 = Y2 - 12;
                Node2 = rs2.getInt("node");
            }
            System.out.println("x2=" + X2 + "  y2=" + Y2 + "node2=" + Node2);
            time_Dist td = new time_Dist();
            td = gr.dijkstra_GetMinDistances(Node1, Node2);
            double time_bellmanford;
            double time_dijktras;
            DecimalFormat df2 = new DecimalFormat("0.00000");
            time_dijktras = (double) (td.time * Math.pow(10, -9));
            System.out.println("dtime->" + time_dijktras);
            System.out.println("dtime:" + df2.format(time_dijktras));
            time_bellmanford = (double) (gr1.bellmanFord_sp(Node1, Node2) * Math.pow(10, -9));
            System.out.println("btime->" + time_bellmanford);
            System.out.println("btime:" + df2.format(time_bellmanford));
            dist = td.dist;
            dist = dist / 16;
            System.out.println("Dist:" + dist);
            DecimalFormat df1 = new DecimalFormat("0.0");
            String str1 = df1.format(dist);
            jLabel3.setText("Distance: " + str1 + "km");
            if (Node1 == Node2) {
                time_dijktras = 0;
                time_bellmanford = 0;
            }
            jLabel6.setText("Running time of Dijktra's Algorithm: " + df2.format(time_dijktras) + " s");
            jLabel7.setText("Running time of Bellmanford's Algorithm: " + df2.format(time_bellmanford) + " s");
            for (int i = 0; i < gr.ar.size(); i++) {
                String q = "SELECT `x`, `y` FROM `coo` WHERE node = \"" + gr.ar.get(i) + "\";";
                ResultSet rs3;
                rs3 = stmt.executeQuery(q);
                while (rs3.next()) {
                    x.add(rs3.getInt("x"));
                    y.add(rs3.getInt("y"));
                }
            }
            // backend.main();
            condition = true;
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        count++;
        if (count % 2 == 0) {
            if (count > 1) {
                l3.setVisible(false);
                l4.setVisible(false);
                l1.setVisible(true);
                l2.setVisible(true);
            }
            l1.setText(getString1());
            l1.setFont(new Font("serif",Font.BOLD,15));
            l2.setText(getString2());
            l2.setFont(new Font("serif",Font.BOLD,15));
            this.add(l1);
            jLabel1.add(l1);
            l1.setBounds(temp1, temp2 - 180, 150, 30);
            this.add(l2);
            jLabel1.add(l2);
            l2.setBounds(temp3, temp4 - 180, 150, 30);

        } else {
            if (count > 0) {
                l1.setVisible(false);
                l2.setVisible(false);
                l3.setVisible(true);
                l4.setVisible(true);
            }
            l3.setText(getString1());
            l3.setFont(new Font("serif",Font.BOLD,15));
            l4.setText(getString2());
            l4.setFont(new Font("serif",Font.BOLD,15));
            this.add(l3);
            jLabel1.add(l3);
            l3.setBounds(temp1, temp2 - 180, 150, 30);
            this.add(l4);
            jLabel1.add(l4);
            l4.setBounds(temp3, temp4 - 180, 150, 30);
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String res = jComboBox1.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(map_demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(map_demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(map_demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(map_demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new map_demo().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}