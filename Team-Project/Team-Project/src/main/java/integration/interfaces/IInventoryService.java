package integration.interfaces;
import java.util.List;

public interface IInventoryService {

	List getCatalogue();

	/**
	 * 
	 * @param itemID
	 * @param quantity
	 */
	String reserveItemsforPurchase(String[] itemID, int[] quantity);

	/**
	 * 
	 * @param reservationID
	 */
	boolean cancelReservedItems(String reservationID);

	/**
	 * 
	 * @param reservationID
	 */
	String deductStock(String reservationID);

}