package pe.edu.cibertec.Starbucks_Clone.exception;

public class BadCredentialsException extends RuntimeException{

    public BadCredentialsException(String message){
        super(message);
    }
}
