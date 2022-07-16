package heranca;

public class Maritimo extends Veiculo{
    private String codigo;
    private String empresa;
    
    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void compre(String comprador){
        setEmpresa(comprador);
    }

    public void info(){
        super.info();
        System.out.println("Codigo" + getCodigo() + "\n" + 
                            "Empresa: " + getEmpresa() + "\n");
    }
}
