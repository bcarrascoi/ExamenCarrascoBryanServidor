package ec.ups.edu.examen.notificaciones.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VtnNotificacion extends JFrame {

	private JPanel contentPane;
	private JTextField txtFecha;
	private JTextField txtAsunto;
	private JTextField txtDetalle;
	private JTextField txtEnvio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VtnNotificacion frame = new VtnNotificacion();
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
	public VtnNotificacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fecha: ");
		lblNewLabel.setBounds(70, 37, 63, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Asunto:");
		lblNewLabel_1.setBounds(70, 73, 63, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Detalle");
		lblNewLabel_2.setBounds(70, 111, 63, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TipoEnvio");
		lblNewLabel_3.setBounds(70, 154, 86, 13);
		contentPane.add(lblNewLabel_3);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(169, 34, 144, 19);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
		
		txtAsunto = new JTextField();
		txtAsunto.setBounds(169, 70, 144, 19);
		contentPane.add(txtAsunto);
		txtAsunto.setColumns(10);
		
		txtDetalle = new JTextField();
		txtDetalle.setBounds(169, 108, 144, 19);
		contentPane.add(txtDetalle);
		txtDetalle.setColumns(10);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(162, 214, 132, 21);
		contentPane.add(btnNewButton);
		
		txtEnvio = new JTextField();
		txtEnvio.setBounds(166, 151, 144, 19);
		contentPane.add(txtEnvio);
		txtEnvio.setColumns(10);
	}
}
