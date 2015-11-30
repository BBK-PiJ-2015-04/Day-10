public class MobilePhone extends OldPhone {
	
	private String[] lastTenNumbers = new String[10];
	
	@Override
	public void call(String number) {
		super.call(number);
		int currentLength = lastTenNumbers.length;
		if(currentLength == 10) {
			String[] newNumbers = new String[10];
			for(int i = 0; i < 9; i++) {
				newNumbers[i] = lastTenNumbers[i + 1];
			}
			for(int i = 0; i < 9; i++) {
				lastTenNumbers[i] = newNumbers[i];
			}
			lastTenNumbers[9] = number;
		}
		else {
			lastTenNumbers[currentLength - 1] = number;
		}
	}
	
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
