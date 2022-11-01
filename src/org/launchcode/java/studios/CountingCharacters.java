package org.launchcode.java.studios;

import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character,Integer> charCount = new HashMap<>();
        String example = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        char [] charactersInString = example.toCharArray();

        for (char letter : charactersInString){
            if charCount.containsKey(letter){

            } else {
                charCount.put(letter,1);
            }
        }


    }
}
