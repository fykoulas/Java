package gr.aueb.cf.ch2;

public class PrintApp {
    public static void main(String[] args) {
        int day = 8;
        int month = 7;
        int year = 2024;
        int poso = 54844;

        System.out.println("Η ημερομηνία είναι: " + day + "/" + month + "/" + year);
        System.out.printf("Η ημερομηνία είναι: %02d/%02d/%d", day, month, year);
        System.out.printf(" και το ποσό που απομένει είναι: %,d", poso);



    }
}
