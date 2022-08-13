import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner kboard = new Scanner(System.in);
        int key = 0;

        do {
            System.out.println("\nMenu");
            System.out.println("1 - Inserir Endereço");
            System.out.println("2 - Atualizar Endereço");
            System.out.println("3 - Excluir Endereço");
            System.out.println("4 - Visualizar Endereço");
            System.out.println("5 - Sair");
            System.out.print("Digite sua opção:");

            key = kboard.nextInt();

            switch (key) {
                case 1: {
                    Endereco endereco = new Endereco();
                    try {
                        System.out.print("\nDigite o logradouro: ");
                        kboard.nextLine();
                        endereco.setLogradouro(kboard.nextLine());

                        System.out.print("\nDigite o bairro: ");
                        endereco.setBairro(kboard.nextLine());

                        System.out.print("\nDigite o CEP: ");
                        endereco.setCep(kboard.nextInt());

                        System.out.print("\nDigite a cidade: ");
                        kboard.nextLine();
                        endereco.setCidade(kboard.nextLine());

                        endereco.inserir();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 2: {
                    Endereco endereco = new Endereco();
                    try {
                        System.out.print("\nDigite o ID da cidade: ");
                        endereco.setId(kboard.nextInt());

                        System.out.print("\nDigite o logradouro: ");
                        kboard.nextLine();
                        endereco.setLogradouro(kboard.nextLine());

                        System.out.print("\nDigite o bairro: ");
                        endereco.setBairro(kboard.nextLine());

                        System.out.print("\nDigite o CEP: ");
                        endereco.setCep(kboard.nextInt());

                        System.out.print("\nDigite a cidade: ");
                        kboard.nextLine();
                        endereco.setCidade(kboard.nextLine());

                        endereco.atualizar();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 3: {
                    Endereco endereco = new Endereco();

                    try {
                        System.out.print("\nDigite o id da cidade: ");
                        endereco.setId(kboard.nextInt());

                        endereco.excluir();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("teste");

                    break;
                }
                case 4: {
                    Endereco endereco = new Endereco();
                    try {
                        System.out.println("\nEndereços: ");
                        endereco.consultar();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                default: {
                    System.out.println("Digite uma opção válida!!!");
                }
            }
        } while (key != 3);
    }
}


