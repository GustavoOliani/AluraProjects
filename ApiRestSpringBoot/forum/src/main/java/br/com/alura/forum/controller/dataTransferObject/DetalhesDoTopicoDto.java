package br.com.alura.forum.controller.dataTransferObject;

import java.time.LocalDateTime;

import br.com.alura.forum.modelo.StatusTopico;
import br.com.alura.forum.modelo.Topico;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DetalhesDoTopicoDto {

    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriação;
    private StatusTopico status;
    private List<RespostaDto> respostas;
    private String NomeAutor;

    public DetalhesDoTopicoDto(Topico topico) {
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriação = topico.getDataCriacao();
        this.status = topico.getStatus();
        this.respostas = new ArrayList<>();
        this.NomeAutor = topico.getAutor().getNome();
        this.respostas.addAll(topico.getRespostas().stream().map(RespostaDto::new).collect(Collectors.toList()));
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataCriação() {
        return dataCriação;
    }

    public StatusTopico getStatus() {
        return status;
    }

    public List<RespostaDto> getRespostas() {
        return respostas;
    }

    public String getNomeAutor() {
        return NomeAutor;
    }
}
