import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrincipal = new JLabel("Seleccione una opción de Conversión");
		lblPrincipal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrincipal.setBounds(10, 0, 436, 36);
		contentPane.add(lblPrincipal);
		
		JComboBox comboBoxMenu = new JComboBox();
		comboBoxMenu.setForeground(Color.BLACK);
		comboBoxMenu.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBoxMenu.setModel(new DefaultComboBoxModel(new String[] {"Conversor de Moneda", "Conversor de Temperatura"}));
		comboBoxMenu.setBounds(70, 46, 313, 42);
		contentPane.add(comboBoxMenu);
		
		JButton btnPrincipalOk = new JButton("OK");
		btnPrincipalOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (comboBoxMenu.getSelectedItem().equals("Conversor de Moneda")) {
					dispose();
					IngresoDeCantidad ingresoDeCantidad = new IngresoDeCantidad();
					ingresoDeCantidad.setLocationRelativeTo(null);
					ingresoDeCantidad.setVisible(true);
					
				} else {
					dispose();
					IngresoDeTemperatura ingresoDeTemperatura = new IngresoDeTemperatura();
					ingresoDeTemperatura.setLocationRelativeTo(null);
					ingresoDeTemperatura.setVisible(true);
				}
				
			}
		});
		btnPrincipalOk.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPrincipalOk.setBounds(92, 106, 108, 40);
		contentPane.add(btnPrincipalOk);
		
		JButton btnPrincipalCancelar = new JButton("Cancelar");
		btnPrincipalCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnPrincipalCancelar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPrincipalCancelar.setBounds(233, 106, 118, 40);
		contentPane.add(btnPrincipalCancelar);
	}
}
