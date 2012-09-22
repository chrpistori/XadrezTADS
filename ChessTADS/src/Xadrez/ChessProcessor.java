package Xadrez;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;

public class ChessProcessor {
	
//	Recebe a informação da posição do mouse no momento do clique, e retorna a posicao X,Y da célula
	public Rectangle posicaoAtual(MouseEvent e)
	{
		 Rectangle novo = e.getComponent().getBounds();
		 return novo;
	}
	
//	Recebe o nome da peça (Essa parte nao finalizei), a posicao atual (X,Y) e a posicao da celula que a pessoa que mover (X,Y).
//	Retorna um boolean com a informacao da validade do movimento
	
//	public boolean posicaoValida(String nome, Rectangle posAtual, Rectangle posNova)
//	{
//		
//	}
	
}
