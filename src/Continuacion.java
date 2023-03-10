import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	public Continuacion() {
		setTitle("Opciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 160);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnContinuacionSi = new JButton("SI");
		btnContinuacionSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Principal principal = new Principal();
				principal.setLocationRelativeTo(null);
				principal.setVisible(true);
			}
		});
		btnContinuacionSi.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnContinuacionSi.setBounds(70, 69, 85, 21);
		contentPane.add(btnContinuacionSi);
		
		JLabel lblContinuacion = new JLabel("¿Desea Continuar?");
		lblContinuacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblContinuacion.setBounds(132, 10, 211, 34);
		lblContinuacion.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblContinuacion);
		
		JButton btnContinuacionNo = new JButton("NO");
		btnContinuacionNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null, "El programa a finalizado!");
				System.exit(0);
			}
		});
		btnContinuacionNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnContinuacionNo.setBounds(180, 69, 85, 21);
		contentPane.add(btnContinuacionNo);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Principal principal = new Principal();
				principal.setLocationRelativeTo(null);
				principal.setVisible(true);
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCancelar.setBounds(287, 69, 127, 21);
		contentPane.add(btnCancelar);
	}

}
