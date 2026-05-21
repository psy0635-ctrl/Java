package ai0521.Rabbit;

public class Rabbit {
    private String shape;  // 토끼의 모양
    private int xPos;   // x 위치
    private int yPos;   // y 위치

    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public Rabbit(){

    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}

