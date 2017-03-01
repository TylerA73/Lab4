/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.awt.Rectangle;

/**
 * ResizeCommand
 * Implements Command interface
 * Handles the resizing of a rectangle.
 * 
 * @author Tyler
 */
public class ResizeCommand implements Command{
    Rectangle r;
    int height;
    int width;
    int lastWidth;
    int lastHeight;
    
    /**
     * Constructor for the resize command.
     * 
     * @param w     New width of the rectangle
     * @param h     New height of the rectangle
     * @param r     Rectangle to be resized
     */
    ResizeCommand(int w, int h, Rectangle r){
        this.r = r;
        this.width = w;
        this.height = h;
        this.lastWidth = r.width;
        this.lastHeight = r.height;
    }
    
    /**
     * Executes the resize command
     */
    @Override
    public void execute(){
        this.r.setSize(width, height);
    }
    
    /**
     * Undoes the last resize command
     */
    @Override
    public void undo(){
        this.width = lastWidth;
        this.height = lastHeight;
        
        execute();
    }
    
}
