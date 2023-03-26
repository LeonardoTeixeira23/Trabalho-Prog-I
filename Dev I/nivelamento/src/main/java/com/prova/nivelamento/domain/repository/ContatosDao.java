package com.prova.nivelamento.domain.repository;

import com.prova.nivelamento.domain.entity.Contato;
//import org.springframework.data.annotation.Transient;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;

//@RepositoryRestResource(collectionResourceRel = "contato", path = "contato")
public interface ContatosDao extends JpaRepository<Contato, Integer> {
//    @Query("SELECT c FROM Contato AS c LEFT JOIN FETCH c.telefones")
//    Contato findContatoFechTelefone();

//    @Query("SELECT c.id, c.nome, c.email, ")
//    Contato findContatoFechTelefone;
}


//###############JPA NA MÃO###################################
//
//    @Autowired
//    private EntityManager entityManager;
//
//    @Transactional
//    @GetMapping("/salvar")
//    public Contato salvar(Contato contato){
//        entityManager.persist(contato);
//        return contato;
//    }
//
//    @Transactional
//    public Contato atualizar(Contato contato){
//        entityManager.merge(contato);
//        return contato;
//    }
//
//    @Transactional
//    public void deletar(Contato contato){
////        if (entityManager.contains())
//        entityManager.remove(contato);
//    }
//
//    @Transactional
//    public void deletar(int id){
//        Contato contato = entityManager.find(Contato.class, id);
//        if (contato != null) {
//            deletar(contato);
//        } else {
//            System.out.println("Contado não encontrado");
//        }
//
//
//    }
//
//    @Transactional(readOnly = true)
//    public List<Contato> buscaPorNome(String nome){
//        String jpql = "SELECT c FROM Contato AS c WHERE c.nome LIKE :nome";
//        TypedQuery<Contato> query = entityManager.createQuery(jpql, Contato.class);
//        query.setParameter("nome", "%" + nome + "%");
//        return  query.getResultList();
//    }
//
//    @Transactional
//    public List<Contato> obterTodos(){
//        return entityManager
//                .createQuery("FROM Contato", Contato.class)
//                .getResultList();
//    }


//###############JDBC#########################################
//
//
//    private static String INSERT = "INSERT INTO contato (nome, email) VALUES (?,?)";
//    private static String SELECT_ALL = "SELECT * FROM contato";
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    public Contato salvar(Contato contato){
//        jdbcTemplate.update(INSERT, new Object[]{contato.getNome(), contato.getEmail()});
//        return contato;
//    }
//
//    public List<Contato> obterTodos(){
//        return jdbcTemplate.query(SELECT_ALL, new RowMapper<Contato>() {
//            @Override
//            public Contato mapRow(ResultSet rs, int rowNum) throws SQLException {
//                int id = rs.getInt("id");
//                String nome = rs.getString("nome");
//                String email = rs.getString("email");
//                return new Contato(nome, email);
//            }
//        });
//    }
