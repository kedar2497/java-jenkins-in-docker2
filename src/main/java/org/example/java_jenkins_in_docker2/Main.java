package org.example.java_jenkins_in_docker2;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
    	System.out.println(checkIfInputIsAnEvenNumber(122));
    }
    
public static boolean checkIfInputIsAnEvenNumber(int number) {
		
		return number % 2 ==0;

	}   
    
    
}

