import java.util.Scanner;

public class Main {
    static Algoritimo fila;
    static Scanner kboard = new Scanner(System.in);

    public static void main(String[] args) throws CloneNotSupportedException {

        iniciarFila();
        povoarFila();

        do{
            textoPrincipal();

            switch (kboard.nextInt()){
                case 1-> fila.fcfs();
                case 2-> fila.sjf();
                case 3-> fila.sjfPreem();
                case 4-> fila.robin();
                case 5-> fila.prioridade();
                case 6-> fila.prioridadePreem();
            }

        }while(true);


    }

    public static void textoPrincipal(){
        System.out.println("\n[1] - FCFS\n" +
                "[2] - SJF\n" +
                "[3] - SJF P\n" +
                "[4] - ROBIN\n" +
                "[5] - PRIORIDADE\n" +
                "[6] - PRIORIDADE P\n" +
                "[7] - SAIR\n" +
                "ESCOLHA O TIPO DE ALGORITMO: ");
    }

    public static void iniciarFila(){
        System.out.print("\nDigite o Número de processos : ");
        fila = new Algoritimo(kboard.nextInt());
    }

    public static void povoarFila(){
        System.out.print("\n ----- Opções ----- \n" +
                "1) Atribuição Automática\n" +
                "2) Atribuição Manual\n" +
                "ESCOLHA UMA OPÇÃO: ");
        int key = kboard.nextInt();
        switch (key){
            case 1-> fila.povoarFilaAuto();
            case 2-> fila.povoarFilaManual();
        }
    }
}
