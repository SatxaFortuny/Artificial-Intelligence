package Heuristic;

import java.util.List;
import Algorithms.Size;
import Algorithms.State;

public class Heuristica3 extends Heuristica {

    @Override
    public double heuristica(List<Integer> map, State actual, State successor, State end) {
        int movX = ((Size.SIZE-1)-successor.getPosX());
        int movY = ((Size.SIZE-1)-successor.getPosY());
        return movX+movY;
    }
}