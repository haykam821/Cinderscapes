package com.terraformersmc.cinderscapes.client;

import com.terraformersmc.cinderscapes.init.CinderscapesBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

/**
 * [REVIEWED]
 *
 * @author <Wtoll> Will Toll on 2020-05-02
 * @project Cinderscapes
 */
@SuppressWarnings("unused")
@Environment(EnvType.CLIENT)
public class CinderscapesClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // TODO: Find a more elegant way to add blocks to their render layers
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                CinderscapesBlocks.UMBRAL_WART_BLOCK
        );
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                CinderscapesBlocks.PHOTOFERN,
                CinderscapesBlocks.TALL_PHOTOFERN,
                CinderscapesBlocks.LUMINOUS_POD,
                CinderscapesBlocks.TWILIGHT_FESCUES,
                CinderscapesBlocks.TWILIGHT_TENDRILS,
                CinderscapesBlocks.UMBRAL_FUNGUS
        );
    }
}