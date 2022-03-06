package br.com.alura.forum.controller.dataTransferObject;

public class ErroDeFormularioDto {
    
    private String campo;
    private String mensagemDeErro;

    public ErroDeFormularioDto(String campo, String mensagemDeErro){
        this.campo = campo;
        this.mensagemDeErro = mensagemDeErro;
    }

    public String getCampo() {
        return campo;
    }

    public String getMensagemDeErro() {
        return mensagemDeErro;
    }
}
