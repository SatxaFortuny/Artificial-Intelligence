package Heuristic;
import java.util.List;

import Algorithms.Size;
import Algorithms.State;

public class Heuristica1 extends Heuristica{

	@Override
	public double heuristica(List<Integer> map, State actual, State successor, State end) {
		int x, y;
		x = end.getPosX() - successor.getPosX();
		y = end.getPosY() - successor.getPosY();
		x = x*x; y = y*y;
		return x+y;
	}
}