package edu.cscc;
/**
 * Code for Lab 7 RPSLSpockTest Class
 * @author nikolasBall
 * @version 1.0
 **/

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;


public class RPSLSpockTest {

    private RPSLSpock genpick;
    private RPSLSpock genpick1;

    @Before
    public void pretest() {
        genpick = new RPSLSpock();
    }

    @Before
    public void pretest1() {
        genpick1 = new RPSLSpock();
    }


    @Test
    public void isValidPick() {
        Assert.assertTrue(RPSLSpock.isValidPick("ROCK"));
        Assert.assertTrue(RPSLSpock.isValidPick("PAPER"));
        Assert.assertTrue(RPSLSpock.isValidPick("SCISSORS"));
        Assert.assertTrue(RPSLSpock.isValidPick("LIZARD"));
        Assert.assertTrue(RPSLSpock.isValidPick("SPOCK"));
        Assert.assertFalse(RPSLSpock.isValidPick("KIRK"));
    }

    @Test
    public void generatePick() {
        String pick = RPSLSpock.generatePick();
        Assert.assertNotNull(pick);
        Assert.assertTrue(RPSLSpock.isValidPick(pick));
        for  (int i =0; i<=1000000; ++i) {
            System.out.println(RPSLSpock.generatePick());


        }
    }

    @Test
    public void isComputerWin() {
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK, RPSLSpock.SCISSORS));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER, RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS, RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD, RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK, RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK, RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER, RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS, RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD, RPSLSpock.SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK, RPSLSpock.SCISSORS));

        Assert.assertFalse(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS, RPSLSpock.ROCK));
    }
}