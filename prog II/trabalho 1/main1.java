public class main1{
    public static void main(String[] args) {
        
        empresa e1 = new empresa();

        remedio r1 = new remedio("Etanercepte",
                                 "Vermelha", 
                                 "R$ 9.030,00",
                                 "Enbrel", 
                                 5);

        funcionarios f1 = new funcionarios("Carlos",
                                            "D'avilla", 
                                            "894.496.514-25",
                                            "R$ 2.000,00",
                                            "Desenvolvedor Jr");
       
        livro l1 = new livro("O guia do mochileiro das galáxias",
                             "978-8-99296-94-3", 
                             "R$ 22,99", 
                             "Duoglas Adams", 
                             "Arqueiro", 
                            37);

        e1.nome("Super Jva");
        e1.cnpj("32.725.767/0001-74");
        e1.endereco("Est. Berico J Bernardes, 1330");
        e1.servico("Varejo");
        
        System.out.println("\n\nEMPRESAS\n");
        System.out.println("Empresa: " + e1.nome + "\n" +
                            "Cnpj: " + e1.cnpj + "\n" +
                            "Endereço: " + e1.endereco + "\n" +
                            "Serviço: " + e1.servico + "\n");

        
        System.out.println("MEDICAMENTOS\n");    
        System.out.println("Nome: " + r1.nome + "\n" +
                            "Tarja: " + r1.tarja + "\n" +
                            "Valor: " + r1.valor + "\n" +
                            "Laboratoio: " + r1.laboratorio + "\n" +
                            "Estoque: " + r1.estoque + "\n");
        
        System.out.println("FUNCIONARIOS\n");
        System.out.println("Nome: " + f1.nome + "\n" +
                            "Sobrenome: " + f1.sobrenome + "\n" +
                            "CPF: " + f1.cpf + "\n" + 
                            "Salario: " + f1.salario + "\n" + 
                            "Cargo: " + f1.cargo + "\n");
        
        System.out.println("LIVROS\n");
        System.out.println("Titulo: " + l1.titulo + "\n" +
                            "ISNB: " + l1.isbn + "\n" +
                            "Valor: " + l1.valor + "\n" + 
                            "Autor: " + l1. autor + "\n" +
                            "Editora: " + l1.editora + "\n" +
                            "Estoque: " + l1.estoque + "\n");

    }
}