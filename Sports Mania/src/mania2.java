
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author syase
 */
public class mania2 extends javax.swing.JFrame {
 String db_URL ="jdbc:mysql://localhost:3306/sports_mania?zeroDateTimeBehavior=convertToNull";
    String db_USER="root";
    String db_password="";
    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    DefaultComboBoxModel field_mdl=new DefaultComboBoxModel();
    
    String colour="",tm="";
    int uni;
    public mania2() {
        initComponents();
        field_mdl.addElement("SHORT PUTS");
          team.setModel(field_mdl);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        dept = new javax.swing.ButtonGroup();
        yr = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rollno_tf = new javax.swing.JTextField();
        male_rb = new javax.swing.JRadioButton();
        female_rb = new javax.swing.JRadioButton();
        l_rb = new javax.swing.JRadioButton();
        bamc_rb = new javax.swing.JRadioButton();
        bsw_rb = new javax.swing.JRadioButton();
        bca_rb = new javax.swing.JRadioButton();
        bbatt_rb = new javax.swing.JRadioButton();
        bbmm_rb = new javax.swing.JRadioButton();
        bba_rb = new javax.swing.JRadioButton();
        fy_rb = new javax.swing.JRadioButton();
        sy_rb = new javax.swing.JRadioButton();
        ty_rb = new javax.swing.JRadioButton();
        email_tf = new javax.swing.JTextField();
        phone_tf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        age_tf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        team = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

        jLabel1.setText("DON BOSCO COLLEGE");

        jLabel2.setText("SPORTS MANIA 2019-2020");

        jLabel3.setText("NAME");

        name_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_tfActionPerformed(evt);
            }
        });
        name_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                name_tfKeyTyped(evt);
            }
        });

        jLabel4.setText("ROLL NO");

        jLabel5.setText("GENDER");

        jLabel6.setText("DEPARTMENT");

        jLabel7.setText("YEAR");

        jLabel8.setText("EMAIL");

        jLabel9.setText("MOBILE NO");

        rollno_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rollno_tfKeyTyped(evt);
            }
        });

        gender.add(male_rb);
        male_rb.setText("MALE");
        male_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                male_rbActionPerformed(evt);
            }
        });

        gender.add(female_rb);
        female_rb.setText("FEMALE");
        female_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                female_rbActionPerformed(evt);
            }
        });

        gender.add(l_rb);
        l_rb.setText("LGBTQ");

        dept.add(bamc_rb);
        bamc_rb.setText("BAMC");

        dept.add(bsw_rb);
        bsw_rb.setText("BSW");

        dept.add(bca_rb);
        bca_rb.setText("BCA");
        bca_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bca_rbActionPerformed(evt);
            }
        });

        dept.add(bbatt_rb);
        bbatt_rb.setText("BBA T&T");

        dept.add(bbmm_rb);
        bbmm_rb.setText("BBMM");

        dept.add(bba_rb);
        bba_rb.setText("BBA");

        yr.add(fy_rb);
        fy_rb.setText("FY");

        yr.add(sy_rb);
        sy_rb.setText("SY");

        yr.add(ty_rb);
        ty_rb.setText("TY");

        email_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                email_tfKeyTyped(evt);
            }
        });

        phone_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phone_tfKeyTyped(evt);
            }
        });

        jLabel10.setText("AGE(18+)");

        age_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                age_tfKeyTyped(evt);
            }
        });

        jButton1.setText("FIELD EVENT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        team.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamActionPerformed(evt);
            }
        });

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(male_rb)
                                .addGap(18, 18, 18)
                                .addComponent(female_rb)
                                .addGap(18, 18, 18)
                                .addComponent(l_rb))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bamc_rb)
                                .addGap(18, 18, 18)
                                .addComponent(bsw_rb)
                                .addGap(18, 18, 18)
                                .addComponent(bca_rb)
                                .addGap(18, 18, 18)
                                .addComponent(bbatt_rb)
                                .addGap(18, 18, 18)
                                .addComponent(bbmm_rb)
                                .addGap(18, 18, 18)
                                .addComponent(bba_rb))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(fy_rb)
                                .addGap(18, 18, 18)
                                .addComponent(sy_rb)
                                .addGap(18, 18, 18)
                                .addComponent(ty_rb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(team, 0, 91, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(email_tf)
                            .addComponent(phone_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                        .addGap(125, 125, 125))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(286, 286, 286)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rollno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(73, 73, 73)
                                .addComponent(age_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(296, 296, 296)
                                .addComponent(jLabel1)))
                        .addGap(17, 17, 17)))
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(age_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rollno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(male_rb)
                    .addComponent(female_rb)
                    .addComponent(l_rb))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bamc_rb)
                    .addComponent(bsw_rb)
                    .addComponent(bca_rb)
                    .addComponent(bbatt_rb)
                    .addComponent(bbmm_rb)
                    .addComponent(bba_rb))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(fy_rb)
                            .addComponent(sy_rb)
                            .addComponent(ty_rb))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(email_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phone_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(team)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void name_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_tfActionPerformed

    private void name_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name_tfKeyTyped
        char ch=evt.getKeyChar();
        if((ch < 'a' || ch> 'z') && (ch<'A' || ch>'Z') && (ch!=' ') &&(ch!='\b')){
            evt.consume();
        }
    }//GEN-LAST:event_name_tfKeyTyped

    private void rollno_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rollno_tfKeyTyped
        char ch=evt.getKeyChar();
        if(((ch <'0' || ch>'9') && (ch !='\b')) || rollno_tf.getText().length()==2 )
        {
            evt.consume();
        }
    }//GEN-LAST:event_rollno_tfKeyTyped

    private void male_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_male_rbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_male_rbActionPerformed

    private void female_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_female_rbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_female_rbActionPerformed

    private void bca_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bca_rbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bca_rbActionPerformed

    private void email_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_email_tfKeyTyped
        char ch=evt.getKeyChar();
        //String s="";
        if((ch < 'a' || ch> 'z') &&  (ch!=' ') &&(ch < '0' || ch > '9')&&(ch!='\b') && (ch!='@')&&(ch!='.')&&(ch!='_')&&(ch!='>')&&(ch!='<')){
            evt.consume();
        }
    }//GEN-LAST:event_email_tfKeyTyped

    private void phone_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phone_tfKeyTyped
        char ch=evt.getKeyChar();
        if(((ch < '0' || ch > '9') && (ch !='\b')) || phone_tf.getText().length()==10)
        evt.consume();
    }//GEN-LAST:event_phone_tfKeyTyped

    private void age_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_age_tfKeyTyped
        char ch=evt.getKeyChar();
        if(((ch <'0' || ch>'9') && (ch !='\b')) || age_tf.getText().length()==2 )
        {
            evt.consume();
        }
    }//GEN-LAST:event_age_tfKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();
        field_event f=new field_event();
      f.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int roll=Integer.parseInt(rollno_tf.getText());
        String name=name_tf.getText();
        String mail=email_tf.getText();
        int ag=Integer.parseInt(age_tf.getText());
       // uni=Integer.parseInt(uni_tf.getText());
        // int ph=Integer.parseInt(phone_tf.getText());
        char gender=' ';
        String dep=" ",f=" ";
        //gender
        if(male_rb.isSelected())
        {
            gender='M';
        }
        else if(female_rb.isSelected())
        {
            gender='F';
        }
        else if(l_rb.isSelected())
        {
            gender='O';
        }
        //dept
        if(bamc_rb.isSelected())
        {
            dep="BAMC";
        }
        else if(bsw_rb.isSelected())
        {
            dep="BSW";
        }
        else if(bca_rb.isSelected())
        {
            dep="BCA";
        }
        else if(bbatt_rb.isSelected())
        {
            dep="BBA T&T";
        }
        else if(bbmm_rb.isSelected())
        {
            dep="BBMM";
        }
        else if(bba_rb.isSelected())
        {
            dep="BBA";
        }
        //colour code
        if(fy_rb.isSelected()&&bba_rb.isSelected())
        {
            colour="Yellow";
        }
        else if(sy_rb.isSelected()&&bba_rb.isSelected())
        {
            colour="Brown";
        }
        else if(ty_rb.isSelected()&&bba_rb.isSelected())
        {
            colour="Floresent Blue";
        }
        else  if(fy_rb.isSelected()&&bamc_rb.isSelected())
        {
            colour="Light Gray";
        }
        else if(sy_rb.isSelected()&&bamc_rb.isSelected())
        {
            colour="Black";
        }
        else if(ty_rb.isSelected()&&bbmm_rb.isSelected() && ty_rb.isSelected() && bsw_rb.isSelected())
        {
            colour="Florescent Blue";
        }
        else if(fy_rb.isSelected()&&bbatt_rb.isSelected())
        {
            colour="Green";
        }
        else if(sy_rb.isSelected()&&bbatt_rb.isSelected())
        {
            colour="Red";
        }
        else if(ty_rb.isSelected()&&bbatt_rb.isSelected())
        {
            colour="Orange";
        }
        else  if(fy_rb.isSelected()&&bca_rb.isSelected())
        {
            colour="Purple";
        }
        else if(sy_rb.isSelected()&&bca_rb.isSelected())
        {
            colour="Blue";
        }
        else   if(ty_rb.isSelected()&&bca_rb.isSelected())
        {
            colour="Maroon";
        }
        //year
        if(fy_rb.isSelected())
        {
            f="FY";

        }
        else if(sy_rb.isSelected())
        {
            f="SY";
        }
        else if(ty_rb.isSelected())
        {
            f="TY";
        }
        //team
          if(fy_rb.isSelected()&&bba_rb.isSelected())
        {
            tm="FYBBA";
        }
        else if(sy_rb.isSelected()&&bba_rb.isSelected())
        {
            tm="SYBBA";
        }
        else if(ty_rb.isSelected()&&bba_rb.isSelected())
        {
            tm="TYBBA";
        }
        else  if(fy_rb.isSelected()&&bamc_rb.isSelected())
        {
            tm="FYBAMC";
        }
        else if(sy_rb.isSelected()&&bamc_rb.isSelected())
        {
            tm="SYBAMC";
        }
         else if(ty_rb.isSelected()&&bamc_rb.isSelected())
        {
            javax.swing.JOptionPane.showMessageDialog(rootPane,"TEAM NOT AVAILABLE...PLEASE CHOOSE OTHER TEAM");
            return ;
        }
         else if(fy_rb.isSelected()&& bbmm_rb.isSelected())
        {
          javax.swing.JOptionPane.showMessageDialog(rootPane,"TEAM NOT AVAILABLE...PLEASE CHOOSE OTHER TEAM");
            return ;
        }
          else if(sy_rb.isSelected()&& bbmm_rb.isSelected())
        {
           javax.swing.JOptionPane.showMessageDialog(rootPane,"TEAM NOT AVAILABLE...PLEASE CHOOSE OTHER TEAM");
            return ;
        }
         else if(ty_rb.isSelected()&& bbmm_rb.isSelected())
        {
            tm="TYBBMM";
        }
         else if(fy_rb.isSelected() && bsw_rb.isSelected())
        {
           javax.swing.JOptionPane.showMessageDialog(rootPane,"TEAM NOT AVAILABLE...PLEASE CHOOSE OTHER TEAM");
            return ;
        }
          else if(sy_rb.isSelected() && bsw_rb.isSelected())
        {
           javax.swing.JOptionPane.showMessageDialog(rootPane,"TEAM NOT AVAILABLE...PLEASE CHOOSE OTHER TEAM");
            return ;
        }
         else if(ty_rb.isSelected() && bsw_rb.isSelected())
        {
            tm="TYBSW";
        }
        else if(fy_rb.isSelected()&&bbatt_rb.isSelected())
        {
            tm="FYBBA T&T";
        }
        else if(sy_rb.isSelected()&&bbatt_rb.isSelected())
        {
          tm="SYBBA T&T";
        }
        else if(ty_rb.isSelected()&&bbatt_rb.isSelected())
        {
            tm="TYBBA T&T";
        }
        else  if(fy_rb.isSelected()&&bca_rb.isSelected())
        {
            tm="FYBCA";
        }
        else if(sy_rb.isSelected()&&bca_rb.isSelected())
        {
            tm="SYBCA";
        }
        else   if(ty_rb.isSelected()&&bca_rb.isSelected())
        {
            tm="TYBCA";
        }
        if(fy_rb.isSelected())
        {
            f="FY";

        }
        else if(sy_rb.isSelected())
        {
            f="SY";
        }
        else if(ty_rb.isSelected())
        {
            f="TY";
        }

        String query="INSERT INTO sports_mania_table VALUES('"+roll+"','"+name+"','"+mail+"','"+ag+"','"+phone_tf.getText()+"','"+gender+"','"+f+"','"+dep+"','"+team.getSelectedItem()+"','"+colour+"','"+uni+"','"+tm+"');";
        javax.swing.JOptionPane.showMessageDialog(rootPane, query);
        if((name_tf.getText().trim().equals("")))
        {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "name is  mandatory");
        }
        else if((age_tf.getText().trim().equals(""))|| Integer.parseInt(age_tf.getText()) <= 18)
        {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "age is  mandatory");
        }
        else if(male_rb == null || female_rb==null || l_rb==null)
        {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "select a gender");
        }
        else if((phone_tf.getText().trim().equals("")) && phone_tf.getText().length()==10)
        {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Enter a valid phone number");
        }
        else if(email_tf.getText().trim().equals(""))
        {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Enter a valid phone number");
        }

        else
        {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "submission successful");
        }
        int i;
        try
        {
            conn= DriverManager.getConnection(db_URL,db_USER,db_password);
            stmt=conn.createStatement();
            i=stmt.executeUpdate(query);

        }
        //catch (MySQLIntegrityConstraintViolationException ex) {

            // JOptionPane.showMessageDialog(rootPane,uni);
            // }

        catch(SQLException e)
        {
            System.out.print("SQL EXCEPTION"+e.toString());
        }
        catch(Exception ex)
        {
            System.out.print("EXCEPTION"+ex.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void teamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teamActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        field_event f=new field_event();
        f.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(mania2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mania2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mania2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mania2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mania2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age_tf;
    private javax.swing.JRadioButton bamc_rb;
    private javax.swing.JRadioButton bba_rb;
    private javax.swing.JRadioButton bbatt_rb;
    private javax.swing.JRadioButton bbmm_rb;
    private javax.swing.JRadioButton bca_rb;
    private javax.swing.JRadioButton bsw_rb;
    private javax.swing.ButtonGroup dept;
    private javax.swing.JTextField email_tf;
    private javax.swing.JRadioButton female_rb;
    private javax.swing.JRadioButton fy_rb;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton l_rb;
    private javax.swing.JRadioButton male_rb;
    private javax.swing.JTextField name_tf;
    private javax.swing.JTextField phone_tf;
    private javax.swing.JTextField rollno_tf;
    private javax.swing.JRadioButton sy_rb;
    private javax.swing.JComboBox<String> team;
    private javax.swing.JRadioButton ty_rb;
    private javax.swing.ButtonGroup yr;
    // End of variables declaration//GEN-END:variables
}
