package elektronik.ktp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class ElektronikKTP extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			primaryStage.setTitle("KTP Elektronik");
			GridPane grid = new GridPane();
			grid.setAlignment(Pos.BASELINE_LEFT);
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(10, 10, 10, 10));
			
			Scene scene = new Scene(grid,1200,600);
			
			Text scenetitle = new Text("KTP Elektronik");
			scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			grid.add(scenetitle, 0,0,1,1);
			
			Label nik = new Label("NIK:");
			grid.add(nik, 0, 1);
			
			TextField nikTextField = new TextField();
			grid.add(nikTextField, 1, 1);
			nikTextField.setPromptText("Masukkan Nik");
			nikTextField.setPrefColumnCount(10);
                        nikTextField.setPrefWidth(500);
			nikTextField.getText();
			
			Label nama = new Label("Nama:");
			grid.add(nama, 0, 2);
			
			TextField namaTextField = new TextField();
			grid.add(namaTextField , 1, 2);
			namaTextField.setPromptText("Masukkan Nama");
			namaTextField.setPrefColumnCount(10);
			namaTextField.getText();
			
			Label ttgl = new Label("Tempat/Tgl Lahir:");
			grid.add(ttgl, 0, 3);
			
			TextField ttglTextField = new TextField();
			grid.add(ttglTextField, 1, 3);
			ttglTextField.setPromptText("Masukkan Ttempat/Tgl Lahir");
			ttglTextField.getText();
			
			Label jk = new Label("Jenis Kelamin:");
			grid.add(jk, 0, 4);
			
			TextField jkTextField = new TextField();
			grid.add(jkTextField, 1, 4);
			jkTextField.setPromptText("Masukkan Jenis Kelamin");
			jkTextField.getText();
			
			Label alamat = new Label("Alamat:");
			grid.add(alamat, 0, 5);
			
			TextArea alamatTextField = new TextArea();
			grid.add(alamatTextField, 1, 5);
			alamatTextField.setPromptText("Masukkan Alamat");
			alamatTextField.getText();
			
			Label rt = new Label("RT:");
			grid.add(rt, 0, 6);
			
			TextField rtTextField = new TextField();
			grid.add(rtTextField, 1, 6);
			rtTextField.setPromptText("Masukkan RT/RW");
			rtTextField.getText();
			
			Label kelDes = new Label("Kel/Desa:");
			grid.add(kelDes, 0, 7);
			
			TextField kelDesTextField = new TextField();
			grid.add(kelDesTextField, 1, 7);
			kelDesTextField.setPromptText("Masukkan Kel/Desa asal");
			kelDesTextField.getText();
  
                        Label kec = new Label("Kecamatan:");
			grid.add(kec, 1, 8);
			
			TextField kecPosTextField = new TextField();
			grid.add(kecPosTextField, 2, 8);
			kecPosTextField.setPromptText("Masukkan Kecamatan");
			kecPosTextField.getText();
			
                        Label agama = new Label("Agama:");
			grid.add(agama, 0, 9);
			
			TextField agamaTextField = new TextField();
			grid.add(agamaTextField, 1, 9);
			agamaTextField.setPromptText("Masukkan Agama");
			agamaTextField.getText();
                        
                        Label setper = new Label("Status Perkawinan:");
			grid.add(setper, 0, 10);
			
			TextField spTextField = new TextField();
			grid.add(spTextField, 1, 10);
			spTextField.setPromptText("Masukkan Status Perkawinan");
			spTextField.getText();
                        
                        Label kerja = new Label("Pekerjaan:");
			grid.add(kerja, 0, 11);
			
			TextField kerjaTextField = new TextField();
			grid.add(kerjaTextField, 1, 11);
			kerjaTextField.setPromptText("Masukkan Pekerjaan");
			kerjaTextField.getText();
                        
                        Label kw = new Label("Kewarganegaraan:");
			grid.add(kw, 0, 12);
			
			TextField kwTextField = new TextField();
			grid.add(kwTextField, 1, 12);
			kwTextField.setPromptText("Masukkan Kewarganegaraan");
			kwTextField.getText();
                        
                        Label berlaku = new Label("Berlaku Hingga:");
			grid.add(berlaku, 0, 13);
			
			TextField berlakuTextField = new TextField();
			grid.add(berlakuTextField, 1, 13);
			berlakuTextField.setPromptText("Masukkan Batas Waktu KTP");
			berlakuTextField.getText();
                        
			Label goldar = new Label("Golongan Darah:");
			grid.add(goldar, 0, 14);
			
			TextField golTextField = new TextField();
			grid.add(golTextField, 1, 14);
			golTextField.setPromptText("Masukkan Golongan Darah");
			golTextField.getText();
			
			Button btn = new Button("Delete");
			HBox hbtn= new HBox(10);
			hbtn.setAlignment(Pos.BOTTOM_RIGHT);
			hbtn.getChildren().add(btn);
			grid.add(hbtn, 1, 15);
			
			Button btn2 = new Button("Edit");
			HBox hbtn2 = new HBox(10);
			hbtn.setAlignment(Pos.BOTTOM_RIGHT);
			hbtn.getChildren().add(btn2);
			grid.add(hbtn2, 1, 16);
			
			Button btn3 = new Button("Submit");
			HBox hbtn3 = new HBox(10);
			hbtn.setAlignment(Pos.BOTTOM_RIGHT);
			hbtn.getChildren().add(btn3);
			grid.add(hbtn3, 1, 17);
			
			final Text actiontarget = new Text();
			grid.add(actiontarget, 1, 19);
			
			final Label label = new Label();
			GridPane.setConstraints(label, 1, 20);
			GridPane.setColumnSpan(label, 2);
			grid.getChildren().add(label);
			
			btn.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					actiontarget.setFill(Color.FIREBRICK);
					actiontarget.setText("Data Mahasiswa di hapus");
				}
			});
			
			btn2.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					actiontarget.setFill(Color.FIREBRICK);
					actiontarget.setText("Data Mahasiswa di Update");
				}
			});

			btn3.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					if ((nikTextField.getText() != null && !namaTextField.getText().isEmpty())) {
			            label.setText(nikTextField.getText() + " " + namaTextField.getText() + " "  + ttglTextField.getText() + " " 
			            		 + jkTextField.getText() + " "  + alamatTextField.getText() + " "  + rtTextField.getText() + " " 
			            		 + kelDesTextField.getText() + " "  + kecPosTextField.getText() + " " 
                                    + agamaTextField.getText() + " "  + spTextField.getText() + " " 
                                    + kerjaTextField.getText() + " "  + kwTextField.getText() + " " 
                                    + berlakuTextField.getText() + " "  + golTextField.getText() + " " );
			        } else {
			            label.setText("Nim belum di isi.");
			        }
				}
			});
			
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
