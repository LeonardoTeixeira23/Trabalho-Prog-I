import java.util.Random;

import static java.lang.Math.*;

public class Processo implements Cloneable {

    Random r = new Random();
    String id;
    int ut;
    int tempoEsp;
    int prioridade;
    int tempoDeChegada;
    int tempoRestante;

    public Processo(String id, int ut, int chegada, int prioridade){
        this.id = id;
        this.ut = ut;
        this.tempoDeChegada = chegada;
        this.tempoRestante = ut;
    }

    public Processo(String id, int chegada){
        this.id = id;
        gerarUt();
        this.tempoDeChegada = chegada;
        this.tempoRestante = this.ut;
        this.prioridade = r.nextInt(100);
    }

    public void gerarUt() {
        this.ut = r.nextInt(31);
    }

    @Override
    public Processo clone() throws CloneNotSupportedException {
        return (Processo) super.clone();
    }
}

//    public Processo varreProcessos(Processo p, int index, Processo p1){
//        if(p.tempoRestante > 0 && p.tempoDeChegada <= index){
//            System.out.println("teste1");
//            if (p.tempoRestante < p1.tempoRestante || p1.tempoRestante == 0){
//                System.out.println("teste2");
//
//                return p;
//            }
//            System.out.println("teste3");
//
//            return p1;
//        }else{
//            System.out.println("teste4");
//            return null;}
//    }