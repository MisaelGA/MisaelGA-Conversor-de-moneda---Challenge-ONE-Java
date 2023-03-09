import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
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
		
		JComboBox comboBoxMonedas = new JComboBox();
		comboBoxMonedas.setModel(new DefaultComboBoxModel(new String[] {"ºF a ºC", "K a ºC", "ºC a K", "ºF a K", "K a ºF"}));
		comboBoxMonedas.setFont(new Font("Tahoma", Font.BOLD, 17));
		comboBoxMonedas.setBounds(39, 112, 332, 36);
		contentPane.add(comboBoxMonedas);
		
		JButton btnConvertirTemperatuta = new JButton("Convertir");
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
