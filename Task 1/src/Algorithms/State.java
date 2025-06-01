package Algorithms;
public class State {
    private int posX, posY;

    public State(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    public boolean isEquals(State e){
        return (e.getPosX() == posX) && (e.getPosY() == posY);
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String toString(){
        return "PosX: "+posX+" | PosY: "+posY+"\n";
    }
}
