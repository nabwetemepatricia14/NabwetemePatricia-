public class Bank Account{
    private double _balance;
    public BankAccount(
        double b) {_balance =b;}

        public double getBalance() {return_balance;}// read-only

        public void Deposit(double amount){
            if(amount<=0)throw new illegalArgumentException("Mustbe positive");
            _balance += amount;
        }
        public void Withdrawal(double amount) {
            if(amount<=0) throw new illegalArgumentException("Must be positive");
            if(amount>_balance)throw new Runtimeexception("insuffient funds");
            _balance -=amount;
        }
        }
    )
}