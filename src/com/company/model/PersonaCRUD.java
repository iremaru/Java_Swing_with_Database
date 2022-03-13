package com.company.model;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

public class PersonaCRUD {
    private static ArrayList<Persona> personas = new ArrayList<Persona>();

    public PersonaCRUD()
    {
        ArrayList<String[]> rawData = PersonaSaver.getData();
        if (rawData != null) {
            for (String[] person : rawData) {
                personas.add(new Persona(person[0], person[1], person[2],
                        person[3], person[4], person[5], person[6],
                        person[7], person[8], person[9], person[10]));
            }
        }
    }
    /**********************************************
     *              METHODS - ONE PERSON
     *********************************************/

    public static void addPerson(String nif, String name, String firstSurname, String secondSurname, String city, String address, String phoneNumber, String birthdate, String genre, String type)
    {
        String id = ""; //TODO: Get next id from db
        personas.add(new Persona(id, nif, name, firstSurname, secondSurname, city,
                address, phoneNumber, birthdate, genre, type));
        //TODO: Send changes to database.
    }

    public static void deletePerson(String id){
        personas.removeIf(persona -> persona.getId() == id);
        //TODO: Send changes to database.
    }

    public static void updatePerson(String id, String nif, String name,
                                    String firstSurname, String secondSurname,
                                    String city, String address,
                                    String phoneNumber, String birthdate,
                                    String genre, String type)
    {
        for (Persona persona : personas) {
            if(persona.getId() == id)
            {
                if (nif != null) persona.setNif(nif);
                if (name != null) persona.setName(name);
                if (firstSurname != null) persona.setFirstSurname(firstSurname);
                if (secondSurname != null) persona.setSecondSurname(secondSurname);
                if (city != null) persona.setCity(city);
                if (address != null) persona.setAddress(address);
                if (phoneNumber != null) persona.setPhoneNumber(phoneNumber);
                if (birthdate != null) persona.setBirthdate(birthdate);
                if (genre != null) persona.setGenre(genre);
                if (type != null) persona.setType(type);
                break;
            }
        }
        //TODO: Send changes to database.
    }


    /**********************************************
     *              METHODS - ALL PERSONS
     *********************************************/

    public static Dictionary<String, Dictionary<String, String>> getAllPersons(){
        Dictionary<String, Dictionary<String, String>> persons = new Hashtable<>();

        for (Persona person : personas) {
            Dictionary<String, String> personInfo = new Hashtable<>();

            personInfo.put("NIF", person.getId());
            personInfo.put("Nombre", person.getName());
            personInfo.put("1er apellido", person.getFirstSurname());
            personInfo.put("2º apellido", person.getSecondSurname());
            personInfo.put("Población", person.getCity());
            personInfo.put("Dirección", person.getAddress());
            personInfo.put("Teléfono", person.getPhoneNumber());
            personInfo.put("Género", person.getGenre());
            personInfo.put("Tipo", person.getType());

            persons.put("Id", personInfo);
        }
        return persons;
    }

    public static void saveData()
    {
        ArrayList<String[]> data = new ArrayList<>();



        PersonaSaver.pushToDB(data);
    }

}
