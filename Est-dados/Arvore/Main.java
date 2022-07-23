public class Main
{
	public static void main(String[] args) {
		Arvore ar = new Arvore();
		
		ar.inserir(5);
		ar.inserir(3);
 		ar.inserir(4);
 		ar.inserir(15);
 		
 		ar.exibir(ar.raiz);

		ar.busca(6, ar.raiz);
	}
}
