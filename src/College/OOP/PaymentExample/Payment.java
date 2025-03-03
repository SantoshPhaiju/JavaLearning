package College.OOP.PaymentExample;

public abstract class Payment {
    protected double transactionAmount;

    public Payment(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public abstract void pay();

    public double getCommissionRate() {
        return getCommissionRate(transactionAmount);
    }

    public double getCommissionRate(double amount) {
        if (amount < 10000) {
            return 0.05; // 5% commission
        } else if (amount < 50000) {
            return 0.08; // 8% commission
        } else if (amount < 100000) {
            return 0.10; // 10% commission
        } else {
            return 0.15; // 15% commission
        }
    }

    public double calculateCommission() {
        return transactionAmount * getCommissionRate();
    }

    // Display transaction details
    public void displayTransactionDetails() {
        try {
            System.out.println("Processing transaction...");
            Thread.sleep(3000); // 1-second delay

            System.out.println("Transaction Amount: Rs." + transactionAmount);
            Thread.sleep(2000); // 1-second delay

            System.out.println("Commission Rate: " + (getCommissionRate() * 100) + "%");
            Thread.sleep(1000); // 1-second delay

            System.out.println("Commission Amount: Rs." + calculateCommission());
            Thread.sleep(3000); // 1-second delay
            double commissionAmount = calculateCommission();
            double totalamount = commissionAmount + transactionAmount;
            System.out.println("Paid Amount: Rs." + totalamount);
            
            System.out.println("Transaction Complete!");
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
