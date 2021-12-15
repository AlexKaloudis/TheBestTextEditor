
package mainPackage;

import javax.swing.event.UndoableEditListener;
import javax.swing.event.UndoableEditEvent;
import javax.swing.undo.UndoManager;
import java.awt.print.PrinterException;
import java.io.FileReader; //eisagwgh aparatetiton vivliothikon
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File; 
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;


public class textEditor extends javax.swing.JFrame {
  UndoManager undoManager = new UndoManager();
  //dhmiourgia pinaka Font
  private Font []font;
  
    /**
     * Creates new form textEditor
     */
    public textEditor() {
        initComponents();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
        jFileChooser1.setFileFilter(filter);
        /*orismos ws arxikhs katastashs-->
        tou frame gia thn epilogh twn font*/
        fontsFrame.setVisible(false);
        jTextArea1.getDocument().addUndoableEditListener(undoManager); //krataei thn allagh poy ginetai se periptosh pou theloume na kanoume undo
        /*dhlwsh enos pinaka font-->
        me mhkos to mhkos tou pinaka-->
        me ta onomata twn font se morfh string*/
        font=new Font[fonts.length];
        
    }
         
  
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jFileChooser1 = new javax.swing.JFileChooser();
        ErrorDialog1 = new javax.swing.JDialog();
        PrintErrorDialog = new javax.swing.JDialog();
        RightClickPopUpMenu = new javax.swing.JPopupMenu();
        UndoRClick = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        CutRClick = new javax.swing.JMenuItem();
        CopyRClick = new javax.swing.JMenuItem();
        PasteRClick = new javax.swing.JMenuItem();
        DeleteRClick = new javax.swing.JMenuItem();
        jButton2 = new javax.swing.JButton();
        fontsFrame = new javax.swing.JFrame();
        fontLb = new javax.swing.JLabel();
        styleLb = new javax.swing.JLabel();
        sizeLb = new javax.swing.JLabel();
        fontCB = new javax.swing.JComboBox<String>(fonts);
        styleCB = new javax.swing.JComboBox<>();
        sizeCB = new javax.swing.JComboBox<>();
        cancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newMenuItem = new javax.swing.JMenuItem();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        printMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        undoKey = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        cutKey = new javax.swing.JMenuItem();
        copyKey = new javax.swing.JMenuItem();
        pasteKey = new javax.swing.JMenuItem();
        deleteKey = new javax.swing.JMenuItem();
        formMenu = new javax.swing.JMenu();
        textPropertiesMenu = new javax.swing.JMenu();
        fontItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();

        ErrorDialog1.setTitle("Error Message");

        javax.swing.GroupLayout ErrorDialog1Layout = new javax.swing.GroupLayout(ErrorDialog1.getContentPane());
        ErrorDialog1.getContentPane().setLayout(ErrorDialog1Layout);
        ErrorDialog1Layout.setHorizontalGroup(
            ErrorDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        ErrorDialog1Layout.setVerticalGroup(
            ErrorDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PrintErrorDialogLayout = new javax.swing.GroupLayout(PrintErrorDialog.getContentPane());
        PrintErrorDialog.getContentPane().setLayout(PrintErrorDialogLayout);
        PrintErrorDialogLayout.setHorizontalGroup(
            PrintErrorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        PrintErrorDialogLayout.setVerticalGroup(
            PrintErrorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        UndoRClick.setText("Undo");
        UndoRClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoRClickActionPerformed(evt);
            }
        });
        RightClickPopUpMenu.add(UndoRClick);
        RightClickPopUpMenu.add(jSeparator2);

        CutRClick.setText("Cut");
        CutRClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutRClickActionPerformed(evt);
            }
        });
        RightClickPopUpMenu.add(CutRClick);

        CopyRClick.setText("Copy");
        CopyRClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyRClickActionPerformed(evt);
            }
        });
        RightClickPopUpMenu.add(CopyRClick);

        PasteRClick.setText("Paste");
        PasteRClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteRClickActionPerformed(evt);
            }
        });
        RightClickPopUpMenu.add(PasteRClick);

        DeleteRClick.setText("Delete");
        DeleteRClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteRClickActionPerformed(evt);
            }
        });
        RightClickPopUpMenu.add(DeleteRClick);

        jButton2.setText("jButton2");

        fontsFrame.setMinimumSize(new java.awt.Dimension(400, 300));
        fontsFrame.setSize(new java.awt.Dimension(500, 450));
        fontsFrame.setType(java.awt.Window.Type.POPUP);
        fontsFrame.getContentPane().setLayout(new java.awt.GridBagLayout());

        fontLb.setText("Font");
        fontsFrame.getContentPane().add(fontLb, new java.awt.GridBagConstraints());

        styleLb.setText("Style");
        fontsFrame.getContentPane().add(styleLb, new java.awt.GridBagConstraints());

        sizeLb.setText("Size");
        fontsFrame.getContentPane().add(sizeLb, new java.awt.GridBagConstraints());

        DefaultComboBoxModel dml= new DefaultComboBoxModel();
        for (int i = 0; i < fonts.length; i++) {
            dml.addElement(fonts[i]);
        }
        fontCB.setModel(dml);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.ipady = 5;
        fontsFrame.getContentPane().add(fontCB, gridBagConstraints);

        styleCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Default","Bold", "Italic", "Underlined"}));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 7;
        fontsFrame.getContentPane().add(styleCB, gridBagConstraints);

        sizeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "6", "7", "8","9","10","11","12","14","16","18","20","22","24","26","28" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 8;
        fontsFrame.getContentPane().add(sizeCB, gridBagConstraints);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weighty = 0.9;
        fontsFrame.getContentPane().add(cancelButton, gridBagConstraints);

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        fontsFrame.getContentPane().add(okButton, gridBagConstraints);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextArea1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextArea1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        fileMenu.setText("File");

        newMenuItem.setText("New");
        fileMenu.add(newMenuItem);

        openMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveMenuItem.setText("Save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        fileMenu.add(jSeparator1);

        printMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        printMenuItem.setText("Print");
        printMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(printMenuItem);

        menuBar.add(fileMenu);

        editMenu.setText("Edit");
        editMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuActionPerformed(evt);
            }
        });

        undoKey.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        undoKey.setText("Undo");
        undoKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoKeyActionPerformed(evt);
            }
        });
        editMenu.add(undoKey);
        editMenu.add(jSeparator3);

        cutKey.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cutKey.setText("Cut");
        cutKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutKeyActionPerformed(evt);
            }
        });
        editMenu.add(cutKey);

        copyKey.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        copyKey.setText("Copy");
        copyKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyKeyActionPerformed(evt);
            }
        });
        editMenu.add(copyKey);

        pasteKey.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        pasteKey.setText("Paste");
        pasteKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteKeyActionPerformed(evt);
            }
        });
        editMenu.add(pasteKey);

        deleteKey.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        deleteKey.setText("Delete");
        deleteKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteKeyActionPerformed(evt);
            }
        });
        editMenu.add(deleteKey);

        menuBar.add(editMenu);

        formMenu.setText("Format");

        textPropertiesMenu.setText("Text properties");

        fontItem.setText("Font");
        fontItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontItemActionPerformed(evt);
            }
        });
        textPropertiesMenu.add(fontItem);

        formMenu.add(textPropertiesMenu);

        menuBar.add(formMenu);

        helpMenu.setText("Help");
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        // TODO add your handling code here:
        FileReader fs;
        int openFile = jFileChooser1.showOpenDialog(this);//me to showOpenDialog anoigw to parathiro gia epilgi Open
        if(openFile == JFileChooser.APPROVE_OPTION){
            
            String fileName = jFileChooser1.getSelectedFile().getPath(); //tha apothikeusei sthn metavliti filename to arxeio me to path pou epileksame
                try{
                    fs = new FileReader(fileName); 
                    jTextArea1.read(fs,null); //nul??
                    setTitle(fileName); //allazei titlo symfona me to arxeio.Deixnei to plires path kai onoma toy arxeiou 
                    fs.close();
                    
                } catch(IOException exc){
                  // ErrorDialog1.showMessageDialog(exc.getMessage(),""); //pop up parathiro me exception alla den mporw na vrw pws leitourgei
                }
        }
          
         
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        // TODO add your handling code here:    
        FileWriter fw;
        int saveFile = jFileChooser1.showSaveDialog(this);
        if(saveFile == JFileChooser.APPROVE_OPTION){
            File fileName = jFileChooser1.getSelectedFile();              
            try{
                    fw = new FileWriter(fileName);
                    jTextArea1.write(fw); 
                    fw.close();
                } catch(IOException exc){
                 //  ErrorDialog1.showMessageDialog(super.rootPane,"Save failed","",ErrorDialog1.ERROR_MESSAGE); //pop up parathiro me exception alla den mporw na vrw pws leitourgei
                }
        }
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void printMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printMenuItemActionPerformed
        //Print file
        try {
                boolean complete = jTextArea1.print();
            if (complete) {
                /* show a success message  */
                JOptionPane.showMessageDialog(super.rootPane, "The file was printed succefully",
               "textEditor", JOptionPane.PLAIN_MESSAGE);
            } else {
            /*show a message indicating that printing was cancelled */
                JOptionPane.showMessageDialog(super.rootPane, "Printing was canceled!",
               "textEditor", JOptionPane.ERROR_MESSAGE);
            }
        } catch (PrinterException pe) {
        /* Printing failed, report to the user */
            JOptionPane.showMessageDialog(super.rootPane, "Printing failed!!!",
            "textEditor", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_printMenuItemActionPerformed

    private void cutKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutKeyActionPerformed
        // TODO add your handling code here:
        jTextArea1.cut();
    }//GEN-LAST:event_cutKeyActionPerformed

    private void copyKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyKeyActionPerformed
        // TODO add your handling code here:
        jTextArea1.copy();
    }//GEN-LAST:event_copyKeyActionPerformed

    private void pasteKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteKeyActionPerformed
        // TODO add your handling code here:
        jTextArea1.paste();       
    }//GEN-LAST:event_pasteKeyActionPerformed

    private void deleteKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteKeyActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(jTextArea1.getText().replace(jTextArea1.getSelectedText(),""));
    }//GEN-LAST:event_deleteKeyActionPerformed

    private void undoKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoKeyActionPerformed
        // TODO add your handling code here:
        if (undoManager.canUndo()) {
          undoManager.undo();
        }

    }//GEN-LAST:event_undoKeyActionPerformed

    private void editMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editMenuActionPerformed

    private void DeleteRClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteRClickActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(jTextArea1.getText().replace(jTextArea1.getSelectedText(),""));
    }//GEN-LAST:event_DeleteRClickActionPerformed

    private void PasteRClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasteRClickActionPerformed
        // TODO add your handling code here:
        jTextArea1.paste();
    }//GEN-LAST:event_PasteRClickActionPerformed

    private void CopyRClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyRClickActionPerformed
        // TODO add your handling code here:
        jTextArea1.copy();
    }//GEN-LAST:event_CopyRClickActionPerformed

    private void CutRClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CutRClickActionPerformed
        // TODO add your handling code here:
        jTextArea1.cut();
    }//GEN-LAST:event_CutRClickActionPerformed

    private void UndoRClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoRClickActionPerformed
        //  undoKeyActionPerformed(evt); //kalei tin arxikh methodo

        if (undoManager.canUndo()) {  //to kanei apo thn arxh
            undoManager.undo();
        }
    }//GEN-LAST:event_UndoRClickActionPerformed

    private void jTextArea1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseReleased

        if(evt.isPopupTrigger()){
            RightClickPopUpMenu.show(this,evt.getX(),evt.getY());
        }
    }//GEN-LAST:event_jTextArea1MouseReleased

    private void jTextArea1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextArea1MousePressed

    private void jTextArea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1MouseClicked

    private void fontItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontItemActionPerformed
        //otan o xrhsths kanei click sthn epilogh font tote anoigei to frame gia thn epilogh twn font
        fontsFrame.setVisible(true);
        fontsFrame.setSize(200,200);
        
    }//GEN-LAST:event_fontItemActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        /*otan o xrhsths pataei to cancel tote to parathuro kleinei xwris na 
        orisei kapoia allag sto keimeno*/
        fontsFrame.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        
        //pairnoume thn timh tou style combobox
        String styleItem=styleCB.getSelectedItem().toString();
       
        // pairnoume thn timh tou size combobox
        int letterSize=Integer.parseInt(sizeCB.getSelectedItem().toString());
        
        /*loop ston pinaka me ta font Strings-->
        gemisma tou pinaka font typou Font-->
        me th vohtheia tou pinaka fonts typou String*/
        for (int i=0;i<fonts.length;i++) {
            switch (styleItem) {
                //metatroph se bold
                case "Bold":
                    font[i]=new Font(fonts[i],Font.BOLD,letterSize);
                    break;
                //metatroph se italic
                case "Italic":
                    font[i]=new Font(fonts[i],Font.ITALIC,letterSize);
                    break;
                //metatroph se underlined
                case "Underlined":
                    font[i]=new Font(fonts[i],Font.PLAIN,letterSize);
                    Map<TextAttribute, Object> map = new HashMap<TextAttribute, Object>();
                    map.put(TextAttribute.FONT, font[i]);
                    map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
                    font[i] = Font.getFont(map);
                    jTextArea1.setFont(font[i]);
                    break;
                default:
                    font[i]=new Font(fonts[i],Font.PLAIN,letterSize);
                    break;
            }
        }
        
        /*pairnoume to index apo to stoixeio
        pou exei epileksei o xrhsths sto combo
        box me ta font*/
        int fontIdx =fontCB.getSelectedIndex();
        
        /*orizoume to font me to index pou dialekse
        o xrhsths se sunduasmo me ton pinaka twn font
        typou Font*/
        jTextArea1.setFont(font[fontIdx]);
        
        //kryvoume to frame
        fontsFrame.setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed

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
            java.util.logging.Logger.getLogger(textEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(textEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(textEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(textEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new textEditor().setVisible(true);

            }
        });
    }
    /* dhlwsh enos pinaka typou String
    pou gemizei me ta onomata twn diathesimwn
    font pou einai diathesima sthn Java*/
    private String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CopyRClick;
    private javax.swing.JMenuItem CutRClick;
    private javax.swing.JMenuItem DeleteRClick;
    private javax.swing.JDialog ErrorDialog1;
    private javax.swing.JMenuItem PasteRClick;
    private javax.swing.JDialog PrintErrorDialog;
    private javax.swing.JPopupMenu RightClickPopUpMenu;
    private javax.swing.JMenuItem UndoRClick;
    private javax.swing.JButton cancelButton;
    private javax.swing.JMenuItem copyKey;
    private javax.swing.JMenuItem cutKey;
    private javax.swing.JMenuItem deleteKey;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JComboBox<String> fontCB;
    private javax.swing.JMenuItem fontItem;
    private javax.swing.JLabel fontLb;
    private javax.swing.JFrame fontsFrame;
    private javax.swing.JMenu formMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem newMenuItem;
    private javax.swing.JButton okButton;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteKey;
    private javax.swing.JMenuItem printMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JComboBox<String> sizeCB;
    private javax.swing.JLabel sizeLb;
    private javax.swing.JComboBox<String> styleCB;
    private javax.swing.JLabel styleLb;
    private javax.swing.JMenu textPropertiesMenu;
    private javax.swing.JMenuItem undoKey;
    // End of variables declaration//GEN-END:variables
}
