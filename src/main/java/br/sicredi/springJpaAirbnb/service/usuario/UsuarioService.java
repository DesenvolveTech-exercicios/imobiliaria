package br.sicredi.springJpaAirbnb.service.usuario;

import br.sicredi.springJpaAirbnb.models.Usuario;
import br.sicredi.springJpaAirbnb.dto.UsuarioDto;
import br.sicredi.springJpaAirbnb.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public boolean verifyUserExist(UsuarioDto usuarioDto){
        if (findAll().isEmpty()) return true;
        for(Usuario Usuario : findAll()) {
            if(Usuario.getUsuario().equals(usuarioDto.getUsuario())){
                return false;
            }
        }
        return true;
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> findById(Long id) {
        return usuarioRepository.findById(id);
    }

    public void save(UsuarioDto usuarioDto) {
        if(verifyUserExist(usuarioDto)){
            UsuarioDtoService dtoService = new UsuarioDtoService();
            usuarioRepository.save(dtoService.createUsuario(usuarioDto));
        }
    }

    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }
}
