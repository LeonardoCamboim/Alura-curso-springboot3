package med.voli.api.paciente;

import med.voli.api.endereco.DadosEndereco;

public record CadastroDadosPaciente(String nome, String email, String telefone, String cpf, DadosEndereco endereco) {
}
