package com.mainExecrise;

import java.util.List;

public class College {

    String cName;
    List<Course> coursesList;

    public College(String cName) {
        this.cName = cName;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public List<Course>  getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Course>  coursesList) {
        this.coursesList = coursesList;
    }
}
