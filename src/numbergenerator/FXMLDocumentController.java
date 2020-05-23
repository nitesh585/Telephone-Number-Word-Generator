package numbergenerator;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author nitesh
 */
public class FXMLDocumentController implements Initializable {
    
    
    private Generator generate;
    
    @FXML
    private Label label, numbertext, result;

    @FXML
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,enter,back, backButton;

    
    @FXML
    private void handleButtonAction(ActionEvent event) throws InterruptedException, IOException {
        int len = numbertext.getText().length();
        String tmp="";
    
        if(len>7){
            label.setText("Number should be 7 digit.");
        }else if(len==7){
            List<String> results = generate.buildString(Integer.parseInt(numbertext.getText()));
            if(!results.isEmpty()){
              for (int i=0; i<results.size();) {
                    for (int j = 0; j<4 &&  i<results.size() ; j++) {
                        tmp += (results.get(i) + ", ");
                        i++;
                    }
                    tmp+=("\n");
                }
                
                result.setText(tmp);
               
            }else{
                label.setText("Number should not contain 1 or 0.");
            }
        }else{
            label.setText("Number should be 7 digit.");
        }
        
    }
    
    
    @FXML
    private void handleBtn1(ActionEvent event) throws InterruptedException{
        label.setText("");
        numbertext.setText(numbertext.getText()+"1");
    }
    
    @FXML
    private void handleBtn2(ActionEvent event){
        label.setText("");
        numbertext.setText(numbertext.getText()+"2");
    }
    
    @FXML
    private void handleBtn3(ActionEvent event){
        label.setText("");
        numbertext.setText(numbertext.getText()+"3");
    }
    
    @FXML
    private void handleBtn4(ActionEvent event){
        label.setText("");
        numbertext.setText(numbertext.getText()+"4");
    }
    
    @FXML
    private void handleBtn5(ActionEvent event){
        label.setText("");
        numbertext.setText(numbertext.getText()+"5");
    }
    
    @FXML
    private void handleBtn6(ActionEvent event){
        label.setText("");
        numbertext.setText(numbertext.getText()+"6");
    }
    
    @FXML
    private void handleBtn7(ActionEvent event){
        label.setText("");
        numbertext.setText(numbertext.getText()+"7");
    }
    
    @FXML
    private void handleBtn8(ActionEvent event){
        label.setText("");
        numbertext.setText(numbertext.getText()+"8");
    }
    
    @FXML
    private void handleBtn9(ActionEvent event){
        label.setText("");
        numbertext.setText(numbertext.getText()+"9");
    }
    
    @FXML
    private void handleBtn0(ActionEvent event){
        label.setText("");
        numbertext.setText(numbertext.getText()+"0");
    }
    
    
    @FXML
    private void backspace(ActionEvent event){
        label.setText("");
        String s =  numbertext.getText();
        numbertext.setText(s.substring(0,s.length()-1));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       generate = new Generator();
    }    
    
}
