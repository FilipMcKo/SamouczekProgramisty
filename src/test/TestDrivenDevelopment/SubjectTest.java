package test.TestDrivenDevelopment;

import TestDrivenDevelopment.Subject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {
    Subject math = new Subject("Math");

    @Test
    void shouldAddGradeToSubject(){
        assertTrue(math.addGrade(5));
    }

    @Test
    void shouldCountGradeAverage(){
        math.addGrade(3);
        math.addGrade(5);
        math.addGrade(4);
        math.addGrade(5);
        assertEquals(4.25, math.calculateAverage());
    }

}