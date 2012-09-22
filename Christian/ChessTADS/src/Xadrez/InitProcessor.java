package Xadrez;

import java.util.ArrayList;
import java.util.List;

public class InitProcessor {
	
	public static List<Pecas> iniciaPecas()
	{
		
//	Inicializa uma List do tipo Pecas, que é a classe com a posicao, nome e cor da peca
	List<Pecas> pieces = new ArrayList<Pecas>();
		
		Pecas p = new Pecas();
		
		p.setPos(0);
		p.setNome("Torre");
		p.setCor("Branco");
		
		pieces.add(p);
		
		p.setPos(1);
		p.setNome("Cavalo");
		p.setCor("Branco");
		
		pieces.add(p);
		
		p.setPos(2);
		p.setNome("Bispo");
		p.setCor("Branco");
		
		pieces.add(p);
		
		p.setPos(3);
		p.setNome("Rainha");
		p.setCor("Branco");
		
		pieces.add(p);
		
		p.setPos(4);
		p.setNome("Rei");
		p.setCor("Branco");
		
		pieces.add(p);
		
		p.setPos(5);
		p.setNome("Bispo");
		p.setCor("Branco");
		
		pieces.add(p);
		
		p.setPos(6);
		p.setNome("Cavalo");
		p.setCor("Branco");
		
		pieces.add(p);
		
		p.setPos(7);
		p.setNome("Torre");
		p.setCor("Branco");
		
		for (int i = 8; i < 16; i++) {
			
			p.setPos(i);
			p.setNome("Peao");
			p.setCor("Branco");
			
			pieces.add(p);
			
		}
		
		for (int i = 48; i < 56; i++) {
			
			p.setPos(i);
			p.setNome("Peao");
			p.setCor("Preto");
			
			pieces.add(p);
		}
		
		p.setPos(56);
		p.setNome("Torre");
		p.setCor("Preto");
		
		pieces.add(p);
		
		p.setPos(57);
		p.setNome("Cavalo");
		p.setCor("Preto");
		
		pieces.add(p);
		
		p.setPos(58);
		p.setNome("Bispo");
		p.setCor("Preto");
		
		pieces.add(p);
		
		p.setPos(59);
		p.setNome("Rainha");
		p.setCor("Preto");
		
		pieces.add(p);
		
		p.setPos(60);
		p.setNome("Rei");
		p.setCor("Preto");
		
		pieces.add(p);
		
		p.setPos(61);
		p.setNome("Bispo");
		p.setCor("Preto");
		
		pieces.add(p);
		
		p.setPos(62);
		p.setNome("Cavalo");
		p.setCor("Preto");
		
		pieces.add(p);
		
		p.setPos(63);
		p.setNome("Torre");
		p.setCor("Preto");
		
		pieces.add(p);
		
		return pieces;
		
	}

}
