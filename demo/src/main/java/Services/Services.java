package Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;


@Service
public class Services {
	
	List<Course>list;

	public Services()
	{
		list = new ArrayList<>();
		list.add(new Course(1,"Soap",30,"Household"));
		list.add(new Course(2,"Mobile",20000,"Electronic product"));
		list.add(new Course(3,"Sweater",1000,"Clothing"));
		list.add(new Course(4,"Computer",50000,"Electronic product"));
	}
	@Override
	public List<Course> getCourses() {
		return list;
	}
	@Override
	public Course getCourse(long CourseId) {
		Course c=null;
		for(Course course: list)
		{
			if(course.getId()==CourseId)
			{
				c=course;
				break;
			}
		}
		return c;
	}
	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

}



