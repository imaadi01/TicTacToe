
package tictactoe;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Line;

/**
 *
 * @author aadikumar
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label tick_box_1;
    @FXML
    private Label tick_box_2;
    @FXML
    private Label tick_box_3;
    @FXML
    private Label tick_box_4;
    @FXML
    private Label tick_box_5;
    @FXML
    private Label tick_box_6;
    @FXML
    private Label tick_box_7;
    @FXML
    private Label tick_box_8;
    @FXML
    private Label tick_box_9;
    
    private Label tick_box[] = new Label[9];
    
    int turn=0;
    int game_played;
    boolean tickbox[] = new boolean[9];
    @FXML
    private Label show_result;
    @FXML
    private Label human_turn;
    private Line winner_line;
    @FXML
    private Line winner_line_1;
    @FXML
    private Line winner_line_2;
    @FXML
    private Line winner_line_3;
    @FXML
    private Line winner_line_7;
    @FXML
    private Line winner_line_8;
    @FXML
    private Line winner_line_4;
    @FXML
    private Line winner_line_5;
    @FXML
    private Line winner_line_6;
    
    public FXMLDocumentController()
    {
    for(int i=0;i<9;i++)
        tickbox[i]=true;
    }
    
    
    
    
    public void Computer_Turn()
    {
        int i;
        Random random = new Random();
        i=random.nextInt(0+9);
        if(tickbox[i]==false && turn<8)
        {
            human_turn.setText(Integer.toString(i));
            Computer_Turn();
        }
        if(tickbox[i]==true)
        {
        switch(i)
        {
            case 0 : 
                tick_box_1.setText("O");
                tickbox[i]=false;
                break;
            case 1 :
                tick_box_2.setText("O"); 
                tickbox[i]=false;
                break;
            case 2 :
                tick_box_3.setText("O");
                tickbox[i]=false;
                break;
            case 3 :
                tick_box_4.setText("O"); 
                tickbox[i]=false;
                break;
            case 4 :
                tick_box_5.setText("O"); 
                tickbox[i]=false;
                break;
            case 5 :
                tick_box_6.setText("O"); 
                tickbox[i]=false;
                break;
            case 6 :
                tick_box_7.setText("O"); 
                tickbox[i]=false;
                break;
            case 7 :
                tick_box_8.setText("O"); 
                tickbox[i]=false;
                break;
            case 8 :
                tick_box_9.setText("O"); 
                tickbox[i]=false;
                break;
            
        }
        turn++;
        human_turn.setText("Human Turn");
        check_Result();
        }
    }
    
    public void DisableLabel()
    {
    tick_box_1.setDisable(true);
    tick_box_2.setDisable(true);
    tick_box_3.setDisable(true);
    tick_box_4.setDisable(true);
    tick_box_5.setDisable(true);
    tick_box_6.setDisable(true);
    tick_box_7.setDisable(true);
    tick_box_8.setDisable(true);
    tick_box_9.setDisable(true);
    turn=10;
    }
    
    public void check_Result()
    {
//        Row
    if(tick_box_1.getText().equals("X") && tick_box_1.getText().equals(tick_box_2.getText()) && tick_box_1.getText().equals(tick_box_3.getText()) || tick_box_1.getText().equals("O") && tick_box_1.getText().equals(tick_box_2.getText()) && tick_box_1.getText().equals(tick_box_3.getText()))
    {
    show_result.setText(tick_box_1.getText()+"\nWins");
    winner_line_1.setVisible(true);
    DisableLabel();
    }
    if(tick_box_4.getText().equals("X") && tick_box_4.getText().equals(tick_box_5.getText()) && tick_box_4.getText().equals(tick_box_6.getText()) || tick_box_4.getText().equals("O") && tick_box_4.getText().equals(tick_box_5.getText()) && tick_box_4.getText().equals(tick_box_6.getText()))
    {
    show_result.setText(tick_box_4.getText()+"\nWins");
    winner_line_2.setVisible(true);
    DisableLabel();
    }
    if(tick_box_7.getText().equals("X") && tick_box_7.getText().equals(tick_box_8.getText()) && tick_box_7.getText().equals(tick_box_9.getText()) || tick_box_7.getText().equals("O") && tick_box_7.getText().equals(tick_box_8.getText()) && tick_box_7.getText().equals(tick_box_9.getText()))
    {
    show_result.setText(tick_box_7.getText()+"\nWins");
    winner_line_3.setVisible(true);
    DisableLabel();
    }
//     Column
    
    if(tick_box_1.getText().equals("X") && tick_box_1.getText().equals(tick_box_4.getText()) && tick_box_1.getText().equals(tick_box_7.getText()) || tick_box_1.getText().equals("O") && tick_box_1.getText().equals(tick_box_4.getText()) && tick_box_1.getText().equals(tick_box_7.getText()))
    {
    show_result.setText(tick_box_1.getText()+"\nWins");
    winner_line_4.setVisible(true);
    DisableLabel();
    }
    if(tick_box_2.getText().equals("X") && tick_box_2.getText().equals(tick_box_5.getText()) && tick_box_2.getText().equals(tick_box_8.getText()) || tick_box_2.getText().equals("O") && tick_box_2.getText().equals(tick_box_5.getText()) && tick_box_2.getText().equals(tick_box_8.getText()))
    {
    show_result.setText(tick_box_2.getText()+"\nWins");
    winner_line_5.setVisible(true);
    DisableLabel();
    }
    if(tick_box_3.getText().equals("X") && tick_box_3.getText().equals(tick_box_6.getText()) && tick_box_3.getText().equals(tick_box_9.getText()) || tick_box_3.getText().equals("O") && tick_box_3.getText().equals(tick_box_6.getText()) && tick_box_3.getText().equals(tick_box_9.getText()))
    {
    show_result.setText(tick_box_3.getText()+"\nWins");
    winner_line_6.setVisible(true);
    DisableLabel();
    }
    
//    Diagonal
    if(tick_box_1.getText().equals("X") && tick_box_1.getText().equals(tick_box_5.getText()) && tick_box_1.getText().equals(tick_box_9.getText()) || tick_box_1.getText().equals("O") && tick_box_1.getText().equals(tick_box_5.getText()) && tick_box_1.getText().equals(tick_box_9.getText()))
    {
    show_result.setText(tick_box_1.getText()+"\nWins");
    winner_line_7.setVisible(true);
    DisableLabel();
    }
    if(tick_box_3.getText().equals("X") && tick_box_3.getText().equals(tick_box_5.getText()) && tick_box_3.getText().equals(tick_box_7.getText()) || tick_box_3.getText().equals("O") && tick_box_3.getText().equals(tick_box_5.getText()) && tick_box_3.getText().equals(tick_box_7.getText()))
    {
    show_result.setText(tick_box_3.getText()+"\nWins");
    winner_line_8.setVisible(true);
    DisableLabel();
    }
    
    if(turn==8)
        show_result.setText("TIE");
    
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void tick_box_button_1(MouseEvent event) 
    {
     if(tickbox[0]==true)
     {
     tickbox[0]=false;
     tick_box_1.setText("X");
     check_Result();
     Computer_Turn();
     turn++;
     }
    }

    @FXML
    private void tick_box_button_2(MouseEvent event) 
    {
      if(tickbox[1]==true)
     {
     tickbox[1]=false;
     tick_box_2.setText("X");
     check_Result();
     Computer_Turn();
     turn++;
     }
    }

    @FXML
    private void tick_box_button_3(MouseEvent event) 
    {
    if(tickbox[2]==true)
     {
     tickbox[2]=false;
     tick_box_3.setText("X");
     check_Result();
     Computer_Turn();
     turn++;
     }
    }

    @FXML
    private void tick_box_button_4(MouseEvent event) 

    {
        if(tickbox[3]==true)
     {
     tickbox[3]=false;
     tick_box_4.setText("X");
     check_Result();
     Computer_Turn();
     turn++;
     }
    }

    @FXML
    private void tick_box_button_5(MouseEvent event) 
    {
        if(tickbox[4]==true)
     {
     tickbox[4]=false;
     tick_box_5.setText("X");
     check_Result();
     Computer_Turn();
     turn++;
     }
    }

    @FXML
    private void tick_box_button_6(MouseEvent event) 
    {
        if(tickbox[5]==true)
     {
     tickbox[5]=false;
     tick_box_6.setText("X");
     check_Result();
     Computer_Turn();
     turn++;
     }
    }

    @FXML
    private void tick_box_button_7(MouseEvent event) 
    {
        if(tickbox[6]==true)
     {
     tickbox[6]=false;
     tick_box_7.setText("X");
     check_Result();
     Computer_Turn();
     turn++;
     }
    }

    @FXML
    private void tick_box_button_8(MouseEvent event) 
    {
        if(tickbox[7]==true)
     {
     tickbox[7]=false;
     tick_box_8.setText("X");
     check_Result();
     Computer_Turn();
     turn++;
     }
    }

    @FXML
    private void tick_box_button_9(MouseEvent event) 
    {
        if(tickbox[8]==true && !tick_box_9.getText().equals("O"))
     {
     tickbox[8]=false;
     tick_box_9.setText("X");
     check_Result();
     Computer_Turn();
     turn++;
     }
    }

    @FXML
    private void restart_game(ActionEvent event) 
    {
        game_played++;
        for(int i=0;i<9;i++)
        tickbox[i]=true;
        winner_line_1.setVisible(false);
        winner_line_2.setVisible(false);
        winner_line_3.setVisible(false);
        winner_line_4.setVisible(false);
        winner_line_5.setVisible(false);
        winner_line_6.setVisible(false);
        winner_line_7.setVisible(false);
        winner_line_8.setVisible(false);
        tick_box_1.setDisable(false);
        tick_box_2.setDisable(false);
        tick_box_3.setDisable(false);
        tick_box_4.setDisable(false);
        tick_box_5.setDisable(false);
        tick_box_6.setDisable(false);
        tick_box_7.setDisable(false);
        tick_box_8.setDisable(false);
        tick_box_9.setDisable(false);
        tick_box_1.setText("");
        tick_box_2.setText("");
        tick_box_3.setText("");
        tick_box_4.setText("");
        tick_box_5.setText("");
        tick_box_6.setText("");
        tick_box_7.setText("");
        tick_box_8.setText("");
        tick_box_9.setText("");
        show_result.setText("");
        turn=0;
        if(game_played%2==1)
            Computer_Turn();
    }

    @FXML
    private void End_Game(ActionEvent event) 
    {
        System.exit(0);
    }
    
}
