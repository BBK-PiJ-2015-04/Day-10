public class Main {
	
	public static void main(String[] args) {
		
		Lecturer sergio = new Lecturer("Dr Sergio Gutierrez-Santos");
		
		System.out.println("Name: " + sergio.getName());
		
		sergio.teach("Programming in Java");
		
		sergio.doResearch("Higher Quantum Supercomputing in N Dimensions!!!");
		
	}
}