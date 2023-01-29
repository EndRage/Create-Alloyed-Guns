package com.mrcrayfish.guns.init;

import com.mrcrayfish.guns.GunMod;
import com.mrcrayfish.guns.Reference;
import com.mrcrayfish.guns.block.SteelPipeBlock;
import com.mrcrayfish.guns.block.WorkbenchBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.simibubi.create.content.contraptions.relays.elementary.ShaftBlock;
import com.tterrag.registrate.util.entry.BlockEntry;

import static com.simibubi.create.Create.ID;
import static com.simibubi.create.Create.REGISTRATE;
import com.simibubi.create.foundation.data.SharedProperties;
import net.minecraft.world.level.material.MaterialColor;
import com.simibubi.create.foundation.block.BlockStressDefaults;
import static com.simibubi.create.foundation.data.TagGen.pickaxeOnly;
import static com.simibubi.create.foundation.data.BlockStateGen.axisBlock;
import static com.simibubi.create.foundation.data.BlockStateGen.simpleCubeAll;
import com.simibubi.create.foundation.data.BlockStateGen;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.content.contraptions.relays.elementary.BracketedKineticBlockModel;

import javax.annotation.Nullable;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Author: MrCrayfish
 */
public class ModBlocks
{
    public static final DeferredRegister<Block> REGISTER = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);


    public static final RegistryObject<Block> WORKBENCH = register("workbench", () -> new WorkbenchBlock(Block.Properties.of(Material.METAL).strength(1.5F)));

    public static final BlockEntry<ShaftBlock> SMALL_STEEL_PIPE = REGISTRATE.block("small_steel_pipe", ShaftBlock::new)
            .properties(p -> p.color(MaterialColor.METAL).strength(0.2F))
            .transform(BlockStressDefaults.setNoImpact())
            .transform(pickaxeOnly())
            .blockstate(BlockStateGen.axisBlockProvider(false))
            .onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
            .simpleItem()
            .register();
    public static final BlockEntry<ShaftBlock> SMALL_IRON_PIPE = REGISTRATE.block("small_iron_pipe", ShaftBlock::new)
            .properties(p -> p.color(MaterialColor.METAL).strength(0.2F))
            .transform(BlockStressDefaults.setNoImpact())
            .transform(pickaxeOnly())
            .blockstate(BlockStateGen.axisBlockProvider(false))
            .onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
            .simpleItem()
            .register();
    private static <T extends Block> RegistryObject<T> register(String id, Supplier<T> blockSupplier)
    {
        return register(id, blockSupplier, block1 -> new BlockItem(block1, new Item.Properties().tab(GunMod.GROUP)));
    }

    private static <T extends Block> RegistryObject<T> register(String id, Supplier<T> blockSupplier, @Nullable Function<T, BlockItem> supplier)
    {
        RegistryObject<T> registryObject = REGISTER.register(id, blockSupplier);
        if(supplier != null)
        {
            ModItems.REGISTER.register(id, () -> supplier.apply(registryObject.get()));
        }
        return registryObject;
    }
}
