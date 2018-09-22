package br.com.globalti.servicecep.service;

import br.com.globalti.servicecep.domain.orm.Endereco;
import br.com.globalti.servicecep.exception.BadRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class EnderecoServiceFallback implements EnderecoService {
    @Override
    public Endereco getCep(String cep) {
        throw new BadRequest("Endereço não encontrado");
    }
}
