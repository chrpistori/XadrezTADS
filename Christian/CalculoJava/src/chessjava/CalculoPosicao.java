package chessjava;

/**
 * 
 * @author tonare
 * 
 *         alt shift f identa codigo
 * 
 *         Zezés considerem q o nosso vetor jalabel vai de 1 a 64 e uma matriz
 *         8,8,
 * 
 *         Coloquem um valor de posiçao na variavel posicao e ele te dará a
 *         linha e coluna na matriz
 */
public class CalculoPosicao {

	public static void main(String[] args) {
		int posicao = 2;

		int resultado = (posicao / 8);
		int resto = (posicao % 8);

		//if (resto == 1) {
			System.out.println("Está na " + (resultado + 1) + "ª linha e "
					+ (resto) + "ª coluna\n" + "(x=" + (resto - 1) + ")\n"
					+ "(y=" + resultado + ")");
		/*} else if (resto == 0) {
			System.out.println("Está na última coluna: x = " + resultado
					+ "y = " + "7");
		} else {
			System.out.println("Está em outro lugar x = " + (resto - 1)
					+ "y = " + resultado);
		}*/
	}
}