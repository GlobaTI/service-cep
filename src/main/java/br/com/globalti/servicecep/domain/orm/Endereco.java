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
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
}
