package pl.sokol.pacman.gui.elements;

import java.awt.*;

public class Tile extends Rectangle implements Renderable {

    private final int TILE_WIDTH = 32;
    private final int TILE_HEIGHT = 32;

    public Tile(int x, int y) {
        setBounds(x, y, TILE_WIDTH, TILE_HEIGHT);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(new Color(33, 0, 127));
        g.fillRect(x, y, width, height);
    }
}