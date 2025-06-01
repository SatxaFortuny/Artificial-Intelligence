package Heuristic;

import java.util.List;

import Algorithms.Size;
import Algorithms.State;

public class Heuristica2 implements Heuristica {

    @Override
    public double heuristica(List<Integer> map, State actual, State successor, State end) {
        int x, y;
        x = end.getPosX() - successor.getPosX();
        y = end.getPosY() - successor.getPosY();
        x = x * x; y = y * y;
        int actualAltitude = map.get(actual.getPosY()*Size.SIZE + actual.getPosX());
		int nextAltitude = map.get(successor.getPosY()*Size.SIZE + successor.getPosX());
        if (actualAltitude <= nextAltitude){
            return (x+y)*(1+(nextAltitude-actualAltitude));
        }
        else {
            return (x+y)*(1+(actualAltitude-nextAltitude)/(double)2);
        }
    }
}