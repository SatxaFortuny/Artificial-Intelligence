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

    public void setPath(String path){
        this.path = path;
    }

    public void setTime(double time){
        this.time = time;
    }

    public void setIteration(int it){
        this.nIteration = it;
    }

    public String toString(){
        return "Path: "+this.path+"\nTime: "+this.time+"\nIterations: "+this.nIteration+"\n";
    }
}
