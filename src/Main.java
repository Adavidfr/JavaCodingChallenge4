public class Main {
    public static void main(String[] args) throws Exception {

        Bank bank = new Bank();

        bank.addAccount("12345", "David", 2234.45);
        bank.addAccount("12234", "Katy", 5697.09);
        bank.addAccount("23445", "Maya", 12.35);

        System.out.println("===========Create accounts==========");
        for (BankAccount account : bank.listAllAccounts()) {
            System.out.println(account);
        }

        System.out.println("===========Find account by number==========");
        System.out.println(bank.findAccount("12234"));

        System.out.println("===========Remove account by number==========");
        bank.removeAccount("23445");
        for (BankAccount account : bank.listAllAccounts()) {
            System.out.println(account);
        }

        System.out.println("===========Transfer to another account==========");
        bank.transfer("12345", "12234", 245.90);
        for (BankAccount account : bank.listAllAccounts()) {
            System.out.println(account);
        }

    }

}