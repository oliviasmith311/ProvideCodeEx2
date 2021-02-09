package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter grade:");
        sortValues(getGradesToSort());
    }

    private static final Scanner input = new Scanner(System.in);

    public static ArrayList<Grade> getGradesToSort(){

        ArrayList<Grade> gradeList = new ArrayList<>();

        while(true){
            System.out.println("Enter a grade or enter 0 to exit");
            String gradeInput = input.nextLine();

            if(gradeInput.equals("0")){
                break;
            }

            Grade gradeObject = new Grade(gradeInput);
            if (gradeObject.getGradeValue() == 0) {
                System.out.println("Invalid input. Please enter valid letter grade");
            } else {
                gradeList.add(gradeObject);
            }

        }
        return gradeList;
    }

    public static ArrayList<Grade> sortValues(ArrayList<Grade> grades) {

        Collections.sort(grades);

        for (Grade sortedGrade: grades){
            System.out.println(sortedGrade.getGradeLetter());
        }

        return grades;
    }
}