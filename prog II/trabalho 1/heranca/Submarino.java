package heranca;

public class Submarino extends Maritimo{
    private float posicaoZ;
    private float profundidadeMax;
    
    public float getPosicaoZ() {
        return posicaoZ;
    }
    
    public void setPosicaoZ(float posicaoZ) {
        this.posicaoZ = posicaoZ;
    }
    
    public float getProfundidadeMax() {
        return profundidadeMax;
    }
    
    public void setProfundidadeMax(float profundidadeMax) {
        this.profundidadeMax = profundidadeMax;
    }

    public void deslocamento(float posicaoX, float posicaoY, float posicaoZ){
        this.deslocamento(posicaoX, posicaoY);
        float deslocamentoZ = this.posicaoZ - posicaoZ;
        setPosicaoZ(posicaoZ);
        System.out.println("O deslocamento Z foi de " + deslocamentoZ + "graus");
    }

    public void info(){
        super.info();
        System.out.println("Posição Z: " + getPosicaoZ() + " graus\n" +
                            "Profundidade maxima: " + getProfundidadeMax() + "m\n");
    }
}
