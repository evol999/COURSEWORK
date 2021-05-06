/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author evol9
 */
class UserInput {

    /**
     * @return the selection
     */
    public int getSelection() {
        return selection;
    }

    static Scanner input;
    private int selection;

    private ArrayList<String> textToDisplay;
    private ArrayList<String> options;

    public UserInput() {
        input = new Scanner(System.in);
        textToDisplay = new ArrayList<>();
        options = new ArrayList<>();
        selection = 0;
    }

    void setText(String text) {
        textToDisplay.add(text);
    }

    void setOption(String option) {
        int index = options.size();
        options.add(String.format("%2d. ", index + 1) + option);
    }

    int run() {
        selection = 0;
        boolean invalidInput = Boolean.TRUE;

        while (invalidInput) {
            // Trying to clear screen but not working.
            System.out.print("\033[H\033[2J");
            System.out.flush();

            for (String line : textToDisplay) {
                System.out.println(line);
            }
            System.out.println("please select from these choices");
            System.out.println("---------------------------------");
            for (String line : options) {
                System.out.println(line);
            }
            try {
                selection = input.nextInt();

            } catch (InputMismatchException e) {
                invalidInput = Boolean.TRUE;
                input.nextLine();
            }
            if (getSelection() > 0 && getSelection() <= options.size()) {
                invalidInput = Boolean.FALSE;
            }
            if (invalidInput) {
                System.out.println("Invalid selection");
            }
        }

        return getSelection();

    }

    void reset() {
        textToDisplay.clear();
        options.clear();
    }

}
