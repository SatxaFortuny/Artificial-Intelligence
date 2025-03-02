public class Heuristica3 extends Heuristica {

    public double heuristica(int altAct, int altFin, int altExit){
        Heuristica1 h1 = new Heuristica1();
        double gn = h1.heuristica(altAct, altFin);
        double hn = h1.heuristica(altFin, altExit);
        return gn + hn;
    }

    @Override
    double heuristica(int altAct, int altFin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'heuristica'");
    }

    @Override
    double heuristica(int posX, int posY, int posFinX, int posFinY) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'heuristica'");
    }
}