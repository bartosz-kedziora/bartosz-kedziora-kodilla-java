package com.kodilla.rps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Game
{
    int countRound = 0;
    int resultUser = 0;
    int resultComputer = 0;
    private Items items;

    String imie;
    void prepareGame() throws IOException
    {
        System.out.println("Welcome to the game - Paper, shears, stone");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        imie = reader.readLine();
        while (imie.equals(""))
        {
            System.out.println("Error, Could you wrtie correct name");
            imie=reader.readLine();
        }
        System.out.println("Hello " + imie);
        System.out.println();

        int num1;
        System.out.println("Select the win amount of rounds: ");
        while (true)
        {
            try
            {
                num1 = Integer.parseInt(reader.readLine());
                if (num1>0)
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
        System.out.println("The amount of rounds: " + num1);
        panelGame();
    }
    void panelGame() throws IOException
    {
        while(!(resultUser==3||resultComputer==3))
        {
            System.out.println("Game panel");
            System.out.println("Press the appropriate key: ");
            System.out.println("---------------------------------------------");
            System.out.println("Key 1 - Play Stone");
            System.out.println("Key 2 - Play Paper");
            System.out.println("Key 3 - Play Shears");
            System.out.println("Key X - End Game");
            System.out.println("Key N - New Game");
            //uruchomienie gry od nowa, poprzedzone pytaniem "Czy na pewno zakończyć aktualną grę?",
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Your turn: ");
            String key;
            while (true)
            {
                key = reader.readLine();
                if (key.equals("1") || key.equals("2") || key.equals("3") || key.toLowerCase().contains("x") || key.toLowerCase().contains("n"))
                {
                    break;
                }
                else
                {
                    System.out.println("Try again: ");
                }
            }
            playGame(key);
            System.out.println("Round nr " + countRound);
            System.out.println(imie+ " : " + resultUser);
            System.out.println("Computer : " + resultComputer);
            if(resultUser==3)
            {
                System.out.println("----------------------");
                System.out.println("USER WIN");
            }
            else if (resultComputer==3)
            {
                System.out.println("----------------------");
                System.out.println("COMPUTER WIN");
            }
        }


    }

    void playGame(String key) throws IOException
    {

        System.out.println("Key: " + key);
        if(key.toLowerCase().contains("1"))
        {
            countRound++;
            Items stone = new Stone();
            fightGame(stone, playComputer());
        }
        else if(key.toLowerCase().contains("2"))
        {
            countRound++;
            Items stone = new Paper();
            fightGame(stone, playComputer());
        }
        else if(key.toLowerCase().contains("3"))
        {
            countRound++;
            Items stone = new Shears();
            fightGame(stone, playComputer());
        }
        else if(key.toLowerCase().contains("x"))
        {
            endGame();
        }
        else if(key.toLowerCase().contains("n"))
        {
            newGame();
        }
//        System.out.println("Result battle: ");
//        System.out.println("Result game: ");

    }

    void endGame() throws IOException
    {
        System.out.println("You are sure to end the game");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("(Y)es/(No): ");
        while (true)
        {
            String decision = reader.readLine();
            if (decision.toLowerCase().contains("y"))
            {
                break;
            }
            else if(decision.toLowerCase().contains("n"))
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
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("(Y)es/(No): ");
        while (true)
        {
            String decision = reader.readLine();
            if (decision.toLowerCase().contains("y"))
            {
                countRound = 0;
                prepareGame();
            }
            else if(decision.toLowerCase().contains("n"))
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
        System.out.println("My items: " + items.toString());
        System.out.println("Computer items: " + itemsComputer.toString());
        if (items instanceof Stone && itemsComputer instanceof Stone)
        {
            System.out.println("Draw");
        }
        else if (items instanceof Paper && itemsComputer instanceof Paper)
        {
            System.out.println("Draw");
        }
        else if (items instanceof Shears && itemsComputer instanceof Shears)
        {
            System.out.println("Draw");
        }
        else if (items instanceof Stone && itemsComputer instanceof Shears)
        {
            System.out.println("Win");
            resultUser++;
        }
        else if (items instanceof Stone && itemsComputer instanceof Paper)
        {
            System.out.println("Lose");
            resultComputer++;
        }
        else if (items instanceof Paper && itemsComputer instanceof Shears)
        {
            System.out.println("Lose");
            resultComputer++;
        }
        else if (items instanceof Paper && itemsComputer instanceof Stone)
        {
            System.out.println("Win");
            resultUser++;
        }
        else if (items instanceof Shears && itemsComputer instanceof Stone)
        {
            System.out.println("Lose");
            resultComputer++;
        }
        else if (items instanceof Shears && itemsComputer instanceof Paper)
        {
            System.out.println("Win");
            resultUser++;
        }
    }
    Items playComputer()
    {
        Random randomGenerator = new Random();
        int computerChoose=randomGenerator.nextInt(3)+1;
        if(computerChoose==1)
        {
            return new Stone();
        }
        else if(computerChoose==2)
        {
            return new Paper();
        }
        else
        {
            return new Shears();
        }

    }


}

