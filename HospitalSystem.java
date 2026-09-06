import java.util.HashMap;
import java.util.Scanner;

public class HospitalSystem {

    static Scanner scanner = new Scanner(System.in);

    static PatientBST patientBST = new PatientBST();
    static EmergencyQueue emergencyQueue = new EmergencyQueue();
    static TreatmentStack treatmentStack = new TreatmentStack();

    static HashMap<Integer, VisitHistory> visitHistories =
            new HashMap<>();

    public static void main(String[] args) {

        int choice;

        do {

            displayMenu();

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            scanner.nextLine();

            switch (choice) {

                case 1:
                    registerPatient();
                    break;

                case 2:
                    searchPatient();
                    break;

                case 3:
                    deletePatient();
                    break;

                case 4:
                    displayPatients();
                    break;

                case 5:
                    addEmergencyPatient();
                    break;

                case 6:
                    treatNextPatient();
                    break;

                case 7:
                    emergencyQueue.displayQueue();
                    break;

                case 8:
                    completeTreatment();
                    break;

                case 9:
                    treatmentStack.displayStack();
                    break;

                case 10:
                    addVisit();
                    break;

                case 11:
                    removeVisit();
                    break;

                case 12:
                    searchVisit();
                    break;

                case 13:
                    displayVisitHistory();
                    break;

                case 0:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        scanner.close();
    }

    static void displayMenu() {

        System.out.println("\n=================================");
        System.out.println(" MINI HOSPITAL EMERGENCY SYSTEM");
        System.out.println("=================================");

        System.out.println("1. Register New Patient");
        System.out.println("2. Search Patient");
        System.out.println("3. Delete Patient");
        System.out.println("4. Display All Patients");

        System.out.println("5. Add Emergency Patient");
        System.out.println("6. Treat Next Patient");
        System.out.println("7. Display Waiting Queue");

        System.out.println("8. Complete Treatment");
        System.out.println("9. View Treatment History");

        System.out.println("10. Add Patient Visit");
        System.out.println("11. Remove Patient Visit");
        System.out.println("12. Search Patient Visit");
        System.out.println("13. Display Patient Visit History");

        System.out.println("0. Exit");
    }

    // =========================
    // PATIENT BST
    // =========================

    static void registerPatient() {

        System.out.print("Enter Patient ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Contact Number: ");
        String contact = scanner.nextLine();

        System.out.print("Enter Medical Condition: ");
        String condition = scanner.nextLine();

        Patient patient =
                new Patient(id, name, age, contact, condition);

        patientBST.insert(patient);

        visitHistories.put(id, new VisitHistory());

        System.out.println("Patient registered successfully.");
    }

    static void searchPatient() {

        System.out.print("Enter Patient ID: ");
        int id = scanner.nextInt();

        Patient patient = patientBST.search(id);

        if (patient != null) {
            System.out.println(patient);
        }
        else {
            System.out.println("Patient not found.");
        }
    }

    static void deletePatient() {

        System.out.print("Enter Patient ID: ");
        int id = scanner.nextInt();

        Patient patient = patientBST.search(id);

        if (patient != null) {

            patientBST.delete(id);
            visitHistories.remove(id);

            System.out.println("Patient deleted successfully.");

        }
        else {
            System.out.println("Patient not found.");
        }
    }

    static void displayPatients() {

        System.out.println("\nAll Patients:");

        patientBST.displayInOrder();
    }

    // =========================
    // QUEUE
    // =========================

    static void addEmergencyPatient() {

        System.out.print("Enter Patient ID: ");
        int id = scanner.nextInt();

        Patient patient = patientBST.search(id);

        if (patient != null) {

            emergencyQueue.enqueue(patient);

        }
        else {

            System.out.println("Patient not found. Register patient first.");
        }
    }

    static void treatNextPatient() {

        Patient patient = emergencyQueue.dequeue();

        if (patient != null) {

            System.out.println("Now treating:");
            System.out.println(patient);
        }
    }

    // =========================
    // STACK
    // =========================

    static void completeTreatment() {

        System.out.print("Enter Patient ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Patient patient = patientBST.search(id);

        if (patient == null) {

            System.out.println("Patient not found.");
            return;
        }

        System.out.print("Enter Doctor Name: ");
        String doctor = scanner.nextLine();

        System.out.print("Enter Treatment: ");
        String treatment = scanner.nextLine();

        TreatmentRecord record =
                new TreatmentRecord(
                        patient.getPatientId(),
                        patient.getPatientName(),
                        treatment,
                        doctor
                );

        treatmentStack.push(record);
    }

    // =========================
    // LINKED LIST
    // =========================

    static void addVisit() {

        System.out.print("Enter Patient ID: ");
        int patientId = scanner.nextInt();

        Patient patient = patientBST.search(patientId);

        if (patient == null) {

            System.out.println("Patient not found.");
            return;
        }

        scanner.nextLine();

        System.out.print("Enter Visit ID: ");
        int visitId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Visit Date: ");
        String date = scanner.nextLine();

        System.out.print("Enter Doctor Name: ");
        String doctor = scanner.nextLine();

        System.out.print("Enter Diagnosis: ");
        String diagnosis = scanner.nextLine();

        System.out.print("Enter Treatment: ");
        String treatment = scanner.nextLine();

        Visit visit =
                new Visit(
                        visitId,
                        date,
                        doctor,
                        diagnosis,
                        treatment
                );

        visitHistories
                .get(patientId)
                .addVisit(visit);
    }

    static void removeVisit() {

        System.out.print("Enter Patient ID: ");
        int patientId = scanner.nextInt();

        if (!visitHistories.containsKey(patientId)) {

            System.out.println("Patient not found.");
            return;
        }

        System.out.print("Enter Visit ID: ");
        int visitId = scanner.nextInt();

        visitHistories
                .get(patientId)
                .removeVisit(visitId);
    }

    static void searchVisit() {

        System.out.print("Enter Patient ID: ");
        int patientId = scanner.nextInt();

        if (!visitHistories.containsKey(patientId)) {

            System.out.println("Patient not found.");
            return;
        }

        System.out.print("Enter Visit ID: ");
        int visitId = scanner.nextInt();

        Visit visit =
                visitHistories
                        .get(patientId)
                        .searchVisit(visitId);

        if (visit != null) {
            System.out.println(visit);
        }
        else {
            System.out.println("Visit not found.");
        }
    }

    static void displayVisitHistory() {

        System.out.print("Enter Patient ID: ");
        int patientId = scanner.nextInt();

        if (!visitHistories.containsKey(patientId)) {

            System.out.println("Patient not found.");
            return;
        }

        System.out.println("\nVisit History:");

        visitHistories
                .get(patientId)
                .displayHistory();
    }
}
