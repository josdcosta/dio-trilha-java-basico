public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException() {
    }

    public ParametrosInvalidosException(String message) {
        super(message);
    }

    public ParametrosInvalidosException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParametrosInvalidosException(Throwable cause) {
        super(cause);
    }

    public ParametrosInvalidosException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
