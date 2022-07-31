package sistemaBancario;

import java.util.ArrayList;

public class Banco {
    private String nome;
    private String cnpj;
    private int numBanco;
    ArrayList<Conta> contas = new ArrayList<Conta>();



    /*
    * GETTER's E SETTER'S
    * */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getNumBanco() {
        return numBanco;
    }

    public void setNumBanco(int numBanco) {
        this.numBanco = numBanco;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }
}
