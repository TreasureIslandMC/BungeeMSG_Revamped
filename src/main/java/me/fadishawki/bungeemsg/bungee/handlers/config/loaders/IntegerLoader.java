package me.fadishawki.bungeemsg.bungee.handlers.config.loaders;

/*
 * OrbitMines - @author Fadi Shawki - 2018
 */

import me.fadishawki.bungeemsg.bungee.handlers.config.Config;
import me.fadishawki.bungeemsg.bungee.handlers.config.ConfigLoader;
import net.md_5.bungee.config.Configuration;

public class IntegerLoader extends ConfigLoader<Integer> {

    public IntegerLoader(Config.Type type, String path) {
        super(type, path);
    }

    public IntegerLoader(Config.Type type, String path, String key) {
        super(type, path, key);
    }

    @Override
    public boolean load(Configuration configuration) {
        this.value = configuration.getInt(path);
        return true;
    }
}
