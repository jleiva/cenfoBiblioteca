/*
 * Created by JFormDesigner on Sun Dec 18 01:22:21 CST 2016
 */

package UI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Yves Roulin
 */
public class menuUsuariosUI extends JFrame {
    public menuUsuariosUI() {
        initComponents();
    }

    private void UsuariosActionPerformed(ActionEvent e) {
        // TODO add your code here
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

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Yves Roulin
        label1 = new JLabel();
        VerUsuariosBtn = new JButton();
        EliminarUsuarioBtn = new JButton();
        BuscarUsuarioBtn = new JButton();
        RegistrarUsuarioBtn = new JButton();
        Salir = new JButton();

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
        BuscarUsuarioBtn.setText("3. Buscar Usuario");

        //---- RegistrarUsuarioBtn ----
        RegistrarUsuarioBtn.setText("2. Registrar nuevo Usuario");

        //---- Salir ----
        Salir.setText("Ir a Menu Principal");
        Salir.addActionListener(e -> button5ActionPerformed(e));

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
                        .addComponent(RegistrarUsuarioBtn)
                        .addComponent(BuscarUsuarioBtn, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                        .addComponent(EliminarUsuarioBtn, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))
                    .addGap(352, 352, 352))
        );
        contentPaneLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {BuscarUsuarioBtn, EliminarUsuarioBtn, RegistrarUsuarioBtn, VerUsuariosBtn});
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(Salir, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                    .addGap(69, 69, 69)
                    .addComponent(VerUsuariosBtn)
                    .addGap(12, 12, 12)
                    .addComponent(RegistrarUsuarioBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(BuscarUsuarioBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(EliminarUsuarioBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(128, Short.MAX_VALUE))
        );
        contentPaneLayout.linkSize(SwingConstants.VERTICAL, new Component[] {BuscarUsuarioBtn, EliminarUsuarioBtn, RegistrarUsuarioBtn, VerUsuariosBtn});
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
    private JButton RegistrarUsuarioBtn;
    private JButton Salir;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
