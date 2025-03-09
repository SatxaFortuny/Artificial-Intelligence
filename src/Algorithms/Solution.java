package Algorithms;

public class Solution {
    private String path;
    private double time;
    private int nIteration;

    public Solution(String path, double time, int it){
        this.path = path;
        this.time = time;
        this.nIteration = it;
    }

    public String getPath(){
        return path;
    }

    public double getTime(){
        return time;
    }

    public int getIteration(){
        return nIteration;
    }
}
