package interfaces.implementations;

import interfaces.Movable;

public class MovablePoint implements Movable {

    private int x,y,xSpeed,ySpeed;

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRigth() {
        x++;
    }
}
