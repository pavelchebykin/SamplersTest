package sample.plugin.plugin2;
import sample.plugin.inter.Plugin;
import sample.plugin.inter.PluginContext;


public class HelloPlugin implements Plugin {

	private PluginContext pc;
	
	@Override
	public void invoke() {
		// TODO Auto-generated method stub
		System.out.println("I am a plugin 2");
		pc.getButton().setText("Other text 2");
	}

	@Override
	public void init(PluginContext context) {
		// TODO Auto-generated method stub
		this.pc = context;
	}

}
