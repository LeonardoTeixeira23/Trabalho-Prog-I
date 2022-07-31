
public class Main
{
	public static void main(String[] args) {
		Tutor t1 = new Tutor("Jorge Pereira", 8756598, "Rua feijao","jorginho223@gmail.com" , 51979 );
		Pet p1 = new Pet("Cachorro", "Labrador", "Thor", 5, t1);
        Pet p2 = new Pet("Gato", "Perça", "Anubis", 2);
        Veterrinario v1 = new Veterrinario("Carlos Silva", 6597,"Rua milho", "carlinho212@hotmail.com", 955548, 5554,"noite");
        Consulta c1 = new Consulta(v1, p1, t1, 550.50, "15/07/2022");
        Consulta c2 = new Consulta(v1, p2, t1, 320, "20/07/2022");

        v1.addAtendimento(c1);
        v1.addAtendimento(c2);
       // p1.info();
        //t1.info();
        
        t1.addPet(p1);
        t1.addPet(p2);
        //t1.infoPets();

        //t1.infoTelefones();
        t1.addTelefone(54877);
        //t1.infoTelefones();

        Tutor t2 = new Tutor("Pedro", 8848, "Rua Arroz", "acordapedrinho@gmail.com", 5587);
        //p1.infoTutores();;
        p1.addTutor(t2);
       // p1.infoTutores();
        c1.info();
        v1.info();
        v1.infoConsultas();



    }
}
