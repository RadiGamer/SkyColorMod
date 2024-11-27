package com.radi;

import com.mojang.brigadier.arguments.StringArgumentType;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;
import net.minecraft.text.Text;


public class SkyColorMod implements ModInitializer {
	@Override
	public void onInitialize() {
		CommandRegistrationCallback.EVENT.register(((commandDispatcher, commandRegistryAccess, registrationEnvironment) -> {
			commandDispatcher.register(CommandManager.literal("skycolor")
					.then(CommandManager.argument("color", StringArgumentType.string())
							.executes(commandContext -> {
								String colorHex = StringArgumentType.getString(commandContext, "color");
								try {
									int color = Integer.parseInt(colorHex, 16);
									SkyColorManagerF.setSkyColor(color);
									return 1;
								} catch (NumberFormatException e) {
									commandContext.getSource().sendError(Text.literal("Color invalido"));
									return 0;
								}
							})));
		}));

	}
}

