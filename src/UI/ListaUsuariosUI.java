/*
 * Created by JFormDesigner on Sun Dec 18 01:28:05 CST 2016
 */

package UI;

import javax.swing.event.*;
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

    private void button5ActionPerformed(ActionEvent e) {
        // TODO add your code here
        JFrame menuPrincipal = new MenuPrincipalUI();
        menuPrincipal.setVisible(true);
        this.setVisible(false);
    }

    private void RegistrarUsuarioActionPerformed(ActionEvent e) {
        // TODO add your code here
        JFrame crearUsuario = new crearUsuarioUI();
        crearUsuario.setVisible(true);
        this.setVisible(false);
    }

    private void ListaUsuariosBtnActionPerformed(ActionEvent e) {
        // TODO add your code here
        //Gestor.listarUsuarios();
    }

    private void textArea1CaretUpdate(CaretEvent e) {
        // TODO add your code here
        JTextArea textBox = new JTextArea();

        //text = Gestor.listarUsuarios();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Yves Roulin
        label1 = new JLabel();
        Salir = new JButton();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();

        try {
            textArea1.setText(Gestor.listarUsuarios());
        } catch (Exception e) {
            e.printStackTrace();
        }


        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Listado de Usuarios");
        label1.setEnabled(false);
        label1.setFont(new Font("Segoe UI", Font.BOLD, 20));

        //---- Salir ----
        Salir.setText("Ir a Menu Principal");
        Salir.addActionListener(e -> button5ActionPerformed(e));

        //======== scrollPane1 ========
        {

            //---- textArea1 ----
            textArea1.setEditable(false);
            textArea1.addCaretListener(e -> textArea1CaretUpdate(e));
            scrollPane1.setViewportView(textArea1);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(214, Short.MAX_VALUE)
                    .addComponent(label1)
                    .addGap(101, 101, 101)
                    .addComponent(Salir)
                    .addContainerGap())
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 516, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(73, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(Salir))
                    .addGap(44, 44, 44)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(47, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Yves Roulin
    private JLabel label1;
    private JButton Salir;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
