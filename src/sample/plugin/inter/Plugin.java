package sample.plugin.inter;


public interface Plugin {
	public void invoke();
	public void init(PluginContext context);
}
