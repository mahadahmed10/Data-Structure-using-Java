package Homework;

import java.util.Date;

public class exercise3 {
    public static void main(String[] args) {
        Loan l1= new Loan(2.5,1,1000);

        System.out.println("Annual Interest Rate: " +l1.getAnnualInterestRate() +"%");
        System.out.println("Number Of Years: "+l1.getNumberOfYears());
        System.out.println("Loan Amount: "+ l1.getLoanAmount());

        System.out.printf("Monthly Payment: $ %.2f%n",l1.getMonthlyPayment());
        System.out.printf("Total Payment: $ %.3f%n",l1.getTotalPayment());

    }
}


class Loan{
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public  Loan(){};
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate=annualInterestRate;
        this.numberOfYears=numberOfYears;
        this.loanAmount=loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment(){
        double monthly_rate= (annualInterestRate / (12 * 100));
        int numOfMonthly= numberOfYears * 12;

        return (loanAmount * monthly_rate) / (1 - Math.pow(1 + monthly_rate,-numOfMonthly));
    }

    public double getTotalPayment(){
        return getMonthlyPayment() * numberOfYears * 12;
    }

}