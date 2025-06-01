package Algorithms;
import java.util.LinkedList;
import java.util.List;

public class Node {
    private State estat;
    private String cami;
    private double heuristica;
    private double time;

    public Node(State estat, String cami, double resultat){
        this.estat = estat;
        this.cami = cami;
        this.heuristica = resultat;
        time = 0;
    }

    public List<Node> successors(){
        List<Node> list = new LinkedList<>();
        if (estat.getPosX() != 0){
            list.add(new Node(new State(estat.getPosX()-1, estat.getPosY()), cami+"->Left", heuristica));
        }
        if (estat.getPosX() != (Size.SIZE-1)){
            list.add(new Node(new State(estat.getPosX()+1, estat.getPosY()), cami+"->Right", heuristica));
        }
        if (estat.getPosY() != 0){
            list.add(new Node(new State(estat.getPosX(), estat.getPosY()-1), cami+"->Up", heuristica));
        }
        if (estat.getPosY() != (Size.SIZE-1)){
            list.add(new Node(new State(estat.getPosX(), estat.getPosY()+1), cami+"->Down", heuristica));
        }
        return list;
    }

    public void setTime(double time){
        this.time = time;
    }

    public double getTime(){
        return time;
    }

    public State getEstat() {
        return estat;
    }

    public String getCami() {
        return cami;
    }

    public double getHeuristica() {
        return heuristica;
    }

    public void setEstat(State estat) {
        this.estat = estat;
    }

    public void setCami(String cami) {
        this.cami = cami;
    }

    public void setHeuristica(double heuristica) {
        this.heuristica = heuristica;
    }

    public String toString(){
        return estat.toString() + "Cami: " + cami + " Heuristic: " + heuristica;
    }
}
