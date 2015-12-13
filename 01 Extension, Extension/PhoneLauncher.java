public class PhoneLauncher {

	public static void main(String[] args) {

		PhoneLauncher launcher = new PhoneLauncher();
		
		launcher.launch();
		
	}

	public void launch() {
		
		SmartPhone iPhone = new SmartPhone();
		
		iPhone.call("245-1111");
		iPhone.call("245-1111");
		iPhone.call("245-1234");
		iPhone.call("245-1111");
		iPhone.call("245-1111");
		iPhone.call("1111");
		iPhone.printLastNumbers();
		
		
	}

}
