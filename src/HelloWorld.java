/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Hello! This is the first lesson in a series of 
 * lessons for those who are new to Java. This tutorial
 * cover a large amount of content, starting with a basic
 * output message to advanced Java topics, including 
 * input/output. 
 * 
 * The lessons will be structured in the following way:
 * First, this javadoc describes what the lesson will
 * be about. Next, you will find the main method, with 
 * a multitude of comments to guide you through the 
 * lesson. 
 * 
 * Lesson 1:
 * This lesson will cover very basic output to the
 * default console using System.out.println();
 * 
 * @author Manu Singhal
 */
public class HelloWorld 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        /*
        Welcome to Java! This tutorial will help you
        learn how to use this versatile programming
        language!
        
        Java is a language that is very easy to understand,
        yet so developed that one can make whatever program
        he or she wishes. All programmers make extensive use 
        of debugging, which is used to fix programs when it is
        faulty. The most basic form of debugging comes from
        CONSOLE OUTPUT, where a message will appear in the window
        underneath the editor you are viewing. The main way to 
        send messages to the console is by using System.out.println(),
        which we will abbreviate SYSO. syso is a method, an instruction
        for the program to do something. In this case, to output
        a message to the console. 
        
        Below, you will find a SYSO statement. If you run
        the program, you will find the message inside the console below.
        Try it! You can run the program by hitting the green arrow
        in your toolbar above (when using Eclipse or NetBeans).
        */
        
        System.out.println("Hello World!");
        
        /*
        Did you run it? You should have seen Hello World! in the 
        console below. Note that the message appears without the 
        quotation marks "". Try removing the quotes and the program.
        What happens to the program?
        */
        
        /*
        You should have gotten an ERROR MESSAGE, a message that tells
        you that the code is wrong. In this case, the quotation marks
        tell the complier to treat the stuff inside as characters, and
        not as other Objects (more on this in another lesson). You can
        modify the message inside to be whatever you want it to be! Try 
        it out with your name!
        */
        
        System.out.println("Put your name here!");
        
        /*
        As mentioned before, syso is used as an easy debugging method
        for programmers when something is wrong in a program. Using
        the console will become important, even when you're not debugging.
        For example, when you want to tell the user (the person who is
        running the program) something, it is easy to use syso.
        */
    }

}
