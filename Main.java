public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            double payment = Double.parseDouble(args[i]);
            double bonus = 0;
            double total = 0;
            double deposit = 100;
            if (payment >= 1000) {
                bonus = payment * 0.01;
            }
            total = deposit + payment + bonus;
            System.out.print("Payment " + payment + " bonus = " + bonus + " total = " + total + "\n");
        }


}
}
