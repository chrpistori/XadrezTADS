package xadrez;

public interface Movimento {  
	   public static final int DIRECAO_HORIZONTAL = 0;  
	   public static final int DIRECAO_VERTICAL = 1;  
	   public static final int DIRECAO_DIAGONAL_P = 2;  
	   public static final int DIRECAO_DIAGONAL_S = 3;  
	   public static final int DIRECAO_ELE = 4;  
	     
	   void setDirecao(int direcao);  
	     
	   int getDirecao();  
	     
	     
	}