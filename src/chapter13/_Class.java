package chapter13;

import java.util.ArrayList;
import java.util.List;

public class _Class {

    List students;

    _Class(){
        students = new ArrayList();
        makeStudent();
    }

    void makeStudent(){
        for(int i=0; i<5; i++){
            this.students.add((int)(Math.random()*1000)+1);
        }
    }

    void showStudent(){
        for(int i=0;i<this.students.size();i++){
            System.out.println(students.get(i));
        }
    }

}
