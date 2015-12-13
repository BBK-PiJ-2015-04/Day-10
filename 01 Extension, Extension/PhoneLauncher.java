public class PhoneLauncher {

	public static void main(String[] args) {

		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}

	public void launch() {
		System.out.println("Launch!");
		Phone nokia = new OldPhone();
		nokia.call();
		
		Phone samsung = new MobilePhone();
		samsung.call();
		samsung.findPosition();
		
		OldPhone sony = new SmartPhone();
		
		
		
		// your code creating and using SmartPhone here...
	}

}
