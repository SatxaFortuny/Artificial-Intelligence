import java.util.LinkedList;
import java.util.List;

public class Node {
    final int tamany = 10;
    private Estat estat;
    private String cami;
    private double heuristica;

    public Node(Estat estat, String cami, double resultat){
        this.estat = estat;
        this.cami = cami;
        this.heuristica = resultat;
    }

    public List<Node> successors(){
        List<Node> list = new LinkedList<>();
        if (estat.getPosX() != 0){
            list.add(new Node(new Estat(estat.getPosX()-1, estat.getPosY()), cami+"->Esquerra", heuristica));
        }
        if (estat.getPosX() != (tamany-1)){
            list.add(new Node(new Estat(estat.getPosX()+1, estat.getPosY()), cami+"->Dreta", heuristica));
        }
        if (estat.getPosY() != 0){
            list.add(new Node(new Estat(estat.getPosX(), estat.getPosY()-1), cami+"->Baix", heuristica));
        }
        if (estat.getPosY() != (tamany-1)){
            list.add(new Node(new Estat(estat.getPosX(), estat.getPosY()+1), cami+"->Dalt", heuristica));
        }
    }

    public Estat getEstat() {
        return estat;
    }

    public String getCami() {
        return cami;
    }

    public double getHeuristica() {
        return heuristica;
    }

    public void setEstat(Estat estat) {
        this.estat = estat;
    }

    public void setCami(String cami) {
        this.cami = cami;
    }

    public void setHeuristica(double heuristica) {
        this.heuristica = heuristica;
    }
}
