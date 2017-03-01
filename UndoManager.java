/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Stack;

/**
 * UndoManager
 * Manages the previous moves and resizes made to each rectangle.
 *
 * @author Tyler
 */
public class UndoManager {
    Stack<Command> undo;
    
    /**
     * Constructor for the UndoManager
     */
    UndoManager(){
        undo = new Stack();
    }
    
    /**
     * Pushes a command onto the undo stack.
     * 
     * @param cmd   Command of the operation made to the rectangle.
     */
    public void add(Command cmd){
        undo.push(cmd);
    }
    
    /**
     * Undo the last command made to a rectangle.
     */
    public void undo(){
        undo.pop().undo();
    }
}
