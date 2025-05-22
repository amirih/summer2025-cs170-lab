package Lab_01;

import libs.*;

public class Step07HelloTurtle {

  public static void main(String[] args) throws InterruptedException {
    Turtle pointer = new Turtle(); // create a new turtle named pointer
    pointer.delay(1000); // set the delay in milliseconds between turtle actions
    pointer.forward(200); // move the pointer forward
    pointer.left(90); // rotate the pointer to the left (counter-clockwise)
    pointer.forward(200); // move the pointer forward
    pointer.left(135); // rotate the pointer to the left (counter-clockwise)
    pointer.forward(200); // move the pointer forward
    pointer.backward(50); // move the pointer backward 50 steps
    pointer.right(45); // rotate the pointer clockwise 45 degrees
    pointer.penup(); // pointer does not draw anymore
    pointer.forward(100);
    pointer.hideturtle();
    pointer.pendown(); // pointer draws again
    pointer.forward(50);
    pointer.color("red"); // turns the turtle red
    pointer.forward(100);

  }

}
