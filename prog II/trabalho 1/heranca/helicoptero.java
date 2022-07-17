package heranca;

public class helicoptero extends Aereo {
    
    private int rotores;
    private String piloto;

    public void cadastro(){
        super.cadastro();

        System.out.print("\nInsira o numero de rotores do helicoptero: ");
        setRotores(kboard.nextInt());
        System.out.print("\nInsira o nome do piloto: ");
        kboard.nextLine();
        setPiloto(kboard.nextLine());
    }
    
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
