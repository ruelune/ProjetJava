package model;

import java.awt.Image;

import javax.swing.text.Position;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order.Direction;

public interface Movable {
	
	public Direction getDirection();
	
	public void setDirection();
	
	public Position getPosition();
	
	public Image getImage();
	
	public void move();
	
	public void hit();
	

}
