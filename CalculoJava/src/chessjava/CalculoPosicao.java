package chessjava;

/**
 * 
 * @author tonare
 * 
 *         alt shift f identa codigo
 * 
 *         Zez�s considerem q o nosso vetor jalabel vai de 1 a 64 e uma matriz
 *         8,8,
 * 
 *         Coloquem um valor de posi�ao na variavel posicao e ele te dar� a
 *         linha e coluna na matriz
 */
public class CalculoPosicao {

	public static void main(String[] args) {
		int posicao = 2;

		int resultado = (posicao / 8);
		int resto = (posicao % 8);

		//if (resto == 1) {
			System.out.println("Est� na " + (resultado + 1) + "� linha e "
					+ (resto) + "� coluna\n" + "(x=" + (resto - 1) + ")\n"
					+ "(y=" + resultado + ")");
		/*} else if (resto == 0) {
			System.out.println("Est� na �ltima coluna: x = " + resultado
					+ "y = " + "7");
		} else {
			System.out.println("Est� em outro lugar x = " + (resto - 1)
					+ "y = " + resultado);
		}*/
	}
}