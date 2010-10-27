package sample.classloader;

import java.lang.reflect.InvocationTargetException;

import sample.classloader.classes.IJarSample;

public class TestClassLoader {
	public static void main(String[] args) {		
		// Создаем загрузчик
		JarClassLoader jarClassLoader = new JarClassLoader("beq.jar", "sample.classloader.classes.impl");
		
		// Загружаем класс
		Class<?> clazz = null;
		try {
			clazz = jarClassLoader.loadClass("JarSample");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// Создаем экземпляр класса
		IJarSample sample = null;
		try {
			sample = (IJarSample) clazz.newInstance();
	        System.out.println("invoke: demo" + clazz.getMethod("demo", String.class).invoke(sample, "Test refleaction"));
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		sample.demo("Test");		
	}
}
