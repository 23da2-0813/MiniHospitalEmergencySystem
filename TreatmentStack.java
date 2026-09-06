import java.util.Stack;

public class TreatmentStack {

    private Stack<TreatmentRecord> stack;

    public TreatmentStack() {
        stack = new Stack<>();
    }

    // Push
    public void push(TreatmentRecord record) {
        stack.push(record);
        System.out.println("Treatment record added.");
    }

    // Pop
    public TreatmentRecord pop() {

        if (stack.isEmpty()) {
            System.out.println("Treatment history is empty.");
            return null;
        }

        return stack.pop();
    }

    // Display
    public void displayStack() {

        if (stack.isEmpty()) {
            System.out.println("Treatment history is empty.");
            return;
        }

        System.out.println("\nTreatment History:");

        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }
}