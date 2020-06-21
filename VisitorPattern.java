import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
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

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    
    public int leafSum = 0;
    public int getResult() {
      	//implement this
       return leafSum;
    }

    public void visitNode(TreeNode node) {
      	//implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
      	//implement this
         leafSum = leafSum + leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    int product = 1;
    public int getResult() {
      	//implement this
        return product;
    }

    public void visitNode(TreeNode node) {
      	//implement this
          if (node.getColor() == Color.RED) product = product * node.getValue();

    }

    public void visitLeaf(TreeLeaf leaf) {
      	//implement this
         if (leaf.getColor() == Color.RED) product = product * leaf.getValue();
    }
}

class FancyVisitor extends TreeVis {
    int absoluteNodeVal = 0;
    int absoluteVal = 0;
    public int getResult() {
      	//implement this

        return (absoluteNodeVal >= absoluteVal)? (absoluteNodeVal - absoluteVal):(absoluteVal - absoluteNodeVal);
    }

    public void visitNode(TreeNode node) {
    	//implement this
        if(0 == node.getDepth()%2) absoluteNodeVal = absoluteNodeVal + node.getValue();
    }

    public void visitLeaf(TreeLeaf leaf) {
    	//implement this
        if(Color.GREEN == leaf.getColor()) absoluteVal = absoluteVal + leaf.getValue();

    }
}

public class Solution {
  
    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
       Color treeNodeColor = Color.RED;
       Scanner sc = new Scanner(System.in);
       int depth = 0;
     
       int numOfNodes = sc.nextInt();
       ArrayList[] nodes = new ArrayList[numOfNodes+1];
       ArrayList[] childList = new ArrayList[numOfNodes+1];       

        //First element of a nodes[i] is the Tree Node Value. e.g nodes[0] = 4
        for(int i = 1; i <= numOfNodes; i++){
            nodes[i] = new ArrayList();
            childList[i] = new ArrayList();
            nodes[i].add(sc.nextInt());
        }
    
        //2nd element of a nodes[i] is the color. e.g nodes[0] = {4, RED}
        for(int i = 1; i <= numOfNodes; i++){
            nodes[i].add(sc.nextInt());
        }

        //System.out.println("Next input from the std input/console "+ sc.nextInt());
        //System.out.println("Next input from the std input/console "+ sc.nextInt());

        //System.out.println("Next input from the std input/console "+ sc.nextInt());
        //System.out.println("Next input from the std input/console "+ sc.nextInt());

        //3rd and/or 4th, etc... nodes[i] array elements are the children

        while(sc.hasNext()){  
            int d = sc.nextInt();
            int child = sc.nextInt();
            childList[d].add(child);
            //System.out.println(d);
            //System.out.println(childList[d].size());
        }

       //System.out.println(childList[1].get(0));
       //System.out.println(childList[1].get(1));
        Integer value =  (Integer)(nodes[1].get(0));
        Color col = Color.RED;
        if (nodes[1].get(1) == 1) col = Color.GREEN;
        
        TreeNode builtTree =  new TreeNode(value, col, 0);
        TreeLeaf child = new TreeLeaf(7, Color.GREEN, 1);
        builtTree.addChild(child);
        TreeNode child1 = new TreeNode(2, Color.RED, 1);
        builtTree.addChild(child1);
        TreeLeaf child2 = new TreeLeaf(5, Color.RED, 2);
        child1.addChild(child2);
        TreeLeaf child3 = new TreeLeaf(12, Color.GREEN, 2);
        child1.addChild(child3);

        return builtTree;
    }


    public static void main(String[] args) {
      	Tree root = solve();
		SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
      	ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
      	FancyVisitor vis3 = new FancyVisitor();

      	root.accept(vis1);
      	root.accept(vis2);
      	root.accept(vis3);

      	int res1 = vis1.getResult();
      	int res2 = vis2.getResult();
      	int res3 = vis3.getResult();

      	System.out.println(res1);
     	System.out.println(res2);
    	System.out.println(res3);
	}
}