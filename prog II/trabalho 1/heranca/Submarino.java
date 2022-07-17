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

    public void testaPofundidade(float pfMax, float posZ) {
        if(pfMax < posZ){
            System.out.print("\n=================================" +
                            "\nProfundidade acima do permitido"  +
                            "\n==================================" );
        }
    }

    public void deslocamento(float posicaoX, float posicaoY, float posicaoZ){
        this.deslocamento(posicaoX, posicaoY);
        float deslocamentoZ = this.posicaoZ - posicaoZ;
        System.out.println("O deslocamento Z foi de " + deslocamentoZ + "graus");
        testaPofundidade(getProfundidadeMax(), posicaoZ);
        setPosicaoZ(posicaoZ);
    }

    public void info(){
        super.info();
        System.out.println("Posição Z: " + getPosicaoZ() + " graus\n" +
                            "Profundidade maxima: " + getProfundidadeMax() + "\n");
    }
}
