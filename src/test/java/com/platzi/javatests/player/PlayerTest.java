package com.platzi.javatests.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void looses_when_dice_number_is_too_low(){
        Dice dice = Mockito.mock(Dice.class);
        //siempre que llames al método roll de Dice, siempre va a ser dos.
        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice, 5);
        assertFalse(player.play());
    }

    @Test
    public void looses_when_dice_number_is_big(){
        Dice dice = Mockito.mock(Dice.class);
        //siempre que llames al método roll de Dice, siempre va a ser dos.
        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice, 3);
        assertTrue(player.play());
    }

}
