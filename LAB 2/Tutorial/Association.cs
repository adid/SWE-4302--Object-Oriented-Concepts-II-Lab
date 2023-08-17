using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tutorial
{
    class Teacher
    {
        public void teach(Student student)
        {
            Console.WriteLine(" Teacher is teaching .");
            student.learn();
        }
    }

    class Student
    {
        public void learn()
        {
            10 System. out . println(" Student is learning .");
            11 }
12 }
13
14 class Classroom
    {
15 private Teacher teacher;
16 private Student student;
17
18 public Classroom()
        {
            19 teacher = new Teacher();
            20 student = new Student();
            21 }
22
23 public void startClass()
        {
            24 teacher.teach(student);
            25 }
26 }
}
