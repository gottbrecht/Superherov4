package com.example.superherov4.model;

public class Superhero {

        private String heroName;
        private String realName;
        private String city;
        private int creationYear;
        private String superpower;
        private boolean human;
        private double strength;

        // Constructor
        public Superhero(String heroName, String realName, String city, int creationYear, String superpower, boolean human, double strength) {
            this.heroName = heroName;
            this.realName = realName;
            this.city = city;
            this.creationYear = creationYear;
            this.superpower = superpower;
            this.human = human;
            this.strength = strength;
        }

        public Superhero() {
        }

        // Setter for all the field of attributes
        public void setHeroName(String heroName) {
            this.heroName = heroName;
        }

        public void setCreationYear(int creationYear) {
            this.creationYear = creationYear;
        }

        public void setRealName(String realName) {
            this.realName = realName;
        }

        public void setHuman(boolean human) {
            this.human = human;
        }

        public void setStrength(double strength) {
            this.strength = strength;
        }
        public void setSuperpower(String superpower) {
            this.superpower = superpower;
        }

        // Getter for all the field of attributes
        public String getHeroName() {
            return heroName;
        }

        public String getRealName() {
            return realName;
        }

        public int getCreationYear() {
            return creationYear;
        }

        public String getSuperpower() {
            return superpower;
        }

        public double getStrength() {
            return strength;
        }

        public boolean isHuman() {
            return human;
        }

        @Override
        public String toString() {
            return "Superhero{" +
                    "heroName='" + heroName + '\'' +
                    ", realName='" + realName + '\'' +
                    ", city='" + city + '\'' +
                    ", creationYear=" + creationYear +
                    ", superpower='" + superpower + '\'' +
                    ", human=" + human +
                    ", strength=" + strength +
                    '}';
        }

        //Ternary operator for boolean human
        public String getHumanternary() {
            String getHumanternary  = (human) ? "No" : "Yes";
            return getHumanternary;
        }


    }



