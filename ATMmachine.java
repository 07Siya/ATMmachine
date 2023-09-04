import java.util.Scanner;

class ATM{
    float Balance;
    int PIN = 5233;
    public void checkpin(){
        System.out.println("Enter your pin");
        Scanner sc =new Scanner (System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin==PIN){
            menu();
        }
        else{
            System.out.println("Please enter valid pin");
            menu();
        }
    }
    public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. check A/C balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposite Money");
        System.out.println("4. Exit");
        Scanner sc =new Scanner(System.in);
        int option =sc.nextInt();
        if(option==1){
            CheckBalance();
        }
        else if(option==2){
            WithdrawMoney();
        }
        else if(option==3){
            DepositeMoney();

        }
        else if(option==4){
            return;
        }
        else{
            System.out.println("Enter a valid choice");
        }
    }
    public void CheckBalance(){
        System.out.println(" Your Balance is:"+ Balance);
        menu();
    }
    public void WithdrawMoney(){
        System.out.println("Enter the amount to withdraw: ");
        Scanner sc =new Scanner(System.in);
        float amount=sc.nextInt();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance =Balance-amount;
            System.out.println("Money withdraw Succesfully");
        }
        menu();
    }
    public void DepositeMoney(){
        System.out.println("Enter amount ");
        Scanner sc =new Scanner(System.in);
        float amount=sc.nextInt();
        Balance=Balance+amount;
        System.out.println("Money deposited succesfully");
        menu();
    }
}
public class ATMmachine{
    public static void main(String[] args){
        ATM ab =new ATM();
        ab.checkpin();
}
}
