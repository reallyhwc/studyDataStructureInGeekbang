package com.xuhu.study.geekbang.wangzheng.dataStructure.Class24.T01;

/**
 * @author xuhu
 * @date 2020-08-31 17:55
 */
public class MainTest {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        addTest(tree);
        System.out.println(tree.searchTreeNode(66));
        System.out.println(tree.searchTreeNode(73));
        System.out.println(tree.searchTreeNode(7));
        System.out.println(tree.searchTreeNode(94));
    }

    public static void addTest(BinarySearchTree tree){
        tree.addTreeNode(50);
        tree.addTreeNode(25);
        tree.addTreeNode(75);
        tree.addTreeNode(13);
        tree.addTreeNode(15);
        tree.addTreeNode(64);
        tree.addTreeNode(39);
        tree.addTreeNode(17);
        tree.addTreeNode(79);
        tree.addTreeNode(66);
        tree.addTreeNode(95);
        tree.addTreeNode(88);
        tree.addTreeNode(94);
        tree.showTree();
    }
}
