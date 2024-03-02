package sistema;

import java.awt.Frame;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.*;

public class editarImagen extends javax.swing.JDialog {
 public static final int RET_CANCEL = 0;
    public static final int RET_OK = 1;
       public JTextField txtNuevoId;
    private int returnStatus = RET_CANCEL;
    public JTextField txtImagenId;
    public JTextField txtTitulo;
    public JTextField txtDescripcion;
     public JTextField txtPrecio;
    
    public JTextArea txtImagen;
    private File archivoSeleccionado;
    /**
     * Creates new form EditarImagen
     */
    public editarImagen(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();

    // Centrar la ventana en la pantalla
    setLocationRelativeTo(null);
            txtImagenId = new javax.swing.JTextField();
    txtTitulo = new javax.swing.JTextField();
    txtDescripcion = new javax.swing.JTextField();
    txtPrecio = new javax.swing.JTextField();
    
    txtImagen = new javax.swing.JTextArea();
        // Close the dialog when Esc is pressed
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
    }

    /**
     * @return the return status of this dialog - one of RET_OK or RET_CANCEL
     */
    public int getReturnStatus() {
       return returnStatus;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTitulo2 = new javax.swing.JTextField();
        btnExaminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDescripcion2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio2 = new javax.swing.JTextField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Titulo");

        jLabel3.setText("Imagen");

        txtTitulo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitulo2ActionPerformed(evt);
            }
        });

        btnExaminar.setText("examinar");
        btnExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExaminarActionPerformed(evt);
            }
        });

        jLabel4.setText("      Edicion");

        jLabel5.setText("Descripcion");

        jLabel6.setText("Precio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTitulo2))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnExaminar, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(txtPrecio2))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcion2)))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDescripcion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnExaminar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(cancelButton)))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, okButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addContainerGap())
        );

        getRootPane().setDefaultButton(okButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
try {
    // Validar campos vacíos antes de proceder
    if (txtImagenId.getText().isEmpty() || txtTitulo2.getText().isEmpty() || txtDescripcion2.getText().isEmpty() || txtPrecio2.getText().isEmpty() || txtImagen.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Detener la ejecución si algún campo está vacío
    }

    // Obtener los datos del formulario
     int imagenId = Integer.parseInt(txtImagenId.getText());
            String titulo = txtTitulo2.getText();
            String descripcion = txtDescripcion2.getText();
            Double precio = obtenerPrecioDesdeTexto(txtPrecio2.getText());
            String rutaArchivo = txtImagen.getText();

    // Verificar si hay una ruta de archivo seleccionada
    if (rutaArchivo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Seleccione una imagen.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Detener la ejecución si no se seleccionó una imagen
    }

    // Obtener los datos de la imagen
    byte[] imagenData = obtenerDatosDeImagen(new File(rutaArchivo));

    // Verificar si los datos de la imagen son válidos
    if (imagenData == null || imagenData.length == 0) {
        JOptionPane.showMessageDialog(this, "Error al leer los datos de la imagen.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Detener la ejecución si hay un problema con los datos de la imagen
    }

    // Actualizar la imagen en la base de datos
    if (actualizarBaseDeDatos(imagenId, titulo, descripcion, precio, imagenData)) {
        // Cerrar el diálogo si la actualización fue exitosa
        doClose(RET_OK);
    } else {
        JOptionPane.showMessageDialog(this, "Error al actualizar la imagen en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Ingrese un ID válido.", "Error", JOptionPane.ERROR_MESSAGE);
} catch (Exception e) {
    JOptionPane.showMessageDialog(this, "Error al actualizar la imagen.", "Error", JOptionPane.ERROR_MESSAGE);
    e.printStackTrace(); // Imprime la excepción en consola para depuración
}}

    
     private Double obtenerPrecioDesdeTexto(String textoPrecio) {
        try {
            // Intentar convertir el texto del precio a Double
            return Double.parseDouble(textoPrecio);
        } catch (NumberFormatException e) {
            // Manejar la excepción si el texto no es un número válido
            return null; // O devuelve otro valor predeterminado o lanza una excepción según tus necesidades
        }
    }
    
    // ... (otros métodos y código)


private boolean actualizarBaseDeDatos(int imagenId, String titulo,String descripcion, Double precio, byte[] imagenData) {  try {
        // Crear un objeto ImagenAlmacen con los nuevos datos
        ImagenAlmacen nuevaImagen = new ImagenAlmacen();
        nuevaImagen.setImagen_id(imagenId);
        nuevaImagen.setTitulo(titulo);
        nuevaImagen.setDescripcion(descripcion);
        nuevaImagen.setPrecio(precio);
        
        nuevaImagen.setImagen(imagenData);

        // Llamar al método de tu clase BD para actualizar la imagen en la base de datos
        BD bd = new BD("proyectoFinal", "root", "");
        bd.conectar();
        bd.ActualizarImagen(nuevaImagen);
        bd.desconectar();

        // Devolver true si la actualización fue exitosa
        return true;
    } catch (Exception e) {
        // Manejar la excepción según tus necesidades
        e.printStackTrace(); // Imprime la excepción en consola para depuración
        return false;
    }
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void txtTitulo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitulo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitulo2ActionPerformed

    private void btnExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarActionPerformed
     JFileChooser fileChooser = new JFileChooser();
    fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

    int result = fileChooser.showOpenDialog(this);

    if (result == JFileChooser.APPROVE_OPTION) {
        // El usuario seleccionó un archivo o carpeta
        archivoSeleccionado = fileChooser.getSelectedFile();
        
        // Puedes hacer algo con el archivo seleccionado si es necesario
        // ...

        // Puedes mostrar la ruta del archivo en el JTextField
        txtImagen.setText(archivoSeleccionado.getAbsolutePath());
    }
    }//GEN-LAST:event_btnExaminarActionPerformed
    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

  

    public String getTitulo() {
        return txtTitulo.getText();
    }

      public String getDescripcion() {
        // TODO: Agrega lógica para obtener los datos de la imagen
        return txtDescripcion.getText();
    }
    
      public String getPrecio() {
        // TODO: Agrega lógica para obtener los datos de la imagen
        return txtPrecio.getText();
    }
    public byte[] getImagenData() {
        // TODO: Agrega lógica para obtener los datos de la imagen
        return new byte[0];
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editarImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            editarImagen dialog = new editarImagen(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExaminar;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField txtDescripcion2;
    private javax.swing.JTextField txtPrecio2;
    private javax.swing.JTextField txtTitulo2;
    // End of variables declaration//GEN-END:variables
public boolean seHizoClicEnGuardar() {
    // Implementa la lógica para determinar si el usuario hizo clic en "Guardar"
    // Devuelve true si se hizo clic en "Guardar", false de lo contrario
    return true; // o false, según tu lógica
}

    private byte[] obtenerDatosDeImagen(File file) throws IOException {
     if (file != null) {
        FileInputStream fis = new FileInputStream(file);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        
        byte[] buffer = new byte[1024];
        int bytesRead;
        
        while ((bytesRead = fis.read(buffer)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }
        
        fis.close();
        bos.close();
        
        return bos.toByteArray();
    } else {
        // Manejar el caso en el que el archivo es null (puede imprimir un mensaje de error, lanzar una excepción, etc.)
        throw new IllegalArgumentException("El archivo no puede ser null");
    }

    }}
