package week3.day2homeassignments;

public class TextField extends WebElement{

	public void getText() {
		System.out.println("getText");
	}
	
	public static void main(String[] args) {
	TextField textField = new TextField();
	textField.click();
	textField.setText("TestLeaf");
	textField.getText();
	}

}
