package br.sicredi.springJpaAirbnb.models;


import br.sicredi.springJpaAirbnb.models.data.TiposUsuario;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String usuario;
    @NonNull
    private String senha;
    @NonNull
    private TiposUsuario tipo;
}