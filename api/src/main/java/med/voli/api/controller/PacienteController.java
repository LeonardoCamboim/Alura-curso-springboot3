package med.voli.api.controller;

import med.voli.api.paciente.CadastroDadosPaciente;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("paciente")
public class PacienteController {


    public void cadastrar(@RequestBody CadastroDadosPaciente dados) {
        System.out.println(dados);

    }

}
