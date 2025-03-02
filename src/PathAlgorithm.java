import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class PathAlgorithm {

    private LinkedList<Integer> map= new LinkedList<>();
    private int x, y, finalX, finalY;

    public PathAlgorithm(String fileName, int x, int y, int finalX, int finalY){
        try{
            String line;
            this.x=x;
            this.y=y;
            this.finalX=finalX;
            this.finalY=finalY;
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, " ");
                while (tokenizer.hasMoreTokens()) {
                    map.add(Integer.parseInt(tokenizer.nextToken()));
                }
            }
        }
        catch(FileNotFoundException e){
            System.err.println(e);
        }
        catch(Exception e){
            System.err.println(e);
        }
        
    }

    /*public PathAlgorithm(LinkedList<Integer> map, int x, int y, int finalX, int finalY){
        this.map = map;
        this.x=x;
        this.y=y;
        this.finalX=finalX;
        this.finalY=finalY;
    }*/

    public void getMap(){
        //System.out.println(map.toString());
        System.out.println(map.size());
        /*for (int i = 0; i < 10; i++){
            String p = "";
            for (int j = 0; j < 10; i++){
                p=p+" "+map.get(i*10+j);
            }
            System.out.println(p);
        }*/
    }
}