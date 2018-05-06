package br.com.codref.deliveryauth.deliveryauthserver.repository;

import br.com.codref.deliveryauth.deliveryauthserver.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Esse repository será responsável pelas consultas das regras do usuário no banco de dados.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String>{

    Authority findByName(String name);

}