package br.com.alura.codechella.domain.evento;

import br.com.alura.codechella.domain.ingresso.TipoIngresso;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Evento {
    private UUID uuid;
    private Categoria categoria;
    private String descricao;
    private LocalDateTime data;
    private Endereco endereco;
    private List<TipoIngresso> tiposIngresso = new ArrayList<>();

    public Evento(Categoria categoria, String descricao, LocalDateTime data, Endereco endereco) {
        this.categoria = categoria;
        this.descricao = descricao;
        this.data = data;
        this.endereco = endereco;

        gerarUUID();
    }

    private void gerarUUID() {
        this.uuid = UUID.randomUUID();
    }

    public void adicionaTipoIngresso(TipoIngresso tipoIngresso) {
        this.tiposIngresso.add(tipoIngresso);
    }

    public void aumentaNumeroDeIngressosPorTipo() {

    }

    public UUID getUuid() {
        return uuid;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public List<TipoIngresso> getTiposIngresso() {
        return tiposIngresso;
    }
}
