package com.Tester;

import com.operations.InputParser;

public class Main 
{
    public static void main( String[] args )
    {
       
        InputParser inputParser = new InputParser();
        switch (args.length) {
            case 0:
                System.out.println("You have not enter input filepath as parameter");
                break;
            case 1:
                // File input/output          	
                inputParser.parseFileInput(args[0]);
                break;
            default:
                System.out.println("Invalid input...");
        }
    }
        
 }

