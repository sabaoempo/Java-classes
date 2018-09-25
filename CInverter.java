
public class CInverter {

	private CPilha cp;

	// Coloca inteiros na pilha
	public void PreenchePilha() {
		for (int i = 0; i < 10; i++) {
			cp.empilha(i + 2);
		}
	}

	// Imprime a pilha invertida usando uma pilha auxiliar
	public void ImprimePilhaInv() {
		CPilha inverteCp = new CPilha();
		int qtde = cp.quantidade();
		for (int i = 0; i < qtde; i++) {
			inverteCp.empilha(cp.desempilha());
		}
		for (int i = 0; i < qtde; i++) {
			System.out.println(inverteCp.peek());
			inverteCp.desempilha();
		}
	}

}
