package com.Tester;

public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! sanket shirsat" );
        
        switch (args.length) {
            case 0:
                System.out.println("You have not enter input filepath as parameter");
                break;
            case 1:
                // File input/output
                System.out.println(" File is Here");
                break;
            default:
                System.out.println("Invalid input....");
        }
    }
        
 }

