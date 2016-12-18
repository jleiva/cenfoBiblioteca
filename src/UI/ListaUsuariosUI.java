/*
 * Created by JFormDesigner on Sun Dec 18 01:28:05 CST 2016
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
public class ListaUsuariosUI extends JFrame {
    public ListaUsuariosUI() {
        initComponents();
    }

    private void UsuariosActionPerformed(ActionEvent e) {
        // TODO add your code here
        //Gestor.listarUsuarios();
    }

    private void button5ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Yves Roulin
        label1 = new JLabel();
        Usuarios = new JButton();
        Reservaciones = new JButton();
        Temas = new JButton();
        Materiales = new JButton();
        Salir = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Listado de Usuarios");

        //---- Usuarios ----
        Usuarios.setText("1. Ver lista de Usuarios");
        Usuarios.addActionListener(e -> {
			UsuariosActionPerformed(e);
			UsuariosActionPerformed(e);
		});

        //---- Reservaciones ----
        Reservaciones.setText("4. Eliminar Usuario");

        //---- Temas ----
        Temas.setText("3. Buscar Usuario");

        //---- Materiales ----
        Materiales.setText("2. Registrar nuevo Usuario");

        //---- Salir ----
        Salir.setText("0. Ir a Menu Principal");
        Salir.addActionListener(e -> button5ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(301, Short.MAX_VALUE)
                    .addComponent(label1)
                    .addGap(248, 248, 248))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(Salir)
                        .addComponent(Materiales)
                        .addComponent(Usuarios)
                        .addComponent(Temas)
                        .addComponent(Reservaciones))
                    .addContainerGap(352, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(label1)
                    .addGap(76, 76, 76)
                    .addComponent(Usuarios)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Materiales)
                    .addGap(18, 18, 18)
                    .addComponent(Temas)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(Reservaciones)
                    .addGap(18, 18, 18)
                    .addComponent(Salir)
                    .addContainerGap(85, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Yves Roulin
    private JLabel label1;
    private JButton Usuarios;
    private JButton Reservaciones;
    private JButton Temas;
    private JButton Materiales;
    private JButton Salir;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
