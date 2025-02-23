package bancocuscatlan.products.bancocuscatlan.adapter.exception;

import bancocuscatlan.products.bancocuscatlan.common.ConstantsCommon;
import bancocuscatlan.products.bancocuscatlan.common.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class ControllerAdviceHandler {
    
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ResponseDTO> handlerMethodArgumentTypeException(MethodArgumentTypeMismatchException ex, WebRequest request){
        String parameterName = ex.getName();
        String invalidValue = ex.getValue().toString();
        String errorMessage = String.format("The value '%s' is invalid for param '%s'",parameterName,invalidValue);
        ResponseDTO responseDTO = ResponseDTO.builder()
                .message(errorMessage)
                .status(ConstantsCommon.STATUS_ERROR)
                .result(null)
                .build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseDTO);
    }
}
