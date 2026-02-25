package integration.interfaces;

public interface ICommercialMembershipService {

	/**
	 * Allows PU to pass an application for a commercial member to SA, string is a JSON containing details including company registration number, details on the Company Director(s), type of business, address, email address, etc.
	 * @param candidate
	 */
	boolean requestMembership(String[] candidate);

}