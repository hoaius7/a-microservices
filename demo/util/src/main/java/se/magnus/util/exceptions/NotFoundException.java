package se.magnus.util.exceptions;

public class NotFoundException extends RuntimeException {
	private static final long serialVersionUID = 5588556785365899332L;

	public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundException(Throwable cause) {
        super(cause);
    }
}
