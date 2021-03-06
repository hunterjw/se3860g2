package spike.fileTest;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import prototype1.GUI;
import spike.fileTest.FHKFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashlyn
 */
public class fileOpenerTest extends javax.swing.JFrame {
   File file;
   FileReader fileReader;
   BufferedReader bufferedReader;
   FileWriter fileWriter;
   BufferedWriter bufferedWriter;
    /**
     * Creates new form fileOpenerTest
     */
    public fileOpenerTest() {
        initComponents();
        fileChoose.addChoosableFileFilter(new FHKFilter());
        fileChoose.setAcceptAllFileFilterUsed(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents()
   {

      fileChoose = new javax.swing.JFileChooser();
      jMenuBar1 = new javax.swing.JMenuBar();
      jMenu1 = new javax.swing.JMenu();
      newSelect = new javax.swing.JMenuItem();
      loadSelect = new javax.swing.JMenuItem();
      saveSelect = new javax.swing.JMenuItem();
      saveAsSelect = new javax.swing.JMenuItem();
      exitSelect = new javax.swing.JMenuItem();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jMenu1.setText("File");

      newSelect.setText("New File");
      newSelect.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            newSelectActionPerformed(evt);
         }
      });
      jMenu1.add(newSelect);

      loadSelect.setText("Load File");
      loadSelect.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            loadSelectActionPerformed(evt);
         }
      });
      jMenu1.add(loadSelect);

      saveSelect.setText("Save");
      saveSelect.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            saveSelectActionPerformed(evt);
         }
      });
      jMenu1.add(saveSelect);

      saveAsSelect.setText("Save As");
      saveAsSelect.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            saveAsSelectActionPerformed(evt);
         }
      });
      jMenu1.add(saveAsSelect);

      exitSelect.setText("Exit");
      exitSelect.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            exitSelectActionPerformed(evt);
         }
      });
      jMenu1.add(exitSelect);

      jMenuBar1.add(jMenu1);

      setJMenuBar(jMenuBar1);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 400, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 279, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void saveAsSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsSelectActionPerformed
      //int returnVal = fileChoose.showSaveDialog(fileOpenerTest.this);
      //if(returnVal == JFileChooser.APPROVE_OPTION)
      //{
         //file = fileChoose.getSelectedFile();  //this will save the .FHX file
      //} 
      newSelectActionPerformed(evt);
      saveSelectActionPerformed(evt);
    }//GEN-LAST:event_saveAsSelectActionPerformed

    private void exitSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitSelectActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitSelectActionPerformed

    private void saveSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSelectActionPerformed
        //saves changes to the .FHX file based on the table
       if (file != null)
         save(file);//not sure if this is good
    }//GEN-LAST:event_saveSelectActionPerformed

    private void loadSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadSelectActionPerformed
      int returnVal = fileChoose.showOpenDialog(fileOpenerTest.this);
      
      if(returnVal == JFileChooser.APPROVE_OPTION)
      {
         file = fileChoose.getSelectedFile();  //this will load the .FHX file
         load(file);//load the table based on the file
      }
    }//GEN-LAST:event_loadSelectActionPerformed

    private void newSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newSelectActionPerformed
      int returnVal = fileChoose.showSaveDialog(fileOpenerTest.this);
      if(returnVal == JFileChooser.APPROVE_OPTION)
      {
         file = fileChoose.getSelectedFile(); //this will save the .FHX file path?
         String file_name = file.toString();
         if(!file_name.endsWith(".FHX"))
            file_name += ".FHX";
         file = new File(file_name);
         if(!file.exists())
         {
            try {
               file.createNewFile();//create the file in the folder selected
         }
         catch (IOException ex) {
            System.out.println("Oops");
         }
         }
      }  
    }//GEN-LAST:event_newSelectActionPerformed
    
    private void save(File f)
    {
       //this will use the table to write to the file
    }
    
    private void load(File f)
    {
         
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
            java.util.logging.Logger.getLogger(fileOpenerTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fileOpenerTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fileOpenerTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fileOpenerTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fileOpenerTest().setVisible(true);
            }
        });
    }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JMenuItem exitSelect;
   private javax.swing.JFileChooser fileChoose;
   private javax.swing.JMenu jMenu1;
   private javax.swing.JMenuBar jMenuBar1;
   private javax.swing.JMenuItem loadSelect;
   private javax.swing.JMenuItem newSelect;
   private javax.swing.JMenuItem saveAsSelect;
   private javax.swing.JMenuItem saveSelect;
   // End of variables declaration//GEN-END:variables
}
