package med.voli.api.medico;

import med.voli.api.endereco.DadosEndereco;

public record CadastroDadosMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {


}
