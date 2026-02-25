package integration.interfaces;

public interface IPaymentProcessing {

	/**
	 * 
	 * @param merchantID
	 * @param orderID
	 * @param fullName
	 * @param address
	 * @param cardDetails
	 * @param amount
	 */
	String requestPayment(String merchantID, String orderID, String fullName, String address, String[] cardDetails, double amount);

}