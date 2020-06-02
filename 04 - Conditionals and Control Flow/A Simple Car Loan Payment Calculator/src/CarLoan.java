public class CarLoan {
    /*
    This class calculates the monthly payment for a car loan.
    It is far from how interests are calculated in real life.
     */

    public static void main(String[] args) {
        int carLoan = 10000;
        int loanLength = 3;
        int interestRate = 5;
        int downPayment = 2000;

        if (loanLength < 1 || interestRate < 1) {
            System.out.println("Error! You must take out a valid car load");
        } else if (downPayment > carLoan) {
            System.out.println("The car can be paid in full.");
        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = monthlyBalance * interestRate / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }

    }
}