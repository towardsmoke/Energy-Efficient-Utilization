/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energy.efficient;


import static energy.efficient.VM_Center.str1;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author EGC
 */
public class Physical_Create extends javax.swing.JFrame {

   String str;
   public static int nofPhysical;
  
    public Physical_Create() {
        initComponents();
         try{
           Class.forName("com.mysql.jdbc.Driver").newInstance();
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/?","root","");
             String sql="CREATE DATABASE aco";
             String sql1="Drop database if exists aco";
             PreparedStatement s=con.prepareStatement(sql);
             PreparedStatement s1=con.prepareStatement(sql1);
             s1.executeUpdate();
             s.executeUpdate();
            
        }
        catch(Exception ex)
        {
            
        }
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
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        physical = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(240, 157, 234));
        jPanel3.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel8.setText("Energy-Efficient Many-Objective Virtual Machine Placement Optimization in a Cloud Computing Environment");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(20, 10, 750, 50);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 770, 80);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Palatino Linotype", 1, 14))); // NOI18N
        jPanel4.setOpaque(false);
        jPanel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel3.setText("Physical Machine");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(30, 20, 130, 32);

        physical.setEditable(false);
        physical.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jPanel4.add(physical);
        physical.setBounds(188, 20, 190, 30);

        jButton3.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jButton3.setText("Physical Machine");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(400, 20, 160, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(100, 90, 580, 70);

        jList1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jList1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(100, 200, 190, 200);

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Physical Machine", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Palatino Linotype", 1, 14))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel7.setText("Network Bandwidth");
        jLayeredPane3.add(jLabel7);
        jLabel7.setBounds(20, 170, 140, 20);

        jLabel9.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel9.setText("Processor");
        jLayeredPane3.add(jLabel9);
        jLabel9.setBounds(20, 20, 70, 20);

        jLabel10.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel10.setText("RAM");
        jLayeredPane3.add(jLabel10);
        jLabel10.setBounds(20, 90, 50, 20);

        jComboBox1.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "64bit Processor", "32bit Processor" }));
        jLayeredPane3.add(jComboBox1);
        jComboBox1.setBounds(20, 50, 230, 30);

        jComboBox2.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8GB", "4GB", "2GB" }));
        jLayeredPane3.add(jComboBox2);
        jComboBox2.setBounds(20, 120, 230, 30);

        jComboBox3.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1GB/Day", "2GB/Day", "3GB/Day", "4GB/Day" }));
        jLayeredPane3.add(jComboBox3);
        jComboBox3.setBounds(20, 200, 230, 30);

        jPanel1.add(jLayeredPane3);
        jLayeredPane3.setBounds(350, 180, 280, 260);

        jButton1.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        jButton1.setText("CREATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(660, 290, 90, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NextButton2.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(670, 350, 100, 110);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         try
         {
            str = JOptionPane.showInputDialog(this, "Enter Number Of Physical Machine");
            nofPhysical = Integer.parseInt(str);
            physical.setText(nofPhysical + " ");
         
            DefaultListModel list1=new DefaultListModel();
            for (int j=1;j<=nofPhysical;j++)
            {
                    String a="Physical Machine "+j+"";
                    list1.addElement(a);
            }
            jList1.setModel(list1);
           
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aco?zeroDateTimeBehavior=convertToNull","root","");
            Statement stmt=con.createStatement();

            stmt.executeUpdate("DROP TABLE IF EXISTS physical");
            String create="create table physical(pm_no varchar(50),pm_pro varchar(50),pm_ram varchar(50),pm_net varchar(50))";
            stmt.execute(create);
            
            
            
         }
         catch(Exception ex)
         {
             ex.printStackTrace();
         }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
//             for(int k=0;k<nofPhysical;k++)
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aco?zeroDateTimeBehavior=convertToNull","root","");
                Statement st=con.createStatement();
            
                String a=jList1.getSelectedValue();
                String processors=jComboBox1.getSelectedItem().toString();
                String rams=jComboBox2.getSelectedItem().toString();
                String network=jComboBox3.getSelectedItem().toString();
                
                String sql1="insert into physical(pm_no,pm_pro,pm_ram,pm_net)values('"+a+"','"+processors+"','"+rams+"','"+network+"')";
                st.executeUpdate(sql1);
                
                DefaultListModel model = (DefaultListModel) jList1.getModel();
                int selectedIndex = jList1.getSelectedIndex();
                if (selectedIndex != -1)
                {
                    model.remove(selectedIndex);
                }
                JOptionPane.showMessageDialog(rootPane,"Physical Machine Created Successfully");
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        new View_Physical().setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(Physical_Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Physical_Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Physical_Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Physical_Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Physical_Create().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField physical;
    // End of variables declaration//GEN-END:variables
}
