package br.edu.ifes.astro_api.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifes.astro_api.Dados;
import br.edu.ifes.astro_api.Service.RetornaDadosService;

@RestController
@RequestMapping("/buscarDados")
public class RetornaDadosController {
    
    RetornaDadosService service = new RetornaDadosService();

    @GetMapping("/{nickname}/{plano}")
    public Dados buscarDados(
            @PathVariable String nickname,
            @PathVariable String plano) {


           Dados dados = service.buscarDados(nickname, plano);
                

            

        return dados;
    }
}
