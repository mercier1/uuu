package Module04;
public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        double commision = user.getBank().getCommission(amount)*0.01;
        double limit = user.getBank().getLimitOfWithdrawal();
        double total = commision*amount;
        double balance = user.getBalance();

        if(balance<total) System.err.println("NOT money");
        else {
            if (limit < amount && limit != 0) System.err.println(" limit of withdraw "+limit);
            else user.setBalance(balance-total);
    }}

    @Override
    public void fundUser(User user, int amount) {
        double balance = user.getBalance();
        double limit = user.getBank().getLimitOfFunding();
        if(amount>limit) System.err.println("limit of funding "+limit);
        else user.setBalance(balance+amount);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double balance1 = fromUser.getBalance();
        double balance2 = toUser.getBalance();
        if (amount>balance1) System.err.println("NOT money");
        else {
            fromUser.setBalance(balance1-amount);
            toUser.setBalance(balance2+amount);
        }
    }

    @Override
    public void paySalary(User user) {
        double balance = user.getBalance();
        double salary = user.getSalary();
        double commision = salary*user.getBank().getMonthlyRate()*0.01;
        user.setBalance(balance+salary-commision);
    }
}
