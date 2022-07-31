package sistemaBancario;

import java.util.ArrayList;

public class Pessoa {
    String nome;
    String sobreNome;
    int idade;
    private String cpf;
    ArrayList<Conta> contas = new ArrayList<>();

    ContaCorrente c = new ContaCorrente();
    con
    public void info(){
        System.out.println("\nNome: " + this.nome +
                         "\nSobrenome: " + this.sobreNome +
                         "\nIdade: " + this.idade +
                         "\nCPF: " + this.cpf);
    }

    public void infoContas(){
        for(Conta c : contas){
            c.info();
        }
    }
    /*
     * GETTER's E SETTER'S
     * */
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }
}
