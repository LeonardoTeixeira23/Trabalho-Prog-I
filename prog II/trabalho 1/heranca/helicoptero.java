package heranca;

public class helicoptero extends Aereo {
    
    private int rotores;
    private String piloto;
    
    public int getRotores() {
        return rotores;
    }
    public void setRotores(int rotores) {
        this.rotores = rotores;
    }
    public String getPiloto() {
        return piloto;
    }
    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public void info() {
        super.info();
        System.out.println("Numero de rotores: " + getRotores() + "\n" +
                            "Nome do piloto: " + getPiloto() + "\n");
    }

}
