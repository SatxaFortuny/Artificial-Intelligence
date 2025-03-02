public class Heuristica1 extends Heuristica{

    public double heuristica(int altAct, int altFin){
        if (altAct <= altFin){
            return (1 + (altFin-altAct));
        }
        else {
            return (1 + (altAct-altFin)/(double)2);
        }
    }

    @Override
    double heuristica(int posX, int posY, int posFinX, int posFinY) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'heuristica'");
    }

    @Override
    double heuristica(int altAct, int altFin, int altExit) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'heuristica'");
    }


}