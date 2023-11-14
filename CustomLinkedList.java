package DSA;

public class CustomLinkedList {

    private Node Head;
    private Node tail;
    private int size;
    
    public CustomLinkedList() {
       this.size = 0;
    }

    private class Node{
        private int Node_Value;
        private Node Next_Node;
        public Node(int node_Value) {
           this.Node_Value = node_Value;
        }
        public Node(int node_Value, Node next_Node) {
            this.Node_Value = node_Value;
            this.Next_Node = next_Node;
        }

        
    }
}

