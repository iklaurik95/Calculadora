import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.GridBagLayout;


import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField TextoResultado;
	private boolean decimal;
	private double numero;
	private String operador;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		JButton BotonIgual = new JButton("=");
		BotonIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
					
				}
				
		});
		JButton BotonBorrar = new JButton("C");
		BotonBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
					TextoResultado.setText("");
					decimal = false;
				}
						
		});
		JButton BotonPunto = new JButton(".");
		BotonPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				if(decimal == false){
					TextoResultado.setText(TextoResultado.getText() + BotonPunto.getText());
					decimal = true;
				}
			}			
		});
		JButton BotonPlusMinus = new JButton("+/-");
		BotonPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
					
			}
			
		});
		JButton BotonSumar = new JButton("+");
		BotonSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decimal = false;
				numero = Double.parseDouble(TextoResultado.getText());
				operador = BotonSumar.getText();
				TextoResultado.setText(null);
			}
		});
		JButton BotonRestar = new JButton("-");
		BotonRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				decimal = false;
				numero = Double.parseDouble(TextoResultado.getText());
				operador = BotonRestar.getText();
				TextoResultado.setText(null);
			}
		});
		
		JButton BotonDividir = new JButton("/");
		BotonDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				decimal = false;
				numero = Double.parseDouble(TextoResultado.getText());
				operador = BotonDividir.getText();
				TextoResultado.setText(null);
				}
				
		});
		JButton BotonMultiplicar = new JButton("*");
		BotonMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				decimal = false;
				numero = Double.parseDouble(TextoResultado.getText());
				operador = BotonMultiplicar.getText();
				TextoResultado.setText(null);
				}
				
		});
		JButton Boton0 = new JButton("0");
		Boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
					TextoResultado.setText(TextoResultado.getText() + Boton0.getText());
				}
						
		});
		JButton Boton1 = new JButton("1");
		Boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
					TextoResultado.setText(TextoResultado.getText() + Boton1.getText());
				}
						
		});
		JButton Boton2 = new JButton("2");
		Boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
					TextoResultado.setText(TextoResultado.getText() + Boton2.getText());
				}
						
		});
		JButton Boton3 = new JButton("3");
		Boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
					TextoResultado.setText(TextoResultado.getText() + Boton3.getText());
				}
						
		});
		JButton Boton4 = new JButton("4");
		Boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
					TextoResultado.setText(TextoResultado.getText() + Boton4.getText());
				}
				
		});
		JButton Boton5 = new JButton("5");
		Boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
					TextoResultado.setText(TextoResultado.getText() + Boton5.getText());
				}
				
		});
		JButton Boton6 = new JButton("6");
		Boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
					TextoResultado.setText(TextoResultado.getText() + Boton6.getText());
				}
				
		});
		JButton Boton7 = new JButton("7");
		Boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
					TextoResultado.setText(TextoResultado.getText() + Boton7.getText());
				}
				
		});
		JButton Boton8 = new JButton("8");
		Boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
					TextoResultado.setText(TextoResultado.getText() + Boton8.getText());
				}
				
		});
		JButton Boton9 = new JButton("9");
		Boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
					TextoResultado.setText(TextoResultado.getText() + Boton9.getText());
				}
				
		});
		
		
		TextoResultado = new JTextField();
		TextoResultado.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(57)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(Boton4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Boton5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Boton6, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(BotonSumar, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(Boton0, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
										.addComponent(Boton7, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(BotonPunto, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
										.addComponent(Boton8, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
								.addComponent(BotonPlusMinus, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(BotonBorrar, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(BotonMultiplicar, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(Boton9, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(BotonDividir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(BotonIgual, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(Boton1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Boton2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Boton3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(BotonRestar, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addComponent(TextoResultado))
					.addContainerGap(89, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(44)
					.addComponent(TextoResultado, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(Boton1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(Boton2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(Boton3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(BotonRestar, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(Boton4, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(Boton5, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(Boton6, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addComponent(BotonSumar, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(Boton7, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(Boton0, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(BotonPunto, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(BotonBorrar, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(BotonMultiplicar, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(Boton9, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addComponent(BotonDividir, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
						.addComponent(Boton8, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(BotonIgual, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(BotonPlusMinus, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(20))
		);
		contentPane.setLayout(gl_contentPane);
	}
}

