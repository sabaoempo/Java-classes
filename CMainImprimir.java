
public class CMainImprimir {
	
	static void furaFila(CFila F, Object item) {
		F.enfileira(item);
		for (int i = 0; i < F.quantidade()-1; i++) {
			F.enfileira(F.desenfileira());
		}
	}

	public static void main(String[] args) {
		CFila cf = new CFila();
		cf.enfileira(1);
		cf.enfileira(2);
		cf.enfileira(3);
		cf.enfileira(5);
		furaFila(cf, 10);
		for (int i = 0; i < cf.quantidade(); i++) {
			System.out.println(cf.peek());
			cf.enfileira(cf.desenfileira());
		}
	}
}
