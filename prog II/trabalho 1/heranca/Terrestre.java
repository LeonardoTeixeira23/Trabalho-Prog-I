package heranca;
public class Terrestre extends Veiculo {
    private String placa;
    private String dono;
    
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public void emplacar(String placa){
        this.placa = placa;
    }

    public void compra(String novoDono){
        this.dono = novoDono;
    }

    public void info(){
        super.info();
        System.out.println("Placa: " + getPlaca() + "\n" +
                            "Dono: " + getDono() + "\n");
    }
}
