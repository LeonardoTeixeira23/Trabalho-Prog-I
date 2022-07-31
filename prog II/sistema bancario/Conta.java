package sistemaBancario;

abstract class Conta {
    protected Pessoa titular;
    protected Banco banco;
    protected int nroConta;
    protected double saldo;
    protected String string;




    /*
     * GETTER's E SETTER'S
     * */
    public Pessoa getPessoa() {
        return titular;
    }

    public void setPessoa(Pessoa pessoa) {
        this.titular = pessoa;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public int getNroConta() {
        return nroConta;
    }

    public void setNroConta(int nroConta) {
        this.nroConta = nroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
