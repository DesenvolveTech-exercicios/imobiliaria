package br.sicredi.springJpaAirbnb.service.usuario;

import br.sicredi.springJpaAirbnb.models.Usuario;
import br.sicredi.springJpaAirbnb.dto.UsuarioDto;

public class UsuarioDtoService {
    public Usuario createUsuario(UsuarioDto usuarioDto){
        return new Usuario(usuarioDto.getUsuario(), usuarioDto.getSenha(), usuarioDto.getTipo());
    }
}
