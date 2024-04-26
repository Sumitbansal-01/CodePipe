import java.util.*;

public class  Four{

    // CodePipe

    static class Node1 {
        int num;

        Node1(int _num) {
            this.num = _num;
        }

        @Override
        public int hashCode() {
            return 0;
        }

    }
    
    static class Node2 extends Node1 {

        Node2(int _num) {
            super(_num);
        }

        @Override
        public boolean equals(Object obj) {
            // Check if obj is an instance of Node2
            if (obj instanceof Node2) {
                Node2 other = (Node2) obj;
                return this.num == other.num;
            }
            return false;
        }

    }

    public static void main(String[] args) {

        HashMap<Node1, Integer> squareMap1 = new HashMap<>();
        HashMap<Node2, Integer> squareMap2 = new HashMap<>();

        squareMap1.put(new Node1(0), 0);
        squareMap2.put(new Node2(0), 0);

        // equals Method
        System.out.println(squareMap1.containsKey(new Node1(0)));

        System.out.println(squareMap2.containsKey(new Node2(0)));

    }
}
