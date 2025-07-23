package iii__Behavioural.c__chainofresponisbility;

public class ConcreteHandlers  {
	
}

class Clerk implements Approver{
    private Approver next;

    public void setNext(Approver nextApprover) {
        this.next = nextApprover;
    }

    public void approveLoan(int amount) {
        if (amount <= 50000) {
            System.out.println("Clerk: Approved loan of ₹" + amount);
        } else if (next != null) {
            next.approveLoan(amount);
        } else {
            System.out.println("Clerk: Cannot process. No higher authority available.");
        }
    }
}

class Manager implements Approver {
    private Approver next;

    public void setNext(Approver nextApprover) {
        this.next = nextApprover;
    }

    public void approveLoan(int amount) {
        if (amount <= 500000) {
            System.out.println("Manager: Approved loan of ₹" + amount);
        } else if (next != null) {
            next.approveLoan(amount);
        } else {
            System.out.println("Manager: Cannot process. No higher authority available.");
        }
    }
}

class Director implements Approver {
    private Approver next;

    public void setNext(Approver nextApprover) {
        this.next = nextApprover;
    }

    public void approveLoan(int amount) {
        if (amount > 500000) {
            System.out.println("Director: Approved loan of ₹" + amount);
        } else {
            System.out.println("Director: This amount should have been handled earlier.");
        }
    }
}

