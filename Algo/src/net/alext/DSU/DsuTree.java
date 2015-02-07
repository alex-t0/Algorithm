package net.alext.DSU;

import java.util.ArrayList;

public class DsuTree<TData> {
    public class DsuNode {
        private ArrayList<DsuNode> parents;
        private TData data;

        public DsuNode(TData val) {
            parents = new ArrayList<DsuNode>();
            data = val;
        }

        public TData getData() { return data; }

        public void setParent(DsuNode nodeParent){
            parents.add(nodeParent);
        }
    }

    public DsuTree() {
    }
}
