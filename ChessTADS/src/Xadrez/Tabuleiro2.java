package Xadrez;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class Tabuleiro2 extends JFrame {
	JLabel[] celula = new JLabel[64];

	public Tabuleiro2() {
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
				celula[k] = new JLabel();
				celula[k].setOpaque(true);
				cp.add(celula[k], new Integer(0));
				celula[k].addMouseListener(new Mover());
				if (((i + j) % 2) == 0) {
					celula[k].setBackground(Color.BLACK);
				} else {
					celula[k].setBackground(Color.WHITE);
				}
				k++;
			}
		}

		celula[0].setIcon(itorrebranca);
		celula[1].setIcon(icavalobranco);
		celula[2].setIcon(ibispobranco);
		celula[3].setIcon(irainhabranca);
		celula[4].setIcon(ireibranco);
		celula[5].setIcon(ibispobranco);
		celula[6].setIcon(icavalobranco);
		celula[7].setIcon(itorrebranca);

		for (int i = 8; i < 16; i++) {
			celula[i].setIcon(ipeaobranco);
		}

		for (int i = 48; i < 56; i++) {
			celula[i].setIcon(ipeaopreto);
		}

		celula[56].setIcon(itorrepreta);
		celula[57].setIcon(icavalopreto);
		celula[58].setIcon(ibispopreto);
		celula[59].setIcon(irainhapreta);
		celula[60].setIcon(ireipreto);
		celula[61].setIcon(ibispopreto);
		celula[62].setIcon(icavalopreto);
		celula[63].setIcon(itorrepreta);
	}

	Component temp;
	Component temp2;

	public class Mover extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			if (e.getButton() == MouseEvent.BUTTON1) {
				temp = e.getComponent();
				
				((JComponent) temp).setBorder(BorderFactory
						.createLineBorder(Color.BLUE));
			} else {
				if (e.getButton() == MouseEvent.BUTTON3) {
					temp2 = e.getComponent();
					((JLabel) temp2).setIcon(((JLabel) temp).getIcon());
					((JLabel) temp).setIcon(null);
					((JComponent) temp).setBorder(null);
				}
			}
		}
	}

	/*
	 * public class Movimento extends MouseMotionAdapter { public void
	 * mouseDragged (MouseEvent e) { Component c = e.getComponent ();
	 * c.setLocation (c.getX () + e.getX (), c.getY () + e.getY ()); } }
	 */
/*
	public static void main(String[] args) {
		Tabuleiro2 principal = new Tabuleiro2();
		principal.setVisible(true);
	}*/
}