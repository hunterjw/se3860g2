/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prototype1;
import java.awt.*;
import java.io.File;
import java.io.FilenameFilter;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
/**

 @author martinale
 */
public class GUI extends javax.swing.JFrame
{
   File file;
   /**
    Creates new form GUI
    */
   public GUI()
   {
      initComponents();
      jLabel3.setVisible(false);
      setResizable(false);
      
   }

   /**
    This method is called from within the constructor to initialize the form.
    WARNING: Do NOT modify this code. The content of this method is always
    regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents()
   {

      jMenu1 = new javax.swing.JMenu();
      jScrollPane2 = new javax.swing.JScrollPane();
      jList2 = new javax.swing.JList();
      list1 = new java.awt.List();
      jPopupMenu1 = new javax.swing.JPopupMenu();
      jScrollPane1 = new javax.swing.JScrollPane();
      fileChoose = new javax.swing.JFileChooser();
      textField1 = new java.awt.TextField();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      textField2 = new java.awt.TextField();
      jScrollPane3 = new javax.swing.JScrollPane();
      table1 = new javax.swing.JTable();
      jLabel4 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      textField3 = new java.awt.TextField();
      jToggleButton1 = new javax.swing.JToggleButton();
      jScrollPane4 = new javax.swing.JScrollPane();
      SampleTable = new javax.swing.JTable();
      jLabel3 = new javax.swing.JLabel();
      jMenuBar1 = new javax.swing.JMenuBar();
      jMenu2 = new javax.swing.JMenu();
      newFileOption = new javax.swing.JMenuItem();
      loadFileOption = new javax.swing.JMenuItem();
      saveFileOption = new javax.swing.JMenuItem();
      exitOption = new javax.swing.JMenuItem();
      jMenu3 = new javax.swing.JMenu();

      jMenu1.setText("jMenu1");

      jList2.setModel(new javax.swing.AbstractListModel()
      {
         String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
         public int getSize() { return strings.length; }
         public Object getElementAt(int i) { return strings[i]; }
      });
      jScrollPane2.setViewportView(jList2);

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      textField1.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            textField1ActionPerformed(evt);
         }
      });

      jLabel1.setText("Ending Year");

      jLabel2.setText("Starting Year");

      textField2.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            textField2ActionPerformed(evt);
         }
      });

      jScrollPane3.setName(""); // NOI18N

      table1.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][]
         {
            {null, null, null}
         },
         new String []
         {
            "Year", "Event ", "New Event "
         }
      ));
      jScrollPane3.setViewportView(table1);

      jLabel4.setText("Sample Information");

      jLabel5.setText("Number of Samples");

      textField3.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            textField3ActionPerformed(evt);
         }
      });

      jToggleButton1.setText("OK");
      jToggleButton1.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            jToggleButton1ActionPerformed(evt);
         }
      });

      SampleTable.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][]
         {

         },
         new String []
         {
            "Sample Name"
         }
      ));
      jScrollPane4.setViewportView(SampleTable);

      jLabel3.setText("ERROR");
      jLabel3.setEnabled(false);

      jMenu2.setText("File");

      newFileOption.setText("New File");
      newFileOption.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            newFileOptionActionPerformed(evt);
         }
      });
      jMenu2.add(newFileOption);

      loadFileOption.setText("Load File");
      loadFileOption.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            loadFileOptionActionPerformed(evt);
         }
      });
      jMenu2.add(loadFileOption);

      saveFileOption.setText("Save File");
      saveFileOption.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            saveFileOptionActionPerformed(evt);
         }
      });
      jMenu2.add(saveFileOption);

      exitOption.setText("Exit");
      exitOption.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            exitOptionActionPerformed(evt);
         }
      });
      jMenu2.add(exitOption);

      jMenuBar1.add(jMenu2);

      jMenu3.setText("Edit");
      jMenuBar1.add(jMenu3);

      setJMenuBar(jMenuBar1);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                  .addComponent(textField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel2)
                     .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(18, 18, 18)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel1)
                     .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jToggleButton1))
            .addGap(18, 18, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jLabel4)
                  .addGap(141, 141, 141)
                  .addComponent(jLabel3)))
            .addContainerGap(73, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                           .addGap(27, 27, 27)
                           .addComponent(jLabel5))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                           .addContainerGap()
                           .addComponent(jLabel4)))
                     .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jScrollPane3))
               .addGroup(layout.createSequentialGroup()
                  .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(94, 94, 94)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel2)
                     .addComponent(jLabel1))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(jToggleButton1)
                  .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void textField1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_textField1ActionPerformed
   {//GEN-HEADEREND:event_textField1ActionPerformed
      
   }//GEN-LAST:event_textField1ActionPerformed

   private void textField2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_textField2ActionPerformed
   {//GEN-HEADEREND:event_textField2ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_textField2ActionPerformed

   private void textField3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_textField3ActionPerformed
   {//GEN-HEADEREND:event_textField3ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_textField3ActionPerformed

   private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jToggleButton1ActionPerformed
   {//GEN-HEADEREND:event_jToggleButton1ActionPerformed
      // TODO add your handling code here:
      int Start, End, SampleNum;
      jLabel3.setVisible(false);
      if(!textField1.getText().isEmpty() && !textField3.getText().isEmpty() && !textField2.getText().isEmpty())
      {
         Start = Integer.parseInt(textField3.getText());
         End = Integer.parseInt(textField2.getText());
         SampleNum = Integer.parseInt(textField1.getText()); 
         DefaultTableModel dtm = (DefaultTableModel) table1.getModel();
         if((Start - End) >= 0 )
            dtm.setRowCount((Start - End) + 1 );
         else 
         {
            jLabel3.setVisible(true);
            jLabel3.setText("Cannot have starting year before ending year");
         }
         table1.setModel(dtm);
      //table1.
         DefaultTableModel dtm2 = (DefaultTableModel) SampleTable.getModel();
         dtm2.setRowCount(SampleNum );
      }
      
      TableColumn column = table1.getColumnModel().getColumn(2);


      JComboBox comboBox = new JComboBox();
      comboBox.addItem("Snowboarding");
      comboBox.addItem("Rowing");
      comboBox.addItem("Chasing toddlers");
      comboBox.addItem("Speed reading");
      comboBox.addItem("Teaching high school");
      comboBox.addItem("None");
      column.setCellEditor(new DefaultCellEditor(comboBox));
      DefaultTableCellRenderer renderer =
                new DefaultTableCellRenderer();
        renderer.setToolTipText("Click for combo box");
        column.setCellRenderer(renderer);
   }//GEN-LAST:event_jToggleButton1ActionPerformed

   private void exitOptionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_exitOptionActionPerformed
   {//GEN-HEADEREND:event_exitOptionActionPerformed
      System.exit(0);
   }//GEN-LAST:event_exitOptionActionPerformed

   private void newFileOptionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_newFileOptionActionPerformed
   {//GEN-HEADEREND:event_newFileOptionActionPerformed
      int returnVal = fileChoose.showSaveDialog(GUI.this);
      if(returnVal == JFileChooser.APPROVE_OPTION)
      {
         file = fileChoose.getSelectedFile();  //this will save the .FHX file
      }     
   }//GEN-LAST:event_newFileOptionActionPerformed

   private void loadFileOptionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_loadFileOptionActionPerformed
   {//GEN-HEADEREND:event_loadFileOptionActionPerformed
      int returnVal = fileChoose.showOpenDialog(GUI.this);
      
      if(returnVal == JFileChooser.APPROVE_OPTION)
      {
         file = fileChoose.getSelectedFile();  //this will load the .FHX file
      }
   }//GEN-LAST:event_loadFileOptionActionPerformed

   private void saveFileOptionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_saveFileOptionActionPerformed
   {//GEN-HEADEREND:event_saveFileOptionActionPerformed
      int returnVal = fileChoose.showSaveDialog(GUI.this);
      if(returnVal == JFileChooser.APPROVE_OPTION)
      {
         file = fileChoose.getSelectedFile();  //this will save the .FHX file
         //FilenameFilter filter;
         fileChoose.setFileFilter(new FileNameExtensionFilter("FHX files", "FHX")); // this is just testing file filtering
      } 
   }//GEN-LAST:event_saveFileOptionActionPerformed
   

   /**
    @param args the command line arguments
    */
   public static void main(String args[])
   {
      /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
       * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
       */
      try
      {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
         {
            if ("Nimbus".equals(info.getName()))
            {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      }
      catch (ClassNotFoundException ex)
      {
         java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (InstantiationException ex)
      {
         java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (IllegalAccessException ex)
      {
         java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (javax.swing.UnsupportedLookAndFeelException ex)
      {
         java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
        //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable()
      {
         public void run()
         {
            new GUI().setVisible(true);
         }
      });
      
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JTable SampleTable;
   private javax.swing.JMenuItem exitOption;
   private javax.swing.JFileChooser fileChoose;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JList jList2;
   private javax.swing.JMenu jMenu1;
   private javax.swing.JMenu jMenu2;
   private javax.swing.JMenu jMenu3;
   private javax.swing.JMenuBar jMenuBar1;
   private javax.swing.JPopupMenu jPopupMenu1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JScrollPane jScrollPane3;
   private javax.swing.JScrollPane jScrollPane4;
   private javax.swing.JToggleButton jToggleButton1;
   private java.awt.List list1;
   private javax.swing.JMenuItem loadFileOption;
   private javax.swing.JMenuItem newFileOption;
   private javax.swing.JMenuItem saveFileOption;
   private javax.swing.JTable table1;
   private java.awt.TextField textField1;
   private java.awt.TextField textField2;
   private java.awt.TextField textField3;
   // End of variables declaration//GEN-END:variables
}
