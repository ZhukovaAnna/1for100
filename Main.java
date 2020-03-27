public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++)
        {
            double payment = Double.parseDouble(args[i]);
            double bonus = 0;
            if (payment >=1000)
            {
                bonus = 100;
            }
            System.out.print("Payment " + payment + " bonus = " + bonus + "\n");
        }


}
}
