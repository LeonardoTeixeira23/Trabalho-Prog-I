import java.sql.*;


public class Endereco {


    private int id;
    private String logradouro;
    private String bairro;
    private int cep;
    private String cidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public void inserir () throws Exception {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/diariodeclasse", "root", "root");

            pstmt = con.prepareStatement("insert into endereco (logradouro, bairro, cep, cidade) value (?, ?, ?, ?)");
            pstmt.setString(1, this.logradouro);
            pstmt.setString(2, this.bairro);
            pstmt.setInt(3, this.cep);
            pstmt.setString(4, this.cidade);


            pstmt.execute();
        } catch (Exception e) {
            throw e;
        } finally {
            if (pstmt != null) pstmt.close();
            if (con != null) con.close();
        }
    }

    public void atualizar() throws Exception {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/diariodeclasse", "root", "root");

            pstmt = con.prepareStatement("update endereco set logradouro = ?, bairro = ?, cep = ?, cidade = ? where id = ?");
            pstmt.setString(1, this.logradouro);
            pstmt.setString(2, this.bairro);
            pstmt.setInt(3, this.cep);
            pstmt.setString(4, this.cidade);
            pstmt.setInt(5, this.id);

            pstmt.execute();
        } catch (Exception e) {
            throw e;
        } finally {
            if (pstmt != null) pstmt.close();
            if (con != null) con.close();
        }
    }

    public void excluir() throws Exception {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/diariodeclasse", "root", "root");

            pstmt = con.prepareStatement("delete from endereco where id = ?");
            pstmt.setInt(1, this.id);

            pstmt.execute();
        } catch (Exception e) {
            throw e;
        } finally {
            if (pstmt != null) pstmt.close();
            if (con != null) con.close();
        }
    }

    public void consultar() throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/diariodeclasse", "root", "root");

            pstmt = con.prepareStatement("select * from endereco");

            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("\nID: " + rs.getInt("id") +
                                   "\nLogradouro: " + rs.getString("logradouro") +
                                   "\nBairro: " + rs.getString("bairro") +
                                   "\nCEP: " + rs.getString("cep") +
                                   "\nCidade: " + rs.getString("cidade"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (pstmt != null) pstmt.close();
            if (con != null) con.close();
        }
    }

}
