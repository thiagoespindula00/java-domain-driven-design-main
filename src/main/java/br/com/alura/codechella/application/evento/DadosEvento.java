package br.com.alura.codechella.application.evento;

import br.com.alura.codechella.domain.evento.Categoria;
import br.com.alura.codechella.application.ingresso.DadosCadastroTipoIngresso;

import java.time.LocalDateTime;
import java.util.List;

public record DadosEvento(
        Long id,
        Categoria categoria,
        String descricao,
        DadosEndereco endereco,
        LocalDateTime data,
        List<DadosCadastroTipoIngresso> tipoIngressos
) {
}
