package heranca;
public class Caminhao extends Terrestre{
    private int eixos;
    private float peso;
    
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public int getPeso() {
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
}
