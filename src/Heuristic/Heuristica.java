package Heuristic;
import java.util.List;
import Algorithms.State;

public interface Heuristica {
    public double heuristica(List<Integer> map, State actual, State successor, State end);
}