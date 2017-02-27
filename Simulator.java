/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.awt.Rectangle;

public class Simulator {
    public static void main(String[] args) {
        // UndoManager is an object that manages command objects
        // You may use a different object to enable undo
        // UndoManager undoManager = new UndoManager();
        System.out.println("Simulation");

        // Create two default rectangle objects
        Rectangle r1 = new Rectangle();
        System.out.println("--Create a default rectangle1: " + r1);
        Rectangle r2 = new Rectangle();
        System.out.println("--Create a default rectangle2: " + r2);

        // Create a command object to move r1 to a new location
        Command moveRect1 = new MoveCommand(5, 10, r1);
        moveRect1.execute();
        // undoManager.add(moveRect1);
        System.out.println("--Move rectangle1 to (5, 10): " + r1);
        
        // Undo the last action
        // undoManager.undo();
        System.out.println("--Undo, rectangle1 back to: " + r1);
        
        // ditto above... add code to simulate a certain user action
        Command resizeRect1 = new ResizeCommand(5, 10, r1);
        resizeRect1.execute();
        System.out.println("--Resize rectangle1 to 5 by 10: " + r1);

        // ditto above... add code to simulate a certain user action
        Command resizeRect2 = new ResizeCommand(8, 12, r2);
        resizeRect2.execute();
        System.out.println("--Resize rectangle2 to 8 by 12: " + r2);
        
        // ditto above... add code to simulate a certain user action
        
        System.out.println("--Move rectangle2 to (10, 20): " + r2);

        // undoManager.undo();
        System.out.println("--Undo, rectangle2 back to: " + r2);

        // undoManager.undo();
        System.out.println("--Undo, rectangle2 back to: " + r2);
    }
}
