package xadrez;

public abstract class Peca implements Movimento {  
	   static final int PEAO = 1;  
	   static final int TORRE = 2;  
	   static final int CAVALO = 3;  
	   static final int BISPO = 4;  
	   static final int RAINHA = 5;  
	   static final int REI = 6;  
	     
	     
	   @Override  
	   public int getDirecao() {  
	      // TODO Auto-generated method stub  
	      return 0;  
	   }  
	     
	   @Override  
	   public void setDirecao(int direcao) {  
	      // TODO Auto-generated method stub  
	        
	   }  
	}