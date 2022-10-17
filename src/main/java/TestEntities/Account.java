package TestEntities;

public class Account {
    public static double DEPOSIT_FEE_PERCENTAGE = 0.02;
    private Long id;
    private double balance;

    public Account(Long id, Double balance) {
        super();
        this.id = id;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public  void deposit(double amount){
        if(amount > 0){
            amount -= amount * DEPOSIT_FEE_PERCENTAGE;
            balance += amount;
        }

    }
    public double lWithrow(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException();
        }
        balance -= amount;
        return amount;
    }
    public  double fullWithrow(){
        double aux = balance;
        balance = 0.0;
        return aux;
        }
    }
