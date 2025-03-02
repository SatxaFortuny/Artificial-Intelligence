import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class PathAlgorithm {

    protected LinkedList<Integer> map= new LinkedList<>();
    protected int x, y, finalX, finalY;
    protected List<Estat> tractats;
    protected List<Node> pendents;

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


}