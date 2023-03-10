import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Temperaturas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temperaturas frame = new Temperaturas();
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
	public Temperaturas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 265);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elije la conversión que deseas hacer");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 20, 401, 36);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBoxTemperaturas = new JComboBox();
		comboBoxTemperaturas.setModel(new DefaultComboBoxModel(new String[] {"ºF a ºC", "K a ºC", "ºC a K", "ºF a K", "K a ºF"}));
		comboBoxTemperaturas.setFont(new Font("Tahoma", Font.BOLD, 17));
		comboBoxTemperaturas.setBounds(39, 112, 332, 36);
		contentPane.add(comboBoxTemperaturas);
		
		JButton btnConvertirTemperatuta = new JButton("Convertir");
		btnConvertirTemperatuta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// ºF a ºC use la fórmula:   ºC = (ºF-32) ÷ 1.8
				//  K a ºC use la fórmula:   ºC = K – 273.15
				// ºC a K use la fórmula: K = ºC + 273.15
				// ºF a K use la fórmula: K = 5/9 (ºF – 32) + 273.15
				// K a ºF use la fórmula:   ºF = 1.8(K – 273.15) + 32
				
				try {
					IngresoDeTemperatura ingresoDeTemperatura = new IngresoDeTemperatura();
					Double temperatura = Double.parseDouble(ingresoDeTemperatura.Temperatura);
					double resultado = 0;
					
					switch (comboBoxTemperaturas.getSelectedIndex()) {
					case 0:
						resultado = (temperatura - 32 ) / 1.8;
						Conversion(resultado);
						break;
					case 1:
						resultado = (temperatura - 273.15) ;
						Conversion(resultado);
						break;
					case 2:
						resultado = (temperatura + 273.15);
						Conversion(resultado);
						break;
					case 3:
						resultado = ((5/9) * (temperatura - 32 )) + (273.15);
						Conversion(resultado);
						break;
					case 4:
						resultado = ((1.8) * (temperatura - 273.15 )) + (32);
						Conversion(resultado);
						break;

					default:
						break;
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(rootPane, "Verifica tu entrada de datos");
					dispose();
					Principal principal = new Principal();
					principal.setLocationRelativeTo(null);
					principal.setVisible(true);
				}
			}
			
			private void Conversion(Double entrada) {
				dispose();
				JOptionPane.showMessageDialog(null, "El resultado de tu conversion es: " + entrada, (String) comboBoxTemperaturas.getSelectedItem(), 
						JOptionPane.INFORMATION_MESSAGE);
				
				Continuacion continuacion = new Continuacion();
				continuacion.setLocationRelativeTo(null);
				continuacion.setVisible(true);
			}
			
		});
		btnConvertirTemperatuta.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnConvertirTemperatuta.setBounds(39, 158, 111, 36);
		contentPane.add(btnConvertirTemperatuta);
		
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
		btnCancelar.setBounds(199, 158, 111, 36);
		contentPane.add(btnCancelar);
		
		JLabel lblTemperaturaAConvertir = new JLabel("");
		lblTemperaturaAConvertir.setForeground(Color.BLUE);
		lblTemperaturaAConvertir.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTemperaturaAConvertir.setBounds(20, 66, 267, 36);
		contentPane.add(lblTemperaturaAConvertir);
		
		IngresoDeTemperatura ingresoDeTemperatura = new IngresoDeTemperatura();
		lblTemperaturaAConvertir.setText(ingresoDeTemperatura.Temperatura);
	}
}
