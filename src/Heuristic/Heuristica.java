package Heuristic;
public abstract class Heuristica {

    abstract double heuristica(int altAct, int altFin);

    abstract double heuristica(int posX, int posY, int posFinX, int posFinY);

    abstract double heuristica(int altAct, int altFin, int altExit);
}