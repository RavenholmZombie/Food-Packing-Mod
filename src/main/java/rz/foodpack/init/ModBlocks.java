package rz.foodpack.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import rz.foodpack.blocks.BlockBase;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RZ_KITCHEN_TILE = new BlockBase("block_kitchen", Material.ROCK);
}
