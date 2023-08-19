import java.util.*;
/**
 * Innercollection
 */ class Innercollection{
     Innercollection()
     {
         System.out.println("hello,world");
     }
    }
    interface football{
        public int num_players(int a);
        public String set_player_name(String a);
    }
    class players implements football{
         public int num_players(int a)
         {
             return(a);
         }
         public String set_player_name(String a)
         {
             return(a);
         }
    }
class collection 
{
   
    public static void main(String[] args) {
         Innercollection ic=new  Innercollection();
         players p=new players();
         int n=p.num_players(2);
         String name=p.set_player_name("ronaldo");
         System.out.println(n+name);
         LinkedList list=new LinkedList();
         list.add(p);
         list.add(ic);
         ArrayList l = new ArrayList();
         l.add(p);
         l.add(ic);
         l.add("ankit");
         l.add("sharma");
         Vector v=new Vector();
         v.add(p);
         v.add(ic);
         Stack s=new Stack<>();
         s.add(p);
         s.add(ic);
         System.out.println(l.get(0));
         System.out.println(l.get(1));
         System.out.println(l.get(2));
         System.out.println(l.get(3));
         System.out.println(list.get(0));
         System.out.println(list.get(1));
        try{
            System.out.println(v.get(0));
            System.out.println(v.get(1));
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
              System.out.println("error found");   
        }
         System.out.println(s.get(0));
         System.out.println(s.get(1));
        }
}