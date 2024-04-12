package easyjava.week06.quiz7_1;
//2133007
//황스일
class Circle extends Shape {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("원을 그리다.");
	}

	public double findArea() {
		return pi * radius * radius;
	}
}