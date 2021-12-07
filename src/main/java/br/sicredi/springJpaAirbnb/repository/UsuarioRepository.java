package br.sicredi.springJpaAirbnb.repository;

import br.sicredi.springJpaAirbnb.models.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<user, Long> {
    Optional<user> findById(@Param("id")Long id);
}
