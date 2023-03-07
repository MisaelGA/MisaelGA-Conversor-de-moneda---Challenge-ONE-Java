import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Continuacion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Continuacion frame = new Continuacion();
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
	public Continuacion() {
		setTitle("Opciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 160);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnContinuacionSi = new JButton("SI");
		btnContinuacionSi.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnContinuacionSi.setBounds(70, 69, 85, 21);
		contentPane.add(btnContinuacionSi);
		
		JLabel lblContinuacion = new JLabel("¿Desea Continuar?");
		lblContinuacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblContinuacion.setBounds(132, 10, 211, 34);
		lblContinuacion.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblContinuacion);
		
		JButton btnContinuacionNo = new JButton("NO");
		btnContinuacionNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnContinuacionNo.setBounds(180, 69, 85, 21);
		contentPane.add(btnContinuacionNo);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCancelar.setBounds(301, 69, 113, 21);
		contentPane.add(btnCancelar);
	}

}
