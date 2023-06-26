public class CreditPaymentService {
    public double calculate (int amountCredit, int years){
        double percentYear = 9.99;
        double percentMonth = (percentYear / 12) / 100;
        int months = years * 12;
        double coefficient = (percentMonth * Math.pow((1 + percentMonth), months)) / (Math.pow((1 + percentMonth), months) - 1);
        double monthPayment = amountCredit * coefficient;
        return monthPayment;
    }
}
