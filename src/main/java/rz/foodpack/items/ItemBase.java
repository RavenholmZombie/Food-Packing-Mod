package rz.foodpack.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import rz.foodpack.Main;
import rz.foodpack.init.ModItems;
import rz.foodpack.util.IHasModel;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

	
}
