
public class NotEnoughFundsException extends RuntimeException {
	// public NotEnoughFundsException(Integer amount, Integer balance) {

	public NotEnoughFundsException(Integer amount, Integer balance) {
		// TODO Auto-generated constructor stub

		super("Attempted to withdraw " + amount + " with a balance of " + balance);
	}

}
