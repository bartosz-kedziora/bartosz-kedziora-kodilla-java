package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser
{
    private final int idUser;
    private final String nameUser;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int countPosts;

    public final int getIdUser()
    {
        return idUser;
    }

    public final String getNameUser()
    {
        return nameUser;
    }

    public final char getSex()
    {
        return sex;
    }

    public final LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }

    public int getCountPosts()
    {
        return countPosts;
    }

    public ForumUser(int idUser, String nameUser, char sex, int yearOfBirth,
                     int monthOfBirth, int dayOfBirth, int countPosts)
    {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.countPosts = countPosts;
    }

    @Override
    public String toString()
    {
        return "ForumUser{" +
                "idUser=" + idUser +
                ", nameUser='" + nameUser + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", countPosts=" + countPosts +
                '}';
    }
}
