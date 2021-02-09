package com.company;

public class Grade implements Comparable<Grade> {

    private String gradeLetter;
    private int gradeValue;

    public Grade(String gradeLetter){
        this.gradeLetter = gradeLetter;
        determineGrade(gradeLetter);
    }

    private void determineGrade(String userInput){

        if(userInput.charAt(0) == 'a' || userInput.charAt(0) == 'A'){
            gradeLetter = "A";
            gradeValue = 2;
        } else if(userInput.charAt(0) == 'b' || userInput.charAt(0) == 'B'){
            gradeLetter = "B";
            gradeValue = 5;
        } else if(userInput.charAt(0) == 'c' || userInput.charAt(0) == 'C'){
            gradeLetter = "C";
            gradeValue = 8;
        } else if(userInput.charAt(0) == 'd' || userInput.charAt(0) == 'D') {
            gradeLetter = "D";
            gradeValue = 11;
        } else if(userInput.charAt(0) == 'f' || userInput.charAt(0) == 'F'){
            gradeLetter = "F";
            gradeValue = 14;
        } else {
            gradeValue = 0;
        }

        if(userInput.length() > 1) {
            if (userInput.substring(1).equals("+")) {
                gradeLetter += "+";
                gradeValue += 1;
            } else if (userInput.substring(1).equals("-")) {
                gradeLetter += "-";
                gradeValue -= 1;
            }
        }
    }

    public String getGradeLetter() {
        return gradeLetter;
    }

    public int getGradeValue() {
        return gradeValue;
    }

    @Override
    public int compareTo(Grade o) {
        return Integer.compare(this.gradeValue, o.getGradeValue());
    }
}
