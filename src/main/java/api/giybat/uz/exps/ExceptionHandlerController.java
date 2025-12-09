package api.giybat.uz.exps;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController extends RuntimeException {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handle(AppBadException e){
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
