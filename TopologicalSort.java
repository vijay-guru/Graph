package graphdatastructures;

import java.util.ArrayList;
import java.util.Stack;

class GNode{
    public String name;
    public ArrayList<GNode> neighbours=new ArrayList<>();
    boolean isVisited=false;
    public GNode(String name){
        this.name=name;
    }
}
public class TopologicalSort {
    void topologicalSortVisit(GNode node,Stack<String>stack){
        for(GNode neigbour:node.neighbours){
            if(!neigbour.isVisited){
                topologicalSortVisit(neigbour,stack);
            }
        }
        stack.add(node.name);
        node.isVisited=true;
    }
    void topologicalSort(ArrayList<GNode> nodeList){
        Stack<String>stack=new Stack<>();
        for(GNode node: nodeList){
            if(!node.isVisited){
                topologicalSortVisit(node,stack);
            }
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
