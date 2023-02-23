package section1_groovybasics;

public class DinnerParty {
    public static void main(String[] args) {
        int numberOfGuests = 2;
        int numberOfShakes = 0;
        // assume 3 guests
        for (int guest=0; guest<numberOfGuests;guest++){
            numberOfShakes += numberOfGuests-(numberOfGuests-1);
        }
        System.out.println("number of shakes: "+numberOfShakes);
    }
}
