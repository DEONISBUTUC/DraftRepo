package operationandcyclepackage;

public class GradeSystemService {
    public static void main(String[] args) {
        int score = 20;
        if (score >= 90){
            System.out.println("The grade is A good job");
        } else if (score >=80) {
            System.out.println("The grade is B good job");
        }else if (score >=70) {
            System.out.println("The grade is C ");
        }else if (score >=60) {
            System.out.println("The grade is D ");
        }else if (score >=50) {
            System.out.println("The grade is E ");
        }else if (score <=50) {
            System.out.println("The exam is failed");
    }
}
}
