/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appligestionetablissemt;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Matiere extends javax.swing.JFrame {
  
    Connection cnx;
    PreparedStatement pst;
   // Statement stm;
    ResultSet rs;
   
    
    Connecter conn=new Connecter();
    Statement stm;
    ResultSet Rs;
    DefaultTableModel model=new DefaultTableModel();

    /**
     * Creates new form Etudiant
     */
    public Matiere() {
        initComponents();
        TableEtudiant();
      
      model.addColumn("CODE");
      model.addColumn("LIBELLE");
      model.addColumn("COEFFICIENT");
      
      try{
          stm=conn.obtenirConnexion().createStatement();
          ResultSet Rs=stm.executeQuery("select * from matiere");
          while(Rs.next()){
              model.addRow(new Object[]{Rs.getString("code"),Rs.getString("libelle"),Rs.getString("coef")});
          }
      }catch(Exception e){System.err.println(e);}
      
      jTable1.setModel(model);
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtlibelle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcoef = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        boutonmod = new javax.swing.JButton();
        butonsup = new javax.swing.JButton();
        boutonaj = new javax.swing.JButton();
        boutonmod1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtrecherche = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 0));
        setForeground(new java.awt.Color(255, 51, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION MATIERE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("CODE:");

        txtcode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("LIBELLE:");

        txtlibelle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("recherche:");

        txtcoef.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtcoef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcoefActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        boutonmod.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        boutonmod.setText("ACTUALISER");
        boutonmod.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boutonmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonmodActionPerformed(evt);
            }
        });

        butonsup.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        butonsup.setText("SUPPRIMER");
        butonsup.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        butonsup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonsupActionPerformed(evt);
            }
        });

        boutonaj.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        boutonaj.setText("AJOUTER");
        boutonaj.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boutonaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonajActionPerformed(evt);
            }
        });

        boutonmod1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        boutonmod1.setText("MODIFIER");
        boutonmod1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boutonmod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonmod1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boutonmod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butonsup, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(boutonaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boutonmod1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boutonaj, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boutonmod1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boutonmod, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butonsup, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("COEF:");

        txtrecherche.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtrecherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtrechercheKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtlibelle, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcode))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcoef)))
                .addGap(49, 49, 49)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtrecherche)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtlibelle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcoef, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtrecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(204, 51, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setRowHeight(20);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deplace(int i){
        try{
            txtcode.setText(model.getValueAt(i, 0).toString());
            txtlibelle.setText(model.getValueAt(i, 1).toString());
            txtcoef.setText(model.getValueAt(i, 2).toString());
        }catch(Exception e){System.err.println(e);
        JOptionPane.showMessageDialog(null,"Erreur de deplacement"+e.getLocalizedMessage());}
    }
            
    private void txtcoefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcoefActionPerformed
        // TODO add your handling code here
        
    }//GEN-LAST:event_txtcoefActionPerformed

    private void boutonajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonajActionPerformed
        // TODO add your handling code here:
        
        /**
            String id=txtid.getText();
            String nom=txtnom.getText();
            String prenom=txtprenom.getText();     
            String requete="insert into etudiant(id, nom, prenom)VALUES('"+id+"','"+nom+"','"+prenom+"')";
            try{
                stm.executeUpdate(requete);
                JOptionPane.showMessageDialog(null,"Etudiant bien ajouter");
                txtid.setText("");txtnom.setText("");txtprenom.setText("");
            }catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());} 
         ***/   
//La modification 
            
        try{

            Class.forName("com.mysql.jdbc.Driver");
            cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/gesetablissement", "root", "");         
            String sql;
            sql = "insert into matiere(code, libelle, coef)VALUES(?,?,?)";
            pst = cnx.prepareStatement(sql);
            pst.setString(1,txtcode.getText());
            pst.setString(2,txtlibelle.getText());
            pst.setString(3,txtcoef.getText());
            pst.executeUpdate();
            cnx.close();
            JOptionPane.showMessageDialog(null,"enregistrement réussi");
            TableEtudiant();

        }catch(Exception e){
            e.printStackTrace();
        }           
   //fin de la modification         
        
        /***
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost/gesetablissement";
            String user="root";
            String password="";
            cnx=DriverManager.getConnection(url,user,password);
            
            String sql="insert into etudiant(id, nom, prenom)VALUES('?','?','?')";
            pst = cnx.prepareStatement(sql);
            pst.setString(1,txtid.getText());
            pst.setString(2,txtnom.getText());
            pst.setString(3,txtprenom.getText());
            pst.executeUpdate();
            cnx.close();
            JOptionPane.showMessageDialog(null,"enregistrement réussi");
            TableEtudiant();
           
            String id=txtid.getText();
            String nom=txtnom.getText();
            String prenom=txtprenom.getText();     
            String requete="insert into etudiant(id, nom, prenom)VALUES('"+id+"','"+nom+"','"+prenom+"')";
            
            pst.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"enregistrement réussi");
            
        }catch(Exception e){
            e.printStackTrace();
        }
    ***/    
    }//GEN-LAST:event_boutonajActionPerformed
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
try{
    int i=jTable1.getSelectedRow();deplace(i);
}catch(Exception e){JOptionPane.showMessageDialog(null,"Erreur de deplacemnt"+e.getLocalizedMessage());}        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void boutonmod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonmod1ActionPerformed
        // TODO add your handling code here:
/***        
        try{
            if(JOptionPane.showConfirmDialog(null,"confirmer la modification","modification",
                    JOptionPane.YES_NO_OPTION)!=JOptionPane.OK_OPTION) {
                stm.execute("UPDATE etudiant SET nom='"+txtnom.getText()+"',prenom='"+txtprenom.getText()+"' WHERE id='"+txtid.getText());
                //stm.execute("update etudiant nom=?'"+txtnom.getText()+"',prenom=?'"+txtprenom.getText()+"' where id =?'"+txtnom.getText());
            } 
        }catch(Exception e){JOptionPane.showMessageDialog(null,"Erreur de Modification!");
        System.err.println(e);} 
***/

    //Les changement
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/gesetablissement", "root", "");         
            String sql;
            sql = "update matiere set libelle=?,coef=? where code=?";
            pst = cnx.prepareStatement(sql);
            pst.setString(3,txtcode.getText());
            pst.setString(1,txtlibelle.getText());
            pst.setString(2,txtcoef.getText());
            pst.executeUpdate();
            cnx.close();
            JOptionPane.showMessageDialog(null,"Modification réussie");
            TableEtudiant();

        }catch(Exception e){
            e.printStackTrace();
        } 
   //fin d

    }//GEN-LAST:event_boutonmod1ActionPerformed


    
    
    
    private void boutonmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonmodActionPerformed
        
          try{
          model.setRowCount(0);
          stm=conn.obtenirConnexion().createStatement();
          ResultSet Rs=stm.executeQuery("select * from matiere");
          while(Rs.next()){
              model.addRow(new Object[]{Rs.getString("code"),Rs.getString("libelle"),Rs.getString("coef")});
          }
      }catch(Exception e){System.err.println(e);}
      
      jTable1.setModel(model);
      
      txtcode.setText("");
      txtlibelle.setText("");
      txtcoef.setText("");
              // TODO add your handling code here:
    }//GEN-LAST:event_boutonmodActionPerformed

    private void butonsupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonsupActionPerformed
        // TODO add your handling code here:
        
            //Les changement
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/gesetablissement", "root", "");         
            String sql;
            sql = "delete from matiere where code=?";
            pst = cnx.prepareStatement(sql);
            pst.setString(1,txtcode.getText());
            pst.executeUpdate();
            cnx.close();
            JOptionPane.showMessageDialog(null,"Suppression réussie");
            TableEtudiant();

        }catch(Exception e){
            e.printStackTrace();
        } 
   //fin d
        
        /***
        try{
            if(JOptionPane.showConfirmDialog(null,"Etes vous sure de supprimer cet etudiant",
                    "Supprimer l'etudiant",JOptionPane.YES_NO_OPTION)!=JOptionPane.OK_OPTION) 
            if(txtid.getText().length()!=0){
                stm.executeUpdate("Delete From etudiant where id="+txtid.getText());
            }
            else{JOptionPane.showMessageDialog(null,"Veuillez remplir le champ id!");}
                
            
        }catch(Exception e){JOptionPane.showMessageDialog(null,"Erreur de Suppression! \n"+e.getMessage());}
        ***/
    }//GEN-LAST:event_butonsupActionPerformed

    private void txtrechercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrechercheKeyReleased
        TableEtudiantRecherche(txtrecherche.getText());
    }//GEN-LAST:event_txtrechercheKeyReleased
   
    public void TableEtudiant(){
        String[] etudiant={"CODE","LIBELLE","COEFFECIENT"};
        String[] afficher=new String[6];
        DefaultTableModel model=new DefaultTableModel(null,etudiant);
        String sql="select * from matiere";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost/gesetablissement";
            String user="root";
            String password="";
            //Connection con;
            cnx = DriverManager.getConnection(url,user,password);
            Statement st=cnx.createStatement();
            rs=st.executeQuery(sql);
            
            while(rs.next()){
                afficher[0]=rs.getString("code");
                afficher[1]=rs.getString("libelle");
                afficher[2]=rs.getString("coef");
                model.addRow(new Object[]{afficher});
            }
            jTable1.setModel(model);
            cnx.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    //Pour Rechercher
    
        public void TableEtudiantRecherche(String valeur){
        String[] etudiant={"CODE","LIBELLE","COEFFICIENT"};
        String[] afficher=new String[6];
        DefaultTableModel model=new DefaultTableModel(null,etudiant);
        String sql="select * from matiere where libelle like'%"+valeur+"'";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost/gesetablissement";
            String user="root";
            String password="";
            //Connection con;
            cnx = DriverManager.getConnection(url,user,password);
            Statement st=cnx.createStatement();
            rs=st.executeQuery(sql);
            
            while(rs.next()){
                afficher[0]=rs.getString("code");
                afficher[1]=rs.getString("libelle");
                afficher[2]=rs.getString("coef");
                model.addRow(new Object[]{afficher});
            }
            jTable1.setModel(model);
            cnx.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(Matiere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matiere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matiere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matiere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matiere().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonaj;
    private javax.swing.JButton boutonmod;
    private javax.swing.JButton boutonmod1;
    private javax.swing.JButton butonsup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtcoef;
    private javax.swing.JTextField txtlibelle;
    private javax.swing.JTextField txtrecherche;
    // End of variables declaration//GEN-END:variables
}
