package xadrez;

public class Tabuleiro extends Casa{  
   private Casa[][] casas;  
   private Tabuleiro tabuleiro;  
     
   public Tabuleiro() throws Exception {  
      if (this.tabuleiro != null){  
         tabuleiro = new Tabuleiro();  
         setCasas(new Casa[8][8]);  
      } else {  
         throw new Exception("Tabuleiro Já Instanciado!");  
      }  
   }

public Casa[][] getCasas() {
	return casas;
}

public void setCasas(Casa[][] casas) {
	this.casas = casas;
}  
}