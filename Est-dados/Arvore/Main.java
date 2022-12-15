import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Arvore ar = new Arvore();
		Scanner kboard = new Scanner(System.in);
		int key;
		boolean fimLoop = false;

		while(!fimLoop){
			System.out.print("\n[1] Inserir valor"   + 
							 "\n[2] Buscar valor"    +
							 "\n[3] Remover valor"   +
							 "\n[4] Exirbir arvore " +
							 "\n[5] Exibir in-ordem" +
							 "\n[0] Sair"            +
							 "\nEscolha uma opção: ");
			key = kboard.nextInt();
			switch (key) {
				case 1:
					System.out.print("Insira um valor: ");
					ar.inserir(kboard.nextInt());
					
					
					ar.calculaBalanciamento(ar.raiz);
					ar.verificaBalanciamento(ar.raiz);
					break;
			
				case 2:
					System.out.print("Insira um valor: ");
					ar.busca(kboard.nextInt(), ar.raiz);
					break;

				case 3:
					System.out.print("Insira um valor: ");
					ar.remover(kboard.nextInt(), ar.raiz);
					break;
				
				case 4:
					System.out.println(ar.exibirArvore(0, ar.raiz));
				break;
				
				case 5:
					ar.exibir(ar.raiz);
					break;
				
				case 0:
					fimLoop = true;
					break;
			}
		}
	}
}
