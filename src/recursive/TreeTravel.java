package recursive;

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt=rt=null;
    }
}

class Tree {
    Node root;

    public Tree(Node root) {
        this.root = root;
    }

    //부 왼 오
    public void DFS(Node root) {
        if (root == null) { // 말단노드 입니당
            return;
        }
        else {
            System.out.print(root.data + " ");
            DFS(root.lt);
            DFS(root.rt);
        }

    }
}
public class TreeTravel {

    public static void main(String[] args) {

        Tree tree = new Tree(new Node(1));
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.DFS(tree.root);



    }
}
