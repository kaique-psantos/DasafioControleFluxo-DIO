/**
 * <h1> Contador </h1>
 * Programa de Controle de Fluxo com o seguinte cenário: O sistema receberá dois parâmetros via terminal que representarão dois números inteiros, com estes dois números ele deverá obter a quantidade de interações (for) e realizar a impressão no console dos números incrementados.
 * Com uma Exceção verificada, em caso do usuário inserir o primeiro parâmetro maior que o segundo.
 * @author Kaíque Pereira
 * @version 1.0
 * @since 01/10/2023
 */
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		
		for(int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número: " + i);
		}
	}
}