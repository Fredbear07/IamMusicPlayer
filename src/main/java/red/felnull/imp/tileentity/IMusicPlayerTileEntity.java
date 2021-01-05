package red.felnull.imp.tileentity;

import net.minecraft.util.ResourceLocation;
import red.felnull.imp.music.IWorldRingWhether;
import red.felnull.imp.music.ServerWorldMusicManager;
import red.felnull.imp.music.resource.PlayMusic;

import java.util.UUID;

public interface IMusicPlayerTileEntity extends IWorldRingWhether {
    default void musicPlay(long pos) {
        ServerWorldMusicManager.instance().play(getMusicPlayerUUID(), getMusicDimension(), getMusic(), this, pos);
    }

    default boolean isMusicPlaying() {
        return ServerWorldMusicManager.instance().isPlaying(getMusicPlayerUUID());
    }

    UUID getMusicPlayerUUID();

    PlayMusic getMusic();

    ResourceLocation getMusicDimension();

}
