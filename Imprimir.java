
public class Imprimir {
	private CPilha cp;
	
	
	//Coloca inteiros na pilha
	public void PreenchePilha() {
		for (int i = 0; i < 10; i++) {
			cp.empilha(i+2);
		}
	}
	
	//Imprime os elementos da pilha usando uma pilha auxiliar
	public void ImprimePilha() {
		CPilha auxCp = new CPilha();
		for (int i = 0; i < cp.quantidade(); i++) {
			System.out.println(cp.peek());
			auxCp.empilha(cp.desempilha());
		}
		for (int i = 0; i < auxCp.quantidade(); i++) {
			cp.empilha(auxCp.desempilha());
		}
	}
	
}
