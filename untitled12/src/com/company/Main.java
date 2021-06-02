package com.company;

class Hero{
    private static Hero hero = new Hero();
    private int weapon;

    private Hero(){
        this.weapon =2;

    }

    public static Hero getInstance(){
        return hero;
    }
    public int getWeapon(){
        return weapon;


    }

    public void setWeapon(int weapon){
        this.weapon = weapon;

    }
}
public class Main {

    public static void main(String[] args) {

            Hero hero = Hero.getInstance();
            System.out.println(hero.getWeapon());
            hero.setWeapon(1);
            Hero hero1 = Hero.getInstance();
            System.out.println(hero1.getWeapon());
        }
    }

