
public class CInverterPilha {
	
	private CPilha cp;

	// Coloca inteiros na pilha
	public void PreenchePilha() {
		for (int i = 0; i < 10; i++) {
			cp.empilha(i + 2);
		}
	}
	
	//inverte os elementos da pilha usando uma fila auxiliar
	public void InverterPilha() {
		CFila inverteCp = new CFila();
		int qtde = cp.quantidade();
		for (int i = 0; i < qtde; i++) {
			inverteCp.enfileira(cp.desempilha());
		}
		for (int i = 0; i < qtde; i++) {
			cp.empilha(inverteCp.desenfileira());
		}
	}
	
}
