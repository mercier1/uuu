package Module04;

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Curency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    Curency currency;

    @Override
    int getLimitOfWithdrawal() {
        if (currency == Curency.USD) {
            return 100;
        }
        return 150;
    }

    @Override
    int getLimitOfFunding() {
        if (currency == Curency.USD) {
            return 10000;
        }
        return 5000;
    }

    @Override
    double getMonthlyRate() {
        if (currency == Curency.USD) {
            return 1;
        }
        return 0;
    }

    @Override
    int getCommission(int amount) {
        if (currency == Curency.USD) {
            amount = amount < 1000 ? 3 : 5;
        } else {
            amount= amount > 1000 ? 10 : 11;
        }
        return amount;
    }
}