package sample;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;

import com.sun.org.apache.xpath.internal.Expression;
import com.sun.org.apache.xpath.internal.ExpressionOwner;
import com.sun.org.apache.xpath.internal.XPathContext;
import com.sun.org.apache.xpath.internal.XPathVisitor;
import com.sun.org.apache.xpath.internal.objects.XObject;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.DragEvent;
import jdk.nashorn.internal.codegen.types.Type;
import jdk.nashorn.internal.ir.LexicalContext;
import jdk.nashorn.internal.ir.Node;
import jdk.nashorn.internal.ir.visitor.NodeVisitor;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.xml.transform.TransformerException;

public class Controller{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textField;

    @FXML
    private Button button1;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button buttonClear;

    @FXML
    private Button button2;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button0;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button buttonComa;

    @FXML
    private Button buttonPlus;

    @FXML
    private Button buttonEqual;

    @FXML
    private Button buttonMinus;

    @FXML
    private Button buttonMultiple;

    @FXML
    void initialize() {
        EventHandler <ActionEvent> eventHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(((Button)event.getSource()).getText().compareTo("clear") == 0)
                {
                    textField.setText("");
                    return;
                }
                if(((Button)event.getSource()).getText().compareTo("=") == 0)
                {
                    String string =  new String();
                    string = textField.getText();
                    ScriptEngineManager mgr = new ScriptEngineManager();
                    String newString = new String();
                    ScriptEngine engine = mgr.getEngineByName("JavaScript");
                    try {
                        newString = engine.eval(string).toString();
                    } catch (ScriptException e) {
                        e.printStackTrace();
                    }
                    textField.setText(newString);
                    return;
                }
                String str1 = new String();
                String str2 = new String();
                str2 = textField.getText();
                Button numberButton = new Button();
                numberButton = (Button) event.getTarget();
                str1=(numberButton.getText());
                str1 = str2.concat(str1);
                textField.setText(str1);

            }
        };

        button1.addEventHandler(ActionEvent.ACTION,eventHandler);
        button2.addEventHandler(ActionEvent.ACTION,eventHandler);
        button3.addEventHandler(ActionEvent.ACTION,eventHandler);
        button4.addEventHandler(ActionEvent.ACTION,eventHandler);
        button5.addEventHandler(ActionEvent.ACTION,eventHandler);
        button6.addEventHandler(ActionEvent.ACTION,eventHandler);
        button7.addEventHandler(ActionEvent.ACTION,eventHandler);
        button8.addEventHandler(ActionEvent.ACTION,eventHandler);
        button9.addEventHandler(ActionEvent.ACTION,eventHandler);
        button0.addEventHandler(ActionEvent.ACTION,eventHandler);
        buttonPlus.addEventHandler(ActionEvent.ACTION,eventHandler);
        buttonMinus.addEventHandler(ActionEvent.ACTION,eventHandler);
        buttonMultiple.addEventHandler(ActionEvent.ACTION,eventHandler);
        buttonComa.addEventHandler(ActionEvent.ACTION,eventHandler);
        buttonClear.addEventHandler(ActionEvent.ACTION, eventHandler);
        buttonEqual.addEventHandler(ActionEvent.ACTION, eventHandler);



    }
}

