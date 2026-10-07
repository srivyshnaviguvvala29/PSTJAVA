import java.util.*;

public class Solution {

    static abstract class Tree {
        private int value;
        private int depth;

        public Tree(int value, int depth) {
            this.value = value;
            this.depth = depth;
        }

        public int getValue() {
            return value;
        }

        public int getDepth() {
            return depth;
        }

        public abstract void accept(TreeVis visitor);
    }

    static class TreeNode extends Tree {
        private ArrayList<Tree> children = new ArrayList<>();

        public TreeNode(int value, int depth) {
            super(value, depth);
        }

        public void accept(TreeVis visitor) {
            visitor.visitNode(this);

            for (Tree child : children) {
                child.accept(visitor);
            }
        }

        public void addChild(Tree child) {
            children.add(child);
        }
    }

    static class TreeLeaf extends Tree {
        public TreeLeaf(int value, int depth) {
            super(value, depth);
        }

        public void accept(TreeVis visitor) {
            visitor.visitLeaf(this);
        }
    }

    static abstract class TreeVis {
        public abstract int getResult();

        public abstract void visitNode(TreeNode node);

        public abstract void visitLeaf(TreeLeaf leaf);
    }

    static class SumInLeavesVisitor extends TreeVis {
        private int sum = 0;

        public void visitNode(TreeNode node) {
        }

        public void visitLeaf(TreeLeaf leaf) {
            sum += leaf.getValue();
        }

        public int getResult() {
            return sum;
        }
    }

    static class ProductOfRedNodesVisitor extends TreeVis {
        private long product = 1;

        public void visitNode(TreeNode node) {
            if (node.getValue() % 2 == 0) {
                product = (product * node.getValue()) % 1000000007;
            }
        }

        public void visitLeaf(TreeLeaf leaf) {
            if (leaf.getValue() % 2 == 0) {
                product = (product * leaf.getValue()) % 1000000007;
            }
        }

        public int getResult() {
            return (int) product;
        }
    }

    static class FancyVisitor extends TreeVis {
        private int evenDepthSum = 0;
        private int greenLeafSum = 0;

        public void visitNode(TreeNode node) {
            if (node.getDepth() % 2 == 0) {
                evenDepthSum += node.getValue();
            }
        }

        public void visitLeaf(TreeLeaf leaf) {
            if (leaf.getDepth() % 2 == 0) {
                evenDepthSum += leaf.getValue();
            }
        }

        public int getResult() {
            return Math.abs(evenDepthSum - greenLeafSum);
        }
    }
}
Sample Input

5
4 7 2 5 12
0 1 0 0 1
1 2
1 3
3 4
3 5
Sample Output

24
40
15
