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

    private void VerMaterialBtnActionPerformed(ActionEvent e) {
        // TODO add your code here
        JFrame menuMateriales = new menuMaterialesUI();
        menuMateriales.setVisible(true);
        this.setVisible(false);
    }

    private void VerTemasBtnActionPerformed(ActionEvent e) {
        // TODO add your code here
        JFrame menuTemas = new menuTemasUI();
        menuTemas.setVisible(true);
        this.setVisible(false);
    }

    private void VerReservacionesBtnActionPerformed(ActionEvent e) {
        // TODO add your code here
        JFrame menuReserv = new menuReservacionesUI();
        menuReserv.setVisible(true);
        this.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Yves Roulin
        label1 = new JLabel();
        VerUsuariosBtn = new JButton();
        VerReservacionesBtn = new JButton();
        VerTemasBtn = new JButton();
        VerMaterialBtn = new JButton();
        Salir = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Menu Principal del Sistema");
        label1.setFont(new Font("Segoe UI", Font.BOLD, 20));

        //---- VerUsuariosBtn ----
        VerUsuariosBtn.setText("1. Usuarios");
        VerUsuariosBtn.addActionListener(e -> UsuariosActionPerformed(e));

        //---- VerReservacionesBtn ----
        VerReservacionesBtn.setText("4. Reservaciones");
        VerReservacionesBtn.addActionListener(e -> VerReservacionesBtnActionPerformed(e));

        //---- VerTemasBtn ----
        VerTemasBtn.setText("3. Temas");
        VerTemasBtn.addActionListener(e -> VerTemasBtnActionPerformed(e));

        //---- VerMaterialBtn ----
        VerMaterialBtn.setText("2. Materiales");
        VerMaterialBtn.addActionListener(e -> VerMaterialBtnActionPerformed(e));

        //---- Salir ----
        Salir.setText("Salir");
        Salir.addActionListener(e -> button5ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(576, Short.MAX_VALUE)
                    .addComponent(Salir)
                    .addContainerGap())
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label1)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(VerTemasBtn)
                                .addComponent(VerUsuariosBtn))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(VerMaterialBtn)
                                .addComponent(VerReservacionesBtn))))
                    .addContainerGap(204, Short.MAX_VALUE))
        );
        contentPaneLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {VerMaterialBtn, VerReservacionesBtn, VerTemasBtn, VerUsuariosBtn});
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(Salir)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label1)
                    .addGap(81, 81, 81)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(VerUsuariosBtn)
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(VerTemasBtn)
                                .addComponent(VerReservacionesBtn)))
                        .addComponent(VerMaterialBtn))
                    .addContainerGap(166, Short.MAX_VALUE))
        );
        contentPaneLayout.linkSize(SwingConstants.VERTICAL, new Component[] {VerMaterialBtn, VerReservacionesBtn, VerTemasBtn, VerUsuariosBtn});
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Yves Roulin
    private JLabel label1;
    private JButton VerUsuariosBtn;
    private JButton VerReservacionesBtn;
    private JButton VerTemasBtn;
    private JButton VerMaterialBtn;
    private JButton Salir;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
