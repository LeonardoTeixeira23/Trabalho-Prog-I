package heranca;
public class Caminhao extends Terrestre{
    private int eixos;
    private float peso;
    
    public void cadastro(){
        super.cadastro();

        System.out.print("\nInsira a quantidade de eixos do veiculo: ");
        setEixos(kboard.nextInt());
        System.out.print("\nInsira o peso do veiculo em toneladas: ");
        setPeso(kboard.nextFloat());
    }

    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void carga(float carga) {
        this.peso += carga;
    }

    public void descarga(float carga){
        this.peso -= carga;
    }

    public void info() {
        super.info();
        System.out.println("Eixos: " + getEixos() + "\n" +
                            "Peso total do veiculo: " + getPeso() + "t\n");
    }
}
