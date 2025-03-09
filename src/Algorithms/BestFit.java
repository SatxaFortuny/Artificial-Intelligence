package Algorithms;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import Heuristic.*;

public class BestFit extends PathAlgorithm{

    //protected LinkedList<Integer> map= new LinkedList<>();
    //protected State current;
    //protected State end;
    //protected List<State> tractats;
    //protected List<Node> pendents;

    public BestFit(String fileName, int x, int y, int finalX, int finalY) {
        super(fileName, x, y, finalX, finalY);
    }
    
    public Solution cerca(Heuristica h){
        this.pendents = new LinkedList<>();
        this.tractats = new LinkedList<>();
        pendents.add(new Node(this.current, null, 0));
        boolean trobat = false;
        Solution solution = new Solution("",0,0);
        int nIteration = 0;
        while ((!trobat) && (!pendents.isEmpty())){
            Node node = pendents.get(0);
            pendents.remove(0);
            if (node.getEstat().isEquals(this.end)){
                trobat = true;
                solution.setPath(node.getCami());
                solution.setTime(node.getTime());
            }
            else{
                List<Node> succ = node.successors();
                succ = this.filterStates(succ);
                for (Node successor:succ){
                    if (!tractats.stream().anyMatch(x -> x.isEquals(successor.getEstat()))
                    && !pendents.stream().anyMatch(x -> x.getEstat().isEquals(successor.getEstat()))){
                        // Calcular nou heuristic
                        successor.setHeuristica(h.heuristica(this.map, node.getEstat(), successor.getEstat(), this.end));
                        successor.setTime(node.getTime()+this.calculeTime(node.getEstat(),successor.getEstat()));
                        pendents.add(successor);
                        pendents = pendents.stream().sorted(Comparator.comparing(Node::getHeuristica))
                                .collect(Collectors.toList());
                        nIteration++;
                    }
                }
                tractats.add(node.getEstat());
            }
        } 
        solution.setIteration(nIteration);
        if (trobat) return solution;
        else{
            return null;
        }

    }
}
