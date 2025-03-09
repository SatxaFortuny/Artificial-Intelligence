package Heuristic;
import java.util.List;

import Algorithms.Size;
import Algorithms.State;

public class Heuristica3 extends Heuristica {

    @Override
    public double heuristica(List<Integer> map, State actual, State successor, State end) {
        int x, y, succslope, endslope;
        x = end.getPosX() - successor.getPosX();
        y = end.getPosY() - successor.getPosY();
        x = x * x; y = y * y;
        succslope = map.get(successor.getPosY()*Size.SIZE + successor.getPosX());
        endslope = map.get(end.getPosY()*Size.SIZE + end.getPosX());
        return x+y+Math.abs(endslope-succslope);
    }
}