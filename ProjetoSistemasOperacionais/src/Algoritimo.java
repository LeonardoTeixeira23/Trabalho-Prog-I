import java.util.Scanner;

public class Algoritimo{
/***********************************************************************************************************************
*                                             VARIAVEIS
***********************************************************************************************************************/

    Scanner kboard = new Scanner(System.in);
    Processo[] fila, filaAux;
    int tempoTotal = 0, index;
    float tempoMedio;

/***********************************************************************************************************************
*                                            INCIALIZAÇÂO
***********************************************************************************************************************/

    public Algoritimo(int tamanho){
        fila = new Processo[tamanho];
    }

    public void povoarFilaAuto(){
        int chegada = 0;
        for(int i = 0; i < fila.length; i++){
            String id = "p"+i;
            fila[i] = new Processo(id, chegada);

            this.tempoTotal += fila[i].ut;
            chegada += fila[i].r.nextInt(20);
        }
    }

    public void povoarFilaManual(){

        for(int i = 0; i < fila.length; i++){
            String id = "p"+i;

            System.out.print("\nInforme o peso do Processo (Ciclos necessarios para executalo): ");
            int ut = kboard.nextInt();


            System.out.print("\nInforme a prioridade do Processo: ");
            int prioridade = kboard.nextInt();

            System.out.print("\nInforme o instante de chegada do Processo: ");
            int chegada = kboard.nextInt();


            fila[i] = new Processo(id, ut, chegada, prioridade);
            this.tempoTotal += ut;
        }
    }

/***********************************************************************************************************************
*                                            ALGORITIMOS DE ORDENAÇÃO
***********************************************************************************************************************/

    public void fcfs() throws CloneNotSupportedException {
        copiarFila();
        this.index = 1;

        for(Processo p : filaAux){
            printNaoPreem(p);
        }
        calcularTempoMedio();
        exibirResultos();
    }

    public void sjf() throws CloneNotSupportedException {
        copiarFila();
        Processo processoSjf;
        this.index = 1;

        ajustaEspera();

        while (true){
            processoSjf = varreProcessos(this.filaAux[0]);

            if(processoSjf.tempoRestante <= 0){
                if(verificaFilaVazia()){
                    break;
                }else{
                    printSemProcPronto(processoSjf);
                }
            }else {
                printNaoPreem(processoSjf);
            }
        }
        calcularTempoMedio();
        exibirResultos();
    }

    public void sjfPreem() throws CloneNotSupportedException {
        copiarFila();
        Processo processSjfPrem;
        this.index = 1;

        ajustaEspera();

        while (true){
            processSjfPrem = varreProcessos(this.filaAux[0]);

            if(processSjfPrem.tempoRestante == 0){
                if(verificaFilaVazia()){
                    break;
                }else{
                    printSemProcPronto(processSjfPrem);
                }
            }else{
                printPreem(processSjfPrem);
            }
        }
        calcularTempoMedio();
        exibirResultos();
    }

    public void prioridadePreem() throws CloneNotSupportedException {
        copiarFila();
        this.index = 1;
        Processo pEx;

        while(true){
            pEx = maiorPrioridade(this.filaAux[0]);

            if(verificaFilaVazia()){
                break;
            }else{
                printPreem(pEx);
            }
        }
        calcularTempoMedio();
        exibirResultos();
    }

    public void prioridade() throws CloneNotSupportedException {
        copiarFila();
        this.index = 1;
        Processo pEx;

        while(true){
            pEx = maiorPrioridade(this.filaAux[0]);

            if(verificaFilaVazia()){
                break;
            }else{
                printNaoPreem(pEx);
            }
        }
        calcularTempoMedio();
        exibirResultos();
    }

    public void robin(){

    }

/***********************************************************************************************************************
*                                            FUNÇÕES GENERICAS
***********************************************************************************************************************/

    public void exibirResultos(){

        for (Processo p: this.filaAux) {
            System.out.println("ID: " + p.id +
                    " | EXECUÇÃO: " + p.ut +
                    " | ESPERA: " + p.tempoEsp +
                    " | PRIORIDADE: " + p.prioridade +
                    " | CHEGADA: " + p.tempoDeChegada
            );
        }
        System.out.printf("\nTempo médio de espera: %.2f%n", this.tempoMedio);
        System.out.println("Tempo total de execução: " + this.tempoTotal);
    }

    public void calcularTempoMedio(){
        float total = 0;
        for(Processo p : this.filaAux){
            if(p.tempoEsp < 0) p.tempoEsp = 0;
            total += p.tempoEsp;
        }
        this.tempoMedio = total / this.filaAux.length;
    }

    public void encrementaEspera(Processo p){
        for(Processo pf : filaAux){
            if(!pf.id.equals(p.id) && pf.tempoRestante > 0) pf.tempoEsp += 1;
        }
    }

    public void ajustaEspera(){
        for(Processo p : filaAux){
            p.tempoEsp -= p.tempoDeChegada -1;
        }
    }

    public void copiarFila() throws CloneNotSupportedException {
        this.filaAux = new Processo[this.fila.length];
        for (int i = 0; i < this.fila.length; i++) {
            this.filaAux[i] = this.fila[i].clone();
        }
    }

    public Processo validaProcessos(Processo p, Processo p1){
        Processo retorno;

        if((p.tempoRestante > 0) && (p.tempoDeChegada <= this.index)){
            if (p.tempoRestante < p1.tempoRestante || p1.tempoRestante == 0){
                retorno = p;
            }else retorno = p1;
        }else retorno = p1;
        return retorno;
    }

    public Processo varreProcessos(Processo proc){
        for (Processo p: this.filaAux) {
            proc = validaProcessos(p, proc);
        }
        return proc;
    }

    public boolean verificaFilaVazia(){
        for(Processo p : filaAux){
            if(p.tempoRestante > 0){
                return false;
            }
        }
        return true;
    }

    public void printPreem(Processo p){
        System.out.println(this.index + " : " + p.id);
        this.index++;
        p.tempoRestante--;
        encrementaEspera(p);
    }

    public void printNaoPreem(Processo p){
        while(p.tempoRestante > 0){
            System.out.println(this.index + " : " + p.id);
            this.index++;
            p.tempoRestante--;
            encrementaEspera(p);
        }
    }

    public void printSemProcPronto(Processo p){
        System.out.println(this.index + " : não a processo pronto");
        this.index++;
        encrementaEspera(p);
    }

    public Processo maiorPrioridade(Processo p){
        for(Processo pAux : this.filaAux){
            if((p.tempoRestante == 0) || (pAux.prioridade > p.prioridade && pAux.tempoRestante > 0)){
                p = pAux;
            }
        }
        return p;
    }
}