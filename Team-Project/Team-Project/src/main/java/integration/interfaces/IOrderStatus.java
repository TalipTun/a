package integration.interfaces;

public interface IOrderStatus {

	/**
	 * Allows CA staff to see status of a specific order made via the PU portal (status can be shipping, in transit or delivered)
	 * @param orderID
	 */
	String getOrderStatus(String orderID);

}