package bancocuscatlan.products.bancocuscatlan.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CreateResponse {
    public static ResponseEntity<ResponseDTO> response(Object data){
        var response =  ResponseDTO.builder()
                .message(ConstantsCommon.MESSAGE_OK)
                .status(ConstantsCommon.STATUS_OK)
                .result(data)
                .build();

        return new ResponseEntity<ResponseDTO>(response,HttpStatus.OK);
    }
}
