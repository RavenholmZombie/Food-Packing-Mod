package rz.foodpack.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import rz.foodpack.items.ItemBase;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item STYROTRAY = new ItemBase("item_styrotray");
	public static final Item STYRODUST = new ItemBase("item_styropowder");
	
	public static final Item MEATHAMMER = new ItemBase("tool_hammer");
	public static final Item KNIFE = new ItemBase("tool_knife");
	
	public static final Item PLASTICWRAP = new ItemBase("item_plasticwrap");
	
}
