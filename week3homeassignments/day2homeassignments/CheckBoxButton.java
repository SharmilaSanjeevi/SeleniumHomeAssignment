package week3.day2homeassignments;

public class CheckBoxButton extends Button{

	public void clickCheckButton() {
		System.out.println("Click the CheckBox Button");
	}
	
	public static void main(String[] args) {
		CheckBoxButton checkBox = new CheckBoxButton();
		checkBox.click();
		checkBox.setText("TestLeaf");
		checkBox.clickCheckButton();
		checkBox.submit();
	}

}
