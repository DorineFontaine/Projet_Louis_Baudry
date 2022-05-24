package com.example.projet_louis_baudry;

public class Client {
    private String pseudo;
    private String password;
    private String mail;
    private String lastname ;
    private String firstname;
    private String tel;



    public Client(String pseudo,String password,String mail,String lastname,String firstname,String tel){
        this.pseudo = pseudo;
        this.password = password;
        this.mail = mail;
        this.firstname = firstname;
        this.lastname = lastname;
        this.tel = tel;

    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }


}
