package br.sicredi.springJpaAirbnb.dto;

import br.sicredi.springJpaAirbnb.models.data.TiposImovel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ImovelDto {
    private String cidade;
    private double valor;
    private TiposImovel tipo;
}
