package com.designpatterns.behavioural.Observer

class Mobile : MobileShop
{

    private var base: String

    // constructor to initialize the model name
    constructor(model : String) : super(model) {
         this.base = model
    }

}

