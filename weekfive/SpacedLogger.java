package weekfive;

public class SpacedLogger implements Logger {
	
	public void Log(String str) {	
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
	}
	
	public void Error(String str) {
		System.out.print("\nERROR:");
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
	}
}