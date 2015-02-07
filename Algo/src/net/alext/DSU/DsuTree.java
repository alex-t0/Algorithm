package net.alext.DSU;

import java.util.ArrayList;

public class DsuTree<TData> {
    // private Dictionary<TData, TData> parents;

    private int height;

    public class DsuNode {
        private DsuNode parent;
        private TData data;
        // private int rank;

        public DsuNode(TData val) {
            data = val;
            // rank = 0;
        }

        public TData getData() { return data; }

        public void setParent(DsuNode nodeParent){
            parent = nodeParent;
        }
    }

    private DsuNode root;

    public DsuTree(TData data) {
        root = new DsuNode(data);
        root.setParent(root);
        height = 0;
    }

    public boolean Initialized(){
        return root != null;
    }

    public void AddNode(TData value, DsuNode parent) {
        DsuNode newNode = new DsuNode(value);

        if (parent != null)
            newNode.parent = parent;
        else
            newNode.parent = root;
    }

    public void Merge(DsuTree<TData> anotherTree){
        if (anotherTree.height + 1 > height)
            height = anotherTree.height + 1;

        anotherTree.root.parent = root;
    }
}
