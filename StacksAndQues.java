package DSA;
import java.security.cert.LDAPCertStoreParameters;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class StacksAndQues {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(99);
        stack.push(98);
        stack.push(97);
        stack.push(96);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        Queue<Integer> que = new LinkedList<>();
        que.add(56);
        que.add(55);
        que.add(54);
        que.add(53);
        que.add(52);
        System.out.println(que.remove());

    }
}
