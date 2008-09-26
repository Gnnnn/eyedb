package org.eyedb.benchmark.quicktour.db4o;

import java.util.*;

public class Student extends Person {
    public Student( String firstName, String lastName)
    {
	super( firstName, lastName);

	courses = new HashSet();
    }

    Set getCourses()
    {
	return courses;
    }

    public void addCourse( Course course)
    {
	courses.add( course);
	course.getStudents().add( this);
    }

    public void removeCourse( Course course)
    {
	courses.remove( course);
	course.getStudents().remove( this);
    }

    private Set courses;
}
