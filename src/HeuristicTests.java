import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import org.junit.Assert;
import org.junit.Test;

import Algorithms.State;
import Heuristic.*;

public class HeuristicTests {
    public HeuristicTests() {
    }

    public static List<Integer> initializer(String fileName){
        List<Integer> map = new LinkedList<>();
        try{
            String line;
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
        return map;   
    }

    @Test
    public void h1test1() {
        //List<Integer> map, State actual, State successor, State end
        List<Integer> map = initializer("map.txt");
        State actual = new State(0, 0);
        State successor = new State(0, 0);
        State end = new State(0, 0);
        Heuristica heuristica = new Heuristica1();
        double result = 
        Assert.assertEquals("", 
            , 
            heuristica.heuristica(map, , ));
    }

    @Test
    public void h1test2() {
        //List<Integer> map, State actual, State successor, State end
        List<Integer> map = initializer("map.txt");
        State actual = new State(0, 0);
        State successor = new State(0, 0);
        State end = new State(0, 0);
        Heuristica heuristica = new Heuristica1();
        double result = 
        Assert.assertEquals("", 
            , 
            heuristica.heuristica(map, , ));
    }

    @Test
    public void h1test3() {
        //List<Integer> map, State actual, State successor, State end
        List<Integer> map = initializer("map.txt");
        State actual = new State(0, 0);
        State successor = new State(0, 0);
        State end = new State(0, 0);
        Heuristica heuristica = new Heuristica1();
        double result = 
        Assert.assertEquals("", 
            , 
            heuristica.heuristica(map, , ));
    }
}