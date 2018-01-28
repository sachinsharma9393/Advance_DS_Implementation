package disjoint_set;

import java.util.HashMap;

/**
 * Created by sachin on 1/28/2018.
 */
public class Disjoint_Set_HashMap {

    int size;
    HashMap<Character,Character>char_with_parent=new HashMap<>(size);;
    HashMap<Character,Integer>char_with_rank=new HashMap<>(size);;
    Disjoint_Set_HashMap(int size)
    {
        this.size=size;
        for (int i = 0; i <size ; i++) {
            char_with_parent.put((char)(i+'A'),(char)(i+'A'));
            char_with_rank.put((char)(i+'A'),0);
        }
    }
    public static void main(String[] args) {
        Disjoint_Set_HashMap s=new Disjoint_Set_HashMap(10);
        s.union('A','B');
        s.union('C','D');
        s.union('E','F');
        s.union('B','C');
        s.union('G','H');
        s.union('I','J');;
        s.union('D','E');
        s.union('F','G');;
        s.union('H','I');
        //now all are in same set and parent should be J lets check
        for (int i = 0; i <10 ; i++) {
            s.find((char) ('A'+i));
        }
    }

    private void find(char f) {
        if(char_with_parent.get(f)==f)
        {
            System.out.println("SET IS " + f);
        }
        else {
            find(char_with_parent.get(f));
        }

    }

    private void union(char c, char d) {
        if(char_with_rank.get(c)==char_with_rank.get(d))
        {

            char_with_parent.replace(c,char_with_parent.get(c),d);
            char_with_rank.replace(c,char_with_rank.get(c),char_with_rank.get(c)+1);
           // char_with_rank.put(c,char_with_rank.get(c)+1);

        }
        if(char_with_rank.get(c)>char_with_rank.get(d))
        {
    char_with_parent.put(d,char_with_parent.get(c));

        }
        if(char_with_rank.get(c)<char_with_rank.get(d))
        {
            char_with_parent.put(c,char_with_parent.get(d));
        }
    }
}
