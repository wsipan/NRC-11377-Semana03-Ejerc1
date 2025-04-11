package ejerc1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class V1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
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
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 229);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Primer número:");
			lblNewLabel.setBounds(10, 21, 87, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Segundo número:");
			lblNewLabel_1.setBounds(10, 46, 87, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Tercer número:");
			lblNewLabel_2.setBounds(10, 71, 87, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			txtN1 = new JTextField();
			txtN1.setBounds(107, 18, 86, 20);
			contentPane.add(txtN1);
			txtN1.setColumns(10);
		}
		{
			txtN2 = new JTextField();
			txtN2.setBounds(107, 43, 86, 20);
			contentPane.add(txtN2);
			txtN2.setColumns(10);
		}
		{
			txtN3 = new JTextField();
			txtN3.setBounds(107, 68, 86, 20);
			contentPane.add(txtN3);
			txtN3.setColumns(10);
		}
		{
			btnNewButton = new JButton("Suma dos enteros");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					do_btnNewButton_actionPerformed(e);
				}
			});
			btnNewButton.setBounds(33, 96, 145, 22);
			contentPane.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("Suma tres enteros");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					do_btnNewButton_1_actionPerformed(e);
				}
			});
			btnNewButton_1.setBounds(33, 129, 145, 23);
			contentPane.add(btnNewButton_1);
		}
		{
			btnNewButton_2 = new JButton("Suma dos reales");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					do_btnNewButton_2_actionPerformed(e);
				}
			});
			btnNewButton_2.setBounds(33, 163, 145, 23);
			contentPane.add(btnNewButton_2);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(228, 21, 196, 67);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{txtN1, txtN2, txtN3, btnNewButton, btnNewButton_1, btnNewButton_2, lblNewLabel, lblNewLabel_1, lblNewLabel_2, scrollPane, txtS}));
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{txtN1, txtN2, txtN3, btnNewButton, btnNewButton_1, btnNewButton_2, contentPane, lblNewLabel, lblNewLabel_1, lblNewLabel_2, scrollPane, txtS}));
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		try {
			int n1 = Integer.parseInt(txtN1.getText());
			int n2 = Integer.parseInt(txtN2.getText());
			
			Calculadora c = new Calculadora(n1, n2);
			
			txtS.setText("");
			txtS.append("La suma de los dos es: " + c.Sumar(n1, n2));	
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "Ingrese números enteros");
		}
		
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		try {
			int n1 = Integer.parseInt(txtN1.getText());
			int n2 = Integer.parseInt(txtN2.getText());
			int n3 = Integer.parseInt(txtN3.getText());
			
			Calculadora c = new Calculadora(n1, n2, n3);
			
			txtS.setText("");
			txtS.append("La suma de los tres es: " + c.Sumar(n1, n2, n3));	
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "Ingrese números enteros");
		}
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		try {
			double num1 = Double.parseDouble(txtN1.getText());
			double num2 = Double.parseDouble(txtN2.getText());
			
			Calculadora c = new Calculadora(num1, num2);
			
			txtS.setText("");
			txtS.append("La suma los dos reales son: " + c.Sumar(num1, num2));	
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "Ingrese números enteros");
		}
	}
}
