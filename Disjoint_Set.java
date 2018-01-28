package disjoint_set;

import java.util.Vector;

/**
 * Created by sachin on 12/19/2017.
 */
class Node
{
    int rank;
    Node parent;
    char name;
    public Node(int rank, char name) {
        this.rank=rank;
        this.name=name;
    }
}
public class Disjoint_Set {
    int size;
Vector<Node>s;
    Disjoint_Set(int size) {
        this.size = size;
        s=new Vector<>();
        for (int i = 0; i < size; i++) {
            s.add(new Node(0,(char)('A'+i)));
            s.elementAt(i).parent=s.elementAt(i);
        }
    }


    public static void main(String[] args) {
Disjoint_Set ds=new Disjoint_Set(7);
        ds.union(1,2);
        ds.union(2,3);
        ds.union(4,5);
        ds.union(6,7);
        ds.union(5,6);
        ds.union(3,7);

        ds.findSet(4);
        ds.findSet(1);
    }

    private void findSet(int i) {
       if(s.elementAt(i-1)==s.elementAt(i-1).parent)

           System.out.println("SET IS" + s.elementAt(i-1).name);

       else
       {
       Character temp=    s.elementAt(i).parent.name;
           findSet(temp-65);
       }


    }

    private void union(int i, int j) {
       if( s.get(i-1).rank==s.get(j-1).rank)
       {
           s.get(j-1).parent=s.get(i-1);//make anyone as parent
           s.get(i-1).rank+=1;
       }
        if(s.get(i-1).rank >s.get(j-1).rank)
        {
            s.get(j-1).parent=s.get(i-1);//make i as parent

        }
        if(s.get(i-1).rank < s.get(j-1).rank)
        {
            s.get(i-1).parent=s.get(j-1);//make j as parent
        }
    }
}