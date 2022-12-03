package com.serenitydojo;

public class Hampster extends Pet {
    private String favouriteGame;

    public Hampster(String name,  String favouriteGame, int age) {
        super(name, age);
        this.favouriteGame = favouriteGame;
    }

    public String getFavouritGame() {
        return favouriteGame;
    }

    @Override
    public String play() {
        return "runs in wheel";
    }
}
