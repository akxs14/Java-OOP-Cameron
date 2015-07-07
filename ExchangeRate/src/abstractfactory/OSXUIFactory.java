package abstractfactory;

public class OSXUIFactory extends UIFactory {
	public TextField createTextField() {
		return new OSXTextField();
	}
	
	public Label createLabel() {
		return new OSXLabel();
	}
	
	public ComboBox createComboBox() {
		return new OSXComboBox();
	}
}
