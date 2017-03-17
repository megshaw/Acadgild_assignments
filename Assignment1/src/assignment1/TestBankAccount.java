
package assignment1;
class Synchronize_Test {

    private volatile int balance;

    public Synchronize_Test(int b){
        balance = b;
    }

    public Synchronize_Test(){
        balance = 0;
    }


    synchronized public int getBalance(){
        return balance;
    }

    synchronized public int withdraw(int w)
    {
        int b = getBalance();
        if(w <= b){
            balance = balance-w;
            return w;
        }
        else
            return 0;
    }
}

class WithdrawAccount implements Runnable{

    private Synchronize_Test acc;
    private int amount;

    public WithdrawAccount(){
        acc = null;
        amount = 0;
    }

    public WithdrawAccount(Synchronize_Test acc,int amount){
        this.acc = acc;
        this.amount = amount;
    }

    public void run() {
        int w; 

        for(int i =0; i<20; i++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            System.out.println("Balance before "+Thread.currentThread().getName()+" withdrawl: "+acc.getBalance());
            w = acc.withdraw(amount);
            System.out.println("Balance after "+Thread.currentThread().getName()+" withdrawl: "+acc.getBalance());
            //System.out.println("amount with drawn by: "+Thread.currentThread().getName()+" "+w);

        }

    }

}

public class TestBankAccount{

    public static void main(String[] args) {

       Synchronize_Test b = new Synchronize_Test(1000);
        WithdrawAccount w = new WithdrawAccount(b,10);
        Thread wt1 = new Thread(w);
        wt1.setName("T1");

        Thread wt2 = new Thread(w);
        wt2.setName("T2");

        wt1.start();
        wt2.start();
    }
}