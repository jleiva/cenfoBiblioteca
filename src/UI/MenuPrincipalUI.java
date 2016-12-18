/*
 * Created by JFormDesigner on Sun Dec 18 01:09:36 CST 2016
 */

package UI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Yves Roulin
 */
public class MenuPrincipalUI extends JFrame {
    public MenuPrincipalUI() {
        initComponents();
    }

	private void button5ActionPerformed(ActionEvent e) {
		// TODO add your code here
        System.exit(0);
	}

    private void UsuariosActionPerformed(ActionEvent e) {
        // TODO add your code here
        JFrame menuUsuarios = new menuUsuariosUI();
        menuUsuarios.setVisible(true);
        this.setVisible(false);
    }

    private void UsuariosKeyPressed(KeyEvent e) {
        // TODO add your code here
    }

    private void EliminarUsuarioBtnActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void SalirBtnActionPerformed(ActionEvent e) {
        // TODO add your code here
        System.exit(1);
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
        label1.setText("Menu Principal del Sistema");
        label1.setFont(new Font("Segoe UI", Font.BOLD, 16));

        //---- VerUsuariosBtn ----
        VerUsuariosBtn.setText("1. Usuarios");
        VerUsuariosBtn.addActionListener(e -> UsuariosActionPerformed(e));

        //---- EliminarUsuarioBtn ----
        EliminarUsuarioBtn.setText("4. Reservaciones");
        EliminarUsuarioBtn.addActionListener(e -> EliminarUsuarioBtnActionPerformed(e));

        //---- BuscarUsuarioBtn ----
        BuscarUsuarioBtn.setText("3. Temas");

        //---- RegistrarUsuarioBtn ----
        RegistrarUsuarioBtn.setText("2. Materiales");

        //---- Salir ----
        Salir.setText("0. Salir");
        Salir.addActionListener(e -> button5ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(192, Short.MAX_VALUE)
                    .addComponent(label1)
                    .addGap(248, 248, 248))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(Salir)
                        .addComponent(VerUsuariosBtn)
                        .addComponent(BuscarUsuarioBtn)
                        .addComponent(EliminarUsuarioBtn)
                        .addComponent(RegistrarUsuarioBtn))
                    .addContainerGap(403, Short.MAX_VALUE))
        );
        contentPaneLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {BuscarUsuarioBtn, EliminarUsuarioBtn, RegistrarUsuarioBtn, Salir, VerUsuariosBtn});
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(label1))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(145, 145, 145)
                            .addComponent(VerUsuariosBtn)
                            .addGap(12, 12, 12)
                            .addComponent(RegistrarUsuarioBtn)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(BuscarUsuarioBtn)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(EliminarUsuarioBtn)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Salir)
                    .addContainerGap(103, Short.MAX_VALUE))
        );
        contentPaneLayout.linkSize(SwingConstants.VERTICAL, new Component[] {BuscarUsuarioBtn, EliminarUsuarioBtn, RegistrarUsuarioBtn, Salir, VerUsuariosBtn});
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
