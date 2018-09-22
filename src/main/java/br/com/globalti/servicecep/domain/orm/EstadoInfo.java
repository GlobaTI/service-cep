package br.com.globalti.servicecep.domain.orm;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class EstadoInfo {
    private String nome;
    private String codigoIbge;
    private String areaKm2;
}
