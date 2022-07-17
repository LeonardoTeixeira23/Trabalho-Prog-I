package heranca;
public class Carro extends Terrestre{
    private String combustivel;
    private String classe;
    private int potencia;
    private String gnv = "Não";

    public void cadastro(){
        super.cadastro();

        System.out.print("\nInsira o tipo de combustivel: ");
        setCombustivel(kboard.nextLine());
        System.out.print("\nInsira o tipo a classe do veiculo: ");
        setClasse(kboard.nextLine());
        System.out.println("\nInsira a potencia do carro: ");
        setPotencia(kboard.nextInt());
    }
    
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void intalarGNV() {
        this.gnv = "Sim";
    }

    public void info() {
        super.info();
        System.out.println("Combustivel: " + getCombustivel() + "\n" + 
                            "Classe: " + getClasse() + "\n" +
                            "Potêcia: " + getPotencia() + "cv\n");
    }
}
