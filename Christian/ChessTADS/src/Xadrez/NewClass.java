package Xadrez;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.ArrayList;

// Código do Marcelo Mazurky

public class NewClass extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4030448834632250162L;
	JLabel [] celula  = new JLabel [64];

    public NewClass () {
        setTitle ("Xadrez TADS");
        setSize (580, 550);
        Container cp = getContentPane ();
        cp.setBackground (Color.BLACK);
        cp.setLayout (new GridLayout (0, 8, 2, 2));
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        Icon itorrebranca = new ImageIcon ("b_torre.png");
        Icon icavalobranco = new ImageIcon ("b_cavalo.png");
        Icon ibispobranco = new ImageIcon ("b_bispo.png");
        Icon irainhabranca = new ImageIcon ("b_rainha.png");
        Icon ireibranco = new ImageIcon ("b_rei.png");
        Icon ipeaobranco = new ImageIcon ("b_peao.png");

        Icon itorrepreta = new ImageIcon ("p_torre.png");
        Icon icavalopreto = new ImageIcon ("p_cavalo.png");
        Icon ibispopreto = new ImageIcon ("p_bispo.png");
        Icon irainhapreta = new ImageIcon ("p_rainha.png");
        Icon ireipreto = new ImageIcon ("p_rei.png");
        Icon ipeaopreto = new ImageIcon ("p_peao.png");

        int k = 0;



        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                celula [k] = new JLabel ();
                celula [k].setOpaque (true);
                cp.add (celula [k], new Integer (0));
                celula [k].addMouseListener (new Mover ());
                if (((i + j) % 2) == 0) {
                    celula [k].setBackground (Color.GRAY);
                }
                else {
                    celula [k].setBackground (Color.WHITE);
                }
                k++;
            }
        }
        
        celula [0].setIcon (itorrebranca);
        celula [1].setIcon (icavalobranco);
        celula [2].setIcon (ibispobranco);
        celula [3].setIcon (irainhabranca);
        celula [4].setIcon (ireibranco);
        celula [5].setIcon (ibispobranco);
        celula [6].setIcon (icavalobranco);
        celula [7].setIcon (itorrebranca);

        for (int i = 8; i < 16; i++) {
            celula [i].setIcon (ipeaobranco);
        }

        for (int i = 48; i < 56; i++) {
            celula [i].setIcon (ipeaopreto);
        }

        celula [56].setIcon (itorrepreta);
        celula [57].setIcon (icavalopreto);
        celula [58].setIcon (ibispopreto);
        celula [59].setIcon (irainhapreta);
        celula [60].setIcon (ireipreto);
        celula [61].setIcon (ibispopreto);
        celula [62].setIcon (icavalopreto);
        celula [63].setIcon (itorrepreta);
    }

    Component temp;
    Component temp2;

    //Cria um ArrayList de Rectangle, que sera usado depois para o metodo posicaoValida do ChessProcessor.
    //Na posicao 0 do ArrayList, ficara a posicao atual e na 1 a posicao que a pessoa quer ir.
    ArrayList<Rectangle> posicao = new ArrayList<Rectangle>();
    
    
    
    public class Mover extends MouseAdapter {
        public void mouseClicked (MouseEvent e) {

//        	Inicializa as pecas (Posicao, nome e cor)
//        	List<Pecas> pecas = InitProcessor.iniciaPecas();
        	
//        	Instancializa o ChessProcessor
        	ChessProcessor chess = new ChessProcessor();
        	
            if (e.getButton () == MouseEvent.BUTTON1) {
//            	Cria a variavel posAtual do tipo Rectangle, que contera as posicoes X,Y, para validacao de movimento.
            	Rectangle posAtual = chess.posicaoAtual(e);
            	
//            	Adiciona na posicao 0 do ArrayList as coordenadas X,Y da posicao atual
            	posicao.add(0,posAtual);
            	
            	temp = e.getComponent ();
                ((JComponent) temp).setBorder
(BorderFactory.createLineBorder (Color.PINK));
            }
            else {
                if (e.getButton () == MouseEvent.BUTTON3) {
//                	Cria a variavel posNova do tipo Rectangle, que contera as posicoes X,Y, para validacao de movimento.                	
                	Rectangle posNova = chess.posicaoAtual(e);
                	
//                	Adiciona na posicao 1 do ArrayList as coordenadas X,Y da posicao que a pessoa quer ir
                	posicao.add(1,posNova);
                    temp2 = e.getComponent ();
                    
//                  Imprime no Console as coordenadas X,Y para auxiliar no desenvolvimento da logica.
                    
                    System.out.println("X antigo="+posicao.get(0).getX()+"Y antigo="+posicao.get(0).getY());
                    System.out.println("X novo="+posicao.get(1).getX()+"Y novo="+posicao.get(1).getY());
                    if ((((JLabel) temp2).getIcon())==null)
                    {
                    ((JLabel) temp2).setIcon (((JLabel) temp).getIcon ());
                    ((JLabel) temp).setIcon (null);
                    ((JComponent) temp).setBorder (null);
                    }
                    else
                    {
                        celula[5].setBackground(Color.BLUE);
                    }

                }
            }
        }
    }


    /*public class Movimento extends MouseMotionAdapter {
        public void mouseDragged (MouseEvent e) {
            Component c = e.getComponent ();
            c.setLocation (c.getX () + e.getX (), c.getY () + e.getY ());
            }
    }*/

    public static void main (String [] args) {
        NewClass principal = new NewClass ();
        principal.setVisible (true);
    }
}