/*
 * Created by JFormDesigner on Sun Dec 18 18:45:57 CST 2016
 */

package UI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Yves Roulin
 */
public class menuReservacionesUI extends JFrame {
    public menuReservacionesUI() {
        initComponents();
    }

    private void UsuariosActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void EliminarUsuarioBtnActionPerformed(ActionEvent e) {
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
        VerListReservBtn = new JButton();
        BuscarReservUsuarioBtn = new JButton();
        BuscarReservBtn = new JButton();
        RegistrarReservBtn = new JButton();
        Salir = new JButton();
        EliminaReservBtn = new JButton();
        ModificarReservBtn = new JButton();
        RedimirReservBtn = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Submenu de Reservaciones");
        label1.setFont(new Font("Segoe UI", Font.BOLD, 20));

        //---- VerListReservBtn ----
        VerListReservBtn.setText("1. Ver lista de Reservaciones");
        VerListReservBtn.addActionListener(e -> UsuariosActionPerformed(e));

        //---- BuscarReservUsuarioBtn ----
        BuscarReservUsuarioBtn.setText("4. Buscar Reservacion por Usuario");
        BuscarReservUsuarioBtn.addActionListener(e -> EliminarUsuarioBtnActionPerformed(e));

        //---- BuscarReservBtn ----
        BuscarReservBtn.setText("3. Buscar Reservacion");

        //---- RegistrarReservBtn ----
        RegistrarReservBtn.setText("2. Registrar nueva Reservacion");

        //---- Salir ----
        Salir.setText("Ir a Menu Principal");
        Salir.addActionListener(e -> SalirActionPerformed(e));

        //---- EliminaReservBtn ----
        EliminaReservBtn.setText("5. Eliminar Reservacion");
        EliminaReservBtn.addActionListener(e -> EliminarUsuarioBtnActionPerformed(e));

        //---- ModificarReservBtn ----
        ModificarReservBtn.setText("6. Modificar Reservacion");
        ModificarReservBtn.addActionListener(e -> EliminarUsuarioBtnActionPerformed(e));

        //---- RedimirReservBtn ----
        RedimirReservBtn.setText("7. Redimir Reservacion");
        RedimirReservBtn.addActionListener(e -> EliminarUsuarioBtnActionPerformed(e));

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
                        .addComponent(VerListReservBtn, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                        .addComponent(RegistrarReservBtn)
                        .addComponent(BuscarReservBtn, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                        .addComponent(EliminaReservBtn, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                        .addComponent(BuscarReservUsuarioBtn, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE))
                    .addGap(38, 38, 38)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(ModificarReservBtn, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
                        .addComponent(RedimirReservBtn, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(49, Short.MAX_VALUE))
        );
        contentPaneLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {BuscarReservBtn, BuscarReservUsuarioBtn, EliminaReservBtn, ModificarReservBtn, RedimirReservBtn, RegistrarReservBtn, VerListReservBtn});
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(Salir, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                    .addGap(69, 69, 69)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(VerListReservBtn)
                        .addComponent(ModificarReservBtn))
                    .addGap(12, 12, 12)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(RegistrarReservBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                        .addComponent(RedimirReservBtn))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(BuscarReservBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(BuscarReservUsuarioBtn, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(EliminaReservBtn)
                    .addContainerGap(66, Short.MAX_VALUE))
        );
        contentPaneLayout.linkSize(SwingConstants.VERTICAL, new Component[] {BuscarReservBtn, BuscarReservUsuarioBtn, EliminaReservBtn, ModificarReservBtn, RedimirReservBtn, RegistrarReservBtn, VerListReservBtn});
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Yves Roulin
    private JLabel label1;
    private JButton VerListReservBtn;
    private JButton BuscarReservUsuarioBtn;
    private JButton BuscarReservBtn;
    private JButton RegistrarReservBtn;
    private JButton Salir;
    private JButton EliminaReservBtn;
    private JButton ModificarReservBtn;
    private JButton RedimirReservBtn;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
