/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousinnerclass;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author crist
 */
public class AnonymousInnerClass extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("AnonymousInnerClass");
        
        //Creo los botones
        Button nuevo = new Button ("New");
        Button abrir = new Button ("Open");
        Button guardar = new Button ("Save");
        Button imprimir = new Button ("Print");
        
        //Creo caja horizontal para meter los botones
        HBox cajaBotones = new HBox(10);
        cajaBotones.getChildren().add(nuevo);
        cajaBotones.getChildren().add(abrir);
        cajaBotones.getChildren().add(guardar); 
        cajaBotones.getChildren().add(imprimir);
        
        Scene scene = new Scene(cajaBotones, 250, 50);
        primaryStage.setScene(scene);
        primaryStage.show();
   
        //Manejador de eventos
        nuevo.setOnAction(new EventHandler<ActionEvent>(){
            @Override
             public void handle(ActionEvent event){
                System.out.println("Nuevo Proceso");
                }
            }
        );
        
        abrir.setOnAction(new EventHandler<ActionEvent>(){
            @Override
             public void handle(ActionEvent event){
                System.out.println("Abrir Proceso");
                }
            }
        );
        
        guardar.setOnAction(new EventHandler<ActionEvent>(){
            @Override
             public void handle(ActionEvent event){
                System.out.println("Guardar Proceso");
                }
            }
        );
        
        imprimir.setOnAction(new EventHandler<ActionEvent>(){
            @Override
             public void handle(ActionEvent event){
                System.out.println("Imprimir Proceso");
                }
            }
        );
         
        
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
