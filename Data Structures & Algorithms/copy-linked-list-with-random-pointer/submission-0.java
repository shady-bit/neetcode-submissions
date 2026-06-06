/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        
        HashMap<Node,Node> map = new HashMap<>();
        map.put(null,null);
        
        Node temp = head;
        while(temp != null){
            Node newNode = new Node(temp.val);
            map.put(temp,newNode);
            temp = temp.next;
        }

        temp = head;
        while(temp != null) {
            Node newTemp = map.get(temp);
            newTemp.next = map.get(temp.next);
            newTemp.random = map.get(temp.random);
            temp = temp.next;
        }
        return map.get(head);
    }
}
