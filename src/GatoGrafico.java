import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GatoGrafico extends JFrame {
	JButton Uno;
	JButton Dos;
	JButton Tres;
	JButton Cuatro;
	JButton Cinco;
	JButton Seis;
	JButton Siete;
	JButton Ocho;
	JButton Nueve;
	
	JRadioButton rdbtnX;
	JRadioButton rdbtnY;
	private JPanel contentPane;
	private JTextField txtPantalla;
	
	int contador = 0;
	private JLabel lblGanador;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GatoGrafico frame = new GatoGrafico();
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
	public GatoGrafico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelBotones.setBounds(27, 28, 215, 245);
		contentPane.add(panelBotones);
		
		 Uno = new JButton("");
		 Dos = new JButton("");
		 Tres = new JButton("");
		 
		 Cuatro = new JButton("");
		 Cinco = new JButton("");
		 Seis = new JButton("");
		 Siete = new JButton("");
		 Ocho = new JButton("");
		 Nueve = new JButton("");
		
		panelBotones.setLayout(new GridLayout(3, 3, 0, 0));
		panelBotones.add(Uno);
		panelBotones.add(Dos);
		panelBotones.add(Tres);
		panelBotones.add(Cuatro);
		panelBotones.add(Cinco);
		panelBotones.add(Seis);
		panelBotones.add(Siete);
		panelBotones.add(Ocho);
		panelBotones.add(Nueve);
		
		JPanel panel = new JPanel();
		panel.setBounds(252, 11, 223, 262);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblTurno = new JLabel("Turno :");
		panel.add(lblTurno);
		
		rdbtnX = new JRadioButton("X");
		rdbtnX.setEnabled(false);
		rdbtnX.setSelected(true);
		panel.add(rdbtnX);
		
	    rdbtnY = new JRadioButton("O");
	    rdbtnY.setEnabled(false);
		panel.add(rdbtnY);
		
		lblGanador = new JLabel("Ganador:");
		panel.add(lblGanador);
		
		txtPantalla = new JTextField();
		txtPantalla.setEditable(false);
		panel.add(txtPantalla);
		txtPantalla.setColumns(10);
		
		JButton btnNewButton = new JButton("Empezar de nuevo");
		panel.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		Eventos();
		
		
	}
	
	public int turno(){
		if(rdbtnX.isSelected()==true)
			return 1;
		else 
			return 0;
		
	}
	public void Eventos(){
		Uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turno() == 1){
					Uno.setText("X");
					Uno.setEnabled(false);
					turnoX();
				}
				else{
					Uno.setText("O");
					Uno.setEnabled(false);
					turnoY();
				}
			}
		});
		Dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turno() == 1){
					Dos.setText("X");
					Dos.setEnabled(false);
					turnoX();
				}
				else{
					Dos.setText("O");
					Dos.setEnabled(false);
					turnoY();
				}
			}
		});
		Tres.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		if(turno() == 1){
					Tres.setText("X");
					Tres.setEnabled(false);
					turnoX();
				}
				else{
					Tres.setText("O");
					Tres.setEnabled(false);
					turnoY();
				}
		 	}
		 });
		Cuatro.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		if(turno() == 1){
					Cuatro.setText("X");
					Cuatro.setEnabled(false);
					turnoX();
				}
				else{
					Cuatro.setText("O");
					Cuatro.setEnabled(false);
					turnoY();
				}
		 	}
		 });
		Cinco.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		if(turno() == 1){
					Cinco.setText("X");
					Cinco.setEnabled(false);
					turnoX();
				}
				else{
					Cinco.setText("O");
					Cinco.setEnabled(false);
					turnoY();
				}
		 	}
		 });
		Seis.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		if(turno() == 1){
					Seis.setText("X");
					Seis.setEnabled(false);
					turnoX();
				}
				else{
					Seis.setText("O");
					Seis.setEnabled(false);
					turnoY();
				}
		 	}
		 });
		Siete.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		if(turno() == 1){
					Siete.setText("X");
					Siete.setEnabled(false);
					turnoX();
				}
				else{
					Siete.setText("O");
					Siete.setEnabled(false);
					turnoY();
				}
		 	}
		 });
		Ocho.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		if(turno() == 1){
					Ocho.setText("X");
					Ocho.setEnabled(false);
					turnoX();
				}
				else{
					Ocho.setText("O");
					Ocho.setEnabled(false);
					turnoY();
				}
		 	}
		 });
		Nueve.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		if(turno() == 1){
					Nueve.setText("X");
					Nueve.setEnabled(false);
					turnoX();
				}
				else{
					Nueve.setText("O");
					Nueve.setEnabled(false);
					turnoY();
				}
		 	}
		 });
	}
	
	public void turnoX(){
		rdbtnY.setSelected(true);
		rdbtnX.setSelected(false);
		Decision();
	}
	
	public void turnoY(){
		rdbtnY.setSelected(false);
		rdbtnX.setSelected(true);
		Decision();
	}
	public void  Decision(){
		//contador++;
		if(referi()!=null){
			
			txtPantalla.setText(referi());
			
			
				
			
		}
	
		else{
			txtPantalla.setText(" ");
		}	
		
	}
	public String referi(){
		if(Uno.getText().equals(Dos.getText())&& Uno.getText().equals(Tres.getText())){
			Cuatro.setEnabled(false);
			Cinco.setEnabled(false);
			Seis.setEnabled(false);
			Siete.setEnabled(false);
			Ocho.setEnabled(false);
			Nueve.setEnabled(false);
			return Uno.getText();
			}
		
		if(Cuatro.getText().equals(Cinco.getText())&& Cuatro.getText().equals(Seis.getText())){
				
			
			return Cuatro.getText();
				}
		
		if(Siete.getText().equals(Ocho.getText())&& Siete.getText().equals(Nueve.getText())){
				return Siete.getText();
				}
			
		if(Uno.getText().equals(Cuatro.getText())&& Uno.getText().equals(Siete.getText())){
			Dos.setEnabled(false);
			Tres.setEnabled(false);
			Cinco.setEnabled(false);
			Seis.setEnabled(false);
			Ocho.setEnabled(false);
			Nueve.setEnabled(false);
			return Uno.getText();
		}
		if(Dos.getText().equals(Cinco.getText())&& Dos.getText().equals(Ocho.getText())){
			return Dos.getText();
			}
		if(Tres.getText().equals(Seis.getText())&& Tres.getText().equals(Nueve.getText())){
			
		
			return Tres.getText();
		}
		if(Uno.getText().equals(Cinco.getText())&& Uno.getText().equals(Nueve.getText())){
	
			return Uno.getText();
		}
		else if(Tres.getText().equals(Cinco.getText())&& Tres.getText().equals(Siete.getText())){
			
		
			return Tres.getText();
		}
		else
			return null;
	}
}
