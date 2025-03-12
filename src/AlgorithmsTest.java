import org.junit.Assert;
import org.junit.Test;

import Algorithms.*;
import Heuristic.*;

public class AlgorithmsTest {
    public AlgorithmsTest() {
    }

    @Test
    public void testBestFitH1() {
        BestFit test = new BestFit("map.txt", 0, 0, 9, 9);
        //test.seeMap();
        System.out.println("BESTFIT - Heuristic1: ");
        Solution solution = test.cerca(new Heuristica1());
        System.out.println(solution);
        Assert.assertEquals("Path checked manually", 
            "->Right->Right->Right->Down->Down->Right->Down->Down->Right->Right->Right->Down->Down->Down->Down->Right->Right->Down", 
            solution.getPath());
    }

    @Test
    public void testBestFitH2() {
        BestFit test = new BestFit("map.txt", 0, 0, 9, 9);
        //test.seeMap();
        System.out.println("BESTFIT - Heuristic2: ");
        Solution solution = test.cerca(new Heuristica2());
        System.out.println(solution);
        Assert.assertEquals("Path checked manually", 
            "->Right->Right->Right->Right->Down->Right->Right->Right->Right->Right->Down->Down->Down->Down->Left->Down->Down->Right->Down->Down", 
            solution.getPath());
    }

    @Test
    public void testBestFitH3() {
        BestFit test = new BestFit("map.txt", 0, 0, 9, 9);
        //test.seeMap();
        System.out.println("BESTFIT - Heuristic3: ");
        Solution solution = test.cerca(new Heuristica3());
        System.out.println(solution);
        Assert.assertEquals("Path checked manually", 
            "->Right->Right->Right->Right->Down->Right->Right->Right->Right->Right->Down->Down->Down->Down->Left->Down->Down->Right->Down->Down", 
            solution.getPath());
    }

    @Test
    public void testAStarH1() {
        AStar test = new AStar("map.txt", 0, 0, 9, 9);
        //test.seeMap();
        System.out.println("A* - Heuristic1: ");
        Solution solution = test.cerca(new Heuristica1());
        System.out.println(solution);
        Assert.assertEquals("Path checked manually", 
            "->Right->Right->Right->Down->Down->Right->Down->Down->Right->Right->Right->Down->Down->Down->Down->Right->Right->Down", 
            solution.getPath());
    }

    @Test
    public void testAStarH2() {
        AStar test = new AStar("map.txt", 0, 0, 9, 9);
        //test.seeMap();
        System.out.println("A* - Heuristic2: ");
        Solution solution = test.cerca(new Heuristica2());
        System.out.println(solution);
        Assert.assertEquals("Path checked manually", 
            "->Right->Right->Right->Right->Down->Right->Right->Right->Right->Right->Down->Down->Down->Down->Left->Down->Down->Right->Down->Down", 
            solution.getPath());
    }

    @Test
    public void testAStarH3() {
        AStar test = new AStar("map.txt", 0, 0, 9, 9);
        //test.seeMap();
        System.out.println("A* - Heuristic3: ");
        Solution solution = test.cerca(new Heuristica3());
        System.out.println(solution);
        Assert.assertEquals("Path checked manually", 
            "->Right->Right->Right->Right->Down->Right->Right->Right->Right->Right->Down->Down->Down->Down->Left->Down->Down->Right->Down->Down", 
            solution.getPath());
    }
}