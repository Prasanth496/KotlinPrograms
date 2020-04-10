package com.designpatterns.structural.Facade

public class Facade
{
    private  var carBody : CarBody
    private var carAccessories : CarAccessories
    private var carEngine : CarEngine
    private var carModel : CarModel

    // constructor for initializing the variables
    public constructor()
    {
        this.carBody =  CarBody();
        this.carAccessories = CarAccessories();
        this.carEngine = CarEngine();
        this.carModel = CarModel();
    }


    // this method can be accessed by client which internally calls the methods of the sub-system classes

    public fun MakeCar()
    {
        this.carModel.GetModel();
        this.carBody.GetCarBody();
        this.carEngine.GetEngine();
        this.carAccessories.GetAccessories();
    }
}
