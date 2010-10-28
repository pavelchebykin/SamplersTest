package sample.plugin.loader;
import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;


public class Boostrap {

	public static void main(String[] args) throws Exception {
		//System.setSecurityManager(new SecurityManager());
		File commonsDir = new File("commons");

		File[] entries = commonsDir.listFiles();
		URL[] urls = new URL[entries.length];

		for (int i = 0; i < entries.length; i++) {
			urls[i] = entries[i].toURI().toURL();
		}

		URLClassLoader commonsLoader = new URLClassLoader(urls, null);
		System.out.println("commonsLoader:" + commonsLoader.getClass());

		URL binDirURL = new File("bin").toURI().toURL();
		URLClassLoader appLoader = new URLClassLoader(new URL[]{binDirURL}, commonsLoader);
		System.out.println("appLoader:" + appLoader.getClass());

		Class<?> appClass = appLoader.loadClass("sample.plugin.loader.PluginLoader");
		Object appInstance = appClass.newInstance();
		Method m = appClass.getMethod("start");
		m.invoke(appInstance);

	}

}
