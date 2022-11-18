package de.christiankoe.ledbackend.model;

public class Profile {
    public String id;
    public String name;
    public String description;

    public Profile(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
