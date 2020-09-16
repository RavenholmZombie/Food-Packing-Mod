package rz.foodpack.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import rz.foodpack.items.ItemBase;
import rz.foodpack.items.ItemMemeRecord;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item STYROTRAY = new ItemBase("item_styrotray");
	public static final Item STYRODUST = new ItemBase("item_styropowder");
	
	public static final Item BEATMYMEAT = new ItemBase("tool_hammer");
	public static final Item KNIFE = new ItemBase("tool_knife");
	
	public static final Item PLASTICWRAP = new ItemBase("item_plasticwrap");
	
	// Food
	public static final Item STEAKSINGLE = new ItemBase("food_steaksingle");
	public static final Item STEAKDOUBLE = new ItemBase("food_steakdouble");
	
	// Meme record lol
	public static final Item MEME_RECORD = new ItemMemeRecord("memerecord", MemeRecord.MEME, "meme_record", "meme_record", CreativeTabs.MISC);
	
	
	
}
