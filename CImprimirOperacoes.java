import java.util.Random;

public class CImprimirOperacoes {
	
	private CPilha cp;

	// Coloca inteiros aleatórios na pilha
	//Os numeros foram gerados de 0 a 50 para deixar os resultados das operacoes mais "apresentáveis"
	public void PreenchePilha() {
		Random numAleatorio = new Random();
		for (int i = 0; i < 10; i++) {
			cp.empilha(numAleatorio.nextInt(50));
		}
	}
	
	//imprime a pilha usando uma pilha auxiliar
	//imprime as operacoes depois de imprimir a pilha
	public void ImprimePilhaEOperacoes() {
		CPilha auxCp = new CPilha();
		int soma = 0, qtde = cp.quantidade();
		for (int i = 0; i < qtde; i++) {
			System.out.println(cp.peek());
			soma += (int)cp.peek();
			auxCp.empilha(cp.desempilha());
		}
		for (int i = 0; i < auxCp.quantidade(); i++) {
			cp.empilha(auxCp.desempilha());
		}
		System.out.println("A soma dos elementos é" + soma + "e a média é" +soma/10);
	}
	
}
