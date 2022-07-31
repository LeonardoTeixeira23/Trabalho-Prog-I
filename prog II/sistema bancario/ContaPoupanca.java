package sistemaBancario;
public class ContaPoupanca extends Conta{
    private double redimento;
    private int saquesMensais;

    public void info(){
        System.out.println("\nNome do banco: " + this.banco +
                           "\nNumero da conta: " + this.nroConta +
                           "\nTitular da conta: " + this.titular.nome +
                           "\nSaldo da conta: " + this.saldo +
                           "\nRedimento mensal: " + this.redimento + "%" +
                           "\nSaques restantes: " + this.saquesMensais);
    }

    /*
     * GETTER's E SETTER'S
     * */

    public double getRedimento() {
        return redimento;
    }

    public void setRedimento(double redimento) {
        this.redimento = redimento;
    }

    public int getSaquesMensais() {
        return saquesMensais;
    }

    public void setSaquesMensais(int saquesMensais) {
        this.saquesMensais = saquesMensais;
    }
}
