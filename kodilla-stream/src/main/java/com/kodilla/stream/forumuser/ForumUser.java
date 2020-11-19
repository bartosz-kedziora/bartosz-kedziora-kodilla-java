package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Locale;

public final class ForumUser
{
    public int getIdUser() {
        return idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getCountPosts() {
        return countPosts;
    }

    private final int idUser;
    private final String nameUser;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int countPosts;

    public ForumUser(int idUser, String nameUser, char sex, int yearOfBirth,
                     int monthOfBirth, int dayOfBirth, int countPosts)
    {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.countPosts = countPosts;
    }
}
