package com.buralo.demo.polyglot.hello;

import org.graalvm.polyglot.Context;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello from Java!");
        try (Context context = Context.newBuilder().allowAllAccess(true).build()) {
            context.eval("js", "print('Hello from JavaScript!');");
            context.eval("python", "print(\"Hello from Python!\")");
            context.eval("R", "print('Hello from R!')");
            context.eval("ruby", "puts \"Hello from Ruby!\"");
        }
     }
}
