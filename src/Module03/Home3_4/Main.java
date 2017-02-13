package Module03.Home3_4;

public class Main {
    public static void main(String[] args) {
        User user = new User("google", 1000, 5, "exel", 100, "doit");
        user.setName("Bob");
        user.setBalance(1000);
        user.setCompanyName("gag");
        user.setMonthsOfEmpl(8);
        user.setCurrency("fds");
        user.setSalary(300);
        user.paySalary();
        user.withdraw(100, 20);
        user.companyNameLenght();
        System.out.println(user.getMonthsOfEmpl());
    }

}

