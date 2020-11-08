package net.mcreator.modrunamia.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.server.MinecraftServer;

import net.mcreator.modrunamia.ModRunamiaModElements;

import java.util.Map;

@ModRunamiaModElements.ModElement.Tag
public class TestCommandeCommandExecutedProcedure extends ModRunamiaModElements.ModElement {
	public TestCommandeCommandExecutedProcedure(ModRunamiaModElements instance) {
		super(instance, 6);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		{
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new StringTextComponent("Pensez a rejoindre le serveur discord ! https://discord.gg/Bn2zb4r"));
		}
	}
}
