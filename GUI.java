import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class GUI {

	private JFrame frame;
	private JTextField txtInstruccion;
	private JTextField txtNombre;

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
		frame.setBounds(100, 100, 450, 747);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtInstruccion = new JTextField();
		txtInstruccion.setBounds(0, 0, 434, 28);
		txtInstruccion.setText("A continuacion inserte el nombres del desarrolador y elija en que plataforma trabaja");
		txtInstruccion.setEditable(false);
		frame.getContentPane().add(txtInstruccion);
		txtInstruccion.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 53, 67, 28);
		frame.getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(56, 57, 86, 20);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblPlataforma = new JLabel("Plataforma");
		lblPlataforma.setBounds(10, 92, 78, 14);
		frame.getContentPane().add(lblPlataforma);
		
		JRadioButton rdbtnJava = new JRadioButton("Java");
		rdbtnJava.setBounds(20, 113, 109, 23);
		frame.getContentPane().add(rdbtnJava);
		
		JRadioButton rdbtnAndroid = new JRadioButton("Android");
		rdbtnAndroid.setBounds(20, 139, 89, 23);
		frame.getContentPane().add(rdbtnAndroid);
		
		JRadioButton rdbtnIos = new JRadioButton("iOS");
		rdbtnIos.setBounds(20, 167, 109, 23);
		frame.getContentPane().add(rdbtnIos);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(20, 227, 89, 23);
		frame.getContentPane().add(btnAgregar);
		
		JLabel lblImplementacion = new JLabel("Implementacion");
		lblImplementacion.setBounds(137, 92, 96, 14);
		frame.getContentPane().add(lblImplementacion);
		
		JRadioButton rdbtnHashset = new JRadioButton("hashSet");
		rdbtnHashset.setBounds(157, 113, 96, 23);
		frame.getContentPane().add(rdbtnHashset);
		
		JRadioButton rdbtnTreeset = new JRadioButton("TreeSet");
		rdbtnTreeset.setBounds(157, 139, 96, 23);
		frame.getContentPane().add(rdbtnTreeset);
		
		JRadioButton rdbtnLinkedhashset = new JRadioButton("LinkedHashSet");
		rdbtnLinkedhashset.setBounds(157, 167, 109, 23);
		frame.getContentPane().add(rdbtnLinkedhashset);
		
		JButton btnNuevaImplementacion = new JButton("Nueva implementacion");
		btnNuevaImplementacion.setBounds(164, 227, 139, 23);
		frame.getContentPane().add(btnNuevaImplementacion);
		
		JTextArea txtrRespuestaInciso = new JTextArea();
		txtrRespuestaInciso.setText("Respuesta inciso 1");
		txtrRespuestaInciso.setBounds(20, 285, 191, 22);
		frame.getContentPane().add(txtrRespuestaInciso);
		
		JTextArea txtrRespuestaInciso_1 = new JTextArea();
		txtrRespuestaInciso_1.setText("Respuesta inciso 2");
		txtrRespuestaInciso_1.setBounds(20, 342, 191, 22);
		frame.getContentPane().add(txtrRespuestaInciso_1);
		
		JTextArea txtrRespuestaInciso_2 = new JTextArea();
		txtrRespuestaInciso_2.setText("Respuesta inciso 3");
		txtrRespuestaInciso_2.setBounds(20, 397, 191, 22);
		frame.getContentPane().add(txtrRespuestaInciso_2);
		
		JTextArea txtrRespuestaInciso_3 = new JTextArea();
		txtrRespuestaInciso_3.setText("Respuesta inciso 4");
		txtrRespuestaInciso_3.setBounds(20, 449, 191, 22);
		frame.getContentPane().add(txtrRespuestaInciso_3);
		
		JTextArea txtrRespuestaInciso_4 = new JTextArea();
		txtrRespuestaInciso_4.setText("Respuesta inciso 5");
		txtrRespuestaInciso_4.setBounds(20, 504, 191, 22);
		frame.getContentPane().add(txtrRespuestaInciso_4);
		
		JTextArea txtrRespuestaInciso_5 = new JTextArea();
		txtrRespuestaInciso_5.setText("Respuesta inciso 6");
		txtrRespuestaInciso_5.setBounds(20, 559, 191, 22);
		frame.getContentPane().add(txtrRespuestaInciso_5);
		
		JTextArea txtrRespuestaInciso_6 = new JTextArea();
		txtrRespuestaInciso_6.setText("Respuesta inciso 7");
		txtrRespuestaInciso_6.setBounds(20, 610, 191, 22);
		frame.getContentPane().add(txtrRespuestaInciso_6);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(20, 661, 89, 23);
		frame.getContentPane().add(btnCalcular);
	}
}
