import java.util.Scanner;
public class elseIf {
    public static void main(String[] args) {
                //Income Tax Calculator
                //         Tax Slabs:
                // Income up to ₹2.5 lakh: Nil
                // ₹2.5 lakh to ₹5 lakh: 5%
                // ₹5 lakh to ₹7.5 lakh: 10%
                // ₹7.5 lakh to ₹10 lakh: 15%
                // ₹10 lakh to ₹12.5 lakh: 20%
                // ₹12.5 lakh to ₹15 lakh: 25%
                // Above ₹15 lakh: 30%

        Scanner s = new Scanner(System.in);
        System.out.println("Income Tax Calculator");
        System.out.println("Please Enter the your P/A Eearnig(Lakh) :-");
        float n = s.nextFloat();
        int lakh = 100000;
        float income = n * lakh;

        if (income <= 2.5 * lakh) {
            System.out.println("Your Income :-: "+ income);
            System.out.println("Your Tex :- Nil");
        }
        else if (income > 2.5 * lakh && income <= 5 * lakh) {
            float tax = income * 5f/100;
            System.out.println("Your Income :-: "+ income);
            System.out.println("Your Tex 5% :- "+tax);
        }
        else if (income > 5 * lakh && income <= 7.5 * lakh) {
            float tax = income * 10f/100;
            System.out.println("Your Income :-: "+ income);
            System.out.println("Your Tex 10% :- "+tax);
        }
        else if (income > 7.5 * lakh && income <= 10 * lakh) {
            float tax = income * 15f/100;
            System.out.println("Your Income :-: "+ income);
            System.out.println("Your Tex 15% :- "+tax);
        }
        else if (income > 10 * lakh && income <= 12.5 * lakh) {
            float tax = income * 20f/100;
            System.out.println("Your Income :-: "+ income);
            System.out.println("Your Tex 20% :- "+tax);
        }
        else if (income > 12.5 * lakh && income <= 15 * lakh) {
            float tax = income * 25f/100;
            System.out.println("Your Income :-: "+ income);
            System.out.println("Your Tex 25% :- "+tax);
        }
        else {
            float tax = income * 30f/100;
            System.out.println("Your Income :-: "+ income);
            System.out.println("Your Tex 30% :- "+tax);
        }

        s.close();
        

    }
}
