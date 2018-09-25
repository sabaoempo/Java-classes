
public class CLimpaPilha {
	public CLimpaPilha() {

	}

	public static void limpaPilha(CPilha P) {
		int qtde = P.quantidade();
		for (int i = 0; i < qtde; i++) {
			P.desempilha();
		}
	}
}
