package com.node;

public class Node {

    public Node next;
    private Object data;

    public Node(Object data) {
        this.data = data;
    }

    //链表：链表是一种物理存储单元撒花姑娘非连续、非顺序的存储结构
    //特点: 插入、删除时间复杂度O(1) 查询遍历时间复杂度O(N)  插入块  查找慢
    public static void main(String[] args) {
        Node node = new Node("张三");
        node.next = new Node("李四");
        node.next.next = new Node("王五");

        System.out.println(node.data);
        System.out.println(node.next.data);
        System.out.println(node.next.next.data);
    }
}
