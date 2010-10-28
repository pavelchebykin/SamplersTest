package sample.plugin.loader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.Properties;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import javax.swing.JButton;

import sample.plugin.inter.Plugin;

public class PluginInfo {

	public PluginInfo(File jarFile) throws Exception {
		try {
			Properties props = getPluginProps(jarFile);
			if (props == null)
				throw new IllegalArgumentException("No props file found");

			String pluginClassName = props.getProperty("main.class");
			if (pluginClassName == null || pluginClassName.length() == 0) {
				throw new Exception("Missing property main.class");
			}

			buttonText = props.getProperty("button.text");
			if (buttonText == null || buttonText.length() == 0) {
				throw new Exception("Missing property button.text");
			}

			URL jarURL = jarFile.toURI().toURL();
			//URLClassLoader classLoader = new URLClassLoader(new URL[]{jarURL});//��� �� ���������� �������
			URLClassLoader classLoader = new URLClassLoader(new URL[]{jarURL},
					getClass().getClassLoader().getParent());
			Class<?> pluginClass = classLoader.loadClass(pluginClassName);
			instance = (Plugin) pluginClass.newInstance();
		
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	public Plugin getPluginInstance() {
		return instance;
	}

	public String getButtonText() {
		return buttonText;
	}

	private Properties getPluginProps(File file) throws IOException {
		Properties result = null;
		JarFile jar = new JarFile(file);
		Enumeration <JarEntry> entries = jar.entries();

		while (entries.hasMoreElements()) {
			JarEntry entry = entries.nextElement();
			if (entry.getName().contains("settings.properties")) {
				// That's it! Load props
				InputStream is = null;
				try {
					is = jar.getInputStream(entry);
					result = new Properties();
					result.load(is);
				} finally {
					if (is != null)
						is.close();
				}
			}
		}
		return result;
	}

	public void setAssociatedButton(JButton associatedButton) {
		this.associatedButton = associatedButton;
	}

	public JButton getAssociatedButton() {
		return associatedButton;
	}
	
	private Plugin instance;
	private String buttonText;
	private JButton associatedButton;
}