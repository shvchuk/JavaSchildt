package Chapter4;

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

//    void range(){ // method within the Vehicle class
//        System.out.println("Range is " + fuelcap * mpg);
//    }

    int range(){
        return mpg * fuelcap;
    }

    // compute fuel needed for a given distance
    double fuelNeeded(int miles){
        return (double) miles / mpg;
    }
}


