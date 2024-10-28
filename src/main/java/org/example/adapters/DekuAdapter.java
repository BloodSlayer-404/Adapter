package org.example.adapters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.npc.Deku;

@AllArgsConstructor
@Getter
public class DekuAdapter {
    Deku deku;

    /**
     * Translate the Deku language to english putting the ASCII in the corresponding characters
     * @return The greeting of a Deku translated to english.
     */
    public String translateDeku(){
        String text = deku.greetings();
        StringBuilder textDeku = new StringBuilder();
        String[] asciiValues = text.split(" ");

        for( String letter: asciiValues){
            int ascii = Integer.parseInt(letter);
            textDeku.append( (char) ascii);
        }

        return textDeku.toString();
    }
}
