package sample.plugin.loader;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;

import sample.plugin.inter.Plugin;
import sample.plugin.inter.PluginContext;

public class PluginLoader{
	
	private Map<String, PluginInfo> plugins;
	private JFrame mainFrame;

	public void start() {
		File pluginDir = new File("plugins");

		File[] jars = pluginDir.listFiles(new FileFilter() {
			public boolean accept(File file) {
				return file.isFile() && file.getName().endsWith(".jar");
			}
		});

		plugins = new HashMap<String, PluginInfo>();

		for (File file : jars) {
			try {
				plugins.put(file.getName(), new PluginInfo(file));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		mainFrame = new JFrame("Plugin test");
		final JFrame frame = mainFrame;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 80);
		frame.getContentPane().setLayout(new FlowLayout());

		synchronized (plugins) {
			for (PluginInfo pluginInfo : plugins.values()) {
				final PluginInfo plugin = pluginInfo;
				final JButton button = new JButton(pluginInfo.getButtonText());
				plugin.setAssociatedButton(button);
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Plugin instance = plugin.getPluginInstance();
						System.out.println("class:" + getClass().getName() + " used:" + instance.getClass() + " loaded by:" + instance.getClass().getClassLoader());
						instance.init(new PluginContext(){
							public JButton getButton() {
								return button;
							}
							public JFrame getFrame() {
								return frame;
							}
						});
						instance.invoke();
					}
				});
				frame.getContentPane().add(button);
			}
		}

		frame.setVisible(true);
	}
	public void removePluginByName(String jarName) throws Exception {
		if (!plugins.containsKey(jarName)) {
			throw new Exception(jarName + " not loaded");
		}

		PluginInfo pluginInfo = plugins.get(jarName);

		mainFrame.remove(pluginInfo.getAssociatedButton());
		mainFrame.validate();
		mainFrame.repaint();

		synchronized (plugins) {
			plugins.remove(jarName);
		}
	}
	
	public void addPluginByName(String jarName) throws Exception {
		if (plugins.containsKey(jarName)) {
			throw new Exception(jarName + " not loaded");
		}
		File jar = new File(jarName);

		synchronized (plugins) {
			plugins.put(jarName, new PluginInfo(jar));
			PluginInfo pluginInfo = plugins.get(jarName);
			JButton newjb = new JButton(pluginInfo.getButtonText());
			pluginInfo.setAssociatedButton(newjb);
			mainFrame.add(newjb);
		}
		mainFrame.validate();
		mainFrame.repaint();
	}
}