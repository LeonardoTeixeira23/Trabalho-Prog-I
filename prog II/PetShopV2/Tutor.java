import java.util.ArrayList;

public class Tutor extends Pessoa{
    private ArrayList<Pet> pets = new ArrayList<Pet>();
    
    public Tutor(String nome, long cpf, String endereco, String email, Integer telefone){
        super(nome, cpf, endereco, email, telefone);
    }
    
    public Tutor(String nome, long cpf, String endereco, String email, Integer telefone, Pet pet){
        super(nome, cpf, endereco, email, telefone);
        this.pets.add(pet);
    }

    public void addPet(Pet p1){
        pets.add(p1);
    }

    public void infoTutor(){
        System.out.print("\n***********************************************\n" +
                            "               Tutor              \n\n");
        super.info();
        System.out.print("***********************************************\n");

    }

    public void infoPets(){
        System.out.println("\n===================================================\n" +
                            "Pets do " + this.getNome());
        for(Pet pet : pets){
            pet.info();
        }
        System.out.println("===================================================");

    }
}