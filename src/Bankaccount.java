public class Bankaccount {
    private String accountnumber;
    private double initialbalance;
    public Bankaccount(String accountnumber,double initialbalance){
        this.accountnumber=accountnumber;
        this.initialbalance=initialbalance;
    }

    public Bankaccount() {

    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getInitialbalance() {
        return initialbalance;
    }

    public void setInitialbalance(double initialbalance) {
        if (initialbalance >= 0) {
            this.initialbalance = initialbalance;

        }
        else{
            System.out.println("balance cannot be negative:");
        }

    }
    public void deposit(double amount){
        if (amount>0){
            initialbalance += amount;
            System.out.println("deposit : $ " + amount);
        }
        else{
            System.out.println("deposit amount must be positive");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= initialbalance){
            initialbalance -= amount;
            System.out.println("withdraw : $ " + amount);

        }
        else if(amount>initialbalance) {
            System.out.println("insufficient balance");
        }
        else {
            System.out.println("withdraw amount must be positive");
        }
    }
    public void displayAccountdetails(){
        System.out.println("Account number : " + accountnumber);
        System.out.println("initialbalance : " + initialbalance);
    }

    public static void main(String[] args) {
        Bankaccount bankaccount= new Bankaccount("IB6097657",600000);
        bankaccount.displayAccountdetails();
        bankaccount.deposit(2000);
        bankaccount.withdraw(5000);
        System.out.println("after transaction : ");
        bankaccount.displayAccountdetails();

    }
}
