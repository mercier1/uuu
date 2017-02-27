package Module04;

public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Curency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
    Curency currency;

    @Override
    int getLimitOfWithdrawal() {
        if (currency == Curency.USD) {
            return 2000;
        }
        return 2200;
    }

    @Override
    int getLimitOfFunding() {
        if (currency == Curency.EUR) {
            return 20000;
        }
        return 10000;
    }

    @Override
    double getMonthlyRate() {
        if (currency == Curency.USD) {
            return 0;
        }
        return 1;
    }

    @Override
    int getCommission(int amount) {
        if (currency == Curency.USD) {
            amount = amount < 1000 ? 5 : 7;
        } else {
            amount = amount < 1000 ? 2 : 4;
        }
        return amount;
    }
}