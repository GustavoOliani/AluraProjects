package br.com.alura.forum.controller.dataTransferObject;

import java.time.LocalDateTime;

import org.springframework.data.domain.Page;

import br.com.alura.forum.modelo.Topico;

//DTo = Data transfer object

public class TopicoDto {
    
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;

    public TopicoDto(Topico topico){

        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();
    }


    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public Long getId(){
        return this.id;
    }

    public static Page<TopicoDto> converter(Page<Topico> topicos){
        return topicos.map(TopicoDto::new);
    }
}
