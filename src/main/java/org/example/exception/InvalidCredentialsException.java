package exception;

/**
 * Исключение, выбрасываемое при неверных данных пользователя.
 */
public class InvalidCredentialsException extends RuntimeException {

    public InvalidCredentialsException(String msg) {
        super(msg);
    }
}
