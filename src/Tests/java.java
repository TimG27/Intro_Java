package Tests;

public class java {
    static int Max_mark = 0;
    static int no_of_questions = 0;
    public static class cat1 {
        cat1() {
            System.out.println("First two");
        }
    }
    static {
        System.out.println ("G2 slot");
        no_of_questions = 5;
    }
    public java () {
        java j = new java (25);
        System.out.println("java course");
    }
    static {
        System.out.println ("Java offered");
        Max_mark = 50;
    }
    public java (int a) {
        System.out.println ("Max mark is " + Max_mark);
        System.out.println ("Total number of ques " + this.no_of_questions);
        this.Max_mark = a;
        no_of_questions = a;
    }
    public static void main(String[] args) {
        java.cat1 obj = new java.cat1();
        java G1 = new java();
        java G2 = new java (10);
        new java (100);
    }
}
