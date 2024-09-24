import java.util.Scanner;

public class Student {

    private String name;
    private int[] scores = new int[3];
    private int math;
    private int science;
    private int english;
    private double avgScores = 0.0;
    private String grade = " ";

    public Student(String name, int math, int science, int english){
        this.name = name;
        this.scores[0] = math;
        this.scores[1] = science;
        this.scores[2] = english;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void calculateAverage(){

        int s=0;
        for(int i=0; i<scores.length; i++){
            s = s + scores[i];
        }
        avgScores = s / 3;
        
        System.out.println("Average: " + avgScores);
    }

    public void assignGrade(){

        if(avgScores>89){
            grade = "A";
        }else if(avgScores>79 && avgScores<90){
            grade = "B";
        }else if(avgScores>69 && avgScores<80){
            grade = "C";
        }else if(avgScores>59 && avgScores<70){
            grade = "D";
        }else if(avgScores<61){
            grade = "F";
        }
        System.out.println("Grade: " + grade);
        System.out.println(" ");
    }

    public void display(){
        
        System.out.println("Name: " + name);
        System.out.println("Mathematic scores: " + scores[0]);
        System.out.println("Science scores: " + scores[1]);
        System.out.println("English scores: " + scores[2]);
        
    }
}

public class ScoreScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student[] student = new Student[5];
        
        for(int i=0; i<2; i++){

            System.out.print("Name : ");
            String setName = scanner.next();
            System.out.print("Mathematic : ");
            int setMath = scanner.nextInt();
            System.out.print("Science : ");
            int setScience = scanner.nextInt();
            System.out.print("English : ");
            int setEnglish = scanner.nextInt();
            System.out.println("");

            student[i] = new Student(setName, setMath, setScience, setEnglish);
        }

        for(int j=0; j<2; j++){
            student[j].display();
            student[j].calculateAverage();
            student[j].assignGrade();
        }

        scanner.close();
    }
}