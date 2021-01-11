package pybot.init;

import java.util.ArrayList;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ModKeyBindings {
	public static ArrayList<KeyBinding> keyBindings;
	
    public static void registerKeyBindings()
    {
        keyBindings = new ArrayList<KeyBinding>();

        keyBindings.add(new KeyBinding("key.test", Keyboard.KEY_P, "category.pybot"));

        for (int i = 0; i < keyBindings.size(); ++i)
        {
            ClientRegistry.registerKeyBinding(keyBindings.get(i));
        }
    }
}