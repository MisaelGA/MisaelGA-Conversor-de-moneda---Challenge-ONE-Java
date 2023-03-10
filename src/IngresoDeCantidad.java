import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class IngresoDeCantidad extends JFrame {

	private JPanel contentPane;
	public JTextField lblEntradaAConvertir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresoDeCantidad frame = new IngresoDeCantidad();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public static String Cantidad = "";
	
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
		
		lblEntradaAConvertir = new JTextField();
		lblEntradaAConvertir.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char entrada = e.getKeyChar();
				
				if (Character.isLetter(entrada) || Character.isWhitespace(entrada)) {
					getToolkit().beep();
					e.consume();
					
					JOptionPane.showMessageDialog(rootPane, "Ingresa solo numeros");
				}
			}
		});
		lblEntradaAConvertir.setBounds(64, 45, 332, 33);
		contentPane.add(lblEntradaAConvertir);
		lblEntradaAConvertir.setColumns(10);
		
		JButton btnOkCantidad = new JButton("OK");
		btnOkCantidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cantidad = lblEntradaAConvertir.getText();
				
				if (lblEntradaAConvertir.getText() == " ") {
					JOptionPane.showMessageDialog(rootPane, "Ingresa una cantidad numerica");
				} else {
					Monedas monedas = new Monedas();
					monedas.setLocationRelativeTo(null);
					monedas.setVisible(true);
					dispose();
				}
				
				//Instancia del Formulario Monedas
				//Monedas monedas = new Monedas();
				//monedas.setCantidad(lblEntradaAConvertir.getText());
				//monedas.setVisible(true);

				//double cantidadIngresada = Double.parseDouble(textDineroAConvertir.getText());
				//System.out.println(cantidadIngresada);
				
			}
		});
		btnOkCantidad.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOkCantidad.setBounds(94, 88, 92, 35);
		contentPane.add(btnOkCantidad);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Principal principal = new Principal();
				principal.setLocationRelativeTo(null);
				principal.setVisible(true);
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancelar.setBounds(239, 88, 106, 35);
		contentPane.add(btnCancelar);
	}
}
