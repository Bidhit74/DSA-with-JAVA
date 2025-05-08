import java.util.ArrayList;

public class StackIntro {

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        //IsEmpty -- O(1)
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // Push Operation -- O(1)
        public static void push(int data) {
            list.add(data); // O(1)
        }

        // Pop Operation -- O(1)
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1); // O(1)
            list.remove(list.size() - 1); // O(1)
            return top;
        }
        
        // Peek Operation -- O(1)
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1); // O(1)
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        // System.out.println(s.pop());
        // System.out.println(s.peek());
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
        // 5 4 3 2 1
    }
}
