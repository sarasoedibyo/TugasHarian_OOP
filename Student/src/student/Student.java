/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;

/**
 *
 * @author Gabriella Sara
 */
public class Student {
   int studentAge;

   public Student(String name) {
      // This constructor has one parameter, name.
      System.out.println("Name chosen is :" + name );
   }

   public void setAge( int age ) {
      studentAge = age;
   }

   public int getAge( ) {
      System.out.println("Student's age is :" + studentAge );
      return studentAge;
   }

   public static void main(String []args) {
      /* Object creation */
      Student myStudent = new Student( "Gabriella Sara Soedibyo" );

      /* Call class method to set student's age */
      myStudent.setAge( 18 );

      /* Call another class method to get student's age */
      myStudent.getAge( );

      /* You can access instance variable as follows as well */
      System.out.println("Variable Value :" + myStudent.studentAge );
   }
}
