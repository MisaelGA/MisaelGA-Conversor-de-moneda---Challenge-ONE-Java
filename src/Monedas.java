import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Monedas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Monedas frame = new Monedas();
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
	public Monedas() {
		setTitle("Monedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elije la conversión que deseas hacer");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 401, 36);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBoxMonedas = new JComboBox();
		comboBoxMonedas.setFont(new Font("Tahoma", Font.BOLD, 17));
		comboBoxMonedas.setModel(new DefaultComboBoxModel(new String[] {"Pesos a Dólar", "Pesos a Euros", "Pesos a Libras Esterlinas", "Pesos a Yen Japonés", "Pesos a Won sul-coreano", "Dólar a Peso", "Euros a Peso", "Libras Esterlinas a Peso", "Yen Japonés a Peso", "Won sul-coreano a Peso"}));
		comboBoxMonedas.setBounds(47, 81, 332, 36);
		contentPane.add(comboBoxMonedas);
		
		JButton btnConvertirMoneda = new JButton("Convertir");
		btnConvertirMoneda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Peso = 1; 
				double Dolar = 18.34; // 1
				double Euro = 19.40;  // 2
				double Libra = 21.85; // 3
				double Yen = 0.13;    // 4
				double Won = 0.014;   // 5
				
				
				
				try {
					IngresoDeCantidad ingresoDeCantidad = new IngresoDeCantidad();
					
					Double cantidad = Double.parseDouble(ingresoDeCantidad.Cantidad);
					
					switch (comboBoxMonedas.getSelectedIndex()) {
					case 0:
						Conversion(cantidad, Dolar);
						break;
					case 1:
						Conversion(cantidad, Euro);
						break;
					case 2:
						Conversion(cantidad, Libra);
						break;
					case 3:
						Conversion(cantidad, Yen);
						break;
					case 4:
						Conversion(cantidad, Won);
						break;
						
					// Otra moneda a Pesos
					case 5:
						ConversionDos(Dolar, cantidad);
						break;
					case 6:
						ConversionDos(Euro, cantidad);
						break;
					case 7:
						ConversionDos(Libra, cantidad);
						break;
					case 8:
						ConversionDos(Yen, cantidad);
						break;
					case 9:
						ConversionDos(Won, cantidad);
						break;
						
					default:
						break;
					}
				} catch (NumberFormatException e2) {
					
					JOptionPane.showMessageDialog(rootPane, "Verifica tu entrada de datos");
					dispose();
					Principal principal = new Principal();
					principal.setLocationRelativeTo(null);
					principal.setVisible(true);
				}
				
				
			}

			private void Conversion(Double cantidadUno,  Double cantidadPeso) {
				dispose();
				Double resultado = (cantidadUno * 1) / cantidadPeso;
				JOptionPane.showMessageDialog(null, "El resultado de tu conversion es: " + resultado, (String) comboBoxMonedas.getSelectedItem(), 
						JOptionPane.INFORMATION_MESSAGE);
				
				Continuacion continuacion = new Continuacion();
				continuacion.setLocationRelativeTo(null);
				continuacion.setVisible(true);
			}
			
			private void ConversionDos(Double cantidadUno,  Double cantidadPeso) {
				dispose();
				Double resultado = (cantidadUno * cantidadPeso) / 1;
				JOptionPane.showMessageDialog(null, "El resultado de tu conversion es: " + resultado, (String) comboBoxMonedas.getSelectedItem(), 
						JOptionPane.INFORMATION_MESSAGE);
				
				Continuacion continuacion = new Continuacion();
				continuacion.setLocationRelativeTo(null);
				continuacion.setVisible(true);
			}
			
			
		});
		btnConvertirMoneda.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnConvertirMoneda.setBounds(47, 127, 111, 36);
		contentPane.add(btnConvertirMoneda);
		
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
		btnCancelar.setBounds(201, 127, 111, 36);
		contentPane.add(btnCancelar);
		
		JLabel lblDineroAConvertir = new JLabel("00.00");
		lblDineroAConvertir.setLabelFor(lblDineroAConvertir);
		lblDineroAConvertir.setForeground(Color.BLUE);
		lblDineroAConvertir.setBackground(Color.WHITE);
		lblDineroAConvertir.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDineroAConvertir.setBounds(20, 44, 155, 25);
		contentPane.add(lblDineroAConvertir);
		
		IngresoDeCantidad ingresoDeCantidad = new IngresoDeCantidad();
		lblDineroAConvertir.setText(ingresoDeCantidad.Cantidad);
		
	}
	
	
	
}

