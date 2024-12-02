package top.mrxiaom.stc.func;
        
import top.mrxiaom.stc.SweetTimeController;

@SuppressWarnings({"unused"})
public abstract class AbstractPluginHolder extends top.mrxiaom.pluginbase.func.AbstractPluginHolder<SweetTimeController> {
    public AbstractPluginHolder(SweetTimeController plugin) {
        super(plugin);
    }

    public AbstractPluginHolder(SweetTimeController plugin, boolean register) {
        super(plugin, register);
    }
}
