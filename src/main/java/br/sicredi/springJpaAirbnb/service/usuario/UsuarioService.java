package br.sicredi.springJpaAirbnb.service.usuario;

import br.sicredi.springJpaAirbnb.models.user;
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
        List<user> users = findAll();
        if (users.isEmpty()) return true;
        for(user user : users) {
            if(user.getUsername().equals(usuarioDto.getUsuario())){
                return false;
            }
        }
        return true;
    }

    public List<user> findAll() {
        return usuarioRepository.findAll();
    }

    public Optional<user> findById(Long id) {
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
