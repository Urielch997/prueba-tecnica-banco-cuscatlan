package bancocuscatlan.core.bancocuscatlan.adapter.persistence.exception;

import bancocuscatlan.core.bancocuscatlan.common.ConstantsCommon;
import bancocuscatlan.core.bancocuscatlan.common.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;


@RestControllerAdvice
public class ControllerAdviceHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ResponseDTO> NotFoundException(NotFoundException ex, WebRequest request){

        ResponseDTO responseDTO = ResponseDTO.builder()
                .message(ex.getMessage())
                .status(ConstantsCommon.STATUS_ERROR)
                .result(null)
                .build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseDTO);
    }

    @ExceptionHandler(PaymentException.class)
    public ResponseEntity<ResponseDTO> PaymentException(PaymentException ex, WebRequest request){

        ResponseDTO responseDTO = ResponseDTO.builder()
                .message(ex.getMessage())
                .status(ConstantsCommon.STATUS_ERROR)
                .result(null)
                .build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseDTO);
    }
}
