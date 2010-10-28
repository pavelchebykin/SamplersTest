package sample.plugin.plugin1;
import sample.plugin.inter.Plugin;
import sample.plugin.inter.PluginContext;


public class HelloPlugin implements Plugin {

	private PluginContext pc;
	
	@Override
	public void invoke() {
		// TODO Auto-generated method stub
		System.out.println("Hello world. I am a plugin 1");
		pc.getButton().setText("Other text 1");
	}

	@Override
	public void init(PluginContext context) {
		// TODO Auto-generated method stub
		this.pc = context;
	}

}
