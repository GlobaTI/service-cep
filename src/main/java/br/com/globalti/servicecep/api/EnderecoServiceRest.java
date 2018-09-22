package br.com.globalti.servicecep.api;

import br.com.globalti.servicecep.domain.orm.Endereco;
import br.com.globalti.servicecep.exception.BadRequest;
import br.com.globalti.servicecep.exception.InternalServerError;
import br.com.globalti.servicecep.exception.NotFound;
import br.com.globalti.servicecep.service.EnderecoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("v1/endereco")
public class EnderecoServiceRest {
    private final EnderecoService enderecoService;

    @ApiOperation(value = "Endereço",
            response = Endereco.class,
            notes = "Consulta de endereço")
    @ApiResponses(value= {
            @ApiResponse(
                    code = 400,
                    message ="Bad Request",
                    response = BadRequest.class
            ),
            @ApiResponse(
                    code = 404,
                    message ="Not Found",
                    response = NotFound.class
            ),
            @ApiResponse(
                    code = 500,
                    message ="Internal Error",
                    response = InternalServerError.class
            )
    })

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{cep}")
    public Endereco getEndereco(@PathVariable String cep) {
        return enderecoService.getCep(cep);
    }
}
