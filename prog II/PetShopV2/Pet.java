import java.util.ArrayList;


public class Pet{
    private String especie;
    private String raca;
    private String nome;


    private int idade;
    
    private ArrayList<Tutor> tutores = new ArrayList<Tutor>();

    public Pet (String especie, String raca, String nome, int idade, Tutor t1){
        this.especie = especie;
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
        this.tutores.add(t1);
    }

    public Pet (String especie, String raca, String nome, int idade){
        this.especie = especie;
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
    }
    
    public void addTutor(Tutor t1){
        tutores.add(t1);
    }
    
    public void infoTutores(){
        System.out.println("\n===================================================\n" +
                            "Tutores Do: " + this.nome );
        
        for(Tutor i : tutores){
            i.infoTutor();
        };
      System.out.println("===================================================\n");
    }
    
    public void info(){
 
        System.out.println("***********************************************\n" +
                            "               PET               \n" +
                            "Nome: " + this.nome + "\n"+
                            "Especie: " + this.especie + "\n" + 
                            "Raça: " + this.raca + "\n" +
                            "Idade: " + this.idade + "Anos\n" +
                            "***********************************************\n");
      
    }
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ArrayList<Tutor> getTutores() {
        return tutores;
    }

    public void setTutores(ArrayList<Tutor> tutores) {
        this.tutores = tutores;
    }

}