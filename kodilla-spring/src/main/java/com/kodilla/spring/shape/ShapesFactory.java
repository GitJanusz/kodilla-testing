package com.kodilla.spring.shape;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

//Drugi sposób tworzenia Beanów
@Configuration
public class ShapesFactory {
    @Bean
    public Square createSquare() {
        return new Square();
    }
    //Metoda chosenShape() losuje liczbę typu int i w zależności
    // od wyniku losowania tworzy obiekt jednego z typów:
    // Circle, Triangle oraz Square. Następnie wylosowany obiekt jest
    // zwracany jako bean typu ogólnego Shape – czegoś takiego nie jesteśmy
    // w stanie zrealizować przy pomocy adnotacji @Component.
    @Bean
    public Shape chosenShape() {
        Shape theShape;
        Random generator = new Random();
        int chosen = generator.nextInt(3);
        if (chosen == 0) {
            theShape = new Triangle();
        } else if (chosen == 1) {
            theShape = new Circle();
        } else {
            theShape = new Square();
        }
        return theShape;
    }
}
