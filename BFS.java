package graphdatastructures;

import java.util.ArrayList;
import java.util.LinkedList;

class GraphNode{
    public String name;
    public ArrayList<GraphNode>neighbours=new ArrayList<>();
    public GraphNode(String name){
        this.name=name;
    }
    boolean isVisited=false;
}
public class BFS {
    void bfsVisit(GraphNode node){
        LinkedList<GraphNode>q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            GraphNode currentNode=q.remove(0);
            System.out.print(currentNode.name+" ");
            currentNode.isVisited=true;
            for(GraphNode gNode:currentNode.neighbours){
                if(!gNode.isVisited)
                    q.add(gNode);
                    gNode.isVisited=true;
            }
        }
    }
    void bfs(ArrayList<GraphNode>nodeList){
        for(GraphNode node:nodeList){
            if(!node.isVisited){
                bfsVisit(node);
            }
        }
    }
}
