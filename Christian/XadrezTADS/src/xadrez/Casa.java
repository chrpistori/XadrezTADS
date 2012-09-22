package xadrez;

public class Casa {
	public static final int COR_PRETA = 0;  
	   public static final int COR_BRANCA = 1;  
	   private Casa casa;  
	   private int linha, coluna;  
	   private int cor = -1;  
	   private boolean ocupada;  
	  
	   public Casa() throws Exception{  
	      if (this.casa != null){  
	         casa = new Casa();  
	      } else {  
	         throw new Exception("Casa já instanciada!");  
	      }  
	   }  
	     
	   public Casa(int linha, int coluna) throws Exception{  
	      if (this.casa != null){  
	         casa = new Casa();  
	         this.linha = linha;  
	         this.coluna = coluna;  
	      } else {  
	         throw new Exception("Casa já instanciada!");  
	      }  
	   }  
	  
	   public void setColor(final int cor) throws Exception{  
	      if (cor == COR_PRETA || cor == COR_BRANCA){  
	         this.cor = cor;  
	      } else {  
	         throw new Exception("Cor Inválida");  
	      }  
	   }  
	  
	   public int getColor() throws Exception{  
	      if (cor != -1){  
	         return this.cor;  
	      }   
	      throw new Exception("Cor Não Instanciada");  
	   }  
	     
	   public int getLinha() {  
	      return linha;  
	        
	   }  
	  
	   public void setLinha(int linha) throws Exception {        
	      if (linha>=0 && linha <=8){  
	         this.linha = linha;  
	      } else {  
	         throw new Exception("Linha Inválida! precisa ser de 0 a 8 ");  
	      }  
	   }  
	  
	   public int getColuna() {  
	      return coluna;  
	   }  
	  
	   public void setColuna(int coluna) throws Exception {  
	      if (coluna>=0 && coluna <=8){  
	         this.coluna = coluna;  
	      } else {  
	         throw new Exception("Coluna Inválida! precisa ser de 0 a 8 ");  
	      }  
	   }  
	     
	   public void setLinhaAndColuna(int linha, int coluna) throws Exception{  
	      setLinha(linha);  
	      setColuna(coluna);  
	   }  
	  
	   public void setCasa(Casa casa){  
	      this.casa = casa;  
	   }  
	  
	   public Casa getCasa(){  
	      return this.casa;  
	   }  
	  
	   public boolean isOcupada() {  
	      return ocupada;  
	   }  
	}