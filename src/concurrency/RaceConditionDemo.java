package concurrency;

/**
 * Created by amitagarwal3 on 8/22/2017.
 */
public class RaceConditionDemo {

    public static void main(String[] args) throws InterruptedException{

        BankAccount task = new BankAccount();
        task.setBalance(100);

        Thread john = new Thread(task);
        Thread anita = new Thread(task);
        john.setName("John");
        anita.setName("Anita");

        john.start();
        anita.start();

    }


}
class BankAccount implements Runnable{

    @Override
    public void run() {

        makeWithDrawl(75);
        if(balance < 0){
            System.out.println("Money Overdrawn : "+balance);
        }

    }

    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    private synchronized void makeWithDrawl(int amount){

        if(balance >= amount){
            System.out.println(Thread.currentThread().getName()+ " Is About to Withdraw .. "+amount);
            balance -= amount;
            System.out.println(Thread.currentThread().getName()+ " has Withdrawn .. "+amount);
        }
        else{
            System.out.println("Sorry, Not enough balance for "+Thread.currentThread().getName());
        }

    }


}
