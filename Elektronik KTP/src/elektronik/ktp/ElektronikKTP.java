package application;


import application.Penduduk;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class EKTP extends Application {
 
    private final TableView<Penduduk> table = new TableView<>();
    private final ObservableList<Penduduk> data =
            FXCollections.observableArrayList(new Penduduk("9830491234", "Dian Sastro", "Malang, 5 Mei 1997", "Perempuan", "jl mawar no 7", "01/02", "Dau", "Dau", "Islam", "Blm kwn", "Pelajar", "WNI", "2019"),
            		new Penduduk("9827334127", "Lazuardi Toram", "Bandung, 2 April 1990", "Laki-Laki", "Jl mawar no 8", "01/02", "Dau", "Dau", "Islam", "Blm kwn", "Pelajar", "WNI", "2019"),
            		new Penduduk("1029381145", "Arini Kusnadi", "Jakarta, 17 Agustus 1998", "Perempuan", "jl mawar no 2", "01/02", "Dau", "Dau", "Islam", "Blm kwn", "Pelajar", "WNI", "2019"),
            		new Penduduk("9928477231", "Joni kara", "Padang, 8 Juli 1999", "Laki-Laki", "jl mawar no 17", "01/02", "Dau", "Dau", "Islam", "Blm kwn", "Wiraswasta", "WNI", "2019"),
            		new Penduduk("7829984783", "Bimbo Dudi", "Jepara, 26 Juni 1989", "Laki-Laki", "jl mawar no 18", "01/02", "Dau", "Dau", "Islam", "Blm kwn", "PNS", "WNI", "2019"),
            		new Penduduk("8837948902", "Ninara Zakirana", "Kediri, 15 Maret 1995", "Perempuan", "jl mawar no 4", "01/02", "Dau", "Dau", "Islam", "Blm kwn", "Pegawai", "WNI", "2019"),
            		new Penduduk("8028789487", "Linda Kurniasandi Faria", "Sukabumi, 10 Oktober 1993", "Perempuan", "jl mawar no 19", "01/02", "Dau", "Dau", "Islam", "Blm kwn", "PNS", "WNI", "2019"),
            		new Penduduk("6890093984", "Yoria Sanadi Kundang", "Tangerang, 11 November 1985", "Laki-Laki", "jl mawar no 13", "01/02", "Dau", "Dau", "Islam", "Kawin", "Pengusaha", "WNI", "2019"));
            		
    final HBox hb = new HBox();
 
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Table View Sample");
        stage.setWidth(450);
        stage.setHeight(550);
 
        final Label label = new Label("Penduduk");
        label.setFont(new Font("Arial", 20));
 
        table.setEditable(true);
        ScrollPane pane = new ScrollPane();
        
        pane.prefWidthProperty().bind(table.widthProperty());
        pane.prefHeightProperty().bind(table.heightProperty());
        pane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        pane.setContent(table);
        
 
        TableColumn nikCol = new TableColumn("NIK");
   //     nikCol.setMinWidth(100);
        nikCol.setCellValueFactory(
                new PropertyValueFactory<>("nik"));
 
        TableColumn namaCol = new TableColumn("Nama");
    //    namaCol.setMinWidth(100);
        namaCol.setCellValueFactory(
                new PropertyValueFactory<>("nama"));
 
        TableColumn TTLCol = new TableColumn("TTL");
     //   TTLCol.setMinWidth(200);
        TTLCol.setCellValueFactory(
                new PropertyValueFactory<>("tempatTglLahir"));
        
        TableColumn jkCol = new TableColumn("Jenis Kel");
     //   jkCol.setMinWidth(200);
       jkCol.setCellValueFactory(
                new PropertyValueFactory<>("jenisKelamin"));
        
        TableColumn alamatCol = new TableColumn("Alamat");
    //    alamatCol.setMinWidth(200);
        alamatCol.setCellValueFactory(
                new PropertyValueFactory<>("alamat"));
        
        TableColumn rtRwCol = new TableColumn("RT/RW");
    //    rtRwCol.setMinWidth(200);
        rtRwCol.setCellValueFactory(
                new PropertyValueFactory<>("rtRw"));
        
        TableColumn kelDesCol = new TableColumn("KelDesa");
     //   kelDesCol.setMinWidth(200);
        kelDesCol.setCellValueFactory(
                new PropertyValueFactory<>("kelDesa"));
        
        TableColumn kecCol = new TableColumn("Kecamatan");
     //   kecCol.setMinWidth(200);
        kecCol.setCellValueFactory(
                new PropertyValueFactory<>("kecamatan"));
        
        TableColumn agamaCol = new TableColumn("Agama");
     //   agamaCol.setMinWidth(200);
        agamaCol.setCellValueFactory(
                new PropertyValueFactory<>("agama"));
        
        TableColumn kawinCol = new TableColumn("Stat Kwn");
    //    kawinCol.setMinWidth(200);
        kawinCol.setCellValueFactory(
                new PropertyValueFactory<>("stKawin"));
        
        TableColumn kerjaCol = new TableColumn("Pekerjaan");
    //    kerjaCol.setMinWidth(200);
        kerjaCol.setCellValueFactory(
               new PropertyValueFactory<>("pekerjaan"));
      
        TableColumn wargaCol = new TableColumn("Kewarganegaraan");
    //    wargaCol.setMinWidth(200);
        wargaCol.setCellValueFactory(
                new PropertyValueFactory<>("wargaNegara"));
        
        TableColumn berlakuCol = new TableColumn("Berlaku Hingga");
     //   berlakuCol.setMinWidth(200);
        berlakuCol.setCellValueFactory(
                new PropertyValueFactory<>("berlakuHingga"));
        
        table.setItems(data);
        table.getColumns().addAll(nikCol, namaCol, TTLCol, jkCol, alamatCol, rtRwCol, kelDesCol, agamaCol,
        							kawinCol, kerjaCol, wargaCol, berlakuCol);
 
        final Button addButton = new Button("Add");
        addButton.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
            public void handle(ActionEvent event){
        		Stage secondStage = new Stage();
        		secondStage.setTitle("KTP Elektronik");
    			GridPane grid = new GridPane();
    			grid.setAlignment(Pos.BASELINE_LEFT);
    			grid.setHgap(10);
    			grid.setVgap(10);
    			grid.setPadding(new Insets(10, 10, 10, 10));
    			secondStage.show();
    			Scene scene1 = new Scene(grid,1200,600);
    			secondStage.setScene(scene1);
    			
    			Text scenetitle1 = new Text("KTP Elektronik");
    			scenetitle1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
    			grid.add(scenetitle1, 0,0,1,1);
    			
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
    			grid.add(kec, 0, 8);
    			
    			TextField kecPosTextField = new TextField();
    			grid.add(kecPosTextField, 1, 8);
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
                            
                            Button btn4 = new Button("Tabel Penduduk");
                            HBox hbtn4 = new HBox(10);
                            hbtn4.setAlignment(Pos.BOTTOM_RIGHT);
                            hbtn4.getChildren().add(btn4);
                            grid.add(hbtn4, 1, 18);
    			
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

        		
                btn3.setOnAction(new EventHandler<ActionEvent>(){
        			public void handle(ActionEvent e) {
        				data.add(new Penduduk(
        						nikTextField.getText(),
        						namaTextField.getText(),
        						ttglTextField.getText(),
        						jkTextField.getText(),
        						alamatTextField.getText(),
        						rtTextField.getText(),
        						kelDesTextField.getText(),
        						kecPosTextField.getText(),
        						agamaTextField.getText(),
        						spTextField.getText(),
        						kerjaTextField.getText(),
        						kwTextField.getText(),
        						berlakuTextField.getText())
        						);
        				
        				nikTextField.clear();
						namaTextField.clear();
						ttglTextField.clear();
						jkTextField.clear();
						alamatTextField.clear();
						rtTextField.clear();
						kelDesTextField.clear();
						kecPosTextField.clear();
						agamaTextField.clear();
						spTextField.clear();
						kerjaTextField.clear();
						kwTextField.clear();
						berlakuTextField.clear();
        			}
        		});
               
        	}
        });
        hb.getChildren().addAll(pane);
        hb.setSpacing(3);
 
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table, hb, addButton);
        
        
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
        
 
        stage.setScene(scene);
        stage.show();
    }
 }
 
