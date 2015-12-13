public class MobilePhone extends OldPhone {
	
	private String[] lastTenNumbers = new String[10];
	
	public MobilePhone() {
		for(int i = 0; i < 10; i++) {
			lastTenNumbers[i] = "Empty";
		}
	}
	
	@Override
	public void call(String number) {
		super.call(number);
		int i = 0;
		while(!lastTenNumbers[i].equals("Empty") || i < 10) {
			i++;
		}
		if(i == 9) {
			for(int j = 0; j < 9; j++) {
				lastTenNumbers[j] = lastTenNumbers[j + 1];
			}
			lastTenNumbers[9] = number;
		}
		else {
			lastTenNumbers[i] = number;
		}
	}
	
	public void ringAlarm(String number) {
		System.out.println("Ring alarm " + number + "...");
	}
	
	public void playGame(String number) {
		System.out.println("Play game " + number + "...");
	}
	
	public void printLastNumbers() {
		int i = 0;
		while(!lastTenNumbers[i].equals("Empty") || i < 10) {
			i++;
		}
		for (int j = 0; i <= i; j++) {
			System.out.println(lastTenNumbers[j]);
		}
	}

}
