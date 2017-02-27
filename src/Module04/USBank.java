package Module04;

public class USBank extends Bank {

    public USBank(long id, String bankCountry, Curency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
    Curency currency;
    @Override
    int getLimitOfWithdrawal() {
        if (currency == Curency.USD) {
            return 1000;
        }
        return 1200;
    }
    @Override
    int getLimitOfFunding(){
   if (currency == Curency.USD) {
        return 1000;
    }
        return Integer.MAX_VALUE;
    }

    @Override
     double getMonthlyRate(){
    if (currency == Curency.USD) {
        return 1;
    }
        return 2;
    }

    @Override
    int getCommission(int amount) {
        if (currency == Curency.USD) {
            amount = amount < 1000 ? 5 : 7;
        } else {
            amount = amount> 1000 ? 8 : 6;
        }
        return amount;
    }
    }