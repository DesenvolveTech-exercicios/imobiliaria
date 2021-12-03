package br.sicredi.springJpaAirbnb.service.imovel;

import br.sicredi.springJpaAirbnb.models.Imovel;
import br.sicredi.springJpaAirbnb.dto.ImovelDto;

public class ImovelDtoService {
    public Imovel createUsuario(ImovelDto imovelDto){
        return new Imovel(imovelDto.getCidade(),imovelDto.getValor(),imovelDto.getTipo());
    }
}
