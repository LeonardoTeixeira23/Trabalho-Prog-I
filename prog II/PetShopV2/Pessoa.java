import java.util.ArrayList;

public class Pessoa{
    private String nome;
    private long cpf;
    private String endereco;
    private String email;
    private ArrayList<Integer> telefones = new ArrayList<>();
    
    public Pessoa(String nome, long cpf, String endereco, String email, Integer telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefones.add(telefone);
    }
    
    public void addTelefone(Integer telefone){
        this.telefones.add(telefone);
    };
    
    public void info(){
        System.out.print("Nome: " + this.nome + "\n"         +
                         "CPF: " + this.cpf + "\n"           + 
                         "Endereco: " + this.endereco + "\n" +
                         "Email: " + this.email + "\n"       +
                         "Telefone principal: " + telefones.get(0) + "\n");
    }
    
    public void infoTelefones(){
        System.out.println("\n===================================================\n" +
                            "Contatos Do: " + this.nome );
        for(Integer telefone : telefones){
            System.out.println("Telefone: " + telefone);
        }
        System.out.println("===================================================\n"); 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Integer> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<Integer> telefones) {
        this.telefones = telefones;
    }
}