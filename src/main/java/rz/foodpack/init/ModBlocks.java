package rz.foodpack.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import rz.foodpack.blocks.BlockBase;
import rz.foodpack.blocks.WrapBox;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// Commercial Kitchen Tiles
	public static final Block RZ_KITCHEN_TILE = new BlockBase("block_kitchen", Material.ROCK);
	public static final Block RZ_KITCHEN_TILE_2 = new BlockBase("block_kitchen_2", Material.ROCK);
	
	// Commercial Kitchen Tiles w/Drains
	public static final Block RZ_KITCHEN_TILE_DRAIN = new BlockBase("block_kitchen_drain", Material.ROCK);
	public static final Block RZ_KITCHEN_TILE_DRAIN_2 = new BlockBase("block_kitchen_drain_2", Material.ROCK);
	
	// FOR TESTING PURPOSES... for now, at least :P
	public static final Block WRAP_BOX = new WrapBox("block_plastic_wrap", Material.IRON);
}
