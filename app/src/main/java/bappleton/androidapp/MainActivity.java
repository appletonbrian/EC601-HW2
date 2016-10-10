package bappleton.androidapp;

import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import android.content.Intent;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    //game array
    // 0 --> unfilled
    // 1 --> X (human player)
    // 2 --> O (computer player)
    int[ ] game_entries = new int[9];
    int gameOver;
    int wins, losses, ties;
    int difficulty; //0=easy, 1=medium, 2=hard
    int playingAs; //user's character: 0=X (default), 1=O

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ttt); //activity_main

        gameOver = 3;//default to a game over, tied state
        wins = 0;
        losses = 0;
        ties = 0;
        playingAs=0;//default to user playing as x
        difficulty=0;//default to easy difficulty
        View view = null;
        printGame(view);
        TextView infoText;
        infoText=(TextView)findViewById(R.id.textView);
        infoText.setText("Press anywhere to begin.");
    }


    public void pressButton1(View view) {
        //user pressed button 1
        TextView infoText;
        infoText=(TextView)findViewById(R.id.textView);

        if(gameOver == 0) {
            //if game isn't over
            if (game_entries[0] == 0) {
                //position is unoccupied, assign X
                game_entries[0] = 1;

                gameOver = checkGameOver(view);
                printGame(view);
                if (gameOver==1) {
                    //human just won
                    infoText.setText("You win! Press anywhere to play again.");
                    wins = wins + 1;
                }
                else if (gameOver==3) {
                    //tie
                    infoText.setText("You tied! Press anywhere to play again.");
                    ties = ties + 1;
                }
                else {
                    //human did not just win or tie, computer move
                    computerMove(view);
                    gameOver = checkGameOver(view);
                    printGame(view);
                    if (gameOver==2) {
                        //computer just won
                        infoText.setText("You lose. Press anywhere to play again.");
                        losses = losses + 1;
                    }
                    else if(gameOver==3) {
                        //computer just tied
                        infoText.setText("You tied! Press anywhere to play again.");
                        ties = ties + 1;
                    }
                }

            }
        }
        else {
            newGame(view);
        }
    }
    public void pressButton2(View view) {
        //user pressed button 1
        TextView infoText;
        infoText=(TextView)findViewById(R.id.textView);

        if(gameOver == 0) {
            //if game isn't over
            if (game_entries[1] == 0) {
                //position is unoccupied, assign X
                game_entries[1] = 1;

                gameOver = checkGameOver(view);
                printGame(view);
                if (gameOver==1) {
                    //human just won
                    infoText.setText("You win! Press anywhere to play again.");
                    wins = wins + 1;
                }
                else if (gameOver==3) {
                    //tie
                    infoText.setText("You tied! Press anywhere to play again.");
                    ties = ties + 1;
                }
                else {
                    //human did not just win or tie, computer move
                    computerMove(view);
                    gameOver = checkGameOver(view);
                    printGame(view);
                    if (gameOver==2) {
                        //computer just won
                        infoText.setText("You lose. Press anywhere to play again.");
                        losses = losses + 1;
                    }
                    else if(gameOver==3) {
                        //computer just tied
                        infoText.setText("You tied! Press anywhere to play again.");
                        ties = ties + 1;
                    }
                }

            }
        }
        else {
            newGame(view);
        }
    }
    public void pressButton3(View view) {
        //user pressed button 1
        TextView infoText;
        infoText=(TextView)findViewById(R.id.textView);

        if(gameOver == 0) {
            //if game isn't over
            if (game_entries[2] == 0) {
                //position is unoccupied, assign X
                game_entries[2] = 1;

                gameOver = checkGameOver(view);
                printGame(view);
                if (gameOver==1) {
                    //human just won
                    infoText.setText("You win! Press anywhere to play again.");
                    wins = wins + 1;
                }
                else if (gameOver==3) {
                    //tie
                    infoText.setText("You tied! Press anywhere to play again.");
                    ties = ties + 1;
                }
                else {
                    //human did not just win or tie, computer move
                    computerMove(view);
                    gameOver = checkGameOver(view);
                    printGame(view);
                    if (gameOver==2) {
                        //computer just won
                        infoText.setText("You lose. Press anywhere to play again.");
                        losses = losses + 1;
                    }
                    else if(gameOver==3) {
                        //computer just tied
                        infoText.setText("You tied! Press anywhere to play again.");
                        ties = ties + 1;
                    }
                }

            }
        }
        else {
            newGame(view);
        }
    }
    public void pressButton4(View view) {
        //user pressed button 1
        TextView infoText;
        infoText=(TextView)findViewById(R.id.textView);

        if(gameOver == 0) {
            //if game isn't over
            if (game_entries[3] == 0) {
                //position is unoccupied, assign X
                game_entries[3] = 1;

                gameOver = checkGameOver(view);
                printGame(view);
                if (gameOver==1) {
                    //human just won
                    infoText.setText("You win! Press anywhere to play again.");
                    wins = wins + 1;
                }
                else if (gameOver==3) {
                    //tie
                    infoText.setText("You tied! Press anywhere to play again.");
                    ties = ties + 1;
                }
                else {
                    //human did not just win or tie, computer move
                    computerMove(view);
                    gameOver = checkGameOver(view);
                    printGame(view);
                    if (gameOver==2) {
                        //computer just won
                        infoText.setText("You lose. Press anywhere to play again.");
                        losses = losses + 1;
                    }
                    else if(gameOver==3) {
                        //computer just tied
                        infoText.setText("You tied! Press anywhere to play again.");
                        ties = ties + 1;
                    }
                }

            }
        }
        else {
            newGame(view);
        }
    }
    public void pressButton5(View view) {
        //user pressed button 1
        TextView infoText;
        infoText=(TextView)findViewById(R.id.textView);

        if(gameOver == 0) {
            //if game isn't over
            if (game_entries[4] == 0) {
                //position is unoccupied, assign X
                game_entries[4] = 1;

                gameOver = checkGameOver(view);
                printGame(view);
                if (gameOver==1) {
                    //human just won
                    infoText.setText("You win! Press anywhere to play again.");
                    wins = wins + 1;
                }
                else if (gameOver==3) {
                    //tie
                    infoText.setText("You tied! Press anywhere to play again.");
                    ties = ties + 1;
                }
                else {
                    //human did not just win or tie, computer move
                    computerMove(view);
                    gameOver = checkGameOver(view);
                    printGame(view);
                    if (gameOver==2) {
                        //computer just won
                        infoText.setText("You lose. Press anywhere to play again.");
                        losses = losses + 1;
                    }
                    else if(gameOver==3) {
                        //computer just tied
                        infoText.setText("You tied! Press anywhere to play again.");
                        ties = ties + 1;
                    }
                }

            }
        }
        else {
            newGame(view);
        }
    }
    public void pressButton6(View view) {
        //user pressed button 1
        TextView infoText;
        infoText=(TextView)findViewById(R.id.textView);

        if(gameOver == 0) {
            //if game isn't over
            if (game_entries[5] == 0) {
                //position is unoccupied, assign X
                game_entries[5] = 1;

                gameOver = checkGameOver(view);
                printGame(view);
                if (gameOver==1) {
                    //human just won
                    infoText.setText("You win! Press anywhere to play again.");
                    wins = wins + 1;
                }
                else if (gameOver==3) {
                    //tie
                    infoText.setText("You tied! Press anywhere to play again.");
                    ties = ties + 1;
                }
                else {
                    //human did not just win or tie, computer move
                    computerMove(view);
                    gameOver = checkGameOver(view);
                    printGame(view);
                    if (gameOver==2) {
                        //computer just won
                        infoText.setText("You lose. Press anywhere to play again.");
                        losses = losses + 1;
                    }
                    else if(gameOver==3) {
                        //computer just tied
                        infoText.setText("You tied! Press anywhere to play again.");
                        ties = ties + 1;
                    }
                }

            }
        }
        else {
            newGame(view);
        }
    }
    public void pressButton7(View view) {
        //user pressed button 1
        TextView infoText;
        infoText=(TextView)findViewById(R.id.textView);

        if(gameOver == 0) {
            //if game isn't over
            if (game_entries[6] == 0) {
                //position is unoccupied, assign X
                game_entries[6] = 1;

                gameOver = checkGameOver(view);
                printGame(view);
                if (gameOver==1) {
                    //human just won
                    infoText.setText("You win! Press anywhere to play again.");
                    wins = wins + 1;
                }
                else if (gameOver==3) {
                    //tie
                    infoText.setText("You tied! Press anywhere to play again.");
                    ties = ties + 1;
                }
                else {
                    //human did not just win or tie, computer move
                    computerMove(view);
                    gameOver = checkGameOver(view);
                    printGame(view);
                    if (gameOver==2) {
                        //computer just won
                        infoText.setText("You lose. Press anywhere to play again.");
                        losses = losses + 1;
                    }
                    else if(gameOver==3) {
                        //computer just tied
                        infoText.setText("You tied! Press anywhere to play again.");
                        ties = ties + 1;
                    }
                }

            }
        }
        else {
            newGame(view);
        }
    }
    public void pressButton8(View view) {
        //user pressed button 1
        TextView infoText;
        infoText=(TextView)findViewById(R.id.textView);

        if(gameOver == 0) {
            //if game isn't over
            if (game_entries[7] == 0) {
                //position is unoccupied, assign X
                game_entries[7] = 1;

                gameOver = checkGameOver(view);
                printGame(view);
                if (gameOver==1) {
                    //human just won
                    infoText.setText("You win! Press anywhere to play again.");
                    wins = wins + 1;
                }
                else if (gameOver==3) {
                    //tie
                    infoText.setText("You tied! Press anywhere to play again.");
                    ties = ties + 1;
                }
                else {
                    //human did not just win or tie, computer move
                    computerMove(view);
                    gameOver = checkGameOver(view);
                    printGame(view);
                    if (gameOver==2) {
                        //computer just won
                        infoText.setText("You lose. Press anywhere to play again.");
                        losses = losses + 1;
                    }
                    else if(gameOver==3) {
                        //computer just tied
                        infoText.setText("You tied! Press anywhere to play again.");
                        ties = ties + 1;
                    }
                }

            }
        }
        else {
            newGame(view);
        }
    }
    public void pressButton9(View view) {
        //user pressed button 1
        TextView infoText;
        infoText=(TextView)findViewById(R.id.textView);

        if(gameOver == 0) {
            //if game isn't over
            if (game_entries[8] == 0) {
                //position is unoccupied, assign X
                game_entries[8] = 1;

                gameOver = checkGameOver(view);
                printGame(view);
                if (gameOver==1) {
                    //human just won
                    infoText.setText("You win! Press anywhere to play again.");
                    wins = wins + 1;
                }
                else if (gameOver==3) {
                    //tie
                    infoText.setText("You tied! Press anywhere to play again.");
                    ties = ties + 1;
                }
                else {
                    //human did not just win or tie, computer move
                    computerMove(view);
                    gameOver = checkGameOver(view);
                    printGame(view);
                    if (gameOver==2) {
                        //computer just won
                        infoText.setText("You lose. Press anywhere to play again.");
                        losses = losses + 1;
                    }
                    else if(gameOver==3) {
                        //computer just tied
                        infoText.setText("You tied! Press anywhere to play again.");
                        ties = ties + 1;
                    }
                }

            }
        }
        else {
            newGame(view);
        }
    }




    public void newGame(View view) {
        //clear game array
        for (int i=0; i<9; i++){
            game_entries[i]=0;
        }

        //set game as not over
        gameOver = 0;

        //update button display
        printGame(view);

        //prompt user to move
        TextView infoText;
        infoText=(TextView)findViewById(R.id.textView);
        infoText.setText("Your move.");
    }

    public void computerMove(View view) {
        //difficulty levels dictated by variable difficulty
        //0: easy - computer makes entirely random moves
        //1: medium - computer tries to block obvious wins
        //2: hard - computer tries to block obvious wins, and execute its own obvious wins
        if (difficulty==0){
            //make a random move
            int count = 0;
            int rand_selection;
            List<Integer> open_positions = new ArrayList<Integer>();
            for (int i = 0; i < 9; i++) {
                //count how many board positions are open
                //store the indicies with open positions in open_positions
                if (game_entries[i] == 0) {
                    count = count + 1;
                    open_positions.add(i);
                }
            }
            //choose a random spot and make a move
            Random rand = new Random();
            rand_selection = rand.nextInt(count);
            game_entries[open_positions.get(rand_selection)] = 2;
        }
        else if (difficulty==1) {
            //block horizontal wins
            if (game_entries[0] == 1 && game_entries[1] == 1 && game_entries[2] == 0) {
                game_entries[2] = 2;
            } else if (game_entries[1] == 1 && game_entries[2] == 1 && game_entries[0] == 0) {
                game_entries[0] = 2;
            } else if (game_entries[0] == 1 && game_entries[2] == 1 && game_entries[1] == 0) {
                game_entries[1] = 2;
            } else if (game_entries[4] == 1 && game_entries[5] == 1 && game_entries[3] == 0) {
                game_entries[3] = 2;
            } else if (game_entries[3] == 1 && game_entries[4] == 1 && game_entries[5] == 0) {
                game_entries[5] = 2;
            } else if (game_entries[3] == 1 && game_entries[5] == 1 && game_entries[4] == 0) {
                game_entries[4] = 2;
            } else if (game_entries[7] == 1 && game_entries[8] == 1 && game_entries[6] == 0) {
                game_entries[6] = 2;
            } else if (game_entries[6] == 1 && game_entries[7] == 1 && game_entries[8] == 0) {
                game_entries[8] = 2;
            } else if (game_entries[6] == 1 && game_entries[8] == 1 && game_entries[7] == 0) {
                game_entries[7] = 2;
            }
            //block vertical wins
            else if (game_entries[0] == 1 && game_entries[3] == 1 && game_entries[6] == 0) {
                game_entries[6] = 2;
            } else if (game_entries[3] == 1 && game_entries[6] == 1 && game_entries[0] == 0) {
                game_entries[0] = 2;
            } else if (game_entries[0] == 1 && game_entries[6] == 1 && game_entries[3] == 0) {
                game_entries[3] = 2;
            } else if (game_entries[1] == 1 && game_entries[4] == 1 && game_entries[7] == 0) {
                game_entries[7] = 2;
            } else if (game_entries[4] == 1 && game_entries[7] == 1 && game_entries[1] == 0) {
                game_entries[1] = 2;
            } else if (game_entries[1] == 1 && game_entries[7] == 1 && game_entries[4] == 0) {
                game_entries[4] = 2;
            } else if (game_entries[2] == 1 && game_entries[5] == 1 && game_entries[8] == 0) {
                game_entries[8] = 2;
            } else if (game_entries[5] == 1 && game_entries[8] == 1 && game_entries[2] == 0) {
                game_entries[2] = 2;
            } else if (game_entries[2] == 1 && game_entries[8] == 1 && game_entries[5] == 0) {
                game_entries[5] = 2;
            }
            //block diagonal wins
            else if (game_entries[0] == 1 && game_entries[4] == 1 && game_entries[8] == 0) {
                game_entries[8] = 2;
            } else if (game_entries[4] == 1 && game_entries[8] == 1 && game_entries[0] == 0) {
                game_entries[0] = 2;
            } else if (game_entries[0] == 1 && game_entries[8] == 1 && game_entries[4] == 0) {
                game_entries[4] = 2;
            } else if (game_entries[2] == 1 && game_entries[4] == 1 && game_entries[6] == 0) {
                game_entries[6] = 2;
            } else if (game_entries[4] == 1 && game_entries[6] == 1 && game_entries[2] == 0) {
                game_entries[2] = 2;
            } else if (game_entries[2] == 1 && game_entries[6] == 1 && game_entries[4] == 0) {
                game_entries[4] = 2;
            } else {
                //if no direct win can be counteracted, choose a random position
                int count = 0;
                int rand_selection;
                List<Integer> open_positions = new ArrayList<Integer>();
                for (int i = 0; i < 9; i++) {
                    //count how many board positions are open
                    //store the indicies with open positions in open_positions
                    if (game_entries[i] == 0) {
                        count = count + 1;
                        open_positions.add(i);
                    }
                }
                //choose a random spot and make a move
                Random rand = new Random();
                rand_selection = rand.nextInt(count);
                game_entries[open_positions.get(rand_selection)] = 2;
            }
        }
        else if (difficulty==2){
            //check possible horizontal wins
            if (game_entries[0]==2 && game_entries[1]==2 && game_entries[2]==0){
                game_entries[2] = 2;
            }
            else if (game_entries[1]==2 && game_entries[2]==2 && game_entries[0]==0){
                game_entries[0] = 2;
            }
            else if (game_entries[0]==2 && game_entries[2]==2 && game_entries[1]==0){
                game_entries[1] = 2;
            }
            else if (game_entries[3]==2 && game_entries[4]==2 && game_entries[5]==0){
                game_entries[5] = 2;
            }
            else if (game_entries[4]==2 && game_entries[5]==2 && game_entries[3]==0){
                game_entries[3] = 2;
            }
            else if (game_entries[3]==2 && game_entries[5]==2 && game_entries[4]==0){
                game_entries[4] = 2;
            }
            else if (game_entries[6]==2 && game_entries[7]==2 && game_entries[8]==0){
                game_entries[8] = 2;
            }
            else if (game_entries[7]==2 && game_entries[8]==2 && game_entries[6]==0){
                game_entries[6] = 2;
            }
            else if (game_entries[6]==2 && game_entries[8]==2 && game_entries[7]==0){
                game_entries[7] = 2;
            }
            //check possible vertical wins
            else if (game_entries[0]==2 && game_entries[3]==2 && game_entries[6]==0){
                game_entries[6] = 2;
            }
            else if (game_entries[3]==2 && game_entries[6]==2 && game_entries[0]==0){
                game_entries[0] = 2;
            }
            else if (game_entries[0]==2 && game_entries[6]==2 && game_entries[3]==0){
                game_entries[3] = 2;
            }
            else if (game_entries[1]==2 && game_entries[4]==2 && game_entries[7]==0){
                game_entries[7] = 2;
            }
            else if (game_entries[4]==2 && game_entries[7]==2 && game_entries[1]==0){
                game_entries[1] = 2;
            }
            else if (game_entries[1]==2 && game_entries[7]==2 && game_entries[4]==0){
                game_entries[4] = 2;
            }
            else if (game_entries[2]==2 && game_entries[5]==2 && game_entries[8]==0){
                game_entries[8] = 2;
            }
            else if (game_entries[5]==2 && game_entries[8]==2 && game_entries[2]==0){
                game_entries[2] = 2;
            }
            else if (game_entries[2]==2 && game_entries[8]==2 && game_entries[5]==0){
                game_entries[5] = 2;
            }
            //check possible diagonal wins
            else if (game_entries[0]==2 && game_entries[4]==2 && game_entries[8]==0){
                game_entries[8] = 2;
            }
            else if (game_entries[4]==2 && game_entries[8]==2 && game_entries[0]==0){
                game_entries[0] = 2;
            }
            else if (game_entries[0]==2 && game_entries[8]==2 && game_entries[4]==0){
                game_entries[4] = 2;
            }
            else if (game_entries[2]==2 && game_entries[4]==2 && game_entries[6]==0){
                game_entries[6] = 2;
            }
            else if (game_entries[6]==2 && game_entries[4]==2 && game_entries[2]==0){
                game_entries[2] = 2;
            }
            else if (game_entries[6]==2 && game_entries[2]==2 && game_entries[4]==0){
                game_entries[4] = 2;
            }
            //block horizontal wins
            else if (game_entries[0] == 1 && game_entries[1] == 1 && game_entries[2] == 0) {
                game_entries[2] = 2;
            } else if (game_entries[1] == 1 && game_entries[2] == 1 && game_entries[0] == 0) {
                game_entries[0] = 2;
            } else if (game_entries[0] == 1 && game_entries[2] == 1 && game_entries[1] == 0) {
                game_entries[1] = 2;
            } else if (game_entries[4] == 1 && game_entries[5] == 1 && game_entries[3] == 0) {
                game_entries[3] = 2;
            } else if (game_entries[3] == 1 && game_entries[4] == 1 && game_entries[5] == 0) {
                game_entries[5] = 2;
            } else if (game_entries[3] == 1 && game_entries[5] == 1 && game_entries[4] == 0) {
                game_entries[4] = 2;
            } else if (game_entries[7] == 1 && game_entries[8] == 1 && game_entries[6] == 0) {
                game_entries[6] = 2;
            } else if (game_entries[6] == 1 && game_entries[7] == 1 && game_entries[8] == 0) {
                game_entries[8] = 2;
            } else if (game_entries[6] == 1 && game_entries[8] == 1 && game_entries[7] == 0) {
                game_entries[7] = 2;
            }
            //block vertical wins
            else if (game_entries[0] == 1 && game_entries[3] == 1 && game_entries[6] == 0) {
                game_entries[6] = 2;
            } else if (game_entries[3] == 1 && game_entries[6] == 1 && game_entries[0] == 0) {
                game_entries[0] = 2;
            } else if (game_entries[0] == 1 && game_entries[6] == 1 && game_entries[3] == 0) {
                game_entries[3] = 2;
            } else if (game_entries[1] == 1 && game_entries[4] == 1 && game_entries[7] == 0) {
                game_entries[7] = 2;
            } else if (game_entries[4] == 1 && game_entries[7] == 1 && game_entries[1] == 0) {
                game_entries[1] = 2;
            } else if (game_entries[1] == 1 && game_entries[7] == 1 && game_entries[4] == 0) {
                game_entries[4] = 2;
            } else if (game_entries[2] == 1 && game_entries[5] == 1 && game_entries[8] == 0) {
                game_entries[8] = 2;
            } else if (game_entries[5] == 1 && game_entries[8] == 1 && game_entries[2] == 0) {
                game_entries[2] = 2;
            } else if (game_entries[2] == 1 && game_entries[8] == 1 && game_entries[5] == 0) {
                game_entries[5] = 2;
            }
            //block diagonal wins
            else if (game_entries[0] == 1 && game_entries[4] == 1 && game_entries[8] == 0) {
                game_entries[8] = 2;
            } else if (game_entries[4] == 1 && game_entries[8] == 1 && game_entries[0] == 0) {
                game_entries[0] = 2;
            } else if (game_entries[0] == 1 && game_entries[8] == 1 && game_entries[4] == 0) {
                game_entries[4] = 2;
            } else if (game_entries[2] == 1 && game_entries[4] == 1 && game_entries[6] == 0) {
                game_entries[6] = 2;
            } else if (game_entries[4] == 1 && game_entries[6] == 1 && game_entries[2] == 0) {
                game_entries[2] = 2;
            } else if (game_entries[2] == 1 && game_entries[6] == 1 && game_entries[4] == 0) {
                game_entries[4] = 2;
            }
            //take the center if possible
            else if(game_entries[4]==0){
                game_entries[4]=2;
            }
            else {
                //if there's nothing else to do, choose a random position
                int count = 0;
                int rand_selection;
                List<Integer> open_positions = new ArrayList<Integer>();
                for (int i = 0; i < 9; i++) {
                    //count how many board positions are open
                    //store the indicies with open positions in open_positions
                    if (game_entries[i] == 0) {
                        count = count + 1;
                        open_positions.add(i);
                    }
                }
                //choose a random spot and make a move
                Random rand = new Random();
                rand_selection = rand.nextInt(count);
                game_entries[open_positions.get(rand_selection)] = 2;
            }

        }

    }

    public int checkGameOver(View view) {
        /*Return values:
            0   Game not over
            1   Human (X) wins
            2   Computer (O) wins
            3   Tie
            */

        //Look for wins
        for(int i=1; i<3; i++){
            //check horizontial wins
            if (game_entries[0]==i && game_entries[1]==i && game_entries[2]==i){
                return i;
            }
            if (game_entries[3]==i && game_entries[4]==i && game_entries[5]==i){
                return i;
            }
            if (game_entries[6]==i && game_entries[7]==i && game_entries[8]==i){
                return i;
            }
            //check vertical wins
            if (game_entries[0]==i && game_entries[3]==i && game_entries[6]==i){
                return i;
            }
            if (game_entries[1]==i && game_entries[4]==i && game_entries[7]==i){
                return i;
            }
            if (game_entries[2]==i && game_entries[5]==i && game_entries[8]==i){
                return i;
            }
            //check diagonal wins
            if (game_entries[0]==i && game_entries[4]==i && game_entries[8]==i){
                return i;
            }
            if (game_entries[6]==i && game_entries[4]==i && game_entries[2]==i){
                return i;
            }
        }

        //Check to see whether board is full
        boolean board_full=true;
        for(int i=0; i<9; i++){
            if(game_entries[i]==0){
                //if there is an unoccupied space
                board_full=false;
                break;
            }
        }
        if (board_full){
            //tie
            return 3;
        }
        else {
            //game not over
            return 0;
        }
    }

    public void printGame(View view) {
        Button game_buttons[ ] = new Button[9];
        game_buttons[0]   = (Button)findViewById(R.id.button1);
        game_buttons[1]  = (Button)findViewById(R.id.button2);
        game_buttons[2]   = (Button)findViewById(R.id.button3);
        game_buttons[3]   = (Button)findViewById(R.id.button4);
        game_buttons[4]  = (Button)findViewById(R.id.button5);
        game_buttons[5]   = (Button)findViewById(R.id.button6);
        game_buttons[6]   = (Button)findViewById(R.id.button7);
        game_buttons[7]  = (Button)findViewById(R.id.button8);
        game_buttons[8]   = (Button)findViewById(R.id.button9);

        for(int i=0; i<9; i++){
            if (game_entries[i]==0){
                game_buttons[i].setText("");
            }
            else if (game_entries[i]==1) {
                if (playingAs==0) {
                    //default, user playing as X
                    game_buttons[i].setText("X");
                }
                else if (playingAs==1){
                    //reverse logic, print O's intead of X's
                    game_buttons[i].setText("O");
                }
            }
            else if (game_entries[i]==2) {
                if (playingAs==0) {
                    //default, computer playing as O
                    game_buttons[i].setText("O");
                }
                else if (playingAs==1) {
                    //reverse logic, print X's instead of O's
                    game_buttons[i].setText("X");
                }
            }

            TextView stats;
            stats=(TextView)findViewById(R.id.textview_stats);
            StringBuilder sb = new StringBuilder();
            sb.append("Wins: ");
            sb.append(wins);
            sb.append(" (");
            if (wins+ties+losses != 0) {
                sb.append(100*wins / (wins + ties + losses));
            }
            else {
                sb.append(0);
            }
            sb.append("%)   ");
            sb.append("Ties: ");
            sb.append(ties);
            sb.append(" (");
            if (wins+ties+losses != 0) {
                sb.append(100*ties / (wins + ties + losses));
            }
            else {
                sb.append(0);
            }
            sb.append("%)   ");
            String stat_text = sb.toString();
            stats.setText(stat_text);
        }
    }

    public void changePlayer(View view) {
        TextView player;
        player=(TextView)findViewById(R.id.button_xo);
        if (playingAs==0) {
            //switch user from x to o
            playingAs=1;
            player.setText("Playing as O");
        }
        else if (playingAs==1){
            //switch user from o to x
            playingAs=0;
            player.setText("Playing as X");
        }
        printGame(view);
    }

    public void changeDifficulty(View view){
        TextView diff_text;
        diff_text=(TextView)findViewById(R.id.button_difficulty);
        if (difficulty==0){
            //change from easy to medium
            difficulty=1;
            diff_text.setText("Medium");
        }
        else if (difficulty==1){
            //change from medium to hard
            difficulty=2;
            diff_text.setText("Hard");
        }
        else if (difficulty==2) {
            //change from hard to easy
            difficulty=0;
            diff_text.setText("Easy");
        }
        //reset statistics
        wins = 0;
        losses = 0;
        ties = 0;
        printGame(view);
    }

}