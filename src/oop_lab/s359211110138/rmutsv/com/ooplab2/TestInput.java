package oop_lab.s359211110138.rmutsv.com.ooplab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestInput {

        public static void main(String[] args) throws IOException {

//        BufferedReader
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            System.out.println("What is your name? :");
            String name = reader.readLine();
            System.out.println("Your name is" + name);

        }
    }