public class WhatToDo {

    public static void main(String[] args) {
        boolean isGodWeather = false;
        boolean isNight = true;

        if(isNight){
            System.out.println("Спать!");
        } else if (!isNight && isGodWeather) {
            System.out.println("Гулять!");
        } else if (!isNight && !isGodWeather){
            System.out.println("Читать книгу!");
        }
    }
}
