package sistemaBancario;

public class ContaCorrente extends Conta{
    private double taxasMensais;



    public void info(){
        System.out.println("\nNome do banco: " + this.banco +
                           "\nNumero da conta: " + this.nroConta +
                           "\nNome do cliente: " + this.titular.nome +
                           "\nSaldo: " + this.saldo +
                           "\nTaxas mensais: " + this.taxasMensais);
    }


    /*
     * GETTER's E SETTER'S
     * */
    public double getTaxasMensais() {
        return taxasMensais;
    }

    public void setTaxasMensais(double taxasMensais) {
        this.taxasMensais = taxasMensais;
    }
}
