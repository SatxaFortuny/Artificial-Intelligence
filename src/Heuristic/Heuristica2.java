package Heuristic;

import java.util.List;

import Algorithms.State;

public class Heuristica2 extends Heuristica {

    @Override
    public double heuristica(List<Integer> map, State actual, State successor, State end) {
        return 3;
    }

    /*public double heuristica(int posX, int posY, int posFinX, int posFinY){
        return (posFinX - posX)*(posFinX - posX) + (posFinY - posY)*(posFinY - posY);
    }*/



}