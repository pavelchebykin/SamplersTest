package sample.classloader.classes.impl;

import sample.classloader.classes.IJarSample;

public class JarSample implements IJarSample {
    public JarSample() {
        System.out.println("JarSample::JarSample()");
    }

	@Override
	public void demo(String str) {
        JarClass2Samle s = new JarClass2Samle();
        s.demo();
        System.out.println("JarSample::demo(String str)" + " classloader:" + getClass().getClassLoader().getClass().getName());

        System.out.println(str);
	}
}
