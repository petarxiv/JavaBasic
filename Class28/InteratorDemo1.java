package Class28;

import java.util.LinkedList;
import java.util.List;

public class InteratorDemo1 {
    public static void main(String[] args) {
        List<String> courses=new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Java");
        courses.add("Java");
        courses.add("Selenium");

     /*   for(int i=0; i<5; i++){
            if(courses.get(i).equals("Java")){
                courses.remove("java");
            }
        } */

        for(String course:courses){
            if(course.equals("Java")){
                courses.remove(course);
            }
        }
    }
}
