package br.com.alura.forum.controller.dataTransferObject;

import java.time.LocalDateTime;

import br.com.alura.forum.modelo.Resposta;

public class RespostaDto {

    private Long id;
    private String mensagem;
    private LocalDateTime dataDeCriação;
    private String nomeAutor;

    public RespostaDto(Resposta resposta) {
        this.id = resposta.getId();
        this.mensagem = resposta.getMensagem();
        this.dataDeCriação = resposta.getDataCriacao();
        this.nomeAutor = resposta.getAutor().getNome();
    }

    public Long getId() {
        return id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataDeCriação() {
        return dataDeCriação;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }
    
}
