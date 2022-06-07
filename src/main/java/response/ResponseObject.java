package response;

public class ResponseObject {
    private int status;
    private String message;
    private Object data;

    public ResponseObject(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
