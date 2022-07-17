package heranca;

import java.util.Scanner;


public class Veiculo {
    Scanner kboard = new Scanner(System.in);

    private String fabricante;
    private String modelo;
    private String pais;
    private float posicaoX;
    private float posicaoY;
    private float valor;
    private int passageiros;

    public void cadastro() {
        System.out.print("\nInsira o nome da fabricante: ");
        setFabricante(kboard.nextLine());
        System.out.print("\nInsira o modelo: ");
        setModelo(kboard.nextLine());
        System.out.print("\nInsira o pais de origem: ");
        setPais(kboard.nextLine());
        System.out.print("\nInsira a posição X: ");
        setPosicaoX(kboard.nextFloat());
        System.out.print("\nInsira a posição Y: ");
        setPosicaoY(kboard.nextFloat());
        System.out.print("\nInsira o valor do veiculo: ");
        setValor(kboard.nextFloat());
        System.out.print("\nInsira o numero maximo de passageiros: ");
        setPassageiros(kboard.nextInt());
    }
    
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
        float deslocamentoX = this.posicaoX - posicaoX;
        float deslocamentoY = this.posicaoY - posicaoY;
        setPosicaoX(posicaoX);
        setPosicaoY(posicaoY);
        System.out.println("O deslocamento X foi de " + deslocamentoX + "graus\n" + 
                            "O deslocamento Y foi de " + deslocamentoY + "graus");
    }

    public void info(){
        System.out.println("Fabricante: " + getFabricante() + "\n" +
                            "Modelo: " + getModelo() + "\n" +
                            "País: " + getPais() + "\n" +
                            "Posição X: " + getPosicaoX() + "\n" +
                            "posição Y: " + getPosicaoY() + "\n" +
                            "Valor: " + getValor() + "\n" +
                            "Numero de passageiros: " + getPassageiros() + "\n");
    }
}
