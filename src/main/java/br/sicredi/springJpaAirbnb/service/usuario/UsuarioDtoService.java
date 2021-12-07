package br.sicredi.springJpaAirbnb.service.usuario;

import br.sicredi.springJpaAirbnb.models.user;
import br.sicredi.springJpaAirbnb.dto.UsuarioDto;

public class UsuarioDtoService {
    public user createUsuario(UsuarioDto usuarioDto){
        return new user(usuarioDto.getUsuario(), usuarioDto.getSenha(), usuarioDto.getTipo());
    }
}
