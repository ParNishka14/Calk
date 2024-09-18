import org.example.second_task.SubjectGrades;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestGrades {
    @Test
    void test1(){
        SubjectGrades subjectGrades = new SubjectGrades();
        subjectGrades.addGrade("Nikita",5);
        subjectGrades.addGrade("Volodya",5);
        subjectGrades.addGrade("Danya",4);
        double exx = (double) (14/3)%10;
        assertEquals(exx, subjectGrades.calculateAverage());
        System.out.println("Test 1 success");
    }

    @Test
    void test2(){
        SubjectGrades subjectGrades = new SubjectGrades();
        subjectGrades.addGrade("Nikita",2);
        subjectGrades.addGrade("Volodya",1);
        subjectGrades.addGrade("Danya",4);
        double exx = (double) (7/3)%10;
        assertEquals(exx, subjectGrades.calculateAverage());
        System.out.println("Test 2 success");
    }

    @Test
    void test3(){
        SubjectGrades subjectGrades = new SubjectGrades();
        subjectGrades.addGrade("Nikita",2);
        subjectGrades.addGrade("Volodya",1);
        subjectGrades.addGrade("Danya",4);
        subjectGrades.addGrade("Andrey",2);
        double exx = (double) (9/4)%10;
        assertEquals(exx, subjectGrades.calculateAverage());
        System.out.println("Test 3 success");
    }

    @Test
    void test4(){
        SubjectGrades subjectGrades = new SubjectGrades();
        subjectGrades.addGrade("Nikita",5);
        subjectGrades.addGrade("Volodya",5);
        double exx = (double) (10/2)%10;
        assertEquals(exx, subjectGrades.calculateAverage());
        System.out.println("Test 4 success");
    }

    @Test
    void test5(){
        SubjectGrades subjectGrades = new SubjectGrades();
        subjectGrades.addGrade("Nikita",2);
        subjectGrades.addGrade("Volodya",5);
        assertNotNull(subjectGrades.grades.get("Nikita"));
        System.out.println("Test 5 success");
    }


}
