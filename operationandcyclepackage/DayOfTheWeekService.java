package operationandcyclepackage;

public class DayOfTheWeekService {
    public static void main(String[] args) {
        String nameOfTheDay = "tuesday" ;
        int numberOfTheDay;

        switch (nameOfTheDay.toUpperCase()){
            case "MONDAY":
                numberOfTheDay =1;
                System.out.println("The day is Monday");
                break;
            case "TUESDAY":
                numberOfTheDay =2;
                System.out.println("The day is Tuesday");
                break;
            case "WEDNESDAY":
                numberOfTheDay =3;
                System.out.println("The day is Wednesday");
                break;
            case "THURSDAY":
                numberOfTheDay =4;
                System.out.println("The day is Thursday");
                break;
            case "FRIDAY":
                numberOfTheDay =5;
                System.out.println("The day is Friday");
                break;
            case "SATURDAY":
                numberOfTheDay =6;
                System.out.println("The day is Saturday");
                break;
            case "SUNDAY":
                numberOfTheDay =7;
                System.out.println("The day is Sunday");
                break;

            default: numberOfTheDay = 0;
                System.out.println("There is not day defined in your program");


        }
        System.out.println(numberOfTheDay);




    }
}
