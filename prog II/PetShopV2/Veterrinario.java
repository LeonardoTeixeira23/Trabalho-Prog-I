import java.util.ArrayList;

public class Veterrinario extends Pessoa{
    int crmv;
    String turno;
    ArrayList<Consulta> atendimentos = new ArrayList<>();


    public Veterrinario(String nome, long cpf, String endereco, String email, Integer telefone, int crmv, String turno) {
        super(nome, cpf, endereco, email, telefone);
        this.crmv = crmv;
        this.turno = turno;
    }

    public void addAtendimento(Consulta consuta){
        atendimentos.add(consuta);
    }
    public void info(){
        System.out.print("\n***********************************************\n" +
                         "               Veterinario              \n\n" +
                         "CRMV: " + this.crmv +
                         "Turno: " + this.turno);
        super.info();
        System.out.print("***********************************************\n");
    }

    public void infoConsultas(){
        System.out.println("\n===================================================\n" +
                            "Consultas do " + this.getNome());
        for (Consulta i : atendimentos) {
            i.info();
        }
        System.out.println("===================================================");
    }
}
