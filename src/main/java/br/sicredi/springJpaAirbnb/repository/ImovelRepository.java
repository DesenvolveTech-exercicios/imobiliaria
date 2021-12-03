package br.sicredi.springJpaAirbnb.repository;

import br.sicredi.springJpaAirbnb.models.Imovel;
import br.sicredi.springJpaAirbnb.models.data.TiposImovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImovelRepository extends JpaRepository<Imovel, Long>{
   List<Imovel> findByTipo(TiposImovel tipo);
}