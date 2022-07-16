package heranca;
public class Veiculo {
    private String fabricante;
    private String modelo;
    private String pais;
    private float posicaoX;
    private float posicaoY;
    private float valor;
    private int passageiros;
    
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public float getPosicaoX() {
        return posicaoX;
    }
    public void setPosicaoX(float posicaoX) {
        this.posicaoX = posicaoX;
    }
    public float getPosicaoY() {
        return posicaoY;
    }
    public void setPosicaoY(float posicaoY) {
        this.posicaoY = posicaoY;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public int getPassageiros() {
        return passageiros;
    }
    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public void deslocamento(float posicaoX, float posicaoY) {
        double deslocamentoX = this.posicaoX - posicaoX;
        double deslocamentoY = this.posicaoY - posicaoY;
        System.out.println("O deslocamento X foi de " + deslocamentoX + "graus\n" + 
                            "O deslocamento Y foi de " + deslocamentoY + "graus");
    }
}
