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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ttt); //activity_main

        gameOver = 3;
        View view = null;
        printGame(view);
        TextView infoText;
        infoText=(TextView)findViewById(R.id.textView);
        infoText.setText("Press NEW GAME to begin.");
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
                    infoText.setText("You win! Press NEW GAME to play again.");
                }
                else if (gameOver==3) {
                    //tie
                    infoText.setText("You tied! Press NEW GAME to play again.");
                }
                else {
                    //human did not just win or tie, computer move
                    computerMove(view);
                    gameOver = checkGameOver(view);
                    printGame(view);
                    if (gameOver==2) {
                        //computer just won
                        infoText.setText("You lose. Press NEW GAME to play again.");
                    }
                    else if(gameOver==3) {
                        //computer just tied
                        infoText.setText("You tied! Press NEW GAME to play again.");
                    }
                }

            }
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
                    infoText.setText("You win! Press NEW GAME to play again.");
                }
                else if (gameOver==3) {
                    //tie
                    infoText.setText("You tied! Press NEW GAME to play again.");
                }
                else {
                    //human did not just win or tie, computer move
                    computerMove(view);
                    gameOver = checkGameOver(view);
                    printGame(view);
                    if (gameOver==2) {
                        //computer just won
                        infoText.setText("You lose. Press NEW GAME to play again.");
                    }
                    else if(gameOver==3) {
                        //computer just tied
                        infoText.setText("You tied! Press NEW GAME to play again.");
                    }
                }

            }
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
                    infoText.setText("You win! Press NEW GAME to play again.");
                }
                else if (gameOver==3) {
                    //tie
                    infoText.setText("You tied! Press NEW GAME to play again.");
                }
                else {
                    //human did not just win or tie, computer move
                    computerMove(view);
                    gameOver = checkGameOver(view);
                    printGame(view);
                    if (gameOver==2) {
                        //computer just won
                        infoText.setText("You lose. Press NEW GAME to play again.");
                    }
                    else if(gameOver==3) {
                        //computer just tied
                        infoText.setText("You tied! Press NEW GAME to play again.");
                    }
                }

            }
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
                    infoText.setText("You win! Press NEW GAME to play again.");
                }
                else if (gameOver==3) {
                    //tie
                    infoText.setText("You tied! Press NEW GAME to play again.");
                }
                else {
                    //human did not just win or tie, computer move
                    computerMove(view);
                    gameOver = checkGameOver(view);
                    printGame(view);
                    if (gameOver==2) {
                        //computer just won
                        infoText.setText("You lose. Press NEW GAME to play again.");
                    }
                    else if(gameOver==3) {
                        //computer just tied
                        infoText.setText("You tied! Press NEW GAME to play again.");
                    }
                }

            }
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
                    infoText.setText("You win! Press NEW GAME to play again.");
                }
                else if (gameOver==3) {
                    //tie
                    infoText.setText("You tied! Press NEW GAME to play again.");
                }
                else {
                    //human did not just win or tie, computer move
                    computerMove(view);
                    gameOver = checkGameOver(view);
                    printGame(view);
                    if (gameOver==2) {
                        //computer just won
                        infoText.setText("You lose. Press NEW GAME to play again.");
                    }
                    else if(gameOver==3) {
                        //computer just tied
                        infoText.setText("You tied! Press NEW GAME to play again.");
                    }
                }

            }
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
                    infoText.setText("You win! Press NEW GAME to play again.");
                }
                else if (gameOver==3) {
                    //tie
                    infoText.setText("You tied! Press NEW GAME to play again.");
                }
                else {
                    //human did not just win or tie, computer move
                    computerMove(view);
                    gameOver = checkGameOver(view);
                    printGame(view);
                    if (gameOver==2) {
                        //computer just won
                        infoText.setText("You lose. Press NEW GAME to play again.");
                    }
                    else if(gameOver==3) {
                        //computer just tied
                        infoText.setText("You tied! Press NEW GAME to play again.");
                    }
                }

            }
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
                    infoText.setText("You win! Press NEW GAME to play again.");
                }
                else if (gameOver==3) {
                    //tie
                    infoText.setText("You tied! Press NEW GAME to play again.");
                }
                else {
                    //human did not just win or tie, computer move
                    computerMove(view);
                    gameOver = checkGameOver(view);
                    printGame(view);
                    if (gameOver==2) {
                        //computer just won
                        infoText.setText("You lose. Press NEW GAME to play again.");
                    }
                    else if(gameOver==3) {
                        //computer just tied
                        infoText.setText("You tied! Press NEW GAME to play again.");
                    }
                }

            }
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
                    infoText.setText("You win! Press NEW GAME to play again.");
                }
                else if (gameOver==3) {
                    //tie
                    infoText.setText("You tied! Press NEW GAME to play again.");
                }
                else {
                    //human did not just win or tie, computer move
                    computerMove(view);
                    gameOver = checkGameOver(view);
                    printGame(view);
                    if (gameOver==2) {
                        //computer just won
                        infoText.setText("You lose. Press NEW GAME to play again.");
                    }
                    else if(gameOver==3) {
                        //computer just tied
                        infoText.setText("You tied! Press NEW GAME to play again.");
                    }
                }

            }
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
                    infoText.setText("You win! Press NEW GAME to play again.");
                }
                else if (gameOver==3) {
                    //tie
                    infoText.setText("You tied! Press NEW GAME to play again.");
                }
                else {
                    //human did not just win or tie, computer move
                    computerMove(view);
                    gameOver = checkGameOver(view);
                    printGame(view);
                    if (gameOver==2) {
                        //computer just won
                        infoText.setText("You lose. Press NEW GAME to play again.");
                    }
                    else if(gameOver==3) {
                        //computer just tied
                        infoText.setText("You tied! Press NEW GAME to play again.");
                    }
                }

            }
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
        //implemented somewhat-intelligent computer player
        //blocks a direct win if one is on the board, otherwise takes the next available position

        //block horizontal wins
        if(game_entries[0]==1 && game_entries[1]==1 && game_entries[2] == 0){
            game_entries[2]=2;
        }
        else if(game_entries[1]==1 && game_entries[2]==1 && game_entries[0] == 0) {
            game_entries[0]=2;
        }
        else if(game_entries[0]==1 && game_entries[2]==1 && game_entries[1] == 0) {
            game_entries[1]=2;
        }
        else if(game_entries[4]==1 && game_entries[5]==1 && game_entries[3] == 0) {
            game_entries[3]=2;
        }
        else if(game_entries[3]==1 && game_entries[4]==1 && game_entries[5] == 0) {
            game_entries[5]=2;
        }
        else if(game_entries[3]==1 && game_entries[5]==1 && game_entries[4] == 0) {
            game_entries[4]=2;
        }
        else if(game_entries[7]==1 && game_entries[8]==1 && game_entries[6] == 0) {
            game_entries[6]=2;
        }
        else if(game_entries[6]==1 && game_entries[7]==1 && game_entries[8] == 0) {
            game_entries[8]=2;
        }
        else if(game_entries[6]==1 && game_entries[8]==1 && game_entries[7] == 0) {
            game_entries[7]=2;
        }
        //block vertical wins
        else if(game_entries[0]==1 && game_entries[3]==1 && game_entries[6] == 0) {
            game_entries[6]=2;
        }
        else if(game_entries[3]==1 && game_entries[6]==1 && game_entries[0] == 0) {
            game_entries[0]=2;
        }
        else if(game_entries[0]==1 && game_entries[6]==1 && game_entries[3] == 0) {
            game_entries[3]=2;
        }
        else if(game_entries[1]==1 && game_entries[4]==1 && game_entries[7] == 0) {
            game_entries[7]=2;
        }
        else if(game_entries[4]==1 && game_entries[7]==1 && game_entries[1] == 0) {
            game_entries[1]=2;
        }
        else if(game_entries[1]==1 && game_entries[7]==1 && game_entries[4] == 0) {
            game_entries[4]=2;
        }
        else if(game_entries[2]==1 && game_entries[5]==1 && game_entries[8] == 0) {
            game_entries[8]=2;
        }
        else if(game_entries[5]==1 && game_entries[8]==1 && game_entries[2] == 0) {
            game_entries[2]=2;
        }
        else if(game_entries[2]==1 && game_entries[8]==1 && game_entries[5] == 0) {
            game_entries[5]=2;
        }
        //block diagonal wins
        else if(game_entries[0]==1 && game_entries[4]==1 && game_entries[8] == 0) {
            game_entries[8]=2;
        }
        else if(game_entries[4]==1 && game_entries[8]==1 && game_entries[0] == 0) {
            game_entries[0]=2;
        }
        else if(game_entries[0]==1 && game_entries[8]==1 && game_entries[4] == 0) {
            game_entries[4]=2;
        }
        else if(game_entries[2]==1 && game_entries[4]==1 && game_entries[6] == 0) {
            game_entries[6]=2;
        }
        else if(game_entries[4]==1 && game_entries[6]==1 && game_entries[2] == 0) {
            game_entries[2]=2;
        }
        else if(game_entries[2]==1 && game_entries[6]==1 && game_entries[4] == 0) {
            game_entries[4]=2;
        }
        else {
            //if no direct win can be counteracted, choose a random position
            int count = 0;
            int rand_selection;
            List<Integer> open_positions = new ArrayList<Integer>();
            for(int i=0; i<9; i++){
                //count how many board positions are open
                //store the indicies with open positions in open_positions
                if(game_entries[i]==0){
                    count = count+1;
                    open_positions.add(i);
                }
            }
            //choose a random spot and make a move
            Random rand = new Random();
            rand_selection = rand.nextInt(count);
            game_entries[open_positions.get(rand_selection)]=2;
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
                game_buttons[i].setText("X");
            }
            else if (game_entries[i]==2) {
                game_buttons[i].setText("O");
            }
        }

        Button newgame = (Button)findViewById(R.id.button_ng);
        if (gameOver==0) {
            newgame.setBackgroundColor(Color.GRAY);
        }
        else {
            newgame.setBackgroundColor(Color.CYAN);
        }
    }

}