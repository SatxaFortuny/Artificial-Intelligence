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

    public boolean correctInitialValues(){
        if (current.getPosX() < 0 || current.getPosX() > Size.SIZE) return false;
        if (current.getPosY() < 0 || current.getPosY() > Size.SIZE) return false;
        if (map.get(current.getPosX()*Size.SIZE + current.getPosX()) == -1) return false;
        if (map.get(end.getPosX()*Size.SIZE + end.getPosX()) == -1) return false;
        return true;
    }

    public String seeMap(String recorregut){
        List<String> mapMov = new LinkedList<>();
        String[] mov = recorregut.split("->");
        String sol = "";
        State state = new State(this.current.getPosX(), this.current.getPosY());
        int pos = 0;
        for (Integer i:map){
            if (i == -1) mapMov.add("[*]");
            else mapMov.add(".");
        }
        for(String s:mov){
            if (s != ""){
                mapMov.set(state.getPosY()*Size.SIZE + state.getPosX(), this.searchCharacter(s));
                state = this.updateState(state, s);
            }
        }
        mapMov.set(this.end.getPosY()*Size.SIZE + this.end.getPosX(), "X");
        pos = 0;
        for(String s:mapMov){
            if (pos % Size.SIZE == 0) sol+="\n";
            sol+=s+"\t";
            pos++;
        }
        return sol+"\n";
    }

    private String searchCharacter(String value){
        switch (value){
            case "Right":
                return ">";
            case "Left":
                return "<";
            case "Up":
                return "¡";
            case "Down":
                return "!";
        }
        return "";
    }

    private State updateState(State state, String value){
        switch (value){
            case "Right":
                state.setPosX(state.getPosX()+1);
                return state;
            case "Left":
                state.setPosX(state.getPosX()-1);
                return state;
            case "Up":
                state.setPosY(state.getPosY()-1);
                return state;
            case "Down":
                state.setPosY(state.getPosY()+1);
                return state;
        }
        return null;
    }
}

//Albuquerque