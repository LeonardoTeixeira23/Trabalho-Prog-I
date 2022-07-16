package heranca;
public class aviao extends Aereo{
    
    private int motores;
    private String piloto;

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

}
