public class MobilePhone extends OldPhone {
	
	private int[] lastTenNumbers = new int[10];
	
	public void ringAlarm(String number) {
		System.out.println("Ring alarm " + number + "...");
	}
	
	public void playGame(String number) {
		System.out.println("Play game " + number + "...");
	}
	
	public void printLastNumbers() {
		for (int i = 0; i < 10; i++) {
			System.out.println(lastTenNumbers[i]);
		}
	}

}