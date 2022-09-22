package graphdatastructures;
import java.util.*;
class Node{
    public String name;
    public ArrayList<Node>neighbours=new ArrayList<>();
    public Node(String name){
        this.name=name;
    }
}
class Graph {
    ArrayList<Node>nodeList=new ArrayList<>();
    public Graph(ArrayList<Node>nodeList){
        this.nodeList=nodeList;
    }
    public void addUndirectedEdge(int i,int j){
        Node first=nodeList.get(i);
        Node second=nodeList.get(j);
        first.neighbours.add(second);
        second.neighbours.add(first);
    }
    public void printGraph(){
        for(int i=0;i<nodeList.size();i++){
            System.out.print(nodeList.get(i).name+" ");
            for(int j=0;j<nodeList.get(i).neighbours.size();j++){
                System.out.print("-->  "+nodeList.get(i).neighbours.get(j).name);
            }
            System.out.println();
        }
    }
}
public class ImplementationUsingAdjacencyList {
    public static void main(String[] args) {
        ArrayList<Node>nodeList=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        for(int i=0;i<n;i++){
            nodeList.add(new Node(sc.nextLine()));
        }
        Graph g=new Graph(nodeList);
        int m=sc.nextInt();
        for(int j=0;j<m;j++){
            g.addUndirectedEdge(sc.nextInt(), sc.nextInt());
        }
        g.printGraph();
    }
}
