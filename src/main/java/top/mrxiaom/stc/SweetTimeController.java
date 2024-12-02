package top.mrxiaom.stc;
        
import org.jetbrains.annotations.NotNull;
import top.mrxiaom.pluginbase.BukkitPlugin;
import top.mrxiaom.pluginbase.EconomyHolder;

public class SweetTimeController extends BukkitPlugin {
    public static SweetTimeController getInstance() {
        return (SweetTimeController) BukkitPlugin.getInstance();
    }

    public SweetTimeController() {
        super(options()
                .bungee(false)
                .adventure(false)
                .database(true)
                .reconnectDatabaseWhenReloadConfig(true)
                .vaultEconomy(false)
                .scanIgnore("top.mrxiaom.stc.libs")
        );
    }


    @Override
    protected void beforeEnable() {
        options.registerDatabase(
                // 在这里添加数据库 (如果需要的话)
        );
    }

    @Override
    protected void afterEnable() {
        getLogger().info("SweetTimeController 加载完毕");
    }
}
