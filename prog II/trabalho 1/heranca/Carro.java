package heranca;
public class Carro extends Terrestre{
    private String combustivel;
    private String classe;
    private int potencia;
    private String gnv = "Não";
    
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
