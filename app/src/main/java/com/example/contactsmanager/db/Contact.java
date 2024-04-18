package com.example.contactsmanager.db;

public class Contact {

    // 1- Constants for Database
    public static final String TABLE_NAME = "contacts";
    public static final String COLUMN_ID = "contact_id";
    public static final String COLUMN_NAME = "contact_name";
    public static final String COLUMN_EMAIL = "contact_email";
    public static final String COLUMN_PHONE = "contact_phone";

    // 2- Variables
    private String name;
    private String email;
    private String phone;
    private int id;

    // 3- Constructors
    public Contact(){

    }

    public Contact(String name, String email, String phone, int id){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.id = id;
    }


// 4- Getters & Setters


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    // 5- SQL Query: Creating the Table
    public static final String CREATE_TABLE =
                    "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_NAME + " TEXT,"
                    + COLUMN_EMAIL + " TEXT,"
                            + COLUMN_PHONE + " DATETIME DEFAULT CURRENT_TIMESTAMP"
                    + ")";
}
