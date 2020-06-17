package cn.cat.第一章.one_three;

import cn.cat.util.Node;

public class Test{
    public static void main(String[] args) {
        Node node = new Node();//新建节点
        node.setObj("string");//设置键
        node.setNext(null);//设置值
        Node next;
        for (int i=0;i<10;i++){
            next = new Node();
            next.setObj("Java"+i);
            next.setNext(null);
        }
        System.out.println(node.toString());
    }
}
