package heranca;
public class aviao extends Aereo{
    
    private int motores;
    private String piloto;

    public void cadastro(){
        super.cadastro();

        System.out.print("\nInsira quantos motores o aviao possui: ");
        setMotores(kboard.nextInt());
        System.out.print("\nInsira o nome do piloto: ");
        kboard.nextLine();
        setPiloto(kboard.nextLine());
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public void mudarPiloto(String novoPiloto) {
        setPiloto(novoPiloto);
    }

    public void info(){
        super.info();
        System.out.println("Numero de motores: " + getMotores() + "\n" +
                            "Nome do piloto" + getPiloto() + "\n");

    }
}
