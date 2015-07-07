package abstractfactory;

public class Main {
	public void static main(String[] args) {
		UIFactory factory = getUIFactory();

		TextField tf = factory.createTextField();
		Label l = factory.createLabel();
		ComboBox cb = factory.createComboBox();

		System.out.println(tf.getClass().getSimpleName());
		System.out.println(l.getClass().getSimpleName());
		System.out.println(cb.getClass().getSimpleName());
	}
	
	public static UIFactory getUIFactory() {
		if(System.getProperty("os.name").equals("Mac OS X")) {
			return new OSXUIFactory();
		} else {
			return new WindowsUIFactory();
		}
	}
}
