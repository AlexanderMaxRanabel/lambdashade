package meteordevelopment.meteorclient.systems.modules.player;

import meteordevelopment.meteorclient.systems.modules.Categories;
import meteordevelopment.meteorclient.systems.modules.Module;

public class HushDisconnect extends Module {
    public HushDisconnect() {
        super(Categories.Player, "silent-disconnect", "Won't show a disconnect screen when you disconnects.");
    }
}
