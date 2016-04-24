import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
public class BeanGame extends Application  {
	private Timeline animation;
	private Circle nC=new Circle();
	@Override
	public void start(Stage primaryStage) {
		BorderPane a=new BorderPane();
		Line x1=new Line(150.0f,0.0f,150.0f,50.0f);
		Line x2=new Line(250.0f,0.0f,250.0f,50.0f);
		Line x3=new Line(150.0f,50.0f,0.0f,400.0f);
		Line x4=new Line(250.0f,50.0f,400.0f,400.0f);
		Line x5=new Line(0.0f,400.0f,0.0f,500.0f);
		Line x6=new Line(50.0f,400.0f,50.0f,500.0f);
		Line x7=new Line(100.0f,400.0f,100.0f,500.0f);
		Line x8=new Line(150.0f,400.0f,150.0f,500.0f);
		Line x9=new Line(200.0f,400.0f,200.0f,500.0f);
		Line x10=new Line(250.0f,400.0f,250.0f,500.0f);
		Line x11=new Line(300.0f,400.0f,300.0f,500.0f);
		Line x12=new Line(350.0f,400.0f,350.0f,500.0f);
		Line x13=new Line(400.0f,400.0f,400.0f,500.0f);
		Line x14=new Line(0.0f,500.0f,400.0f,500.0f);//畫線
		Circle y1=new Circle(50.0f,400.0f,18.0f);
		y1.setStyle("-fx-fill:DODGERBLUE;");
		Circle y2=new Circle(100.0f,400.0f,18.0f);
		y2.setStyle("-fx-fill:DODGERBLUE;");
		Circle y3=new Circle(150.0f,400.0f,18.0f);
		y3.setStyle("-fx-fill:DODGERBLUE;");
		Circle y4=new Circle(200.0f,400.0f,18.0f);
		y4.setStyle("-fx-fill:DODGERBLUE;");
		Circle y5=new Circle(250.0f,400.0f,18.0f);
		y5.setStyle("-fx-fill:DODGERBLUE;");
		Circle y6=new Circle(300.0f,400.0f,18.0f);
		y6.setStyle("-fx-fill:DODGERBLUE;");
		Circle y7=new Circle(350.0f,400.0f,18.0f);
		y7.setStyle("-fx-fill:DODGERBLUE;");
		Circle y8=new Circle(75.0f,350.0f,18.0f);
		y8.setStyle("-fx-fill:DODGERBLUE;");
		Circle y9=new Circle(125.0f,350.0f,18.0f);
		y9.setStyle("-fx-fill:DODGERBLUE;");
		Circle y10=new Circle(175.0f,350.0f,18.0f);
		y10.setStyle("-fx-fill:DODGERBLUE;");
		Circle y11=new Circle(225.0f,350.0f,18.0f);
		y11.setStyle("-fx-fill:DODGERBLUE;");
		Circle y12=new Circle(275.0f,350.0f,18.0f);
		y12.setStyle("-fx-fill:DODGERBLUE;");
		Circle y13=new Circle(325.0f,350.0f,18.0f);
		y13.setStyle("-fx-fill:DODGERBLUE;");
		Circle y14=new Circle(100.0f,300.0f,18.0f);
		y14.setStyle("-fx-fill:DODGERBLUE;");
		Circle y15=new Circle(150.0f,300.0f,18.0f);
		y15.setStyle("-fx-fill:DODGERBLUE;");
		Circle y16=new Circle(200.0f,300.0f,18.0f);
		y16.setStyle("-fx-fill:DODGERBLUE;");
		Circle y17=new Circle(250.0f,300.0f,18.0f);
		y17.setStyle("-fx-fill:DODGERBLUE;");
		Circle y18=new Circle(300.0f,300.0f,18.0f);
		y18.setStyle("-fx-fill:DODGERBLUE;");
		Circle y19=new Circle(125.0f,250.0f,18.0f);
		y19.setStyle("-fx-fill:DODGERBLUE;");
		Circle y20=new Circle(175.0f,250.0f,18.0f);
		y20.setStyle("-fx-fill:DODGERBLUE;");
		Circle y21=new Circle(225.0f,250.0f,18.0f);
		y21.setStyle("-fx-fill:DODGERBLUE;");
		Circle y22=new Circle(275.0f,250.0f,18.0f);
		y22.setStyle("-fx-fill:DODGERBLUE;");
		Circle y23=new Circle(150.0f,200.0f,18.0f);
		y23.setStyle("-fx-fill:DODGERBLUE;");
		Circle y24=new Circle(200.0f,200.0f,18.0f);
		y24.setStyle("-fx-fill:DODGERBLUE;");
		Circle y25=new Circle(250.0f,200.0f,18.0f);
		y25.setStyle("-fx-fill:DODGERBLUE;");
		Circle y26=new Circle(175.0f,150.0f,18.0f);
		y26.setStyle("-fx-fill:DODGERBLUE;");
		Circle y27=new Circle(225.0f,150.0f,18.0f);
		y27.setStyle("-fx-fill:DODGERBLUE;");
		Circle y28=new Circle(200.0f,100.0f,18.0f);
		y28.setStyle("-fx-fill:DODGERBLUE;");//畫圈
		a.getChildren().addAll(x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12,x13,x14,
y1,y2,y3,y4,y5,y6,y7,y8,y9,y10,y11,y12,y13,y14,y15,y16,y17,y18,y19,y20,y21,y22,y23,y24,y25,y26,y27,y28);//丟到Pane裡
		Rectangle rect = new Rectangle(150, 0, 100, 50);
		rect.setFill(Color.WHITE);
		rect.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {//將動作可執行的區域設在剛剛設的Rectangle
	        @Override
	        public void handle(MouseEvent me) {
	        	nC.setCenterX(me.getSceneX());
	    		nC.setCenterY(me.getSceneY());
	    		nC.setRadius(5.0f);//設位置&大小
	            nC.setFill(Color.RED);
	            a.getChildren().add(nC);
	            animation=new Timeline(new KeyFrame(Duration.millis(50),e->moveBall()));
	            animation.setCycleCount(Timeline.INDEFINITE);
	            animation.play();//動作
	        }
	    });
		a.getChildren().add(rect);
		Scene scene = new Scene(a, 400, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	protected void moveBall(){//輸入動作要做啥的地方
		for(int y=100;y<=400;y+=50) {
			for(int x=200-((y/50)-2)*25;x<=200+((y/50)-2)*25;x+=50) {
				if(Math.sqrt(Math.pow((nC.getCenterX()-x),2)+Math.pow((nC.getCenterY()-y),2))<23) {
					if(nC.getCenterX()>x) {
						nC.setCenterX(nC.getCenterX()+23);
					}
					else {
						nC.setCenterX(nC.getCenterX()-23);
					}
				}
			}
		}
		if(nC.getCenterY()+nC.getRadius()<500) {
			nC.setCenterY(nC.getCenterY()+1);
		}
    }
	public static void main(String[] args) {
		launch(args);
	}
}
