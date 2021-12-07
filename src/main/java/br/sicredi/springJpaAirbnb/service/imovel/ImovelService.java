package br.sicredi.springJpaAirbnb.service.imovel;

import br.sicredi.springJpaAirbnb.models.Imovel;
import br.sicredi.springJpaAirbnb.models.data.TiposImovel;
import br.sicredi.springJpaAirbnb.dto.ImovelDto;
import br.sicredi.springJpaAirbnb.repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ImovelService {
    @Autowired
    ImovelRepository imovelRepository;

    public List<Imovel> findAll(TiposImovel tipo) {
        return (tipo != null)?imovelRepository.findByTipo(tipo):imovelRepository.findAll();
    }

    public void save(ImovelDto imovelDto) {
        ImovelDtoService dtoService = new ImovelDtoService();
        imovelRepository.save(dtoService.createUsuario(imovelDto));
    }
}
