package Heuristic;
import java.util.List;
import Algorithms.State;

public abstract class Heuristica {

    public abstract double heuristica(List<Integer> map, State actual, State successor, State end);

    //abstract double heuristica(int posX, int posY, int posFinX, int posFinY);

    //abstract double heuristica(int altAct, int altFin, int altExit);
}