package abstractfactory;

public abstract class UIFactory {
	public abstract TextField createTextField();
	public abstract Label createLabel();
	public abstract ComboBox createComboBox();
}
