public class Main
{
	public static void main(String[] args) {
		Arvore ar = new Arvore();
		
		ar.inserir(10);
		ar.inserir(1);
 		ar.inserir(3);
 		ar.inserir(2);
 		ar.inserir(4);
 		ar.inserir(9);
 		ar.inserir(12);
 		ar.inserir(6);
 		ar.inserir(7);
 		

 		// ar.exibir(ar.raiz);

		// ar.busca(6, ar.raiz);

		// ar.remover(3, ar.raiz);

		ar.calculaBalanciamento(ar.raiz);
		System.out.println(ar.exibirArvore(0,ar.raiz));
	}
}
