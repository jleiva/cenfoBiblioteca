/*
 * Created by JFormDesigner on Sun Dec 18 18:33:29 CST 2016
 */

package UI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Yves Roulin
 */
public class menuMaterialesUI extends JFrame {
    public menuMaterialesUI() {
        initComponents();
    }

    private void UsuariosActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void EliminarUsuarioBtnActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button5ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void SalirActionPerformed(ActionEvent e) {
        // TODO add your code here
        JFrame menuPrincipal = new MenuPrincipalUI();
        menuPrincipal.setVisible(true);
        this.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Yves Roulin
        label1 = new JLabel();
        VerMaterialBtn = new JButton();
        EliminarMaterialBtn = new JButton();
        BuscarMaterialBtn = new JButton();
        RegistrarMaterialBtn = new JButton();
        Salir = new JButton();
        ModificarMaterialBtn = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Submenu Materiales");
        label1.setFont(new Font("Segoe UI", Font.BOLD, 20));

        //---- VerMaterialBtn ----
        VerMaterialBtn.setText("1. Ver lista de Materiales");
        VerMaterialBtn.addActionListener(e -> UsuariosActionPerformed(e));

        //---- EliminarMaterialBtn ----
        EliminarMaterialBtn.setText("4. Eliminar Material");
        EliminarMaterialBtn.addActionListener(e -> EliminarUsuarioBtnActionPerformed(e));

        //---- BuscarMaterialBtn ----
        BuscarMaterialBtn.setText("3. Buscar Material");

        //---- RegistrarMaterialBtn ----
        RegistrarMaterialBtn.setText("2. Registrar nuevo Material");

        //---- Salir ----
        Salir.setText("Ir a Menu Principal");
        Salir.addActionListener(e -> SalirActionPerformed(e));

        //---- ModificarMaterialBtn ----
        ModificarMaterialBtn.setText("5. Modificar Material");
        ModificarMaterialBtn.addActionListener(e -> EliminarUsuarioBtnActionPerformed(e));

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
                        .addComponent(VerMaterialBtn, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                        .addComponent(RegistrarMaterialBtn)
                        .addComponent(BuscarMaterialBtn, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                        .addComponent(EliminarMaterialBtn, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                        .addComponent(ModificarMaterialBtn, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))
                    .addGap(352, 352, 352))
        );
        contentPaneLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {BuscarMaterialBtn, EliminarMaterialBtn, ModificarMaterialBtn, RegistrarMaterialBtn, VerMaterialBtn});
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(Salir, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                    .addGap(69, 69, 69)
                    .addComponent(VerMaterialBtn)
                    .addGap(12, 12, 12)
                    .addComponent(RegistrarMaterialBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(BuscarMaterialBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(EliminarMaterialBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ModificarMaterialBtn)
                    .addContainerGap(84, Short.MAX_VALUE))
        );
        contentPaneLayout.linkSize(SwingConstants.VERTICAL, new Component[] {BuscarMaterialBtn, EliminarMaterialBtn, ModificarMaterialBtn, RegistrarMaterialBtn, VerMaterialBtn});
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Yves Roulin
    private JLabel label1;
    private JButton VerMaterialBtn;
    private JButton EliminarMaterialBtn;
    private JButton BuscarMaterialBtn;
    private JButton RegistrarMaterialBtn;
    private JButton Salir;
    private JButton ModificarMaterialBtn;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
