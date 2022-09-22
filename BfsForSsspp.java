package graphdatastructures;

import java.util.ArrayList;
import java.util.LinkedList;

class BNode {
    int data;
    public ArrayList<BNode> neighbours=new ArrayList<>();
    BNode parent;
    boolean isVisited=false;
    public BNode(int data){
        this.data=data;
    }
}
public class BfsForSsspp {
    void pathPrint(BNode node){
        if(node.parent!=null){
            pathPrint(node.parent);
        }
        System.out.print(node.data);
    }
    void bfs(BNode node){
        LinkedList<BNode>q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            BNode currentNode=q.remove(0);
            currentNode.isVisited=true;
            System.out.print("Printing path for the node "+currentNode.data+": ");
            pathPrint(currentNode);
            System.out.println();
            for(BNode neighbour:currentNode.neighbours){
                if(!neighbour.isVisited){
                    neighbour.isVisited=true;
                    neighbour.parent=currentNode;
                }
            }
        }
    }
}
