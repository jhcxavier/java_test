import java.awt.*;

public class Car {
    //Data Types:
    //int -> integer 1,2,3
    //double -> decimal 34.2, 32.1
    //String -> "Hello World"
    // Color -> from awt library
    //boolean -> true or false;

    double avarageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailingWorking;

    public Car(double inputAvarageMPG,
               String inputLicensePlate,
               Color inputpaintColor,
               boolean inputAreTaillightsWorking){
        this.avarageMilesPerGallon = inputAvarageMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputpaintColor;
        this.areTailingWorking = inputAreTaillightsWorking;
    }
    public void changePaintColor(Color newPaintColor){
        this.paintColor = newPaintColor;
    }

}
