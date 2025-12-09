import java.awt.*;
import java.awt.event.KeyEvent;

public class Rectangle {
//    Instance variables
    private Game game;
    private int x, y, width, height, speed;
    private boolean left, up, down, right;

    public Rectangle(Game argGame, int argX, int argY, int argWidth, int argHeight) {
        game = argGame;
        x = argX;
        y = argY;
        width = argWidth;
        height = argHeight;
        speed = 3;
    }

//    This checks when the key is pressed
    public void keyPressed(KeyEvent e) {
//        Get the key that was pressed
        int key = e.getKeyCode();

//        Handle the key press
        if (key == 37) {
            left = true;
        }
        if (key == 38) {
            up = true;
        }
        if (key == 39) {
            right = true;
        }
        if (key == 40) {
            down = true;
        }
    }

    public void keyReleased(KeyEvent e) {
//        Get the key that was pressed
        int key = e.getKeyCode();

//        Handle the key press
        if (key == 37) {
            left = false;
        }
        if (key == 38) {
            up = false;
        }
        if (key == 39) {
            right = false;
        }
        if (key == 40) {
            down = false;
        }
    }

//    This updates the rectangle
    public void tick() {
        if (up) y -= speed;
        if (down) y += speed;
        if (left) x -= speed;
        if (right) x += speed;

//        Don't allow the rectangle to move off the screen
        if (x < 0) {
            x = 0;
        }
        if (x+width > game.getWidth()) {
            x = game.getWidth() - width;
        }
        if (y < 0) y = 0;

        if (y+height > game.getHeight()) {
            y = game.getHeight() - height;
        }
    }


//    This draws the rectangle
    public void render(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

