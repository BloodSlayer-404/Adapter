package org.example.adapters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.npc.Minish;

@AllArgsConstructor
@Getter
public class MinishAdapter{

    Minish minish;

    /**
     * Translate the Minish language to english, passing the binary to ASCII and
     * putting the ASCII in the corresponding characters
     * @return The greeting of a Minish translated to english.
     */
    public String translateMinish(){
        String text = minish.greetings();
        StringBuilder textMinish = new StringBuilder();
        String[] binariValues = text.split(" ");

        for( String letter: binariValues){
            int ascii = Integer.parseInt(letter,2);
            textMinish.append( (char) ascii);
        }

        return textMinish.toString();
    }
}
