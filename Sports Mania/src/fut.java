
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author syase
 */
public class fut extends javax.swing.JFrame {
String db_URL="jdbc:mysql://localhost:3306/sports_mania?zeroDateTimeBehavior=convertToNull";
    String db_USER="root";
    String db_password="";
    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    public fut() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        p = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        team_com = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        back1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        n_tf = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        p.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "roll", "name", "mail", "age", "phone", "gender", "year", "dep", "event", "colour", "unique chest no.", "team"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(p);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        team_com.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select team", "FYBBA", "SYBBA", "TYBBA", "FYBAMC", "SYBAMC", "TYBBMM", "TYBSW", "FYBBA T&T", "SYBBA T&T", "TYBBA T&T", "FYBCA", "SYBCA", "TYBCA" }));
        team_com.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                team_comActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel2.setText("FUTSAL");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("INSERT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        back1.setBackground(new java.awt.Color(255, 255, 255));
        back1.setText("BACK");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        jLabel1.setText("ENTER THE ROLL NUMBER  TO BE DELETED");

        jButton4.setText("REFRESH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 119, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(n_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(team_com, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(team_com, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(n_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int y=(int)Integer.parseInt(n_tf.getText());        
        DefaultTableModel model = (DefaultTableModel) p.getModel();


       try{
      
        conn=DriverManager.getConnection(db_URL,db_USER,db_password);
            stmt=conn.createStatement();
            int i=stmt.executeUpdate("DELETE FROM sports_mania_table WHERE roll="+y+" ;");
        
            if(i>=0)
                
                javax.swing.JOptionPane.showMessageDialog(rootPane, "DELETE SUCCESSFUL");
            conn.close();
       }
       catch(SQLException e)
        {
            System.out.print("SQL EXCEPTION"+e.getMessage());
        }
        catch(Exception x)
        {
            System.out.print("EXCEPTION"+x.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void team_comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_team_comActionPerformed
        if(team_com.getSelectedIndex()==1)
        {
            int rows=0,cols=0;
            //int i = 0;
            //DefaultTableModel model=( DefaultTableModel) x.getModel();
            try
            {
                conn=DriverManager.getConnection(db_URL,db_USER,db_password);
                stmt=conn.createStatement();
                rs=stmt.executeQuery("SELECT * FROM sports_mania_table WHERE Team='FYBBA' AND event='FUTSAL';");

                while(rs.next())
                {
                    p.setValueAt(rs.getString(1), rows, cols++);
                    p.setValueAt(rs.getString(2), rows, cols++);
                    p.setValueAt(rs.getString(3), rows, cols++);
                    p.setValueAt(rs.getString(4), rows, cols++);
                    p.setValueAt(rs.getString(5), rows, cols++);
                    p.setValueAt(rs.getString(6), rows, cols++);
                    p.setValueAt(rs.getString(7), rows, cols++);
                    p.setValueAt(rs.getString(8), rows, cols++);
                    p.setValueAt(rs.getString(9), rows, cols++);
                    p.setValueAt(rs.getString(10), rows, cols++);
                    p.setValueAt(rs.getInt(11), rows, cols++);
                    p.setValueAt(rs.getString(12), rows, cols++);
                    rows++;
                    cols=0;

                }

                rs.close();
                stmt.close();
                conn.close();

            }

            catch(SQLException e)
            {
                System.out.print("  SQL EXCEPTION  "+e.getMessage());
            }
            catch(Exception ex)
            {
                System.out.print("  EXCEPTION  "+ex.getMessage());
            }

        }
        else if(team_com.getSelectedIndex()==2)
        {
            int rows=0,cols=0;
            //int i = 0;
            // DefaultTableModel model=( DefaultTableModel) x.getModel();
            try
            {
                conn=DriverManager.getConnection(db_URL,db_USER,db_password);
                stmt=conn.createStatement();
                rs=stmt.executeQuery("SELECT * FROM sports_mania_table WHERE Team='SYBBA' AND event='FUTSAL';");

                while(rs.next())
                {
                    p.setValueAt(rs.getString(1), rows, cols++);
                    p.setValueAt(rs.getString(2), rows, cols++);
                    p.setValueAt(rs.getString(3), rows, cols++);
                    p.setValueAt(rs.getString(4), rows, cols++);
                    p.setValueAt(rs.getString(5), rows, cols++);
                    p.setValueAt(rs.getString(6), rows, cols++);
                    p.setValueAt(rs.getString(7), rows, cols++);
                    p.setValueAt(rs.getString(8), rows, cols++);
                    p.setValueAt(rs.getString(9), rows, cols++);
                    p.setValueAt(rs.getString(10), rows, cols++);
                    p.setValueAt(rs.getInt(11), rows, cols++);
                    p.setValueAt(rs.getString(12), rows, cols++);
                    rows++;
                    cols=0;

                }

                rs.close();
                stmt.close();
                conn.close();

            }

            catch(SQLException e)
            {
                System.out.print("  SQL EXCEPTION  "+e.getMessage());
            }
            catch(Exception ex)
            {
                System.out.print("  EXCEPTION  "+ex.getMessage());
            }
        }
        else if(team_com.getSelectedIndex()==3)
        {
            int rows=0,cols=0;
            //int i = 0;
            // DefaultTableModel model=( DefaultTableModel) x.getModel();
            try
            {
                conn=DriverManager.getConnection(db_URL,db_USER,db_password);
                stmt=conn.createStatement();
                rs=stmt.executeQuery("SELECT * FROM sports_mania_table WHERE Team='TYBBA' AND event='FUTSAL';");

                while(rs.next())
                {
                    p.setValueAt(rs.getString(1), rows, cols++);
                    p.setValueAt(rs.getString(2), rows, cols++);
                    p.setValueAt(rs.getString(3), rows, cols++);
                    p.setValueAt(rs.getString(4), rows, cols++);
                    p.setValueAt(rs.getString(5), rows, cols++);
                    p.setValueAt(rs.getString(6), rows, cols++);
                    p.setValueAt(rs.getString(7), rows, cols++);
                    p.setValueAt(rs.getString(8), rows, cols++);
                    p.setValueAt(rs.getString(9), rows, cols++);
                    p.setValueAt(rs.getString(10), rows, cols++);
                    p.setValueAt(rs.getInt(11), rows, cols++);
                    p.setValueAt(rs.getString(12), rows, cols++);
                    rows++;
                    cols=0;

                }

                rs.close();
                stmt.close();
                conn.close();

            }

            catch(SQLException e)
            {
                System.out.print("  SQL EXCEPTION  "+e.getMessage());
            }
            catch(Exception ex)
            {
                System.out.print("  EXCEPTION  "+ex.getMessage());
            }
        }
        else   if(team_com.getSelectedIndex()==4)
        {
            int rows=0,cols=0;
            // int i = 0;
            //  DefaultTableModel model=( DefaultTableModel) x.getModel();
            try
            {
                conn=DriverManager.getConnection(db_URL,db_USER,db_password);
                stmt=conn.createStatement();
                rs=stmt.executeQuery("SELECT * FROM sports_mania_table WHERE Team='FYBAMC' AND event='FUTSAL';");

                while(rs.next())
                {
                    p.setValueAt(rs.getString(1), rows, cols++);
                    p.setValueAt(rs.getString(2), rows, cols++);
                    p.setValueAt(rs.getString(3), rows, cols++);
                    p.setValueAt(rs.getString(4), rows, cols++);
                    p.setValueAt(rs.getString(5), rows, cols++);
                    p.setValueAt(rs.getString(6), rows, cols++);
                    p.setValueAt(rs.getString(7), rows, cols++);
                    p.setValueAt(rs.getString(8), rows, cols++);
                    p.setValueAt(rs.getString(9), rows, cols++);
                    p.setValueAt(rs.getString(10), rows, cols++);
                    p.setValueAt(rs.getInt(11), rows, cols++);
                    p.setValueAt(rs.getString(12), rows, cols++);
                    rows++;
                    cols=0;

                }

                rs.close();
                stmt.close();
                conn.close();

            }

            catch(SQLException e)
            {
                System.out.print("  SQL EXCEPTION  "+e.getMessage());
            }
            catch(Exception ex)
            {
                System.out.print("  EXCEPTION  "+ex.getMessage());
            }
        }

        else   if(team_com.getSelectedIndex()==5)
        {
            int rows=0,cols=0;
            // int i = 0;
            //  DefaultTableModel model=( DefaultTableModel) x.getModel();
            try
            {
                conn=DriverManager.getConnection(db_URL,db_USER,db_password);
                stmt=conn.createStatement();
                rs=stmt.executeQuery("SELECT * FROM sports_mania_table WHERE Team='SYBAMC' AND event='FUTSAL';");

                while(rs.next())
                {
                    p.setValueAt(rs.getString(1), rows, cols++);
                    p.setValueAt(rs.getString(2), rows, cols++);
                    p.setValueAt(rs.getString(3), rows, cols++);
                    p.setValueAt(rs.getString(4), rows, cols++);
                    p.setValueAt(rs.getString(5), rows, cols++);
                    p.setValueAt(rs.getString(6), rows, cols++);
                    p.setValueAt(rs.getString(7), rows, cols++);
                    p.setValueAt(rs.getString(8), rows, cols++);
                    p.setValueAt(rs.getString(9), rows, cols++);
                    p.setValueAt(rs.getString(10), rows, cols++);
                    p.setValueAt(rs.getInt(11), rows, cols++);
                    p.setValueAt(rs.getString(12), rows, cols++);
                    rows++;
                    cols=0;

                }

                rs.close();
                stmt.close();
                conn.close();

            }

            catch(SQLException e)
            {
                System.out.print("  SQL EXCEPTION  "+e.getMessage());
            }
            catch(Exception ex)
            {
                System.out.print("  EXCEPTION  "+ex.getMessage());
            }
        }
        else   if(team_com.getSelectedIndex()==6)
        {
            int rows=0,cols=0;
            // int i = 0;
            //  DefaultTableModel model=( DefaultTableModel) x.getModel();
            try
            {
                conn=DriverManager.getConnection(db_URL,db_USER,db_password);
                stmt=conn.createStatement();
                rs=stmt.executeQuery("SELECT * FROM sports_mania_table WHERE Team='TYBBMM' AND event='FUTSAL';");

                while(rs.next())
                {
                    p.setValueAt(rs.getString(1), rows, cols++);
                    p.setValueAt(rs.getString(2), rows, cols++);
                    p.setValueAt(rs.getString(3), rows, cols++);
                    p.setValueAt(rs.getString(4), rows, cols++);
                    p.setValueAt(rs.getString(5), rows, cols++);
                    p.setValueAt(rs.getString(6), rows, cols++);
                    p.setValueAt(rs.getString(7), rows, cols++);
                    p.setValueAt(rs.getString(8), rows, cols++);
                    p.setValueAt(rs.getString(9), rows, cols++);
                    p.setValueAt(rs.getString(10), rows, cols++);
                    p.setValueAt(rs.getInt(11), rows, cols++);
                    p.setValueAt(rs.getString(12), rows, cols++);
                    rows++;
                    cols=0;

                }

                rs.close();
                stmt.close();
                conn.close();

            }

            catch(SQLException e)
            {
                System.out.print("  SQL EXCEPTION  "+e.getMessage());
            }
            catch(Exception ex)
            {
                System.out.print("  EXCEPTION  "+ex.getMessage());
            }
        }
        else   if(team_com.getSelectedIndex()==7)
        {
            int rows=0,cols=0;
            // int i = 0;
            //  DefaultTableModel model=( DefaultTableModel) x.getModel();
            try
            {
                conn=DriverManager.getConnection(db_URL,db_USER,db_password);
                stmt=conn.createStatement();
                rs=stmt.executeQuery("SELECT * FROM sports_mania_table WHERE Team='TYBSW' AND event='FUTSAL';");

                while(rs.next())
                {
                    p.setValueAt(rs.getString(1), rows, cols++);
                    p.setValueAt(rs.getString(2), rows, cols++);
                    p.setValueAt(rs.getString(3), rows, cols++);
                    p.setValueAt(rs.getString(4), rows, cols++);
                    p.setValueAt(rs.getString(5), rows, cols++);
                    p.setValueAt(rs.getString(6), rows, cols++);
                    p.setValueAt(rs.getString(7), rows, cols++);
                    p.setValueAt(rs.getString(8), rows, cols++);
                    p.setValueAt(rs.getString(9), rows, cols++);
                    p.setValueAt(rs.getString(10), rows, cols++);
                    p.setValueAt(rs.getInt(11), rows, cols++);
                    p.setValueAt(rs.getString(12), rows, cols++);
                    rows++;
                    cols=0;

                }

                rs.close();
                stmt.close();
                conn.close();

            }

            catch(SQLException e)
            {
                System.out.print("  SQL EXCEPTION  "+e.getMessage());
            }
            catch(Exception ex)
            {
                System.out.print("  EXCEPTION  "+ex.getMessage());
            }
        }
        else   if(team_com.getSelectedIndex()==8)
        {
            int rows=0,cols=0;
            // int i = 0;
            //  DefaultTableModel model=( DefaultTableModel) x.getModel();
            try
            {
                conn=DriverManager.getConnection(db_URL,db_USER,db_password);
                stmt=conn.createStatement();
                rs=stmt.executeQuery("SELECT * FROM sports_mania_table WHERE Team='FYBBA T&T' AND event='FUTSAL';");

                while(rs.next())
                {
                    p.setValueAt(rs.getString(1), rows, cols++);
                    p.setValueAt(rs.getString(2), rows, cols++);
                    p.setValueAt(rs.getString(3), rows, cols++);
                    p.setValueAt(rs.getString(4), rows, cols++);
                    p.setValueAt(rs.getString(5), rows, cols++);
                    p.setValueAt(rs.getString(6), rows, cols++);
                    p.setValueAt(rs.getString(7), rows, cols++);
                    p.setValueAt(rs.getString(8), rows, cols++);
                    p.setValueAt(rs.getString(9), rows, cols++);
                    p.setValueAt(rs.getString(10), rows, cols++);
                    p.setValueAt(rs.getInt(11), rows, cols++);
                    p.setValueAt(rs.getString(12), rows, cols++);
                    rows++;
                    cols=0;

                }

                rs.close();
                stmt.close();
                conn.close();

            }

            catch(SQLException e)
            {
                System.out.print("  SQL EXCEPTION  "+e.getMessage());
            }
            catch(Exception ex)
            {
                System.out.print("  EXCEPTION  "+ex.getMessage());
            }
        }
        else   if(team_com.getSelectedIndex()==9)
        {
            int rows=0,cols=0;
            // int i = 0;
            //  DefaultTableModel model=( DefaultTableModel) x.getModel();
            try
            {
                conn=DriverManager.getConnection(db_URL,db_USER,db_password);
                stmt=conn.createStatement();
                rs=stmt.executeQuery("SELECT * FROM sports_mania_table WHERE Team='SYBBA T&T' AND event='FUTSAL';");

                while(rs.next())
                {
                    p.setValueAt(rs.getString(1), rows, cols++);
                    p.setValueAt(rs.getString(2), rows, cols++);
                    p.setValueAt(rs.getString(3), rows, cols++);
                    p.setValueAt(rs.getString(4), rows, cols++);
                    p.setValueAt(rs.getString(5), rows, cols++);
                    p.setValueAt(rs.getString(6), rows, cols++);
                    p.setValueAt(rs.getString(7), rows, cols++);
                    p.setValueAt(rs.getString(8), rows, cols++);
                    p.setValueAt(rs.getString(9), rows, cols++);
                    p.setValueAt(rs.getString(10), rows, cols++);
                    p.setValueAt(rs.getInt(11), rows, cols++);
                    p.setValueAt(rs.getString(12), rows, cols++);
                    rows++;
                    cols=0;

                }

                rs.close();
                stmt.close();
                conn.close();

            }

            catch(SQLException e)
            {
                System.out.print("  SQL EXCEPTION  "+e.getMessage());
            }
            catch(Exception ex)
            {
                System.out.print("  EXCEPTION  "+ex.getMessage());
            }
        }
        else   if(team_com.getSelectedIndex()==10)
        {
            int rows=0,cols=0;
            // int i = 0;
            //  DefaultTableModel model=( DefaultTableModel) x.getModel();
            try
            {
                conn=DriverManager.getConnection(db_URL,db_USER,db_password);
                stmt=conn.createStatement();
                rs=stmt.executeQuery("SELECT * FROM sports_mania_table WHERE Team='TYBBA T&T' AND event='FUTSAL';");

                while(rs.next())
                {
                    p.setValueAt(rs.getString(1), rows, cols++);
                    p.setValueAt(rs.getString(2), rows, cols++);
                    p.setValueAt(rs.getString(3), rows, cols++);
                    p.setValueAt(rs.getString(4), rows, cols++);
                    p.setValueAt(rs.getString(5), rows, cols++);
                    p.setValueAt(rs.getString(6), rows, cols++);
                    p.setValueAt(rs.getString(7), rows, cols++);
                    p.setValueAt(rs.getString(8), rows, cols++);
                    p.setValueAt(rs.getString(9), rows, cols++);
                    p.setValueAt(rs.getString(10), rows, cols++);
                    p.setValueAt(rs.getInt(11), rows, cols++);
                    p.setValueAt(rs.getString(12), rows, cols++);
                    rows++;
                    cols=0;

                }

                rs.close();
                stmt.close();
                conn.close();

            }

            catch(SQLException e)
            {
                System.out.print("  SQL EXCEPTION  "+e.getMessage());
            }
            catch(Exception ex)
            {
                System.out.print("  EXCEPTION  "+ex.getMessage());
            }
        }
        else   if(team_com.getSelectedIndex()==11)
        {
            int rows=0,cols=0;
            // int i = 0;
            //  DefaultTableModel model=( DefaultTableModel) x.getModel();
            try
            {
                conn=DriverManager.getConnection(db_URL,db_USER,db_password);
                stmt=conn.createStatement();
                rs=stmt.executeQuery("SELECT * FROM sports_mania_table WHERE Team='FYBCA' AND event='FUTSAL';");

                while(rs.next())
                {
                    p.setValueAt(rs.getString(1), rows, cols++);
                    p.setValueAt(rs.getString(2), rows, cols++);
                    p.setValueAt(rs.getString(3), rows, cols++);
                    p.setValueAt(rs.getString(4), rows, cols++);
                    p.setValueAt(rs.getString(5), rows, cols++);
                    p.setValueAt(rs.getString(6), rows, cols++);
                    p.setValueAt(rs.getString(7), rows, cols++);
                    p.setValueAt(rs.getString(8), rows, cols++);
                    p.setValueAt(rs.getString(9), rows, cols++);
                    p.setValueAt(rs.getString(10), rows, cols++);
                    p.setValueAt(rs.getInt(11), rows, cols++);
                    p.setValueAt(rs.getString(12), rows, cols++);
                    rows++;
                    cols=0;

                }

                rs.close();
                stmt.close();
                conn.close();

            }

            catch(SQLException e)
            {
                System.out.print("  SQL EXCEPTION  "+e.getMessage());
            }
            catch(Exception ex)
            {
                System.out.print("  EXCEPTION  "+ex.getMessage());
            }
        }
        else   if(team_com.getSelectedIndex()==12)
        {
            int rows=0,cols=0;
            // int i = 0;
            //  DefaultTableModel model=( DefaultTableModel) x.getModel();
            try
            {
                conn=DriverManager.getConnection(db_URL,db_USER,db_password);
                stmt=conn.createStatement();
                rs=stmt.executeQuery("SELECT * FROM sports_mania_table WHERE Team='SYBCA' AND event='FUTSAL';");

                while(rs.next())
                {
                    p.setValueAt(rs.getString(1), rows, cols++);
                    p.setValueAt(rs.getString(2), rows, cols++);
                    p.setValueAt(rs.getString(3), rows, cols++);
                    p.setValueAt(rs.getString(4), rows, cols++);
                    p.setValueAt(rs.getString(5), rows, cols++);
                    p.setValueAt(rs.getString(6), rows, cols++);
                    p.setValueAt(rs.getString(7), rows, cols++);
                    p.setValueAt(rs.getString(8), rows, cols++);
                    p.setValueAt(rs.getString(9), rows, cols++);
                    p.setValueAt(rs.getString(10), rows, cols++);
                    p.setValueAt(rs.getInt(11), rows, cols++);
                    p.setValueAt(rs.getString(12), rows, cols++);
                    rows++;
                    cols=0;

                }

                rs.close();
                stmt.close();
                conn.close();

            }

            catch(SQLException e)
            {
                System.out.print("  SQL EXCEPTION  "+e.getMessage());
            }
            catch(Exception ex)
            {
                System.out.print("  EXCEPTION  "+ex.getMessage());
            }
        }
        else   if(team_com.getSelectedIndex()==13)
        {
            int rows=0,cols=0;
            // int i = 0;
            //  DefaultTableModel model=( DefaultTableModel) x.getModel();
            try
            {
                conn=DriverManager.getConnection(db_URL,db_USER,db_password);
                stmt=conn.createStatement();
                rs=stmt.executeQuery("SELECT * FROM sports_mania_table WHERE Team='TYBCA' AND event='FUTSAL';");

                while(rs.next())
                {
                    p.setValueAt(rs.getString(1), rows, cols++);
                    p.setValueAt(rs.getString(2), rows, cols++);
                    p.setValueAt(rs.getString(3), rows, cols++);
                    p.setValueAt(rs.getString(4), rows, cols++);
                    p.setValueAt(rs.getString(5), rows, cols++);
                    p.setValueAt(rs.getString(6), rows, cols++);
                    p.setValueAt(rs.getString(7), rows, cols++);
                    p.setValueAt(rs.getString(8), rows, cols++);
                    p.setValueAt(rs.getString(9), rows, cols++);
                    p.setValueAt(rs.getString(10), rows, cols++);
                    p.setValueAt(rs.getInt(11), rows, cols++);
                    p.setValueAt(rs.getString(12), rows, cols++);
                    rows++;
                    cols=0;

                }

                rs.close();
                stmt.close();
                conn.close();

            }

            catch(SQLException e)
            {
                System.out.print("  SQL EXCEPTION  "+e.getMessage());
            }
            catch(Exception ex)
            {
                System.out.print("  EXCEPTION  "+ex.getMessage());
            }
        }
    }//GEN-LAST:event_team_comActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
dispose();
        mania3 m3=new mania3();
        m3.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
dispose();
        games g=new games();
       g.setVisible(true);
    }//GEN-LAST:event_back1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
dispose();  
        fut dc=new fut();
 dc.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(fut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField n_tf;
    private javax.swing.JTable p;
    private javax.swing.JComboBox<String> team_com;
    // End of variables declaration//GEN-END:variables
}
