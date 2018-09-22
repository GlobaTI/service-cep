package br.com.globalti.servicecep.domain.orm;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String cep;
    private String logadouro;
    private String bairro;
    private String cidade;
    private String estado;
    private CidadeInfo cidadeInfo;
//    private EstadoInfo estadoInfo;
}
