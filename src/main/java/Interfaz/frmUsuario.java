
package Interfaz;

import entidades.Usuario;
import Interfaz.frmLogin;
import static java.awt.image.ImageObserver.HEIGHT;
import negocio.Usuarios;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Equipo2
 */
public class frmUsuario extends javax.swing.JFrame {

    /**
     * Contructor de la clase frmUsuario
     */
    public frmUsuario() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        campoTextoNombre = new javax.swing.JTextField();
        campoTextoEmail = new javax.swing.JTextField();
        campoTextoDireccion = new javax.swing.JTextField();
        campoTextoTelefono = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        botonVaciar = new javax.swing.JButton();
        campoTextoContrasena = new javax.swing.JPasswordField();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel1.setText("Usuario");
        jLabel1.setVerifyInputWhenFocusTarget(false);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel4.setText("Teléfono");

        lblDireccion.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        lblDireccion.setText("Dirección");

        lblContraseña.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        lblContraseña.setText("Contraseña");

        botonGuardar.setBackground(new java.awt.Color(51, 51, 255));
        botonGuardar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardar.setText("Registrar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonVaciar.setBackground(new java.awt.Color(255, 153, 0));
        botonVaciar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonVaciar.setForeground(new java.awt.Color(255, 255, 255));
        botonVaciar.setText("Vaciar");
        botonVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVaciarActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(102, 255, 0));
        btnVolver.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblContraseña)
                        .addGap(18, 18, 18)
                        .addComponent(campoTextoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(lblDireccion))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoTextoDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(campoTextoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(campoTextoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(campoTextoTelefono))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnVolver)
                .addGap(35, 35, 35)
                .addComponent(botonVaciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonGuardar)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTextoNombre)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTextoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTextoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña)
                    .addComponent(campoTextoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar)
                    .addComponent(botonVaciar)
                    .addComponent(btnVolver))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Maneja el evento de clic en el botón "Guardar". Este método recopila los
     * datos del usuario desde los campos de texto, valida la contraseña
     * ingresada y registra un nuevo usuario si se cumplen los requisitos.
     *
     * @param evt El evento de acción que desencadena este método.
     */
    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        // TODO add your handling code here:
        try {
            Usuarios usuarios = new Usuarios();
            Usuario usuarioNuevo = new Usuario();

            usuarioNuevo.setNombre(campoTextoNombre.getText());
            usuarioNuevo.setEmail(campoTextoEmail.getText());
            char[] contrasenaCaracter = campoTextoContrasena.getPassword();
            String contrasenaString = new String(contrasenaCaracter);
            usuarioNuevo.setContrasena(contrasenaString);
            usuarioNuevo.setTelefono(campoTextoTelefono.getText());
            usuarioNuevo.setDireccion(campoTextoDireccion.getText());

            if (campoTextoNombre.getText().trim().isEmpty() || campoTextoEmail.getText().trim().isEmpty()
                    || contrasenaString.trim().isEmpty() || campoTextoTelefono.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error: campos vacíos, ingrese valores en los campos de texto", "Error de registro de usuario", HEIGHT);

            } else {
                if (usuarios.validarContrasena(usuarioNuevo.getContrasena())) {
                    usuarios.registrarUsuario(usuarioNuevo);
                    frmLogin loginVentana = new frmLogin();
                    loginVentana.setVisible(true);
                    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    this.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Error: La contraseña debe de contener almenos una letra mayuscula, almenos un digito [0-9], \ndebe contener almenos un caracter que no sea ni letra ni digito\n y por último debe tener de 8 a 10 caracteres", "Error de ingreso de contraseña", HEIGHT);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_botonGuardarActionPerformed

    /**
     * Maneja el evento de clic en el botón "Vaciar". Este método limpia (borra)
     * los datos ingresados en los campos de texto del formulario.
     *
     * @param evt El evento de acción que desencadena este método.
     */
    private void botonVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVaciarActionPerformed
        // TODO add your handling code here:
        campoTextoNombre.setText("");
        campoTextoEmail.setText("");
        campoTextoContrasena.setText("");
        campoTextoTelefono.setText("");
        campoTextoDireccion.setText("");
    }//GEN-LAST:event_botonVaciarActionPerformed

    /**
     * Maneja el evento de clic en el botón "Volver". Este método crea una nueva
     * instancia de la ventana de inicio de sesión (frmLogin), la hace visible y
     * configura el cierre de la ventana actual antes de ocultarla.
     *
     * @param evt El evento de acción que desencadena este método.
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        frmLogin log = new frmLogin();
        log.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(false);

    }//GEN-LAST:event_btnVolverActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonVaciar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPasswordField campoTextoContrasena;
    private javax.swing.JTextField campoTextoDireccion;
    private javax.swing.JTextField campoTextoEmail;
    private javax.swing.JTextField campoTextoNombre;
    private javax.swing.JTextField campoTextoTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblDireccion;
    // End of variables declaration//GEN-END:variables
}
