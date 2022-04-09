package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Animal afrodita = new Animal("Afrodita", 1, 10) ;
        Animal hermes = new Animal("hermes", 10, 100) ;

        afrodita.sayHello();
        hermes.sayHello();
        System.out.println(afrodita.getName());
        Animal dog = new Dog("Bobik", 4, 17, "shepherd");
        ((Dog)dog).sayHello();
        /*int x0, y0, x, y, r;
        Scanner scanner = new Scanner(System.in);
        x0 = scanner.nextInt();
        //System.out.println(a);
        y0 = scanner.nextInt();
        //System.out.println(b);
        x = scanner.nextInt();
        //System.out.println(c);
        y = scanner.nextInt();
        //System.out.println(c);
        r = scanner.nextInt();
        //System.out.println(c);
        switch(r){
            case 1:
                System.out.println("desyat");
                break;
            case 2:
                System.out.println("");
                break;
            case 3:
                break;
            default:
        }
        double length = Math.sqrt(Math.pow(x-x0,2)+Math.pow(y-y0,2));
        //System.out.println(d);
        if (r>length){
            System.out.println("In the circle");
        }
        else if(r==length){
            System.out.println("On the circle");
        }
        else {
            System.out.println("Out of the circle");
        }
*/
    }
}
