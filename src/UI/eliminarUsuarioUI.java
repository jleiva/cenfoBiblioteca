/*
 * Created by JFormDesigner on Sun Dec 18 01:49:37 CST 2016
 */

package UI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Yves Roulin
 */
public class eliminarUsuarioUI extends JFrame {
    public eliminarUsuarioUI() {
        initComponents();
    }

    private void UsuariosActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button5ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Yves Roulin
        label1 = new JLabel();
        comboBox1 = new JComboBox<>();
        label2 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Eliminar Usuario");
        label1.setFont(new Font("Segoe UI", Font.BOLD, 20));

        //---- comboBox1 ----
        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
            "Administrativo",
            "Profesor",
            "Estudiante"
        }));

        //---- label2 ----
        label2.setText("Seleccione el tipo de usuario a eliminar");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(268, Short.MAX_VALUE)
                    .addComponent(label1)
                    .addGap(253, 253, 253))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(224, 224, 224)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2))
                    .addContainerGap(219, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(label1)
                    .addGap(83, 83, 83)
                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(243, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Yves Roulin
    private JLabel label1;
    private JComboBox<String> comboBox1;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
