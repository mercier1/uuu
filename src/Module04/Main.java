package Module04;

public class Main {
    public static void main(String[] args) {

             EUBank euBank=new EUBank(12335453,"FRANCE",Curency.EUR,111,773.4,400534,5453453);
        ChinaBank chinaBank=new ChinaBank(7335453,"CHINA",Curency.USD,1161,7733.4,4003534,54534653);
             USBank usBank=new USBank(738753,"KOREA",Curency.USD,115451,7743.4,4034534,545873);
              BankSystemImpl bankSystem=new BankSystemImpl();

        User user=new User(546267,"Goga",2000,5,"Ggogogo",699,chinaBank);
        User user1=new User(5655,"Kalya",5030,10740,"elTa",3600,euBank);
        User user2=new User(5575,"Vova",5030,1700,"OOO GOOGLE",3060,usBank);
        System.out.println("User name is "+user.getName());
        System.out.println("Kalin bank in a "+user1.getBank().getBankCountry());
        System.out.println("Vovun company is "+user2.getCompanyName());

        bankSystem.fundUser(user2, 500);
        bankSystem.withdrawOfUser(user1, 999999);
        bankSystem.paySalary(user);
        bankSystem.transferMoney(user1,user2,99999);

        System.out.println(user.toString());
    }
}