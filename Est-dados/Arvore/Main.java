public class Main
{
	public static void main(String[] args) {
		Arvore ar = new Arvore();
		
		ar.inserir(10);
		ar.inserir(5);
 		ar.inserir(15);
 		ar.inserir(12);
 		ar.inserir(20);
 		ar.inserir(25);
 		// ar.inserir(12);
 		// ar.inserir(6);
 		// ar.inserir(7);
 		

 		// ar.exibir(ar.raiz);

		// ar.busca(6, ar.raiz);

		// ar.remover(3, ar.raiz);

		// ar.calculaBalanciamento(ar.raiz);
		System.out.println(ar.exibirArvore(0,ar.raiz));
	}
}
