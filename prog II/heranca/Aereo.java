package heranca;

public class Aereo extends Veiculo{
    private String codigo;
    private float posicaoZ;
    private String empresa;

    public void cadastro(){
        super.cadastro();

        System.out.print("\nInsira o codigo da aeronave: ");
        setCodigo(kboard.next());
        System.out.print("\nInsira a posição Z: ");
        setPosicaoZ(kboard.nextFloat());
        System.out.print("\nInsira a empresa proprietaria da aeronave: ");
        kboard.nextLine();
        setEmpresa(kboard.nextLine());
    }


    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public float getPosicaoZ() {
        return posicaoZ;
    }
    public void setPosicaoZ(float posicaoZ) {
        this.posicaoZ = posicaoZ;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void deslocamento(float posicaoX, float posicaoY, float posicaoZ){
        this.deslocamento(posicaoX, posicaoY);
        float deslocamentoZ = this.posicaoZ - posicaoZ;
        setPosicaoZ(posicaoZ);
        System.out.println("O deslocamento Z foi de " + deslocamentoZ + "graus");
    }

    public void compra(String comprador) {
        setEmpresa(comprador);
    }

    public void info() {
       super.info();
       System.out.println("Codigo: " + getCodigo() + "\n" +
                            "Posição Z: " + getPosicaoZ() + "\n" +
                            "Empresa: " + getEmpresa() + "\n"); 
    }
}
