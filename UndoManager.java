/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Stack;

/**
 *
 * @author Tyler
 */
public class UndoManager {
    Stack<Command> undo;
    Command last;
    
    UndoManager(){
        undo = new Stack();
    }
    
    public void add(Command cmd){
        
    }
    
    public void undo(){
        
    }
}
