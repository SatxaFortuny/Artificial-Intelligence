import java.util.LinkedList;
import java.util.List;

import Algorithms.*;
import Heuristic.*;

public class Test{
    public static void main(String[] args) {
        BestFit kevin = new BestFit("map.txt", 0, 0, 9, 9);
        kevin.seeMap();
        System.out.println(kevin.cerca(new Heuristica1()));

        System.out.println(kevin.cerca(new Heuristica2()));

       /* List<Node> lis = new LinkedList<>();
        lis.add(new Node(new State(6,0), "mec", 34.0));
        System.out.println((kevin.filterStates(lis)).toString());*/

    }
}