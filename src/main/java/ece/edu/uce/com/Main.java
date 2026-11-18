package ece.edu.uce.com;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Override
    public int run(String... args) throws Exception {

        System.out.println("\nHola mundo con Quarkus");

        return 0;
    }

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

}