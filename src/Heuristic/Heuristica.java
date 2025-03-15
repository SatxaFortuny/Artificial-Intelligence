package Heuristic;
import java.util.List;
import Algorithms.State;

public abstract class Heuristica {

    public abstract double heuristica(List<Integer> map, State actual, State successor, State end);
}