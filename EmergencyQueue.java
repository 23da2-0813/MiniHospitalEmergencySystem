import java.util.LinkedList;

public class EmergencyQueue {

    private LinkedList<Patient> queue;

    public EmergencyQueue() {
        queue = new LinkedList<>();
    }

    // Enqueue
    public void enqueue(Patient patient) {
        queue.addLast(patient);
        System.out.println("Patient added to emergency queue.");
    }

    // Dequeue
    public Patient dequeue() {

        if (queue.isEmpty()) {
            System.out.println("Emergency queue is empty.");
            return null;
        }

        return queue.removeFirst();
    }

    // Display queue
    public void displayQueue() {

        if (queue.isEmpty()) {
            System.out.println("Emergency queue is empty.");
            return;
        }

        System.out.println("\nPatients Waiting:");

        for (Patient patient : queue) {
            System.out.println(patient);
        }
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}