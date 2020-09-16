package rz.foodpack.init;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import rz.foodpack.util.Reference;

public class MemeRecord 
{
	
	public static final SoundEvent MEME = new SoundEvent(new ResourceLocation(Reference.MOD_ID, "memerecord")).setRegistryName(new ResourceLocation(Reference.MOD_ID, "memerecord"));
	
	
	@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
	public static class SoundEventRegistration {
		@SubscribeEvent
		public static void registerSoundEvents(final RegistryEvent.Register<SoundEvent> event) {
			final SoundEvent[] sounds = {
					MEME
			};
			
			event.getRegistry().registerAll(sounds);
		}
	}
}

