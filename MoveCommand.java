/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.awt.Rectangle;

/**
 *
 * @author Tyler
 */
public class MoveCommand implements Command {
    int x;
    int y;
    Rectangle r;
    
    int lastX;
    int lastY;
    
    MoveCommand(int x, int y, Rectangle r){
        this.x = x;
        this.y = y;
        this.r = r;
        
        this.lastX = r.x;
        this.lastY = r.y;
    }
    
    @Override
    public void execute(){
        this.r.setLocation(this.x, this.y);
    }
    
    @Override
    public void undo(){
        this.x = lastX;
        this.y = lastY;
        
        execute();
    }
    
}
