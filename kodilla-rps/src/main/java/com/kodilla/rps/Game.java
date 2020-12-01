package com.kodilla.rps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game
{
    private int countRound;
    private int resultUser;
    private int resultComputer;
    private int numberWinRound;
    private String imie;
    private String userMove;
    private String computerMove;
    private String result;
    private boolean end;
    private boolean isWinner;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    void prepareGame() throws IOException
    {
        isWinner = false;
        resultUser = 0;
        resultComputer = 0;
        countRound = 0;
        numberWinRound = 0;

        System.out.println("Welcome to the game - Paper, Scissors, Rock");
        System.out.println("What is your name?");
        imie = reader.readLine();
        while (imie.equals(""))
        {
            System.out.println("Error, Could you write correct name");
            imie = reader.readLine();
        }
        System.out.println("Hello " + imie);
        System.out.println();

        System.out.println("Select the win amount of rounds: ");
        while (true)
        {
            try
            {
                numberWinRound = Integer.parseInt(reader.readLine());
                if (numberWinRound>0)
                {
                    break;
                }
                System.out.println("Select the amount of rounds over 0: ");
            }
            catch (NumberFormatException numberFormatException)
            {
                System.out.print("Try again: ");
            }
        }
        System.out.println("The amount of rounds: " + numberWinRound);
    }
    void panelGame() throws IOException
    {
        while(!end)
        {
            System.out.println();
            System.out.println("Press the appropriate key: ");
            System.out.println("---------------------------------------------");
            if(!isWinner)
            {
                System.out.println("Key 1 - Play Rock");
                System.out.println("Key 2 - Play Paper");
                System.out.println("Key 3 - Play Scissors");
            }

            System.out.println("Key x - End Game");
            System.out.println("Key n - New Game");
            System.out.println("---------------------------------------------");
            System.out.println("Your turn: ");

            String key;
            while (true)
            {
                key = reader.readLine();
                if (key.equals("1") || key.equals("2") || key.equals("3")
                        || key.equals("x") || key.equals("n"))
                {
                    break;
                }
                else
                {
                    System.out.println("Try again: ");
                }
            }

            playGame(key,isWinner);

            System.out.println(imie + " Move : " + userMove);
            System.out.println("Computer Move : " + computerMove);
            if(result.equals("Lose"))
            {
                System.out.println("Computer Win");
            }
            else if (result.equals("Win"))
            {
                System.out.println(imie + " Win");
            }
            else
            {
                System.out.println("Result: Draw");
            }
            System.out.println(imie+ " : " + resultUser);
            System.out.println("Computer : " + resultComputer);
            System.out.println("Round nr " + countRound);

            if(resultUser==numberWinRound||resultComputer==numberWinRound)
            {
                System.out.println("----------------------");
                if(resultUser>resultComputer)
                {
                    System.out.println(imie + " WIN GAME");
                }
                else
                {
                    System.out.println("COMPUTER WIN GAME");
                }
                System.out.println(imie + " : " + resultUser + " , Computer:" + resultComputer);
                isWinner=true;
            }
        }
    }
    void playGame(String key, boolean isWinner) throws IOException
    {
        Computer computer = new Computer();
        if(!isWinner)
        {
            countRound++;
            Items itemMove;
            Items itemMoveComputer;
            switch (key) {
                case "1" ->
                {
                    itemMove = new Rock();
                    itemMoveComputer = computer.playComputer();
                    fightGame(itemMove, itemMoveComputer);
                }
                case "2" ->
                {
                    itemMove = new Paper();
                    itemMoveComputer = computer.playComputer();
                    fightGame(itemMove, itemMoveComputer);
                }
                case "3" ->
                {
                    itemMove = new Scissors();
                    itemMoveComputer = computer.playComputer();
                    fightGame(itemMove, itemMoveComputer);
                }
            }
        }
        if(key.equals("x"))
        {
            endGame();
        }
        if(key.equals("n"))
        {
            newGame();
        }
    }

    void endGame() throws IOException
    {
        System.out.println("You are sure to end the game");
        System.out.println("(y)es/(n)o: ");
        while (true)
        {
            String decision = reader.readLine();
            if (decision.equals("y"))
            {
                end=true;
                break;
            }
            else if(decision.equals("n"))
            {
                panelGame();
            }
            else
            {
                System.out.println("Try again: ");
            }
        }
    }
    void newGame() throws IOException
    {
        System.out.println("You are sure to new the game");
        System.out.println("(y)es/(n)o: ");
        while (true)
        {
            String decision = reader.readLine();
            if (decision.equals("y"))
            {
                run();
            }
            else if(decision.equals("n"))
            {
                panelGame();
            }
            else
            {
                System.out.println("Try again: ");
            }
        }
    }
    public void fightGame(Items items, Items itemsComputer)
    {
        userMove = items.getClass().getSimpleName();
        computerMove = itemsComputer.getClass().getSimpleName();
        if(userMove.equals(computerMove))
        {
            result = "Draw";
        }
        else if (userMove.equals("Rock"))
        {
            if (computerMove.equals("Paper"))
            {
                result = "Lose";
                resultComputer++;
            }
            else
            {
                result = "Win";
                resultUser++;
            }
        }
        else if (userMove.equals("Paper"))
        {
            if (computerMove.equals("Scissors"))
            {
                result = "Lose";
                resultComputer++;
            }
            else
            {
                result = "Win";
                resultUser++;
            }
        }
        else if (userMove.equals("Scissors"))
        {
            if (computerMove.equals("Rock"))
            {
                result = "Lose";
                resultComputer++;
            }
            else
            {
                result = "Win";
                resultUser++;
            }
        }
    }
    void run() throws IOException
    {
        prepareGame();
        panelGame();
    }
}