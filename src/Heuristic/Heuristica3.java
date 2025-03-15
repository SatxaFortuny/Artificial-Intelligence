package Heuristic;

import java.util.List;
import Algorithms.Size;
import Algorithms.State;

public class Heuristica3 implements Heuristica {

    @Override
    public double heuristica(List<Integer> map, State actual, State successor, State end) {
        int movX = Math.abs((end.getPosX())-successor.getPosX());
        int movY = Math.abs((end.getPosY())-successor.getPosY());
        int j = obtainPenalization(map,successor,end);
        return movX+movY+4*j;
    }

    public int obtainPenalization(List<Integer> map, State successor, State end){
        int j = 0;
        if ((successor.getPosY() == end.getPosY()) && (successor.getPosX() <(Size.SIZE-1)) &&
            (map.get((successor.getPosX()+1)+successor.getPosY()*Size.SIZE) == -1)){
                j++;
        }
        if ((successor.getPosX() == end.getPosX()) && (successor.getPosY() < (Size.SIZE-1)) &&
            (map.get(successor.getPosX()+(successor.getPosY()+1)*Size.SIZE) == -1)){
            j++;
        }
        return j;
    }
}