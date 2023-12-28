package org.lab08.gradeSys;
import java.util.ArrayList;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


class Student {
    private int id;
    private String name;
    private ArrayList<Integer> gradeList = new ArrayList<>();

    public Student(int id, String name, ArrayList<Integer> gradeList){
        this.id = id;
        this.name = name;
        this.gradeList = gradeList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGradeList() {
        return gradeList;
    }

    public void setGradeList(ArrayList<Integer> gradeList) {
        this.gradeList = gradeList;
    }

    public void printInfo(){
        System.out.println("ID: " + this.id + "\nName: " + this.name);
        for(Integer grade : this.gradeList){
            System.out.print(grade + " ");
        }
    }
}
class GradeAnalyzer {
    private ArrayList<Integer> gradeList = new ArrayList<Integer>();

    public GradeAnalyzer(ArrayList<Integer> gradeList){
        this.gradeList = gradeList;
    }

    public double calculateAverage(){
        double sum = 0;
        for(Integer grade : this.gradeList){
            sum += grade;
        }
        return sum / this.gradeList.size();
    }

    public void printSummary(){
        System.out.println("Grade: " + this.gradeList + "\nAverage: " + this.calculateAverage());
    }
}
class Main {
    public static void main(String[] args){
        ArrayList<Integer> gradeList = new ArrayList<>();
        gradeList.add(10);
        gradeList.add(6);
        gradeList.add(8);
        GradeAnalyzer gradeAnalyzer = new GradeAnalyzer(gradeList);

        Field[] gradeAnalyzerFields = gradeAnalyzer.getClass().getDeclaredFields();
        for(Field f : gradeAnalyzerFields){
            f.setAccessible(true);
            try{
                System.out.println(f.getName() + ": " + f.get(gradeAnalyzer));
            } catch (IllegalAccessException e){
                System.out.println("No");
            }
        }

        Method[] gradeAnalyzerMethods = gradeAnalyzer.getClass().getMethods();
        for(Method m : gradeAnalyzerMethods){
            if(m.getName().startsWith("calc")){
                m.setAccessible(true);
                try{
                    System.out.println("Average:" + m.invoke(gradeAnalyzer));
                } catch(Exception e){
                    System.out.println("Still no");
                }
            }
        }
    }
}