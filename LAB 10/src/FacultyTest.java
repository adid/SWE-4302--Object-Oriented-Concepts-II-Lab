import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class FacultyTest {

    @Test
    void testClassAnnotation()
    {
        Faculty f1= new Faculty("Adid", "Professor", 250000.00);
        Field[] fields=f1.getClass().getDeclaredFields();
        List<String> actualFieldNames=new ArrayList<>();

        for (Field f:fields) {

            System.out.println(f.getName());
            boolean annotationPresent=f.isAnnotationPresent(DevelopmentHistory.class);

            if(annotationPresent)
            {
                System .out. println (f. getDeclaredAnnotations (). length );
                actualFieldNames.add(f.getName());
            }

            assertTrue(Arrays.asList("name", "designation", "salary", "courseList").containsAll(actualFieldNames));
        }

    }

    @Test
    void testConstructorAnnotations()
    {
        Faculty f1= new Faculty("Adid", "Professor", 250000.00);
        Constructor[] constructors=f1.getClass().getDeclaredConstructors();
        List<String> actualConstructorNames=new ArrayList<>();

        for (Constructor c:constructors) {

            System.out.println(c.getName());
            boolean annotationPresent=c.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);

            if(annotationPresent)
            {
                System.out.println(c.getDeclaredAnnotations().length);
                actualConstructorNames.add(c.getName());
            }

            assertTrue(Arrays.asList("Faculty", "Faculty").containsAll(actualConstructorNames));
        }
    }

    @Test
    void testTeachMethodAnnotations()
    {
        Faculty f1= new Faculty("Adid", "Professor", 250000.00);
        Method[] methods=f1.getClass().getDeclaredMethods();
        List<String> actualMethodNames=new ArrayList<>();

        for (Method m:methods) {

            System.out.println(m.getName());
            boolean annotationPresent=m.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);

            if(annotationPresent)
            {
                System.out.println(m.getDeclaredAnnotations().length);
                actualMethodNames.add(m.getName());
            }

            assertTrue(Arrays.asList("research", "teach").containsAll(actualMethodNames));
        }
    }
}