import Algorithms.*;
import Heuristic.*;

public class App{
    public static void main(String[] args) {
        BestFit kevin = new BestFit("map.txt", 0, 0, 9, 9);
        //kevin.seeMap();
        System.out.println("BF - Heuristic1: ");
        System.out.println(kevin.cerca(new Heuristica1()));
        System.out.println("BF - Heuristic2: ");
        System.out.println(kevin.cerca(new Heuristica2()));
        System.out.println("BF - Heuristic3: ");
        System.out.println(kevin.cerca(new Heuristica3()));

        AStar satxa = new AStar("map.txt", 0, 0, 9, 9);
        //kevin.seeMap();
        System.out.println("A* - Heuristic1: ");
        System.out.println(satxa.cerca(new Heuristica1()));
        System.out.println("A* - Heuristic2: ");
        System.out.println(satxa.cerca(new Heuristica2()));
        System.out.println("A* - Heuristic3: ");
        System.out.println(satxa.cerca(new Heuristica3()));

       /* List<Node> lis = new LinkedList<>();
        lis.add(new Node(new State(6,0), "mec", 34.0));
        System.out.println((kevin.filterStates(lis)).toString());*/

    }

}