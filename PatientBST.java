public class PatientBST {

    private class Node {
        Patient patient;
        Node left;
        Node right;

        Node(Patient patient) {
            this.patient = patient;
        }
    }

    private Node root;

    // Insert patient
    public void insert(Patient patient) {
        root = insertRecursive(root, patient);
    }

    private Node insertRecursive(Node root, Patient patient) {

        if (root == null) {
            return new Node(patient);
        }

        if (patient.getPatientId() < root.patient.getPatientId()) {
            root.left = insertRecursive(root.left, patient);
        }
        else if (patient.getPatientId() > root.patient.getPatientId()) {
            root.right = insertRecursive(root.right, patient);
        }

        return root;
    }

    // Search patient
    public Patient search(int patientId) {
        Node result = searchRecursive(root, patientId);

        if (result != null) {
            return result.patient;
        }

        return null;
    }

    private Node searchRecursive(Node root, int patientId) {

        if (root == null ||
                root.patient.getPatientId() == patientId) {
            return root;
        }

        if (patientId < root.patient.getPatientId()) {
            return searchRecursive(root.left, patientId);
        }

        return searchRecursive(root.right, patientId);
    }

    // Delete patient
    public void delete(int patientId) {
        root = deleteRecursive(root, patientId);
    }

    private Node deleteRecursive(Node root, int patientId) {

        if (root == null) {
            return null;
        }

        if (patientId < root.patient.getPatientId()) {
            root.left = deleteRecursive(root.left, patientId);
        }
        else if (patientId > root.patient.getPatientId()) {
            root.right = deleteRecursive(root.right, patientId);
        }
        else {

            // No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // One right child
            if (root.left == null) {
                return root.right;
            }

            // One left child
            if (root.right == null) {
                return root.left;
            }

            // Two children
            Node successor = findMinimum(root.right);
            root.patient = successor.patient;
            root.right = deleteRecursive(
                    root.right,
                    successor.patient.getPatientId()
            );
        }

        return root;
    }

    private Node findMinimum(Node root) {

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    // In-order traversal
    public void displayInOrder() {
        if (root == null) {
            System.out.println("No patients registered.");
            return;
        }

        inOrder(root);
    }

    private void inOrder(Node root) {

        if (root != null) {

            inOrder(root.left);

            System.out.println(root.patient);

            inOrder(root.right);
        }
    }
}