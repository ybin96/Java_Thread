package study;

import java.util.Objects;

public class Box {
	private double length;
	private double width;
	private double height;
	private double volume;
	public Box(double length, double width, double heigth) {
		super();
		this.length = length;
		this.width = width;
		this.height = heigth;
	}
	public Box() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void calcVolume() {
		volume = width * length * height;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume() {
		return volume;
	}
	@Override
	public String toString() {
		return "Box [length=" + length + ", width=" + width + ", height=" + height + ", volume=" + volume + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(volume);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Box other = (Box) obj;
		return Double.doubleToLongBits(volume) == Double.doubleToLongBits(other.volume);
	}
}
