package Heuristic;
import java.util.List;

import Algorithms.Size;
import Algorithms.State;

public class Heuristica1 extends Heuristica{

	@Override
	public double heuristica(List<Integer> map, State actual, State successor, State end) {
        int actualAltitude = map.get(actual.getPosY()*Size.SIZE + actual.getPosX());
		int nextAltitude = map.get(successor.getPosY()*Size.SIZE + successor.getPosX());
        int finalAltitude = map.get(end.getPosY()*Size.SIZE + end.getPosX());
        if (actualAltitude <= nextAltitude){
            return (nextAltitude-actualAltitude) + Math.abs(finalAltitude-nextAltitude);
        }
        else {
            return (actualAltitude-nextAltitude)/(double)2 + Math.abs(finalAltitude-nextAltitude);
        }
        //return Math.abs(finalAltitude-nextAltitude);
	}
}