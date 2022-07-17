package heranca;

public class Submarino extends Maritimo{
    private float posicaoZ;
    private float profundidadeMax;

    public void cadastro (){
        super.cadastro();

        System.out.print("\nInsira profundidade maxima que o submarino pode atingir no eixo Z: ");
        setProfundidadeMax(kboard.nextFloat());
        System.out.print("\nInsira a posição Z do submarino: ");
        setPosicaoZ(kboard.nextFloat());
    }
    
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

    public void testaPofundidade() {
        
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
