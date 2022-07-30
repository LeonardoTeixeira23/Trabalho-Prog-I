
public class Main
{
	public static void main(String[] args) {
		Tutor t1 = new Tutor("Jorge Pereira", 8756598, "Rua feijao","jorginho223@gmail.com" , 51979 );
		Pet p1 = new Pet("Cachorro", "Labrador", "Thor", 5, t1);
        Pet p2 = new Pet("Gato", "Perça", "Anubis", 2);

        p1.info();
        t1.info();
        
        t1.addPet(p1);
        t1.addPet(p2);
        //t1.infoPets();

        //t1.infoTelefones();
        t1.addTelefone(54877);
        //t1.infoTelefones();

        Tutor t2 = new Tutor("Pedro", 8848, "Rua Arroz", "acordapedrinho@gmail.com", 5587);
        //p1.infoTutores();;
        p1.addTutor(t2);
        p1.infoTutores();
	}
}
