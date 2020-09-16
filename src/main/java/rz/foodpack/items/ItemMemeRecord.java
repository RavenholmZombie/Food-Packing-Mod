package rz.foodpack.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.SoundEvent;
import rz.foodpack.Main;
import rz.foodpack.init.ModItems;
import rz.foodpack.util.IHasModel;

public class ItemMemeRecord extends ItemRecord implements IHasModel
{
	// U = unlocalizedName
	// R = RegistryName
	public ItemMemeRecord(String name, SoundEvent soundIn, String u, String r, CreativeTabs tab) 
	{
		super(name, soundIn);
		this.setUnlocalizedName(u);
		this.setRegistryName(r);
		this.setCreativeTab(CreativeTabs.MISC);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");	
	}
	
}
