package br.com.hustik.hmoney.api.event;

import org.springframework.context.ApplicationEvent;

import javax.servlet.http.HttpServletResponse;

public class RecursoCriadoEvent extends ApplicationEvent {

    private HttpServletResponse response;
    private Long codigoRecurso;

    public RecursoCriadoEvent(Object source, HttpServletResponse response, Long codigo) {
        super(source);
        this.response = response;
        this.codigoRecurso = codigo;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public Long getCodigoRecurso() {
        return codigoRecurso;
    }

}
