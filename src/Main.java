// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Quadratic equation
        System.out.println("-------------------------------");

        Quadratic quadratic = new Quadratic();
        Quadratic quadratic1 = new Quadratic(2,5,2);
        quadratic1.solveTheEquation();

        System.out.println(quadratic);
        System.out.println(quadratic1);


        //Student
        System.out.println("-------------------------------");

        Students sv1 = new Students(1,"khang",9.0, 8.5);
        Students sv2 = new Students(2, "Trung", 8.0, 8.5);
        Students sv3 = new Students();
        sv3.setId(3);
        sv3.setName("Hùng");
        sv3.setTheoreticalScore(7.0);
        sv3.setPracticalScore(10.0);

        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);

        //Bank
        System.out.println("-------------------------------");

        BankAccount acc = new BankAccount(1293, "Khang");
        BankAccount acc2 = new BankAccount(1009, "Linh");

        acc.deposit(100000000);
        acc.withdraw(500000, 100000);
        acc.termDeposit();
        acc.transfer(acc2, 5000000);

        System.out.println(acc);
        System.out.println(acc2);
    }
}