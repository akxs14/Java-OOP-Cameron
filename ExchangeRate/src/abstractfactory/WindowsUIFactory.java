package abstractfactory;

public class WindowsUIFactory extends UIFactory {
	public TextField createTextField() {
		return new WindowsTextField();
	}
	
	public Label createLabel() {
		return new WindowsLabel();
	}
	
	public ComboBox createComboBox() {
		return new WindowsComboBox();
	}
}
