package sample.classloader.classes.impl;

public class JarClass2Samle{
    public JarClass2Samle() {
        System.out.println("JarClass2Samle::JarClass2Samle()");
    }

	public void demo() {
        System.out.println("JarClass2Samle::demo()" + " classloader:" + getClass().getClassLoader().getClass().getName());     
	}
}
