package org.example.adapters;

import org.example.Player;
import org.example.npc.Deku;
import org.example.npc.Goron;
import org.example.npc.Minish;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class AdaptersTest {

    private Player player;
    private Goron goron;
    private Deku deku;
    private Minish minish;

    /**
     * Test if the GoronAdapter translate correctly the Goron language to english
     */
    @Test
    void goronAdapter(){
        goron = new Goron();
        GoronAdapter adapter = new GoronAdapter(goron);

        assertEquals("Hello, I am one of the Gorons, the stone-eating people who live on Death Mountain.",
                adapter.translateGoron());
        assertNotEquals("Hello, I am one of the Gorons, the stone-eating people who live on Death Mountain.",
                adapter.getGoron().greetings());
    }

    /**
     * Test if the DekuAdapter translate correctly the Deku language to english
     */
    @Test
    void dekuAdapter(){
        deku = new Deku();
        DekuAdapter adapter = new DekuAdapter(deku);

        assertEquals("In the vast, deep forest of Hyrule...  Long have I served as the guardian spirit... I am known as the Deku Tree.  The children of the forest, the Kokiri, live here with me.",
                adapter.translateDeku());
        assertNotEquals("In the vast, deep forest of Hyrule...  Long have I served as the guardian spirit... I am known as the Deku Tree.  The children of the forest, the Kokiri, live here with me.",
                adapter.getDeku().greetings());
    }

    /**
     * Test if the MinishAdapter translate correctly the Minish language to english
     */
    @Test
    void minishAdapter(){
        minish = new Minish();
        MinishAdapter adapter = new MinishAdapter(minish);

        assertEquals("Yes, the ones from the fairy tales... But the Picori are no mere legend. They most certainly exist. No one outside of the royal family knows the truth about them. The Picori, who forged the sacred blade, live deep within Minish Woods.",
                adapter.translateMinish());
        assertNotEquals("Yes, the ones from the fairy tales... But the Picori are no mere legend. They most certainly exist. No one outside of the royal family knows the truth about them. The Picori, who forged the sacred blade, live deep within Minish Woods.",
                adapter.getMinish().greetings());
    }
}