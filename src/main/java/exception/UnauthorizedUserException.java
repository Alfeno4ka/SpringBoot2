package exception;

/**
 * Исключение, выбрасываемое при отсутствии привелегий.
 */
public class UnauthorizedUserException extends RuntimeException {

    public UnauthorizedUserException(String msg) {
        super(msg);
    }
}
