public abstract class ContaBancaria {
    protected Titular pessoa;
    protected Banco banco;
    protected int nroConta;
    protected double saldo;
    protected String string;

    public Titular getPessoa() {
        return pessoa;
    }

    public void setPessoa(Titular pessoa) {
        this.pessoa = pessoa;
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
