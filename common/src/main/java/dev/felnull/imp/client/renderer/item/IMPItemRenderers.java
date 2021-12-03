package dev.felnull.imp.client.renderer.item;

import dev.felnull.imp.block.IMPBlocks;
import dev.felnull.imp.item.IMPItems;
import dev.felnull.otyacraftengine.client.renderer.item.ItemRendererRegister;

public class IMPItemRenderers {
    public static void init() {
        ItemRendererRegister.register(IMPBlocks.MUSIC_MANAGER, new MusicManagerItemRenderer());
        ItemRendererRegister.register(IMPBlocks.BOOMBOX, new BoomboxItemRenderer());
        ItemRendererRegister.register(IMPItems.PARABOLIC_ANTENNA, new ParabolicAntennaItemRenderer());
    }
}
