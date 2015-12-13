public class SmartPhone extends MobilePhone {
	
	public void browseWeb(String number) {
		System.out.println("Browse web " + number + "...");
	}
	
	public void findPosition() {
		System.out.println("Phone is located at...");
		System.out.println("Latitude: 51 degrees North");
		System.out.println("Longitude: 1 degree West");
	}

}
