package com.mainExecrise;

import java.util.*;


class NameComparator implements Comparator<College>{


    @Override
    public int compare(College t1, College t2) {
        if(t1.cName==t2.cName){
            return  0;
        }else if(t1.cName.compareTo(t2.cName)<0){
            return 1;
        }else {
            return -1;
        }
    }

    @Override
    public Comparator<College> reversed() {
        return null;
    }
}


public class Main {

    public static void main(String[] args) {




        Student s1 = new Student("ABC");
        Student s2 = new Student("XYZ");
        Student s3 = new Student("Rahul");
        Student s4 = new Student("Bhavesh");
        Student s5 = new Student("Raj");

        List<Student> studentList1 = new ArrayList<Student>();
        List<Student> studentList2 = new ArrayList<Student>();
        List<Student> studentList3 = new ArrayList<Student>();

        studentList1.add(s1);
        studentList1.add(s3);
        studentList2.add(s2);
        studentList2.add(s4);
        studentList3.add(s1);
        studentList3.add(s5);


        Course course1 = new Course("DS");
        Course course2 = new Course("DBMS");
        Course course3 = new Course("DIS");
        Course course4 = new Course("EG");

        course1.setStudentList(studentList1);
        course2.setStudentList(studentList2);
        course3.setStudentList(studentList3);
        course4.setStudentList(studentList2);


        List<Course> courseList1 = new ArrayList<Course>();
        List<Course> courseList2 = new ArrayList<Course>();
        List<Course> courseList3 = new ArrayList<Course>();

        courseList1.add(course1);
        courseList1.add(course3);
        courseList2.add(course2);
        courseList2.add(course4);
        courseList3.add(course1);
        courseList3.add(course2);


        College c1 = new College("GEC");
        College c2 = new College("NIRMA");
        College c3 = new College("DICT");

        c1.setCoursesList(courseList1);
        c2.setCoursesList(courseList2);
        c3.setCoursesList(courseList3);

        List<College> collegeList1 = new ArrayList<College>();

        collegeList1.add(c1);
        collegeList1.add(c2);
        collegeList1.add(c3);



        Collections.sort(collegeList1,new NameComparator());
        System.out.println("Order");

        for (College college : collegeList1) {
            System.out.print("college Name " + college.cName + "-> ");
            for (Course course : college.getCoursesList()) {
                System.out.print(" courses " + course.courseName + "-> ");
                for (Student student : course.getStudentList()) {
                    System.out.print(" " + student.sName);
                }
            }
            System.out.println();
        }

        System.out.println();


        System.out.println("convert HashSet");

        HashSet<College> hashSet = new HashSet<>(collegeList1);

        for (College college : hashSet) {
            System.out.print("college Name " + college.cName + "-> ");
            for (Course course : college.getCoursesList()) {
                System.out.print(" courses " + course.courseName + "-> ");
                for (Student student : course.getStudentList()) {
                    System.out.print(" " + student.sName);
                }
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("convert HashMap");
        HashMap<Integer,College> hashMap = new HashMap<>();
        hashMap.put(1,c1);
        hashMap.put(2,c2);
        hashMap.put(3,c3);


        for (Map.Entry hashmap : hashMap.entrySet()) {
            System.out.print("ID " + hashmap.getKey()+" ");
            College college = (College) hashmap.getValue();

            System.out.print("college Name " + college.cName + "-> ");
            for (Course course : college.getCoursesList()) {
                System.out.print(" courses " + course.courseName + "-> ");
                for (Student student : course.getStudentList()) {
                    System.out.print(" " + student.sName);
                }
            }
            System.out.println();
        }

/*
        collegeList1.stream().forEach(college ->  {
                    System.out.print(college.cName + " -> ");
                    college.getCoursesList().stream().forEach(course -> {
                        System.out.print("  " + course.courseName + "-> ");
                        course.getStudentList().stream().forEach(student -> {
                            System.out.print(" " + student.sName +"   ");
                        });
                    });
                    System.out.println();
                }
        );*/


    }
}
