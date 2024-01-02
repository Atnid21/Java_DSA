import java.util.Stack;

public class Learn_Stack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        // push() , pop() , peek()
        animals.push("Lions");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        animals.push("Pig");

        System.out.println(animals);
        // peek() => element at top
        System.out.println(animals.peek());

        animals.pop(); // top element will get removed it will be Pig
        System.out.println(animals);

    }
}
