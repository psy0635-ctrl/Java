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
            // 비어있음 = 초기값 없이 객체만 생성
    }

    // shape 값을 꺼내줌
    public String getShape() {
        return shape;          // 저장된 shape 값 반환
    }

    // shape 값을 받아서 저장
    public void setShape(String shape) {
        this.shape = shape; // this.shape = 필드, shape = 매개변수
    }

    // xPos 값을 꺼내줌
    public int getxPos() {
        return xPos;           // 저장된 xPos 값 반환
    }

    // xPos 값을 받아서 저장
    public void setxPos(int xPos) {
        this.xPos = xPos; // this.xPos = 필드, xPos = 매개변수
    }

    // yPos 값을 꺼내줌
    public int getyPos() {
        return yPos;           // 저장된 yPos 값 반환
    }

    // yPos 값을 받아서 저장
    public void setyPos(int yPos) {
        this.yPos = yPos; // this.yPos = 필드, yPos = 매개변수
    }
}

