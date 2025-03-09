package Heuristic;

import java.util.List;

import Algorithms.Size;
import Algorithms.State;

public class Heuristica2 extends Heuristica {

    @Override
    public double heuristica(List<Integer> map, State actual, State successor, State end) {
        int x, y, actslope, succslope;
        x = end.getPosX() - successor.getPosX();
        y = end.getPosY() - successor.getPosY();
        x = x * x; y = y * y;
        succslope = map.get(successor.getPosY()*Size.SIZE + successor.getPosX());
        actslope = map.get(actual.getPosY()*Size.SIZE + actual.getPosX());
        if (actslope <= succslope){
            return x*y+(succslope-actslope);
        }
        else {
            return x*y+(actslope-succslope)/(double)2;
        }
    }
}