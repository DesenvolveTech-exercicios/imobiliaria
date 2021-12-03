package br.sicredi.springJpaAirbnb.models;

import br.sicredi.springJpaAirbnb.models.data.TiposImovel;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String cidade;
    @NonNull
    private double valor;
    @NonNull
    private TiposImovel tipo;
}
