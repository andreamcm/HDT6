import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class GUI {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 265, 366);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JCheckBox chckbxJava = new JCheckBox("Desarrollador Java");
		chckbxJava.setBounds(41, 141, 201, 23);
		panel.add(chckbxJava);

		JCheckBox chckbxDesarrolladorIos = new JCheckBox("Desarrollador IOS");
		chckbxDesarrolladorIos.setBounds(41, 166, 153, 23);
		panel.add(chckbxDesarrolladorIos);

		JCheckBox chckbxAndroid = new JCheckBox("Desarrollador Android");
		chckbxAndroid.setBounds(41, 191, 182, 23);
		panel.add(chckbxAndroid);

		JLabel lblRegistro = new JLabel("Registro");
		lblRegistro.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblRegistro.setBounds(88, 20, 118, 39);
		panel.add(lblRegistro);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(21, 60, 61, 16);
		panel.add(lblNombre);

		textField = new JTextField();
		textField.setBounds(41, 80, 201, 26);
		panel.add(textField);
		textField.setColumns(10);

		JRadioButton rdbtnHash = new JRadioButton("HashSet");
		rdbtnHash.setBounds(41, 249, 141, 23);
		panel.add(rdbtnHash);

		JRadioButton rdbtnTreeset = new JRadioButton("TreeSet");
		rdbtnTreeset.setBounds(41, 274, 141, 23);
		panel.add(rdbtnTreeset);

		JRadioButton rdbtnLinkedHashset = new JRadioButton("Linked HashSet");
		rdbtnLinkedHashset.setBounds(41, 299, 141, 23);
		panel.add(rdbtnLinkedHashset);

		JLabel lblCaractersticas = new JLabel("Características:");
		lblCaractersticas.setBounds(21, 113, 109, 16);
		panel.add(lblCaractersticas);

		JLabel lblImplementacin = new JLabel("Implementación: ");
		lblImplementacin.setBounds(21, 226, 109, 16);
		panel.add(lblImplementacin);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(67, 331, 117, 29);
		panel.add(btnCalcular);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(283, 6, 311, 366);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblResultado = new JLabel("Resultados");
		lblResultado.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblResultado.setBounds(100, 22, 113, 16);
		panel_1.add(lblResultado);

		JLabel lblInterseccion = new JLabel("Con experiencia en los 3:");
		lblInterseccion.setBounds(20, 59, 168, 16);
		panel_1.add(lblInterseccion);

		JLabel lblResInterseccion = new JLabel("");
		lblResInterseccion.setBounds(30, 87, 249, 25);
		panel_1.add(lblResInterseccion);

		JLabel lblJava = new JLabel("Java pero no Android:");
		lblJava.setBounds(20, 115, 168, 16);
		panel_1.add(lblJava);

		JLabel lblJavaNoAndroid = new JLabel("");
		lblJavaNoAndroid.setBounds(30, 137, 249, 25);
		panel_1.add(lblJavaNoAndroid);

		JLabel lblIosYAndroid = new JLabel("IOS y Android, no Java:");
		lblIosYAndroid.setBounds(20, 171, 168, 16);
		panel_1.add(lblIosYAndroid);

		JLabel lblIOSAndroid = new JLabel("");
		lblIOSAndroid.setBounds(30, 193, 249, 25);
		panel_1.add(lblIOSAndroid);

		JLabel lblSubconjunto = new JLabel("Java subconjunto de Android: ");
		lblSubconjunto.setBounds(20, 230, 212, 16);
		panel_1.add(lblSubconjunto);

		JLabel lblResSubconjunto = new JLabel("");
		lblResSubconjunto.setBounds(30, 252, 249, 16);
		panel_1.add(lblResSubconjunto);

		JLabel lblMasDesarrolladores = new JLabel("Conjunto con más desarrolladores: ");
		lblMasDesarrolladores.setBounds(20, 275, 168, 16);
		panel_1.add(lblMasDesarrolladores);

		JLabel lblMas = new JLabel("");
		lblMas.setBounds(30, 297, 249, 25);
		panel_1.add(lblMas);
	}
}
