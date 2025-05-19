package pe.edu.cibertec.Starbucks_Clone.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.Date;

@Builder
@Data
public class ErrorMessage {
    private Integer statusCode;
    private Date dateError;
    private String message;
    private String description;

}
