public class Main {
    public static void printSeparation(){
        System.out.println( "          **********          ");
    }
    public static void printSeparationPlus(){
        System.out.println( "===========================================");
    }
    public static void main(String[] args){


        Author tolkienJRR = new Author("John R. R." , "Tolkien");
        Author kingS = new Author("Stephen" , " King");
        Book theLordOfTheRings = new Book( 1954, "The lord of the rings" , tolkienJRR);
        Book theShining = new Book(1977, "The Shining", kingS);
        theLordOfTheRings.setYear(1955);
        theShining.setYear(1980);

        System.out.println(tolkienJRR.getFirstName()+ " " + tolkienJRR.getLastName());
        printSeparation();
        System.out.println(theLordOfTheRings.getName() + " , " + theLordOfTheRings.getYear() +   " , " + tolkienJRR.getFirstName() + " " + tolkienJRR.getLastName());
        printSeparationPlus();
        System.out.println(kingS.getFirstName()+ " " + kingS.getLastName());
        printSeparation();
        System.out.println(theShining.getName() + " , " + theShining.getYear() +   " , " + kingS.getFirstName() + " " + kingS.getLastName());
    }
}