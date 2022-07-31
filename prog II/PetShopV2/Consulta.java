public class Consulta {
    Veterrinario veterrinario;
    Pet paciente;
    Tutor acompanhante;
    double valor;
    String data;

    public Consulta(Veterrinario v1, Pet p1, Tutor t1, double vl1, String data){
        this.veterrinario = v1;
        this.paciente = p1;
        this.acompanhante = t1;
        this.valor = vl1;
        this.data = data;
    }

    public void info(){
        System.out.println("\n***********************************************\n" +
                           "Veterinario: " + veterrinario.getNome() + "\n" +
                           "Paciente: " + paciente.getNome() + "\n" +
                           "Acompanhante: " + acompanhante.getNome() + "\n" +
                           "Valor: " + this.valor + "\n" +
                           "Data: " + this.data +
                           "\n***********************************************");
    }
}
