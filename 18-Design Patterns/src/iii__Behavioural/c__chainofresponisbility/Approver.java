package iii__Behavioural.c__chainofresponisbility;

public interface Approver {
    void setNext(Approver nextApprover);
    void approveLoan(int amount);
}
