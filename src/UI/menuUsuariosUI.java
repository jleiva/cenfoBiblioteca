/*
 * Created by JFormDesigner on Sun Dec 18 01:22:21 CST 2016
 */

package UI;

import CapaLogica.Gestor;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Yves Roulin
 */
public class menuUsuariosUI extends JFrame {
    private Component frame;

    public menuUsuariosUI() {
        initComponents();
    }

    private void UsuariosActionPerformed(ActionEvent e) {
        // TODO add your code here
        //JOptionPane.showMessageDialog(frame, Gestor.listarUsuarios());
        JFrame ListaUsuarios = new ListaUsuariosUI();
        ListaUsuarios.setVisible(true);
        this.setVisible(false);
    }

    private void button5ActionPerformed(ActionEvent e) {
        // TODO add your code here
        JFrame menuPrincipal = new MenuPrincipalUI();
        menuPrincipal.setVisible(true);
        this.setVisible(false);
    }

    private void ReservacionesActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void EliminarUsuarioBtnActionPerformed(ActionEvent e) {
        // TODO add your code here
        JFrame eliminarUsuariosUI = new eliminarUsuarioUI();
        eliminarUsuariosUI.setVisible(true);
        this.setVisible(false);
    }

    private void RegistrarUsuarioBtnActionPerformed(ActionEvent e) {
        // TODO add your code here
        JFrame crearUsuario = new crearUsuarioUI();
        crearUsuario.setVisible(true);
        this.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Yves Roulin
        label1 = new JLabel();
        VerUsuariosBtn = new JButton();
        EliminarUsuarioBtn = new JButton();
        BuscarUsuarioBtn = new JButton();
        Salir = new JButton();
        RegistrarUsuarioBtn2 = new JButton();
        RegistrarUsuarioBtn3 = new JButton();
        RegistrarUsuarioBtn4 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Submenu Usuarios");
        label1.setFont(new Font("Segoe UI", Font.BOLD, 20));

        //---- VerUsuariosBtn ----
        VerUsuariosBtn.setText("1. Ver lista de Usuarios");
        VerUsuariosBtn.addActionListener(e -> UsuariosActionPerformed(e));

        //---- EliminarUsuarioBtn ----
        EliminarUsuarioBtn.setText("4. Eliminar Usuario");
        EliminarUsuarioBtn.addActionListener(e -> EliminarUsuarioBtnActionPerformed(e));

        //---- BuscarUsuarioBtn ----
        BuscarUsuarioBtn.setText("5. Buscar Usuario");

        //---- Salir ----
        Salir.setText("Ir a Menu Principal");
        Salir.addActionListener(e -> button5ActionPerformed(e));

        //---- RegistrarUsuarioBtn2 ----
        RegistrarUsuarioBtn2.setText("2. Registrar nuevo Profesor");
        RegistrarUsuarioBtn2.addActionListener(e -> RegistrarUsuarioBtnActionPerformed(e));

        //---- RegistrarUsuarioBtn3 ----
        RegistrarUsuarioBtn3.setText("3. Registrar nuevo Administrativo");
        RegistrarUsuarioBtn3.addActionListener(e -> RegistrarUsuarioBtnActionPerformed(e));

        //---- RegistrarUsuarioBtn4 ----
        RegistrarUsuarioBtn4.setText("4. Registrar nuevo Estudiante");
        RegistrarUsuarioBtn4.addActionListener(e -> RegistrarUsuarioBtnActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label1)
                    .addGap(75, 75, 75)
                    .addComponent(Salir, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(VerUsuariosBtn, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                        .addComponent(BuscarUsuarioBtn, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))
                    .addGap(23, 23, 23)
                    .addComponent(EliminarUsuarioBtn, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 148, Short.MAX_VALUE))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(127, 127, 127)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(RegistrarUsuarioBtn2)
                        .addComponent(RegistrarUsuarioBtn3)
                        .addComponent(RegistrarUsuarioBtn4))
                    .addContainerGap(302, Short.MAX_VALUE))
        );
        contentPaneLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {BuscarUsuarioBtn, EliminarUsuarioBtn, VerUsuariosBtn});
        contentPaneLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {RegistrarUsuarioBtn2, RegistrarUsuarioBtn3, RegistrarUsuarioBtn4});
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(Salir, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                    .addGap(69, 69, 69)
                    .addComponent(VerUsuariosBtn)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(RegistrarUsuarioBtn2)
                    .addGap(18, 18, 18)
                    .addComponent(RegistrarUsuarioBtn3)
                    .addGap(18, 18, 18)
                    .addComponent(RegistrarUsuarioBtn4)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(BuscarUsuarioBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(56, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                            .addComponent(EliminarUsuarioBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42))))
        );
        contentPaneLayout.linkSize(SwingConstants.VERTICAL, new Component[] {BuscarUsuarioBtn, EliminarUsuarioBtn, VerUsuariosBtn});
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Yves Roulin
    private JLabel label1;
    private JButton VerUsuariosBtn;
    private JButton EliminarUsuarioBtn;
    private JButton BuscarUsuarioBtn;
    private JButton Salir;
    private JButton RegistrarUsuarioBtn2;
    private JButton RegistrarUsuarioBtn3;
    private JButton RegistrarUsuarioBtn4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
