package Algorithms;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

abstract class PathAlgorithm {
    protected List<Integer> map = new LinkedList<>();
    protected State current;
    protected State end;
    protected List<State> tractats;
    protected List<Node> pendents;

    public PathAlgorithm(String fileName, int x, int y, int finalX, int finalY){
        try{
            String line;
            this.current = new State(x, y);
            this.end = new State(finalX, finalY);
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, " ");
                while (tokenizer.hasMoreTokens()) {
                    map.add(Integer.parseInt(tokenizer.nextToken()));
                }
            }
            br.close();
        }
        catch(FileNotFoundException e){
            System.err.println(e);
        }
        catch(Exception e){
            System.err.println(e);
        }   
    }

    public double calculeTime(State actual, State successor){
        int actualAltitude = map.get(actual.getPosY()*Size.SIZE + actual.getPosX());
		int nextAltitude = map.get(successor.getPosY()*Size.SIZE + successor.getPosX());
        if (actualAltitude <= nextAltitude){
            return 1+(nextAltitude-actualAltitude);
        }
        else {
            return 1+(actualAltitude-nextAltitude)/(double)2;
        }
    }

    public List<Node> filterStates(List<Node> list){
        List<Node> result = new LinkedList<>();
        for (Node node:list){
            if (map.get(node.getEstat().getPosX()+Size.SIZE*node.getEstat().getPosY()) != -1) result.add(node);
        }
        return result;
    }

    public String seeMap(){
        return map.toString();
    }


}