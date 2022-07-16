package heranca;
public class Moto extends Terrestre{
    private int potencia;
    private String partidaEletrica = "Não";

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void instalerPartElet() {
        this.partidaEletrica = "Sim";
    }
}
