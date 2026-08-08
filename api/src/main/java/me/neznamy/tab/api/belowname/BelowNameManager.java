package me.neznamy.tab.api.belowname;

import lombok.NonNull;
import me.neznamy.tab.api.TabPlayer;
import org.jetbrains.annotations.Nullable;

/** API for temporary per-player overrides of TAB's below-name objective. */
public interface BelowNameManager {
    /** Forces the objective on/off for this player. False also hides this player's below-name score from other viewers. Use null to restore configuration control. */
    void setEnabled(@NonNull TabPlayer player, @Nullable Boolean enabled);
    /** Returns the API override, or null when configuration controls the player. */
    @Nullable Boolean getCustomEnabled(@NonNull TabPlayer player);
    /** Overrides the score value owned by this player. Use null to restore configured value. */
    void setValue(@NonNull TabPlayer player, @Nullable Integer value);
    /** Overrides the objective title for this viewer. Use null to restore configured title. */
    void setTitle(@NonNull TabPlayer player, @Nullable String title);
    /** Clears all API overrides for this player and restores configuration control. */
    void reset(@NonNull TabPlayer player);
}
