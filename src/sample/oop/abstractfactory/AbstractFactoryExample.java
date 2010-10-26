package sample.oop.abstractfactory;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        new Application(createOsSpecificFactory());
    }
 
    public static GUIFactory createOsSpecificFactory() {
        int sys = readFromConfigFile("OS_TYPE");
        if (sys == 0) {
            return new WinFactory();
        } else {
            return new OSXFactory();
        }
    }

	private static int readFromConfigFile(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
    
}
