package week3.day2homeassignments;

public class APIClient {

	
	public void sendRequest(String endPoint) {
		System.out.println(endPoint);	
	}
	
	public void sendRequest(String endPoint, String requestBody, boolean requestStatus) {
		System.out.println(endPoint + requestBody + requestStatus);

	}
	public static void main(String[] args) {
		APIClient printData = new APIClient();
		printData.sendRequest("testleaf");
		printData.sendRequest("testleaf", "crendentials", false);

	}

}
