package info.cognit.dvdrental.dto;

import lombok.Data;

@Data
public class Response<T> {
    T body;
    ResponseStatus status;
    String message;

    //DTO/POJO plain old java object

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
