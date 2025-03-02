package Heuristic;
import java.util.List;

import Algorithms.Size;
import Algorithms.State;

public class Heuristica1 extends Heuristica{


    public double heuristica(List<Integer> map, State current, State next, State end){

        int currentAltitude = map.get(current.getPosY()*Size.SIZE + current.getPosX());
        int nextAltitude = map.get(next.getPosY()*Size.SIZE + next.getPosX());
        
        if (currentAltitude <= nextAltitude){
            return (1 + (nextAltitude-currentAltitude));
        }
        else {
            return (1 + (currentAltitude-nextAltitude)/(double)2);
        }
    }

}