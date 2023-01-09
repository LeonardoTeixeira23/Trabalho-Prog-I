import java.util.Scanner;

public class Algoritimo{
/***********************************************************************************************************************
*                                             VARIAVEIS
***********************************************************************************************************************/

    Scanner kboard = new Scanner(System.in);
    Processo[] fila, filaAux;
    int index, passo;
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

            chegada += fila[i].r.nextInt(12);
        }
    }

    public void povoarFilaManual(){

        for(int i = 0; i < fila.length; i++){
            String id = "p"+i;
            System.out.println("\n==================================================================");
            System.out.print("PROCESSO: " + i);
            System.out.print("\nInforme o peso do Processo (Ciclos necessarios para executalo): ");
            int ut = kboard.nextInt();

            System.out.print("Informe a prioridade do Processo: ");
            int prioridade = kboard.nextInt();

            System.out.print("Informe o instante de chegada do Processo: ");
            int chegada = kboard.nextInt();
            System.out.println("==================================================================\n");


            fila[i] = new Processo(id, ut, chegada, prioridade);
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
        Processo processoSjf;
        this.index = 1;

        copiarFila();
        ajustaEspera();

        while (true){
            processoSjf = varreProcessos(this.filaAux[0]);

            if(verificaFilaVazia()){
                break;
            }

            try {
                printNaoPreem(processoSjf);
            }catch (Exception e) {printSemProcPronto(processoSjf);}

//            if(processoSjf.tempoRestante <= 0){
//                if(verificaFilaVazia()){
//                    break;
//                }else{
//                    printSemProcPronto(processoSjf);
//                }
//            }else {
//                printNaoPreem(processoSjf);
//            }
        }
        calcularTempoMedio();
        exibirResultos();
    }

    public void sjfPreem() throws CloneNotSupportedException {
        copiarFila();
        Processo p;
        this.index = 1;

        ajustaEspera();

        while (true){
            p = varreProcessos(this.filaAux[0]);

            if(verificaFilaVazia()){
                break;
            }

            try {
                printPreem(p);
            }catch (Exception e) {printSemProcPronto(p);}

//            if(processSjfPrem.tempoRestante == 0){
//                if(verificaFilaVazia()){
//                    break;
//                }else{
//                    printSemProcPronto(processSjfPrem);
//                }
//            }else{
//                printPreem(processSjfPrem);
//            }
        }
        calcularTempoMedio();
        exibirResultos();
    }

    public void prioridade() throws CloneNotSupportedException {
        this.index = 1;
        Processo pEx;

        copiarFila();
        ajustaEspera();

        while(true){
            pEx = maiorPrioridade(this.filaAux[0]);

            if(verificaFilaVazia()){
                break;
            }

            try {
                printNaoPreem(pEx);
            }catch (Exception e) {printSemProcPronto(pEx);}


//            if(verificaFilaVazia()){
//                break;
//            }else{
//                printNaoPreem(pEx);
//            }
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
            }

            try {
                printPreem(pEx);
            }catch (Exception e) {printSemProcPronto(pEx);}

//            if(verificaFilaVazia()){
//                break;
//            }else{
//                printPreem(pEx);
//            }
        }
        calcularTempoMedio();
        exibirResultos();
    }

    public void robin() throws CloneNotSupportedException {
        this.index = 1;
        int ciclo = 8;
        this.passo = 0;

        copiarFila();

        while (true){

            try{
                printRobin(ciclo);
            }catch(Exception e){
                break;
            }
//            if(verificaFilaVazia()){
//                break;
//            }else{
//                printRobin(ciclo);
//            }
            if (this.passo >= filaAux.length) passo = 0;
        }
        calcularTempoMedio();
        exibirResultos();
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
        System.out.println("Tempo total de execução: " + (this.index - 1));
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
    public void printRobin(int ciclo){
        Processo p = primeiroValido();

        for(int i = 0; i < ciclo; i++){
            if(p.tempoRestante>0){
                printPreem(p);
            }else break;
        }
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

        if(p==null){
            for (Processo pf : filaAux) {
                pf.tempoEsp += 1;
            }
        }else {
            for (Processo pf : filaAux) {
                if (!pf.id.equals(p.id) && pf.tempoRestante > 0) pf.tempoEsp += 1;
            }
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

    public boolean processoPronto(Processo p){
        if ((p.tempoRestante > 0) && (p.tempoDeChegada <= this.index)) return true;
        else return false;
    }

    public Processo maiorPrioridade(Processo p){
        for(Processo pAux : this.filaAux){
            if(processoPronto(pAux)) {
                if ((p.tempoRestante == 0) ||
                        (pAux.prioridade > p.prioridade) ||
                        (p.tempoDeChegada > this.index)) {
                    p = pAux;
                }
            }
        }
        if (processoPronto(p)) return p;
        else return null;
    }
    public Processo primeiroValido() {
        for(;this.passo < filaAux.length; this.passo++){
            Processo p = filaAux[this.passo];
            if(p.tempoRestante > 0){passo++; return p;}
        }
        return null;
    }

    public Processo validaProcessos(Processo p, Processo p1){
        if(processoPronto(p)){
            if ((p.tempoRestante < p1.tempoRestante) ||
                    (p1.tempoRestante == 0) ||
                    (p1.tempoDeChegada > this.index)){
                return p;
            }else return p1;
        }else return p1;
    }
    public Processo varreProcessos(Processo proc) {
        for (Processo p : this.filaAux) {
            proc = validaProcessos(p, proc);
        }
        if (processoPronto(proc)) return proc;
        else return null;
    }
    public boolean verificaFilaVazia(){
        for(Processo p : filaAux){
            if(p.tempoRestante > 0){
                return false;
            }
        }
        return true;
    }

}