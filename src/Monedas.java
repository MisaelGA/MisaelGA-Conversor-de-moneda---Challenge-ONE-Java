import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
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

