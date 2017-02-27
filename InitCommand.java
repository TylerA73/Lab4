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
public class InitCommand implements Command {
    int x;
    int y;
    int width;
    int height;
    Rectangle r;
    
    InitCommand(int x, int y, int w, int h, Rectangle r){
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
        this.r = r;
    }
    
    @Override
    public void execute() {
        r.setBounds(x, y, width, height);
    }

    @Override
    public void undo() {

    }
    
}
