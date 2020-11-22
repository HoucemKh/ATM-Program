import java.io.IOException;

public class Main extends OptionMenu {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to ATM Machine");
		OptionMenu object = new OptionMenu();
		
		object.login();
		object.getAccountType();
}
}
