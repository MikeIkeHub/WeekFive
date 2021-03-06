package weekfive;

public class AsteriskLogger implements Logger {
	
	public void Log (String str) {
		System.out.println("***" + str + "***");
	}
	public void Error (String str) {
		System.out.println("***ERROR:" + str + "***");
	}
}