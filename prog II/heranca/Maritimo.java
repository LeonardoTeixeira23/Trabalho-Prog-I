package heranca;

public class Maritimo extends Veiculo{
    private String codigo;
    private String empresa;
    
    public void cadastro(){
        super.cadastro();

        System.out.print("\nInsira o codigo da embarcação: ");
        setCodigo(kboard.next());
        System.out.print("\nInsira a empresa proprietaria da embarcação: ");
        kboard.nextLine();
        setEmpresa(kboard.nextLine());
    }

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
