public class Estat {
    private int posX, posY;

    public Estat(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    public boolean isEquals(Estat e){
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
}
