/**
 * 
 */
package org.cvtc.shapes;

import java.awt.Component;

import javax.swing.JOptionPane;


/**
 * @author Marcus
 *
 */

//Should all the shapes extend Renderer interface instead of Shape???
//a child of shape 
public class Cylinder extends Shape implements Renderer{
	
	private float radius = (float) 0.0;
	private float height = (float) 0.0;
	private Component frame;
	
	
	public Cylinder(Dialog messageBox,float radius, float height) {
		super(messageBox);
		this.radius = radius;
		this.height = height;
		
		if(radius<0 || height<0) {
			throw new IllegalArgumentException("Number must not be negative!");
		
		}
	}


	public float getRadius() {
		return radius;
	}


	public void setRadius(float radius) {
		this.radius = radius;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}




@Override
public void render() {
	
	JOptionPane.showMessageDialog(frame, "The surface area of a Cylinder is " + surfaceArea() + "\n" +"The volume of a Cylinder is " + volume());
	
}


@Override
public float surfaceArea() {
	
	double saCylinder = (2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius, 2));
	
	return (float) saCylinder;
}


@Override
public float volume() {
	
	double vCylinder = Math.PI*radius*radius*height;
	
	return (float) vCylinder;
}

}
