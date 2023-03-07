import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IngresoDeCantidad extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresoDeCantidad frame = new IngresoDeCantidad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IngresoDeCantidad() {
		setTitle("Input");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 170);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblINgresoDeCantidad = new JLabel("Ingresa la cantidad de dinero a convertir");
		lblINgresoDeCantidad.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblINgresoDeCantidad.setBounds(10, 10, 426, 33);
		contentPane.add(lblINgresoDeCantidad);
		
		textField = new JTextField();
		textField.setBounds(64, 45, 332, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnOkCantidad = new JButton("OK");
		btnOkCantidad.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOkCantidad.setBounds(94, 88, 92, 35);
		contentPane.add(btnOkCantidad);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancelar.setBounds(239, 88, 106, 35);
		contentPane.add(btnCancelar);
	}
}
