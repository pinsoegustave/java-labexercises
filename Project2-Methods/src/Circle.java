import java.awt.*;

public class Circle {

    private Game game;
    private int x, y, radius;
    private int vX, vY;

    public Circle (Game argGame, int argX, int argY, int argRadius) {
        x = argX;
        y = argY;
        radius = argRadius;
        game = argGame;

        vX = 4;
        vY = 4;
    }

    public void tick() {
        x += vX;
        y += vY;

//        Bounce off the screen edges
        if (y+radius > game.getHeight()) {
            y = game.getHeight() - radius;
            vY *= -1;
        }

        if (x+radius > game.getWidth()) {
            y = game.getWidth() - radius;
            vX *= -1;
        }

        if (y - radius < 0) {
            y = radius;
            vY *= -1;
        }
        if (x - radius < 0) {
            x = radius;
            vX *= -1;
        }
    }


    public void render(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
