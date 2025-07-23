package ii__Structural.b__composite;

public class CompanyStructure {
    public static void main(String[] args) {
        IEmployee dev1 = new Developer("Alice", 101);
        IEmployee dev2 = new Developer("Bob", 102);

        Manager engManager = new Manager();
        engManager.add(dev1);
        engManager.add(dev2);

        IEmployee dev3 = new Developer("Charlie", 201);
        Manager generalManager = new Manager();
        generalManager.add(engManager);
        generalManager.add(dev3);

        generalManager.showDetails();
    }
}
