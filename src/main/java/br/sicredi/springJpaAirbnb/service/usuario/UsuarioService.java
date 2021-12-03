package br.sicredi.springJpaAirbnb.service.usuario;

import br.sicredi.springJpaAirbnb.models.Usuario;
import br.sicredi.springJpaAirbnb.dto.UsuarioDto;
import br.sicredi.springJpaAirbnb.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class UsuarioService {
    @Autowired
    private final UsuarioRepository usuarioRepository;

    public boolean verifyUserExist(UsuarioDto usuarioDto){
        List<Usuario> usuarios = findAll();
        if (usuarios.isEmpty()) return true;
        for(Usuario usuario: usuarios) {
            if(usuario.getUsuario().equals(usuarioDto.getUsuario())){
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
