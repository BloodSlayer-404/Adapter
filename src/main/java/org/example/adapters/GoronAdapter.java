package org.example.adapters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.npc.Goron;

@AllArgsConstructor
@Getter
public class GoronAdapter{
    Goron goron;

    /**
     * Translate the Goron language to english going backwards 5 positions in ASCII all the characters
     * @return The greeting of a Goron translated to english.
     */
    public String translateGoron(){
        String text = goron.greetings();
        StringBuilder textGoron = new StringBuilder();

        for( char letter: text.toCharArray()){
            textGoron.append( (char) (letter-5) );
        }

        return textGoron.toString();
    }
}
