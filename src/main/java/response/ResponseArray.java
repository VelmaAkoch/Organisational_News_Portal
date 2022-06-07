package response;

import java.util.List;

public class ResponseArray {
    private int status;
    private String message;
    private List<Object> data;

    public ResponseArray(String message, List<Object> data) {
        this.message = message;
        this.data = data;
    }
}
