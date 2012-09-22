import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class teste extends JPanel {
	// Declarando os componentes que serão utilizados
	private JLabel comp1;
	private JLabel comp2;
	private JLabel comp3;
	private JTextField comp4;
	private JTextField comp5;
	private JTextField comp6;
	private JButton comp7;
	private JButton comp8;
	private JButton comp9;
	private JButton comp10;
	JTable tabela;

	public teste() {
		// instanciando os componentes com os respectivos valores
		comp1 = new JLabel("Nome:");
		comp2 = new JLabel("Sobrenome:");
		comp3 = new JLabel("CPF:");
		comp4 = new JTextField(5);
		comp5 = new JTextField(5);
		comp6 = new JTextField(5);
		comp7 = new JButton("Incluir");
		comp8 = new JButton("Atualizar");
		comp9 = new JButton("Listar");
		comp10 = new JButton("Excluir");
		// definindo as dimeões da janela
		setLayout(null);

		// Adicionando os componentes na janela
		setPreferredSize(new Dimension(700, 500));
		add(comp1);
		add(comp2);
		add(comp3);
		add(comp4);
		add(comp5);
		add(comp6);
		add(comp7);
		add(comp8);
		add(comp9);
		add(comp10);
		
		comp1.setBounds(10, 10, 100, 25);
		comp2.setBounds(10, 40, 100, 25);
		comp3.setBounds(10, 75, 100, 25);
		comp4.setBounds(95, 10, 540, 25);
		comp5.setBounds(95, 40, 540, 25);
		comp6.setBounds(95, 70, 540, 25);
		comp7.setBounds(280, 115, 85, 25);
		comp8.setBounds(370, 115, 85, 25);
		comp9.setBounds(460, 115, 85, 25);
	}
		
	
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("teste");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new teste());
		frame.pack();
		frame.setVisible(true);
	}
}