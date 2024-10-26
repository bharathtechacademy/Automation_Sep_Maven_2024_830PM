package interfacePack;

public interface InterfaceClass1 {
	
	//Interface is 100% abstract class

	abstract void launchBrowserAndLoginIntoApplication(String browser);

	public abstract void login(String username, String password);

	void logoutFromAppAndCloseBrowser();

	double getAccountBalance();
	
//	public void getDarkTheme();
	
	public default void  getDarkTheme() {
		//get dark theme code
	}
	
	public static void  openNewWindow() {
		//get dark theme code
	}
	
//	private void printName() {
//		System.out.println("Bharath");
//	}

}
