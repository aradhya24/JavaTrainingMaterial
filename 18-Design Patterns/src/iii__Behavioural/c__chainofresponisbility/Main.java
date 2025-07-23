package iii__Behavioural.c__chainofresponisbility;

public class Main {
    public static void main(String[] args) {
        // Create Approvers
        Approver clerk = new Clerk();
        Approver manager = new Manager();
        Approver director = new Director();

        // Chain setup
        clerk.setNext(manager);
        manager.setNext(director);

        // Requests
        clerk.approveLoan(30000);     // Clerk approves
        clerk.approveLoan(200000);    // Manager approves
        clerk.approveLoan(1000000);   // Director approves
        clerk.approveLoan(2000000);   // Director approves
    }
}
