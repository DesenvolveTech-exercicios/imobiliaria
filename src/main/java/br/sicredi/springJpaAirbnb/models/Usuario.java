package br.sicredi.springJpaAirbnb.models;


import br.sicredi.springJpaAirbnb.models.data.TiposUsuario;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "users")
public class user {
    @Id
    private String username;
    @NonNull
    private String password;
    @NonNull
    private Boolean enabled;
}
