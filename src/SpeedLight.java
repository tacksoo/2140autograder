/**
 * Class: SpeedLight
 * @author: Your Name
 * @version x.x
 * @course: ITEC 2140 Fall 2019
 * Written: Month Date, 2019
 * The speed of sound is approximately 340 meters per second. Assume that you just saw a lightning flash
 * and you heard the sound of thunder 5 seconds later.
 * Write a program to compute the distance to a lightning strike based on the time elapsed between
 * the flash and the sound of thunder.
 */
public class SpeedLight {
    public static void main(String[] args)
    {
        double SPEED_OF_SOUND = 340.0; //speed of sound per second
        double distance = 5 * SPEED_OF_SOUND;

        System.out.println("The distance is " + distance + " meters");
    }
}
