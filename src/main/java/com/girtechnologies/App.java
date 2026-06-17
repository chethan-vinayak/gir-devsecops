package com.girtechnologies;

public class App
{
    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    public int add(int a, int b) {
        return a + b;
    }

    public static void main( String[] args )
    {
        App app = new App();
        System.out.println( app.greet("World") );
    }
}
