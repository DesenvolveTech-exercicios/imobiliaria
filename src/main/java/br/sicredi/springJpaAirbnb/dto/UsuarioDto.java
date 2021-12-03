package br.sicredi.springJpaAirbnb.dto;

import br.sicredi.springJpaAirbnb.models.data.TiposUsuario;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto {
    private String usuario;
    private String senha;
    private TiposUsuario tipo;
}
