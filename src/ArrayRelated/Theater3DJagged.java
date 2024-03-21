package ArrayRelated;

/*import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Theater3DJagged
{
    static Scanner sc = new Scanner(System.in);
    static int i,j,k;
    static int Platinum=1000,Gold=500,Silver=250;
    public static <BookingSeats> void main(String[] args)
    {
        int[][][] seats = {
                {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}},
                {
                        {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                        {21, 22, 23, 24, 25, 26, 27, 28, 29, 30}
                },
                {
                        {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
                        {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
                        {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
                }
        };
        System.out.println("The seats available in the Theatre : ");
        // Iterate over each dimension and print the values
        for ( i = 0; i < seats.length; i++) {
            for (j = 0; j < seats[i].length; j++) {
                System.out.println(Arrays.toString(seats[i][j]));
            }
            System.out.println();
        }

        System.out.println("Platinum Seats 1 to 10 Fair : ₹1000 \nGold seats 11 to 30 Fair : ₹500 \nSilver seats 31 to 60 Fair : ₹250");
        System.out.println("Enter the number between 1 to 60 for booking : ");
        while(sc.hasNext())
        {
            int book = sc.nextInt();
            BookingSeats(seats,book);
            System.out.println("Platinum Seats 1 to 10 Fair : ₹1000 \nGold seats 11 to 30 Fair : ₹500 \nSilver seats 31 to 60 Fair : ₹250");
            System.out.println("Enter the number between 1 to 60 for More booking : ");
        }



    }


    public class RandomNumberGenerator {

        private static final int MIN_RANGE = 10000;
        private static final int MAX_RANGE = 99999;

        private static Random random = new Random();

        private RandomNumberGenerator() {
            // Private constructor to prevent instantiation of the class
        }

        public static int generateRandom5DigitNumber() {
            return MIN_RANGE + random.nextInt(MAX_RANGE - MIN_RANGE + 1);
        }
    }

    private static void BookingSeats(int[][][] seats, int book)
    {
        if(book>=1&&book<11)
        {
            for (int i = 0; i < seats.length; i++) {
                for (int j = 0; j < seats[i].length; j++) {
                    for(int k=0;k<seats[i][j].length;k++)
                    {
                        if(book==seats[i][j][k])
                        {
                            int randomNumber = RandomNumberGenerator.generateRandom5DigitNumber();

                            System.out.println("The OTP to confirm booking is : "+randomNumber);
                            System.out.println("Enter the OTP to confirm :");
                            int checkOtp = sc.nextInt();
                            if(checkOtp==randomNumber)
                            {
                                System.out.println("Enter ₹1000 as FAIR in console :  ");
                                if(sc.nextInt()==Platinum)
                                {
                                    System.out.println("The seat has been booked the booked seat is -1");
                                    seats[i][j][k]=-1 ; // indicating the seat has been booked
                                    for ( int a = 0; a < seats.length; a++) {
                                        for (int b = 0; b < seats[a].length; b++) {
                                            System.out.println(Arrays.toString(seats[a][b]));
                                        }
                                        System.out.println();
                                    }
                                }
                            }

                        }
                    }
                }

            }
        }//case for platinum ends
        else if(book>=11&&book<31)
        {
            for (int i = 0; i < seats.length; i++) {
                for (int j = 0; j < seats[i].length; j++) {
                    for(int k=0;k<seats[i][j].length;k++)
                    {
                        if(book==seats[i][j][k])
                        {
                            int randomNumber = RandomNumberGenerator.generateRandom5DigitNumber();

                            System.out.println("The OTP to confirm booking is : "+randomNumber);
                            System.out.println("Enter the OTP to confirm :");
                            int checkOtp = sc.nextInt();
                            if(checkOtp==randomNumber)
                            {
                                System.out.println("Enter ₹500 as FAIR in console :  ");
                                if(sc.nextInt()==Gold)
                                {
                                    System.out.println("The seat has been booked the booked seat is -1");
                                    seats[i][j][k]=-1 ; // indicating the seat has been booked
                                    for ( int d = 0; d < seats.length; d++) {
                                        for (int e = 0; e < seats[d].length; e++) {
                                            System.out.println(Arrays.toString(seats[d][e]));
                                        }
                                        System.out.println();
                                    }
                                }
                            }

                        }
                    }
                }

            }
        }//case for gold ends

        else if(book>=31&&book<61)
        {
            for (int i = 0; i < seats.length; i++) {
                for (int j = 0; j < seats[i].length; j++) {
                    for(int k=0;k<seats[i][j].length;k++)
                    {
                        if(book==seats[i][j][k])
                        {
                            int randomNumber = RandomNumberGenerator.generateRandom5DigitNumber();

                            System.out.println("The OTP to confirm booking is : "+randomNumber);
                            System.out.println("Enter the OTP to confirm :");
                            int checkOtp = sc.nextInt();
                            if(checkOtp==randomNumber)
                            {
                                System.out.println("Enter ₹250 as FAIR in console :  ");
                                if(sc.nextInt()==Silver)
                                {
                                    System.out.println("The seat has been booked the booked seat is -1");
                                    seats[i][j][k]=-1 ; // indicating the seat has been booked

                                    for ( int x = 0; x < seats.length; x++) {
                                        for ( int y = 0; y < seats[x].length; y++) {
                                            System.out.println(Arrays.toString(seats[x][y]));
                                        }
                                        System.out.println();
                                    }
                                }
                            }


                        }
                    }
                }

            }
        }//case for silver ends

    }
}*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Theater3DJagged {
    static Scanner sc = new Scanner(System.in);
    static int Platinum = 1000, Gold = 500, Silver = 250;

    public static void main(String[] name) {
        List<List<List<Integer>>> seats = initializeSeats();

        System.out.println("The seats available in the Theatre : ");
        // Iterate over each dimension and print the values
        for (List<List<Integer>> seat : seats) {
            for (List<Integer> integers : seat) {
                System.out.println(integers);
            }
            System.out.println();
        }

        System.out.println("Platinum Seats 1 to 10 Fair : ₹1000 \nGold seats 11 to 30 Fair : ₹500 \nSilver seats 31 to 60 Fair : ₹250");
        System.out.println("Enter the number between 1 to 60 for booking : ");
        while (sc.hasNext()) {
            int book = sc.nextInt();
            if(book==0)
            {
                break;
            }
            else {
                bookingSeats(seats, book);
                System.out.println();
                System.out.println("Platinum Seats 1 to 10 Fair : ₹1000 \nGold seats 11 to 30 Fair : ₹500 \nSilver seats 31 to 60 Fair : ₹250");
                System.out.println("Enter the number between 1 to 60 for More booking (enter 0 to exit): ");}

        }
    }

    private static List<List<List<Integer>>> initializeSeats() {
        List<List<List<Integer>>> seats = new ArrayList<>();

        seats.add(Arrays.asList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
        seats.add(Arrays.asList(
                Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20),
                Arrays.asList(21, 22, 23, 24, 25, 26, 27, 28, 29, 30)
        ));
        seats.add(Arrays.asList(
                Arrays.asList(31, 32, 33, 34, 35, 36, 37, 38, 39, 40),
                Arrays.asList(41, 42, 43, 44, 45, 46, 47, 48, 49, 50),
                Arrays.asList(51, 52, 53, 54, 55, 56, 57, 58, 59, 60)
        ));

        return seats;
    }

    private static void bookingSeats(List<List<List<Integer>>> seats, int book) {
                     for (int i = 0; i < seats.size(); i++) {
            for (int j = 0; j < seats.get(i).size(); j++) {
                for (int k = 0; k < seats.get(i).get(j).size(); k++) {
                    if (book == seats.get(i).get(j).get(k)) {
                        int randomNumber = RandomNumberGenerator.generateRandom5DigitNumber();

                        System.out.println("The OTP to confirm booking is : " + randomNumber);
                        System.out.println("Enter the OTP to confirm :");
                        int checkOtp = sc.nextInt();
                        if (checkOtp == randomNumber) {
                            int seatPrice = getSeatPrice(book);
                            System.out.println("Enter ₹" + seatPrice + " as FAIR in console :  ");
                            if (sc.nextInt() == seatPrice) {
                                System.out.println("The seat has been booked. The booked seat is -1");
                                seats.get(i).get(j).set(k, -1); // indicating the seat has been booked
                                for (int a = 0; a < seats.size(); a++) {
                                    for (int b = 0; b < seats.get(a).size(); b++) {
                                        System.out.println(seats.get(a).get(b));
                                    }
                                    System.out.println();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static int getSeatPrice(int seatNumber) {
        if (seatNumber >= 1 && seatNumber < 11) {
            return Platinum;
        } else if (seatNumber >= 11 && seatNumber < 31) {
            return Gold;
        } else if (seatNumber >= 31 && seatNumber < 61) {
            return Silver;
        }
        return 0; // Default case, should not happen
    }

    public static class RandomNumberGenerator {
        private static final int MIN_RANGE = 10000;
        private static final int MAX_RANGE = 99999;

        private static Random random = new Random();

        private RandomNumberGenerator() {
            // Private constructor to prevent instantiation of the class
        }

        public static int generateRandom5DigitNumber() {
            return MIN_RANGE + random.nextInt(MAX_RANGE - MIN_RANGE + 1);
        }
    }
}

