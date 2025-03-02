public class Heuristica2 extends Heuristica {

    public double heuristica(int posX, int posY, int posFinX, int posFinY){
        return (posFinX - posX)*(posFinX - posX) + (posFinY - posY)*(posFinY - posY);
    }

    @Override
    double heuristica(int altAct, int altFin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'heuristica'");
    }

    @Override
    double heuristica(int altAct, int altFin, int altExit) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'heuristica'");
    }

}