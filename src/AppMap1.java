import Algorithms.*;
import Heuristic.*;

public class AppMap1{
    public static void main(String[] args) {
        BestFirst best = new BestFirst("map.txt", 0, 0, 9, 9);
        AStar star = new AStar("map.txt", 0, 0, 9, 9);

        System.out.println("Optimal path: ");
        Solution solOpt = star.cerca(new HeuristicaP());
        System.out.println(solOpt);
        System.out.println("Mapa Optimal:"+star.seeMap(solOpt.getPath()));

        System.out.println("BF - Heuristic1: ");
        Solution solBF1 = best.cerca(new Heuristica1());
        System.out.println(solBF1);
        System.out.println("Mapa BF1:"+best.seeMap(solBF1.getPath()));

        System.out.println("A* - Heuristic1: ");
        Solution solA1 = star.cerca(new Heuristica1());
        System.out.println(solA1);
        System.out.println("Mapa A1:"+star.seeMap(solA1.getPath()));

        System.out.println("BF - Heuristic2: ");
        Solution solBF2 = best.cerca(new Heuristica2());
        System.out.println(solBF2);
        System.out.println("Mapa BF2:"+best.seeMap(solBF2.getPath()));

        System.out.println("A* - Heuristic2: ");
        Solution solA2 = star.cerca(new Heuristica2());
        System.out.println(solA2);
        System.out.println("Mapa A2:"+star.seeMap(solA2.getPath()));

        System.out.println("BF - Heuristic3: ");
        Solution solBF3 = best.cerca(new Heuristica3());
        System.out.println(solBF3);
        System.out.println("Mapa BF3:"+best.seeMap(solBF3.getPath()));

        System.out.println("A* - Heuristic3: ");
        Solution solA3 = star.cerca(new Heuristica3());
        System.out.println(solA3);
        System.out.println("Mapa A3:"+star.seeMap(solA3.getPath()));
    }

}