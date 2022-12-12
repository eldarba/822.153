package app.core.exceptions;

public class LibraryException extends Exception {

	private static final long serialVersionUID = 1L;

	public LibraryException() {
		super();
	}

	public LibraryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public LibraryException(String message, Throwable cause) {
		super(message, cause);
	}

	public LibraryException(String message) {
		super(message);
	}

	public LibraryException(Throwable cause) {
		super(cause);
	}

}
