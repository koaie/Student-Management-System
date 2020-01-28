package Sms;

import javax.swing.table.DefaultTableModel;

import java.io.*; 
import javax.swing.*; 
import java.awt.event.*; 
import javax.swing.filechooser.*; 

public class Menu extends javax.swing.JFrame 
{
    List list = new List();
    DefaultTableModel tableModel;

   int
   namePos = 0,
   surnamePos = 1,
   genderPos = 2,
   birthDatePos = 3,
   agePos = 4,
   idPos = 5,
   coursePos = 6,
   resultPos = 7,
   statusPos = 8;

    public Menu()
    {
        initComponents();

        addCol("Name");
        addCol("Surname");
        addCol("Gender");
        addCol("Birth Date");
        addCol("Age");
        addCol("ID");
        addCol("Course");
        addCol("Results");
        addCol("Status");

        list.load(list.fileName);
        fetchStudentList();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        SaveButton = new javax.swing.JButton();
        RefreshButton = new javax.swing.JButton();
        NewStudentButton = new javax.swing.JButton();
        DeleteStudentButton = new javax.swing.JButton();
        EditStudentButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable()
	{
            public boolean isCellEditable(int row, int column)
	    {
                return false;
            };
        };
        ExitButton = new javax.swing.JButton();
        SaveAsButton = new javax.swing.JButton();
        OpenFileButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Managament System");
        setBackground(new java.awt.Color(0, 0, 37));
        setMaximumSize(new java.awt.Dimension(1280, 960));
        setMinimumSize(new java.awt.Dimension(1280, 960));

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener()
	{
            public void actionPerformed(java.awt.event.ActionEvent evt)
	    {
                SaveButtonActionPerformed(evt);
            }
        });

        RefreshButton.setText("Refresh");
        RefreshButton.addActionListener(new java.awt.event.ActionListener()
	{
            public void actionPerformed(java.awt.event.ActionEvent evt)
	    {
                RefreshButtonActionPerformed(evt);
            }
        });

        NewStudentButton.setText("New");
        NewStudentButton.addActionListener(new java.awt.event.ActionListener()
	{
            public void actionPerformed(java.awt.event.ActionEvent evt)
	    {
                NewStudentButtonActionPerformed(evt);
            }
        });

        DeleteStudentButton.setText("Del");
        DeleteStudentButton.addActionListener(new java.awt.event.ActionListener()
	{
            public void actionPerformed(java.awt.event.ActionEvent evt)
	    {
                DeleteStudentButtonActionPerformed(evt);
            }
        });

        EditStudentButton.setText("Edit");
        EditStudentButton.addActionListener(new java.awt.event.ActionListener()
	{
            public void actionPerformed(java.awt.event.ActionEvent evt)
	    {
                EditStudentButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTable);

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener()
	{
            public void actionPerformed(java.awt.event.ActionEvent evt)
	    {
                ExitButtonActionPerformed(evt);
            }
        });

        SaveAsButton.setText("Save as");
        SaveAsButton.addActionListener(new java.awt.event.ActionListener()
	{
            public void actionPerformed(java.awt.event.ActionEvent evt)
	    {
                SaveAsButtonActionPerformed(evt);
            }
        });

        OpenFileButton.setText("Open file");
        OpenFileButton.addActionListener(new java.awt.event.ActionListener()
	{
            public void actionPerformed(java.awt.event.ActionEvent evt)
	    {
                OpenFileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(RefreshButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addComponent(EditStudentButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(DeleteStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NewStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(SaveAsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OpenFileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(SaveButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RefreshButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EditStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DeleteStudentButton)
                            .addComponent(NewStudentButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SaveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SaveAsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OpenFileButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ExitButton)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_SaveButtonActionPerformed
             list.save(list.fileName);
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_RefreshButtonActionPerformed
    deleteElements();
    fetchStudentList();
    }//GEN-LAST:event_RefreshButtonActionPerformed

    private void EditStudentButtonActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_EditStudentButtonActionPerformed
        String input = JOptionPane.showInputDialog(null, "Student: " + list.getNode(jTable.getSelectedRow(), 0), JOptionPane.QUESTION_MESSAGE);
        if(!input.isEmpty())
        {
        list.setNode(jTable.getSelectedRow(), jTable.getSelectedColumn(), input);
        }
        if(jTable.getSelectedColumn() == birthDatePos ||jTable.getSelectedColumn() == agePos)
        {
            list.setAge(jTable.getSelectedRow());
        }
        deleteElements();
        fetchStudentList();
    }//GEN-LAST:event_EditStudentButtonActionPerformed

    private void NewStudentButtonActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_NewStudentButtonActionPerformed
        String name = JOptionPane.showInputDialog(null, "Name: ", JOptionPane.QUESTION_MESSAGE);
        String surname = JOptionPane.showInputDialog(null, "Surname: ", JOptionPane.QUESTION_MESSAGE);
        String gender = JOptionPane.showInputDialog(null, "Gender: ", JOptionPane.QUESTION_MESSAGE);
        String birthDate = JOptionPane.showInputDialog(null, "Birth Date(yyyy-mm-dd): ", JOptionPane.QUESTION_MESSAGE);
        String course = JOptionPane.showInputDialog(null, "Course: ", JOptionPane.QUESTION_MESSAGE);
        if(name.matches("[A-Za-z]+") && surname.matches("[A-Za-z]+") && !gender.isEmpty() && birthDate.matches("\\d{4}-\\d{2}-\\d{2}"))
        {
        list.newStudent(name, surname, gender, birthDate, Integer.toString(Integer.parseInt(list.getNode(list.totalStudents() - 1,idPos)) + 1), course, " ", " ");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid input");
        }
        deleteElements();
        fetchStudentList();
    }//GEN-LAST:event_NewStudentButtonActionPerformed

    private void DeleteStudentButtonActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_DeleteStudentButtonActionPerformed
        list.removeStudent(jTable.getSelectedRow());
        deleteElements();
        fetchStudentList();
    }//GEN-LAST:event_DeleteStudentButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_ExitButtonActionPerformed
        list.exit();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void SaveAsButtonActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_SaveAsButtonActionPerformed
        JFileChooser jfs = new JFileChooser("./");
        jfs.setAcceptAllFileFilterUsed(false);
        jfs.addChoosableFileFilter(new FileNameExtensionFilter(".csv", "csv"));
        jfs.showSaveDialog(null);

        File file = new File(jfs.getSelectedFile().getAbsolutePath());

        list.save(file.toString());
    }//GEN-LAST:event_SaveAsButtonActionPerformed

    private void OpenFileButtonActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_OpenFileButtonActionPerformed
        JFileChooser jfs = new JFileChooser("./");
        jfs.setAcceptAllFileFilterUsed(false);
        jfs.addChoosableFileFilter(new FileNameExtensionFilter(".csv", "csv"));
        jfs.showOpenDialog(null);

        File file = new File(jfs.getSelectedFile().getAbsolutePath());

        list.studentList.clear();
        deleteElements();

        list.fileName = file.toString();
        list.load(list.fileName);
        fetchStudentList();
    }//GEN-LAST:event_OpenFileButtonActionPerformed

    void addCol(String value)
    {
        tableModel = (DefaultTableModel) jTable.getModel();
        tableModel.addColumn(value);
    }

    void addRow(Object[] value)
    {
        tableModel = (DefaultTableModel) jTable.getModel();
        tableModel.addRow(value);
    }

    void deleteElements()
    {
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
    }

    void fetchStudentList()
    {
    for(int i = 0; i < list.totalStudents();i++)
     {
       addRow(list.returnArray(i));
     }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteStudentButton;
    private javax.swing.JButton EditStudentButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton NewStudentButton;
    private javax.swing.JButton OpenFileButton;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JButton SaveAsButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
