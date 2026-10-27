public class BracketStack {
    private class Node{
        char data;
        Node next;

        public Node(char data){
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public BracketStack(){
        top = null;
    }


}
