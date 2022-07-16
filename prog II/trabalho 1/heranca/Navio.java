package heranca;

public class Navio extends Maritimo {
    private String nome;
    private String capiao;
    
    public String getCapiao() {
        return capiao;
    }

    public void setCapiao(String capiao) {
        this.capiao = capiao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void trocarCapitao(String capitao) {
        setCapiao(capiao);
    }

    public void info() {
        super.info();
        System.out.println("Nome da embarção: " + getNome() + "\n" +
                            "Nome do capitão: " + getCapiao() + "\n");
    }
}