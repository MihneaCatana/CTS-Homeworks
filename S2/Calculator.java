package ro.ase.cts.s02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    /**
     * Aceasta metoda calculeaza suma dintre x ridicat la puterea a-5a si y ridicat la putearea a-7a.
     * @return Returneaza rezultatul calculat.
     * @throws IOException Arunca exceptie daca datele introduse nu au formatul corect.
     */

    private final String EXIT_VALUE="EXIT";

    public double calculateXpow5PlusYpow7() throws IOException {
        double result = 0.0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x = readConsole();
        double y = readConsole();

        double x5 = calculatePow(x,5);
        double y7 = calculatePow(y,7);

        result = x5 + y7;
        return result;
    }

//    Denumire metoda
//    Exceptia  aruncata trebuie modificata si tratata - check
//   In cazul valorilor non numerice, reia procesul de citire
//    Metoda separata pentru ridicarii la putere - check

    private double calculatePow(double number, int power)
    {
        double result = number;
        for (int i =1;i<power;i++)
            result *= number;
        return  result;
    }

    private double readConsole() throws IOException
    {
        boolean isValidValue = false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Tastati valoarea pentru variabila:");

        double variable=-1;
        String consoleInput;

        while(isValidValue == false) {
            try {
                consoleInput = reader.readLine();
                if (consoleInput.equals(EXIT_VALUE)) {
                    return variable;
                }
                variable = Double.parseDouble(consoleInput);
                break;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Eroare ! Dati o valoare numerica:");
            }
        }
        return  variable;
    }





}