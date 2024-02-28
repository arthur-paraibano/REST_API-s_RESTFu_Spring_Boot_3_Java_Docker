package br.com.erudio.br.com.erudio.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private Date timesDate;
    private String message;
    private String details;

    public ExceptionResponse(Date timesDate, String message, String details) {
        this.timesDate = timesDate;
        this.message = message;
        this.details = details;
    }

    public Date getTimesDate() {
        return timesDate;
    }

    public void setTimesDate(Date timesDate) {
        this.timesDate = timesDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}
