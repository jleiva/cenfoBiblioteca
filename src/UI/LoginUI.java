package UI;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

/*
 * Created by JFormDesigner on Sat Dec 17 22:25:55 CST 2016
 */



/**
 * @author Yves Roulin
 */
public class LoginUI extends JFrame {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;

	String login1 = "1";
	String pw1    = "1";
	private Component frame;
	public LoginUI() {
		initComponents();
	}

	private void jButton1ActionPerformed(ActionEvent e) {
		// TODO add your code here
		System.exit(0);
	}

	private void jButtonSesionMouseClicked(MouseEvent e) {
		// TODO add your code here
		if(jTextFieldUser.getText().equals(login1) && jPassword.getText().equals(pw1))
		{

			JOptionPane.showMessageDialog(frame, "Login correcto");

			JFrame menuPrincipal = new MenuPrincipalUI();
			menuPrincipal.setVisible(true);
			this.setVisible(false);
		} else {
			JOptionPane.showMessageDialog(frame, "Login incorrecto", "Error",JOptionPane.ERROR_MESSAGE);
		}
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Yves Roulin
		jButton1 = new JButton();
		jLabelIcono = new JLabel();
		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jTextFieldUser = new JTextField();
		jPassword = new JPasswordField();
		jButtonSesion = new JButton();
		JLabelFondo = new JLabel();

		//======== this ========
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		//---- jButton1 ----
		jButton1.setBackground(new Color(0, 153, 204));
		jButton1.setFont(new Font("Tahoma", Font.BOLD, 14));
		jButton1.setText("Salir");
		jButton1.addActionListener(e -> jButton1ActionPerformed(e));
		contentPane.add(jButton1);
		jButton1.setBounds(new Rectangle(new Point(355, 20), jButton1.getPreferredSize()));

		//---- jLabelIcono ----
		jLabelIcono.setIcon(new ImageIcon("G:\\Dropbox\\hippo\\Cenfotec\\Programacion orientada a Objetos\\YvesRoulin\\TutorialGUI\\src\\Imagenes\\Libros.png"));
		contentPane.add(jLabelIcono);
		jLabelIcono.setBounds(105, 60, 280, 270);

		//---- jLabel1 ----
		jLabel1.setFont(new Font("Tahoma", Font.BOLD, 18));
		jLabel1.setForeground(Color.white);
		jLabel1.setText("Usuario :");
		contentPane.add(jLabel1);
		jLabel1.setBounds(new Rectangle(new Point(50, 350), jLabel1.getPreferredSize()));

		//---- jLabel2 ----
		jLabel2.setFont(new Font("Tahoma", Font.BOLD, 18));
		jLabel2.setForeground(Color.white);
		jLabel2.setText("Password :");
		contentPane.add(jLabel2);
		jLabel2.setBounds(new Rectangle(new Point(50, 420), jLabel2.getPreferredSize()));

		//---- jTextFieldUser ----
		jTextFieldUser.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(jTextFieldUser);
		jTextFieldUser.setBounds(160, 350, 140, 30);
		contentPane.add(jPassword);
		jPassword.setBounds(160, 420, 140, 30);

		//---- jButtonSesion ----
		jButtonSesion.setBackground(Color.white);
		jButtonSesion.setFont(new Font("Tahoma", Font.BOLD, 11));
		jButtonSesion.setText("Iniciar Sesion");
		jButtonSesion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jButtonSesionMouseClicked(e);
			}
		});
		contentPane.add(jButtonSesion);
		jButtonSesion.setBounds(new Rectangle(new Point(177, 480), jButtonSesion.getPreferredSize()));

		//---- JLabelFondo ----
		JLabelFondo.setFont(new Font("Tahoma", Font.BOLD, 14));
		JLabelFondo.setForeground(Color.white);
		JLabelFondo.setIcon(new ImageIcon("G:\\Dropbox\\hippo\\Cenfotec\\Programacion orientada a Objetos\\YvesRoulin\\TutorialGUI\\src\\Imagenes\\wallpapers-blue-012.jpg"));
		contentPane.add(JLabelFondo);
		JLabelFondo.setBounds(-65, -60, 525, 600);

		{ // compute preferred size
			Dimension preferredSize = new Dimension();
			for(int i = 0; i < contentPane.getComponentCount(); i++) {
				Rectangle bounds = contentPane.getComponent(i).getBounds();
				preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
				preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
			}
			Insets insets = contentPane.getInsets();
			preferredSize.width += insets.right;
			preferredSize.height += insets.bottom;
			contentPane.setMinimumSize(preferredSize);
			contentPane.setPreferredSize(preferredSize);
		}
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Yves Roulin
	private JButton jButton1;
	private JLabel jLabelIcono;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JTextField jTextFieldUser;
	private JPasswordField jPassword;
	private JButton jButtonSesion;
	private JLabel JLabelFondo;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
