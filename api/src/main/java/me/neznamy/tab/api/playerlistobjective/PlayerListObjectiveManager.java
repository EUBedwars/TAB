package me.neznamy.tab.api.playerlistobjective;

import lombok.NonNull;
import me.neznamy.tab.api.TabPlayer;
import org.jetbrains.annotations.Nullable;

/** API for temporary per-player overrides of TAB's player-list objective. */
public interface PlayerListObjectiveManager {
    enum RenderType { INTEGER, HEARTS }
    /** Forces the objective on/off for this viewer. Use null to restore configuration control. */
    void setEnabled(@NonNull TabPlayer player, @Nullable Boolean enabled);
    /** Returns the API override, or null when configuration controls the player. */
    @Nullable Boolean getCustomEnabled(@NonNull TabPlayer player);
    /** Overrides the score value owned by this player. Use null to restore configured value. */
    void setValue(@NonNull TabPlayer player, @Nullable Integer value);
    /** Overrides the objective title for this viewer. Use null to restore configured title. */
    void setTitle(@NonNull TabPlayer player, @Nullable String title);
    /** Overrides render type for this viewer. Use null to restore configured render type. */
    void setRenderType(@NonNull TabPlayer player, @Nullable RenderType renderType);
    /** Clears all API overrides for this player and restores configuration control. */
    void reset(@NonNull TabPlayer player);
}
