/*
 * Copyright arupingit(Arup Dutta) 
 * github profile url  https://github.com/arupingit
 * 
 */
package net.arup.spring.dependencyInjection;

/**
 * class App
 * Conventional coding to interface pattern.
 */
public class App 
{
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main( String[] args )
    {
        Student student = new Student(new Pencils());
        Shapes shape = new Circle();
        student.setShapes(shape);
        student.draw();
    }
}
