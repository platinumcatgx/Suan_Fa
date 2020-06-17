package cn.cat.第一章.one_three;

import edu.princeton.cs.algs4.*;

/**
 * 双栈表达式求值: 仅做基本的运算
 */
public class DoubleStackOperation {

    public void Operation(String str) {
        Stack<Character> ops = new Stack();//创建操作符栈
        Stack<Double> nums = new Stack();//创建操作数栈
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            switch (s) {
                case '('://无视左括号
                    break;
                case '+':// + 、 - 、 * 、／、sqrt 这些操作符都压入栈
                case '-':
                case '*':
                case '/':
                    ops.push(s);
                    break;
                case ')'://遇到右括号时，根据从操作符栈中取出操作符，并从操作数栈中取出相应都操作数进行计算，并将计算结果压入操作数栈
                    char op = ops.pop();//取出一个运算符
                    Double num = nums.pop();//取出栈顶的操作数
                    switch (op) {//num为栈顶元素,处于运算符后,所以必须写为"num = nums.pop() + num",避免 0/5 变成 5/0
                        case '+':
                            num = nums.pop() + num;
                            break;
                        case '-':
                            num = nums.pop() - num;
                            break;
                        case '*':
                            num = nums.pop() * num;
                            break;
                        case '/':
                            num = nums.pop() / num;
                            break;
                    }
                    nums.push(num);//将运算后的结果存入栈中
                    break;
                default:
                    nums.push(Double.parseDouble(Character.toString(s)));
            }
        }
        System.out.println(nums.pop());
    }

}