package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Player {

    private String name;

    /**
     * Return a greeting of the player
     * @return "Hello, I'm (players name)"
     */
    public String talk(){
        return "Hello, I'm " + name;
    }

}
