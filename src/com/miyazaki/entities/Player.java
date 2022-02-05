package com.miyazaki.entities;

import java.awt.image.BufferedImage;

public class Player extends Entity{

	public boolean right,up,left,down;
	public double speed = 1.4;

	public Player(int x, int y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);
		// TODO Auto-generated constructor stub
	}

	public void tick(){
		if(right){
			this.setX(x+=speed);
		}else if(left){
			this.setX(x-=speed);
		}
		if(up){
			this.setY(y-=speed);
		}else if(down){
			this.setY(y+=speed);
		}
	}
	
}
