package com.example.superherov4.repository;

import com.example.superherov4.model.Superhero;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//@Repository("superhero_db")
public class SuperheroRepository implements ISuperheroRepository {

    public ArrayList<Superhero> superheroesDB = new ArrayList<>(List.of(
            new Superhero("Batman", "Kenny", "Hjørring", 1999, "Flight", true, 88.5),
            new Superhero("Wonder Woman", "Francis", "København", 1988, "Human strength", true, 69.5),
            new Superhero("Superman", "Ken clark", "Ribe", 1988, "flight", true, 98.7),
            new Superhero("Paris", "Paris Hilton", "Vecbæk", 1990, "Erotic Capitalism", true, 100)));


    @Value("${spring.datasource.jdbc:mysql://localhost:3306/superhero}")
    private String db_url;
    @Value("${spring.datasource.simo}")
    private String uid;
    @Value("${spring.datasource.Password1?}")
    private String pwd;


    SuperheroRepository sr = new SuperheroRepository();


    public void getSuperheroListTest() {
        List<Superhero> superheroList = new ArrayList<>();


            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/superhero",
                    "superheroesDB", "Password1?")) {
            String SQL = "SELECT * FROM SUPERHERO;";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                System.out.println(rs.getString(toString()));

            }
            //return superheroList;
        }catch(SQLException exception){
            System.out.println(exception);
        }
    }


    public SuperheroRepository() throws SQLException {
    }

   /* public void addSuperhero(Superhero e) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("SELECT * from superhero");

        ResultSet resultSet = ps.executeQuery();

    */


    public void createSuperhero(String heroName, String realName, String city, int creationYear, String superpower, boolean human, double strength) {
        Superhero hero = new Superhero(heroName, realName, city, creationYear, superpower, human, strength);
        superheroesDB.add(hero);
    }

    /*public void add(Superhero superhero) {
        superheroList.add(superhero);
*/


    public void remove(Superhero superhero) {
        superheroesDB.remove(superhero);
    }

    public void updateSuperheroList(ArrayList<Superhero> superheroes) {
        superheroesDB = superheroesDB;
    }

    // Getter for arraylist of superheroes
    public ArrayList<Superhero> getAllSuperheroes() {
        return superheroesDB;
    }


    @Override
    public Superhero getSuperheroByName(String name) {
        return getSuperheroByName("Batman");
    }

}



