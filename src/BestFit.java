import java.util.LinkedList;
import java.util.List;

public class BestFit extends PathAlgorithm{


    //protected LinkedList<Integer> map= new LinkedList<>();
    //protected int x, y, finalX, finalY;
    //protected List<Estat> tractats;
    //protected List<Node> pendents;

    public BestFit(String fileName, int x, int y, int finalX, int finalY) {
        super(fileName, x, y, finalX, finalY);
    }
    
    public String cerca(Heuristica h){
        pendents = new LinkedList<>();
        tractats = new LinkedList<>();
        pendents.add(new Node(ei, null, 0));
        boolean trobat = false;
        String solucio = "";
        while ((!trobat) && (!pendents.isEmpty())){
            Node node = pendents.get(0);
            pendents.remove(0);
            if (node.getEstat().isEquals(ef)){
                trobat = true;
                solucio = node.getCami();
            }
            else{
                
            }
        } 
        if (trobat) return solucio;
        else return "No existeix camí";

    }
}
