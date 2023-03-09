import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IngresoDeTemperatura extends JFrame {

	private JPanel contentPane;
	private JTextField textTemperaturaAConvertir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresoDeTemperatura frame = new IngresoDeTemperatura();
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
	
	public static String Temperatura = "";
	
	public IngresoDeTemperatura() {
		setTitle("Input");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 182);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblINgresoDeTemperatura = new JLabel("Ingresa la temperatura a convertir");
		lblINgresoDeTemperatura.setHorizontalAlignment(SwingConstants.CENTER);
		lblINgresoDeTemperatura.setBounds(13, 10, 410, 25);
		lblINgresoDeTemperatura.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblINgresoDeTemperatura);
		
		textTemperaturaAConvertir = new JTextField();
		textTemperaturaAConvertir.setColumns(10);
		textTemperaturaAConvertir.setBounds(43, 45, 332, 33);
		contentPane.add(textTemperaturaAConvertir);
		
		JButton btnOkTemperatura = new JButton("OK");
		btnOkTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Temperatura = textTemperaturaAConvertir.getText();
				
				Temperaturas temperaturas = new Temperaturas();
				temperaturas.setLocationRelativeTo(null);
				temperaturas.setVisible(true);
				dispose();
			}
		});
		btnOkTemperatura.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOkTemperatura.setBounds(82, 88, 92, 35);
		contentPane.add(btnOkTemperatura);
		
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
		btnCancelar.setBounds(227, 88, 106, 35);
		contentPane.add(btnCancelar);
	}

}
