package Xadrez;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class TabuleiroTeste extends JFrame {
	Peca temp3;
	Peca temp4;

	public class Peca extends JLabel {
		String nome;
		String cor;
	}

	Peca[] celula = new Peca[64];

	public TabuleiroTeste() {
		setTitle("Xadrez TADS");
		setSize(580, 550);
		Container cp = getContentPane();
		cp.setBackground(Color.BLACK);
		cp.setLayout(new GridLayout(0, 8, 2, 2));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Icon itorrebranca = new ImageIcon("b_torre.png");
		Icon icavalobranco = new ImageIcon("b_cavalo.png");
		Icon ibispobranco = new ImageIcon("b_bispo.png");
		Icon irainhabranca = new ImageIcon("b_rainha.png");
		Icon ireibranco = new ImageIcon("b_rei.png");
		Icon ipeaobranco = new ImageIcon("b_peao.png");

		Icon itorrepreta = new ImageIcon("p_torre.png");
		Icon icavalopreto = new ImageIcon("p_cavalo.png");
		Icon ibispopreto = new ImageIcon("p_bispo.png");
		Icon irainhapreta = new ImageIcon("p_rainha.png");
		Icon ireipreto = new ImageIcon("p_rei.png");
		Icon ipeaopreto = new ImageIcon("p_peao.png");

		int k = 0;

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				celula[k] = new Peca();
				celula[k].setOpaque(true);
				cp.add(celula[k], new Integer(0));
				celula[k].addMouseListener(new Mover());
				if (((i + j) % 2) == 0) {
					celula[k].setBackground(Color.GRAY);
				} else {
					celula[k].setBackground(Color.WHITE);
				}
				k++;
			}
		}

		celula[0].setIcon(itorrebranca);
		celula[0].nome = "torre";
		celula[0].cor = "branca";
		celula[1].setIcon(icavalobranco);
		celula[1].nome = "cavalo";
		celula[1].cor = "branca";
		celula[2].setIcon(ibispobranco);
		celula[2].nome = "bispo";
		celula[2].cor = "branca";
		celula[3].setIcon(irainhabranca);
		celula[3].nome = "rainha";
		celula[3].cor = "branca";
		celula[4].setIcon(ireibranco);
		celula[4].nome = "rei";
		celula[4].cor = "branca";
		celula[5].setIcon(ibispobranco);
		celula[5].nome = "bispo2";
		celula[5].cor = "branca";
		celula[6].setIcon(icavalobranco);
		celula[6].nome = "cavalo2";
		celula[6].cor = "branca";
		celula[7].setIcon(itorrebranca);
		celula[7].nome = "torre2";
		celula[7].cor = "branca";

		for (int i = 8; i < 16; i++) {
			celula[i].setIcon(ipeaobranco);
			celula[i].nome = "peao";
			celula[i].cor = "branca";
		}

		for (int i = 48; i < 56; i++) {
			celula[i].setIcon(ipeaopreto);
			celula[i].nome = "peao";
			celula[i].cor = "preta";
		}

		celula[56].setIcon(itorrepreta);
		celula[56].nome = "torre";
		celula[56].cor = "preta";
		celula[57].setIcon(icavalopreto);
		celula[57].nome = "cavalo";
		celula[57].cor = "preta";
		celula[58].setIcon(ibispopreto);
		celula[58].nome = "bispo";
		celula[58].cor = "preta";
		celula[59].setIcon(irainhapreta);
		celula[59].nome = "rainha";
		celula[59].cor = "preta";
		celula[60].setIcon(ireipreto);
		celula[60].nome = "rei";
		celula[60].cor = "preta";
		celula[61].setIcon(ibispopreto);
		celula[61].nome = "bispo2";
		celula[61].cor = "preta";
		celula[62].setIcon(icavalopreto);
		celula[62].nome = "cavalo2";
		celula[62].cor = "preta";
		celula[63].setIcon(itorrepreta);
		celula[63].nome = "torre2";
		celula[63].cor = "preta";
	}

	public void validaMovimento(Component a, Component b) {
		temp3 = (Peca) temp2;
		temp4 = (Peca) temp;
		if (temp3.cor != temp4.cor) {
			((JLabel) temp2).setIcon(((JLabel) temp).getIcon());
			((JLabel) temp).setIcon(null);
			((JComponent) temp).setBorder(null);
		}
	}

	Component temp;
	Component temp2;

	// Peca temp3;
	// Peca temp4;

	public class Mover extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			if (e.getButton() == MouseEvent.BUTTON1) {
				temp = e.getComponent();
				((JComponent) temp).setBorder(BorderFactory
						.createLineBorder(Color.RED));
			} else {
				if (e.getButton() == MouseEvent.BUTTON3) {
					temp2 = e.getComponent();
					// temp3 = (Peca) temp2;
					// temp4 = (Peca) temp;
				}
			}
		}
	}

	/*
	 * public class Movimento extends MouseMotionAdapter { public void
	 * mouseDragged (MouseEvent e) { Component c = e.getComponent ();
	 * c.setLocation (c.getX () + e.getX (), c.getY () + e.getY ()); } }
	 */

	public static void main(String[] args) {
		TabuleiroTeste principal = new TabuleiroTeste();
		principal.setVisible(true);
	}
}