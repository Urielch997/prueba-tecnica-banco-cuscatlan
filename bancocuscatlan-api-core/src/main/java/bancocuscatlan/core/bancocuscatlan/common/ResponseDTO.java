package bancocuscatlan.core.bancocuscatlan.common;

public class ResponseDTO {
    private String status;
    private String message;
    private Object result;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public ResponseDTO() {
    }

    public ResponseDTO(String status, String message, Object result) {
        this.status = status;
        this.message = message;
        this.result = result;
    }

    private ResponseDTO(ResponseDTOBuilder responseDTOBuilder){
        this.message = responseDTOBuilder.message;
        this.status = responseDTOBuilder.status;
        this.result = responseDTOBuilder.result;
    }

    public static class ResponseDTOBuilder{
        private String status;
        private String message;
        private Object result;

        public ResponseDTOBuilder status(String status){
            this.status = status;
            return this;
        }

        public ResponseDTOBuilder message(String message){
            this.message = message;
            return this;
        }

        public ResponseDTOBuilder result(Object result){
            this.result = result;
            return this;
        }

        public ResponseDTO build(){
            return new ResponseDTO(this);
        }
    }

    public static ResponseDTOBuilder builder(){
        return new ResponseDTOBuilder();
    }
}
