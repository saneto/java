
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SelectionnerCoupeDuMonde extends Application {

	@Override
	public void start(Stage primaryStage) {
			primaryStage.setTitle("Sélection des joueurs du mondial");
			BorderPane root = new BorderPane();
			MenuBar menubar = new MenuBar();
			
			Menu menufichier= new Menu("Fichier");
			MenuItem nouveau = new MenuItem("Nouveau", new ImageView("newdoc.png"));
			MenuItem ouvrir = new MenuItem("Ouvrir");
			ouvrir.setAccelerator(KeyCombination.keyCombination("Ctrl+O"));
			//ouvrir.setAccelerator(new KeyCodeCombination(KeyCode.O,KeyCombination.SHORTCUT_DOWN));
			ouvrir.setOnAction(( t) -> {
				System.out.println("Choix Ouvrir");
				});
			MenuItem sauver = new MenuItem("Enregistrer");
			MenuItem quitter = new MenuItem("Quitter");
			quitter.setOnAction(t-> Platform.exit());
			menufichier.getItems().addAll(nouveau,ouvrir,sauver,new SeparatorMenuItem(),quitter);
			
			Menu menuvue = new Menu("Match");
			ToggleGroup qualif = new ToggleGroup() ;
			RadioMenuItem vue1 = new RadioMenuItem("Poules");
			RadioMenuItem vue2 = new RadioMenuItem("Huitième de finale");
			RadioMenuItem vue3 = new RadioMenuItem("Quart de finale");
			RadioMenuItem vue4 = new RadioMenuItem("Demi Finale");
			RadioMenuItem vue5 = new RadioMenuItem("Finale");
			
			vue1.setToggleGroup(qualif);
			vue2.setToggleGroup(qualif);
			vue3.setToggleGroup(qualif);
			vue4.setToggleGroup(qualif);
			vue5.setToggleGroup(qualif);
			
			vue1.setSelected(true);
			
			menuvue.getItems().addAll(vue1, vue2, vue3, vue4, vue5);
			
			Menu menualarme = new Menu("Statistiques");
			ToggleGroup etat = new ToggleGroup() ;
			RadioMenuItem active = new RadioMenuItem("Activée");
			RadioMenuItem desactive = new RadioMenuItem("Désactivée");
			active.setToggleGroup(etat);
			desactive.setToggleGroup(etat);
			desactive.setSelected(true);
			menualarme.getItems().addAll(active,desactive);
			
			menubar.getMenus().addAll(menufichier,menuvue,menualarme);
			
			root.setTop(menubar);
			
			GridPane grille = new GridPane() ;
			
			//Largeur de l'espacement horizontal entre les cellules 
			grille.setHgap(10);
			//Largeur de l'espacement vertical entre les cellules 
			grille.setVgap(10);
			//Marge entre la grille et la bordure de la fenêtre
			grille.setPadding(new Insets(10, 10, 20, 30));

			ChoiceBox<String> choix = new ChoiceBox<String>() ;
			choix.setItems(FXCollections.observableArrayList("Poule","1/8 Finale","1/4 Finale","1/2 Finale","Finale"));
			choix.getSelectionModel().select(0);  
			grille.add(choix, 1, 1);
			
			Text type = new Text() ;
			type.setText("Match du mondial");
			type.setFont(Font.font("Tahoma", FontWeight.NORMAL, 25));
			grille.add(type, 1, 0);
			GridPane.setHalignment(type, HPos.RIGHT);
			
			Text phase = new Text() ;
			phase.setText("Phase :");
			phase.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			grille.add(phase, 0, 1);
			GridPane.setHalignment(phase, HPos.CENTER);
			
			Text contre = new Text() ;
			contre.setText("Contre :");
			contre.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			grille.add(contre, 2, 1);
			GridPane.setHalignment(contre, HPos.CENTER);
			
			TextField adversaire = new TextField() ;
			adversaire.setPromptText("Entrer l'adversaire");
			grille.add(adversaire, 3, 1,2,1);
			
			Text joueurs = new Text() ;
			joueurs.setText("Les joueurs");
			joueurs.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			grille.add(joueurs, 0, 4);
			GridPane.setHalignment(joueurs, HPos.CENTER);
			
			String nomsdesjoueurs[] = {"Lloris", "Ruffier", "Landreau",
					"Debuchy", "Sagna", "Koscielny", "Mangala", "Sakho", "Varane", "Evra", "Digne",
					 "Cabaye", "Pogba", "Matuidi", "Mavuba", "Sissoko", "Schneiderlin", "Valbuena",
					 "Benzema", "Cabella", "Giroud", "Griezmann", "Rémy"};
			
			ObservableList<String> lesnoms = FXCollections.observableArrayList(nomsdesjoueurs);
	            
	        
	        ListView<String> listView = new ListView<String>(lesnoms);
	        grille.add(listView, 0, 5,1,10);
	        
	        Button b1 = new Button(" > ");
	        Button b2 = new Button(" < ");
	          
	        grille.add(b1, 1, 7);
	        grille.add(b2, 1, 10);
	        GridPane.setHalignment(b1, HPos.CENTER);
	        GridPane.setHalignment(b2, HPos.CENTER);
	        
	        Text Equipe = new Text() ;
	        Equipe.setText("L'équipe");
	        Equipe.setFont(javafx.scene.text.Font.font("Tahoma", FontWeight.NORMAL, 20));
			grille.add(Equipe, 2, 4);
			GridPane.setHalignment(Equipe, HPos.CENTER);
	        
	        ObservableList<String> equipe = FXCollections.observableArrayList();
	        ListView<String> lequipe = new ListView<String>(equipe);
	        grille.add(lequipe,2, 5,3,10);
	        
	        Button annuler = new Button("Annuler") ;
	        annuler.setPrefWidth(100);
	        Button valider = new Button ("Valider") ;
	        valider.setPrefWidth(100);
	        HBox hbox = new HBox(10) ;
	        HBox.setMargin(annuler, new Insets(10,10,20,450));
	        HBox.setMargin(valider, new Insets(10,10,20,20));
	        
	        hbox.getChildren().addAll(annuler,valider);
	        
	        b1.setOnAction(  (e)-> {  
	        	String choisi = listView.getSelectionModel().getSelectedItem();
	        	if (choisi != null && equipe.contains(choisi)==false) {
	        		equipe.add(choisi);
	        		lesnoms.remove(choisi);
	        	}
	        });
	        
	        b2.setOnAction((e)-> {
	        	String choisi = lequipe.getSelectionModel().getSelectedItem();
	        	if (choisi !=null) {
	        		equipe.remove(choisi);
	        		lesnoms.add(choisi) ;
	        	}
	        });
	        annuler.setOnAction((e)-> {
	        	lesnoms.setAll(nomsdesjoueurs);
	        	equipe.clear();
	        	choix.getSelectionModel().select(0);  
        		adversaire.setText("");
	        });
	        
	        valider.setOnAction((e)-> {
	        	String quand = choix.getValue();
	        	String adver = adversaire.getText();
	        	String select = "" ;
	        	int N = equipe.size();
	        	System.out.println("N = "+N);
	        	for (int i =0; i<N; i++ )
	        		select = select + equipe.get(i)+" ";
	        	System.out.println(quand+" contre "+adver+" "+select);
	        	
	        	
	        });
	        
	        root.setBottom(hbox);
	        root.setCenter(grille);
			Scene scene = new Scene(root, 750,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		}		

	public static void main(String[] args) {
		launch(args);
	}
}
