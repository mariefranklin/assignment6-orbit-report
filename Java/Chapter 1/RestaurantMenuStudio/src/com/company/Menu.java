package com.company;

import java.util.ArrayList;
import java.util.Scanner;



public class Menu {

        private String latestUpdate;
        ArrayList<MenuItem> menuItems = new ArrayList<>();

        MenuItem m = new MenuItem(16.78, "chicken and broccoli", "Main", true);

    public Menu(String latestUpdate) {
            this.latestUpdate = latestUpdate;
        }

        public String getLatestUpdate () {
            return latestUpdate;
        }

        public void setLatestUpdate (String latestUpdate){
            this.latestUpdate = latestUpdate;
        }

        MenuItem recentMenuItem = new MenuItem(8.99, "brownie and ice cream", "Dessert", true);

        public void addMenuItem () {
            Scanner input = new Scanner(System.in);
            Double price = input.nextDouble();
            String description = input.nextLine();
            String category = input.nextLine();
            Boolean newItem = input.nextBoolean();

            MenuItem recentItem = new MenuItem(price, description, category, newItem);

            menuItems.add(recentItem);
        }
}

