package rz.foodpack.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import rz.foodpack.Main;
import rz.foodpack.init.ModBlocks;
import rz.foodpack.init.ModItems;
import rz.foodpack.util.IHasModel;

public class WrapBox extends Block implements IHasModel 
{
	public static final AxisAlignedBB WRAP_BOX = new AxisAlignedBB(16D, 0.0D, 0.3125D, 0.6875D, 0.375D, 0.6875D);
	
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	{
		this.setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
	}
	
	public WrapBox(String name, Material material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		EnumFacing facing = EnumFacing.getFront(meta);
		
		if(facing.getAxis() == EnumFacing.Axis.Y) 
		{
			facing = EnumFacing.NORTH;
		}
		
		return getDefaultState().withProperty(FACING, facing);
	}
	
	@Override
	public int getMetaFromState(IBlockState state) 
	{
		return((EnumFacing)state.getValue(FACING)).getIndex();
	}
	
	@Override
	protected BlockStateContainer createBlockState() 
	{
		return new BlockStateContainer(this, new IProperty[] {FACING});
	}
	
	private boolean canBlockStay(World worldln, BlockPos pos)
	{
		return worldln.getBlockState(pos.down()).isSideSolid(worldln, pos, EnumFacing.UP);
	}
	
	@Override
	public boolean canPlaceBlockAt(World worldln, BlockPos pos)
	{
		return super.canPlaceBlockAt(worldln, pos) ? this.canBlockStay(worldln, pos) : false;
	}
	
	@Override
	public void neighborChanged(IBlockState state, World worldln, BlockPos pos, Block blockln, BlockPos fromPos)
	{
		if(!this.canBlockStay(worldln, pos)) 
		{
			worldln.setBlockToAir(pos);
			InventoryHelper.spawnItemStack(worldln, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModBlocks.WRAP_BOX));
		}
	}
	
	@Override
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.CUTOUT;
	}

	@Override
	public boolean isFullBlock(IBlockState state)
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return WRAP_BOX;
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
