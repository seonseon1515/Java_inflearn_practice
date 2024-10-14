package enumeration.test.http;

public enum HttpStatus {
    OK(20,"OK"), BAD_FOUND(400, "Bad Request"), NOT_FOUND(404, "Not Found"), INTERNAL_SERVER_ERROR(500,"Internal Server Error");
    private final int code;
    private final String message;
    static boolean isSuccess;

    HttpStatus(int code, String message) {
        this.message = message;
        this.code = code;
    }

     static public HttpStatus findByCode(int httpCodeInput) {
         if (httpCodeInput == 20) {
             return OK;
         } else if (httpCodeInput == 400) {
             return BAD_FOUND;
         } else if (httpCodeInput == 404) {
             return NOT_FOUND;
         } else if (httpCodeInput == 500) {
             return INTERNAL_SERVER_ERROR;
         } else if (httpCodeInput >= 200 && httpCodeInput < 300) {
             return OK;
         } else {
             return NOT_FOUND;
         }
     }

     public boolean isSuccess(){
        if(this.code == 20){
            return isSuccess=true;
        } else {
            return isSuccess=false;
        }
     }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
