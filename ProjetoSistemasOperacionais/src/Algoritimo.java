import java.util.Arrays;
import java.util.Scanner;

public class Algoritimo{
    Scanner kboard = new Scanner(System.in);
    Processo[] fila, filaAux;
    int tempoTotal = 0;
    float tempoMedio;

    public Algoritimo(int tamanho){
        fila = new Processo[tamanho];
    }

    public void povoarFilaAuto(){
        int chegada = 0;
        for(int i = 0; i < fila.length; i++){
            String id = "p"+i;
            fila[i] = new Processo(id, chegada);

            this.tempoTotal += fila[i].ut;
            chegada += fila[i].r.nextInt(5);
        }
    }

    public void povoarFilaManual(){
        int chegada = 0;

        for(int i = 0; i < fila.length; i++){
            int ut = kboard.nextInt();
            String id = "p"+i;
            int prioridade = 0;

            fila[i] = new Processo(id, ut, chegada, prioridade);
            this.tempoTotal += ut;
        }
    }

    public void fcfs() throws CloneNotSupportedException {
        execucaoFcfs();
        exibirResultos();
    }

    public void execucaoFcfs() throws CloneNotSupportedException {
        copiarFila();
        int index = 1, espera = 0;
        for(Processo p : filaAux){
            p.tempoEsp = espera;
            for(int i = 0; i < p.ut; i++) {
                System.out.println(index + " : " + p.id);
                index++;
            }
            espera += p.ut;
        }
        calularTempoMedio();
    }

    public void exibirResultos(){
        for (Processo p: filaAux) {
            System.out.println("ID: " + p.id +
                    " | EXECUÇÃO: " + p.ut +
                    " | ESPERA: " + p.tempoEsp +
                    " | PRIORIDADE: " + p.prioridade +
                    " | CHEGADA: " + p.tempoDeChegada
            );
        }
        System.out.println("\nTempo médio de espera: " + this.tempoMedio);
        System.out.println("Tempo total de execução: " + this.tempoTotal);
    }

    public void calularTempoMedio(){
        float total = 0;
        for(Processo p : filaAux){
            total += p.tempoEsp;
        }
        this.tempoMedio = total / fila.length;
    }

    public void execucaoSjf() throws CloneNotSupportedException {
        copiarFila();
        Processo processoSjf;
        int index = 1;

        while (true){
            processoSjf = this.filaAux[0];
            for (Processo p: this.filaAux) {
                processoSjf = varreProcessos(p, index, processoSjf);
            }
            if(processoSjf.tempoRestante <= 0){
                if(index >= tempoTotal){
                    break;
                }else{
                    System.out.println(index + " : não a processo pronto");
                    index++;
                    encrementaEspera(processoSjf);
                }
            }else {
                for (int j = 0; j < processoSjf.tempoRestante; j++) {
                    System.out.println(index + " : " + processoSjf.id);
                    index++;
                    encrementaEspera(processoSjf);
                }
                processoSjf.tempoRestante = 0;
            }
        }
        calularTempoMedio();
        exibirResultos();
    }

    public void execucaoSjfPreem() throws CloneNotSupportedException {
        copiarFila();
        Processo processSjfPrem;
        int index = 1;

        while (true){
            processSjfPrem = this.filaAux[0];
            for (Processo p: this.filaAux) {
                processSjfPrem = varreProcessos(p, index, processSjfPrem);
            }
            if(processSjfPrem.tempoRestante <= 0){
                if(index >= tempoTotal){
                    break;
                }else{
                    System.out.println(index + " : não a processo pronto");
                    index++;
                    encrementaEspera(processSjfPrem);
                }
            }else{
                System.out.println(index + " : " + processSjfPrem.id);
                processSjfPrem.tempoRestante -= 1;
                index++;
                encrementaEspera(processSjfPrem);
            }
        }
        calularTempoMedio();
        exibirResultos();
    }
    public Processo varreProcessos(Processo p, int index, Processo p1){
        Processo retorno;
        if((p.tempoRestante > 0) && (p.tempoDeChegada <= index)){
            if (p.tempoRestante < p1.tempoRestante || p1.tempoRestante == 0){
                retorno = p;
            }else retorno = p1;
        }else retorno = p1;
        return retorno;
    }

    public boolea

    public void copiarFila() throws CloneNotSupportedException {
        this.filaAux = new Processo[this.fila.length];
        for (int i = 0; i < this.fila.length; i++) {
            this.filaAux[i] = this.fila[i].clone();
        }
    }

    public void algPrioridadePreem() throws CloneNotSupportedException {
        copiarFila();
        int i = 1;
        Processo pEx;

        while(true){
            pEx = this.filaAux[0];
            for(int j = 0; j < this.filaAux.length; j++){
                if(this.filaAux[j].prioridade > pEx.prioridade && this.filaAux[j].tempoRestante > 0){
                    pEx = this.filaAux[j];
                }
            }
            if(pEx.tempoRestante == 0){
                break;
            }else{
                System.out.println(i + " : " + pEx.id);
                i++;
                pEx.tempoRestante--;
                encrementaEspera(pEx);
            }
        }
        calularTempoMedio();
        exibirResultos();
    }

    public void algPrioridade() throws CloneNotSupportedException {
        copiarFila();
        int i = 1;
        Processo pEx;

        while(true){
            pEx = this.filaAux[0];
            for(int j = 0; j < this.filaAux.length; j++){
                if(this.filaAux[j].prioridade > pEx.prioridade && this.filaAux[j].tempoRestante > 0){
                    pEx = this.filaAux[j];
                }
            }
            if(pEx.tempoRestante == 0){
                break;
            }else{
                for(){

                }
                System.out.println(i + " : " + pEx.id);
                i++;
                pEx.tempoRestante--;
                encrementaEspera(pEx);
            }
        }
        calularTempoMedio();
        exibirResultos();
    }

    public void encrementaEspera(Processo p){
        for(Processo pf : filaAux){
            if(!pf.id.equals(p.id) && pf.tempoRestante > 0) pf.tempoEsp += 1;
        }
    }


}

