import java.util.Random;

public class CPreenchePilhaRandom {
	
	private CPilha cp;

	// Coloca inteiros aleat�rios na pilha
	public void PreenchePilha() {
		Random numAleatorio = new Random();
		for (int i = 0; i < 10; i++) {
			cp.empilha(numAleatorio.nextInt());
		}
	}
}
