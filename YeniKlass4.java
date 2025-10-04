package io;

import java.io.FileReader;
import java.io.IOException;

public class YeniKlass4 {

    public static void main(String[] args) {

        try {


            FileReader reader = new FileReader("salam.txt");

            int simvolKodu;

            while ((simvolKodu = reader.read()) != -1) {


                System.out.print((char) simvolKodu);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Yanlis Emeliyyat etdiniz");

        }
    }


}
