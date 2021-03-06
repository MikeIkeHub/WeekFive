package weekfive;

public class App {

	public static void main(String[] args) {
		Logger testAsterisk = new AsteriskLogger();
		testAsterisk.Log("Hello");
		testAsterisk.Error("Hello");
		
		Logger testSpaced = new SpacedLogger();
		testSpaced.Log("Testing");
		testSpaced.Error("Testing");
		
	}

}