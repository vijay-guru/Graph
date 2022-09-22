package graphdatastructures;

import java.util.ArrayList;
import java.util.Stack;

class GraphNode1{
    public String name;
    public ArrayList<GraphNode1>neighbours=new ArrayList<>();
    public GraphNode1(String name){
        this.name=name;
    }
    boolean isVisited=false;
}
public class DFS {
    void dfsVisit(GraphNode1 node){
        Stack<GraphNode1> q=new Stack<>();
        q.add(node);
        while(!q.isEmpty()){
            GraphNode1 currentNode=q.pop();
            System.out.print(currentNode.name+" ");
            currentNode.isVisited=true;
            for(GraphNode1 gNode:currentNode.neighbours){
                if(!gNode.isVisited)
                    q.push(gNode);
                gNode.isVisited=true;
            }
        }
    }
    void dfs(ArrayList<GraphNode1>nodeList){
        for(GraphNode1 node:nodeList){
            if(!node.isVisited){
                  dfsVisit(node);
            }
        }
    }
}
