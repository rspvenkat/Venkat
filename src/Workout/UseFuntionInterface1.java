package Workout;

import Workout.Funtionalnterface1.sayable;
	public class UseFuntionInterface1 implements sayable{  
	    public void say(String msg){  
	        System.out.println(msg);  
	    }  
	    public static void main(String[] args) {  
	    	Funtionalnterface1 fie = new Funtionalnterface1();  
	        fie.say("Hello there"); 

}
