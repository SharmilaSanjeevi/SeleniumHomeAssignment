package week3.day2homeassignments;

public class RadioButton extends Button{

	public void selectRadioButton() {
		System.out.println("Select the RadioButton");
	}
	
	public static void main(String[] args) {
		RadioButton radioButton = new RadioButton();
		radioButton.click();
		radioButton.setText("TestLeaf");
		radioButton.selectRadioButton();
		radioButton.submit();	
	}
}
