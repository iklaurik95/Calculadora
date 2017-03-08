import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
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
	private JTextField textoResultado;
	private double numero1;
	private double numero2;
	private boolean decimal;
	private String operador;
	private JButton botonMultiplicar;
	private JButton botonDividir;
	private JButton botonRestar;
	private JButton botonSumar;

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

		JButton botonBorrar = new JButton("C");
		botonBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textoResultado.setText("");
				decimal = false;
			}

		});

		JButton botonPunto = new JButton(".");
		botonPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (decimal == false) {
					textoResultado.setText(textoResultado.getText() + botonPunto.getText());
					decimal = true;
				}
			}
		});

		JButton botonPlusMinus = new JButton("+/-");
		botonPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//double numero = Double.parseDouble(textoResultado.setText(textoResultado.getText()));
				
			}

		});
		
		JButton botonIgual = new JButton("=");
		botonIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(operador.equals(botonSumar)){
					Double resultado = numero1+numero2;
					textoResultado.setText(resultado.toString());
				}else if(operador.equals(botonRestar)){
					Double resultado = numero1-numero2;
					textoResultado.setText(resultado.toString());
				}else if(operador.equals(botonDividir)){
					Double resultado = numero1/numero2;
					textoResultado.setText(resultado.toString());
				}else if(operador.equals(botonMultiplicar)){
					Double resultado = numero1*numero2;
					textoResultado.setText(resultado.toString());
				}
			}
		});

		botonSumar = new JButton("+");
		botonSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decimal = false;
				numero1 = Double.parseDouble(textoResultado.getText());
				operador = botonSumar.getText();
				textoResultado.setText(null);
			}
		});

		botonRestar = new JButton("-");
		botonRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				decimal = false;
				numero1 = Double.parseDouble(textoResultado.getText());
				operador = botonRestar.getText();
				textoResultado.setText(null);
			}
		});

		botonDividir = new JButton("/");
		botonDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				decimal = false;
				numero1 = Double.parseDouble(textoResultado.getText());
				operador = botonDividir.getText();
				textoResultado.setText(null);
			}

		});

		botonMultiplicar = new JButton("*");
		botonMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				decimal = false;
				numero1 = Double.parseDouble(textoResultado.getText());
				operador = botonMultiplicar.getText();
				textoResultado.setText(null);
			}

		});

		JButton boton0 = new JButton("0");
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textoResultado.setText(textoResultado.getText() + boton0.getText());
			}

		});

		JButton boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textoResultado.setText(textoResultado.getText() + boton1.getText());
			}

		});

		JButton boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textoResultado.setText(textoResultado.getText() + boton2.getText());
			}

		});

		JButton boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textoResultado.setText(textoResultado.getText() + boton3.getText());
			}

		});

		JButton boton4 = new JButton("4");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textoResultado.setText(textoResultado.getText() + boton4.getText());
			}

		});

		JButton boton5 = new JButton("5");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textoResultado.setText(textoResultado.getText() + boton5.getText());
			}

		});

		JButton boton6 = new JButton("6");
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textoResultado.setText(textoResultado.getText() + boton6.getText());
			}

		});

		JButton boton7 = new JButton("7");
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textoResultado.setText(textoResultado.getText() + boton7.getText());
			}

		});

		JButton boton8 = new JButton("8");
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textoResultado.setText(textoResultado.getText() + boton8.getText());
			}

		});

		JButton boton9 = new JButton("9");
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textoResultado.setText(textoResultado.getText() + boton9.getText());
			}

		});

		textoResultado = new JTextField();
		textoResultado.setColumns(10);
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(57)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(boton4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(boton5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(boton6, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(botonSumar, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(boton0, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
										.addComponent(boton7, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(botonPunto, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
										.addComponent(boton8, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
								.addComponent(botonPlusMinus, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(botonIgual, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(boton9, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(botonDividir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(botonBorrar, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(botonMultiplicar, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(boton1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(boton2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(boton3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(botonRestar, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addComponent(textoResultado))
					.addContainerGap(89, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(44)
					.addComponent(textoResultado, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(boton1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(boton2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(boton3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(botonRestar, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(boton4, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(boton5, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(boton6, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addComponent(botonSumar, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(boton7, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(boton0, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(botonPunto, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(botonBorrar, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(botonMultiplicar, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(boton9, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addComponent(botonDividir, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
						.addComponent(boton8, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(botonIgual, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(botonPlusMinus, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
					.addGap(20))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
