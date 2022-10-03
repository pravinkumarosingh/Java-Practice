package com.sugarglider.introtooops.abstracttopic.recipe;

public abstract class Recipe {
    public void execute(){
        getReady();
        doTheDish();
        cleanUp();
    }

    public abstract void getReady();
    public abstract void doTheDish();
    public abstract void cleanUp();
}
