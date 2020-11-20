package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum
{
    private final List<ForumUser> theForumUserStatistics = new ArrayList<>();

    public Forum()
    {
        theForumUserStatistics.add(new ForumUser(1,"Jan Nowak", 'M', 1990, 4, 5, 25));
        theForumUserStatistics.add(new ForumUser(2,"Monika Nowak", 'F', 1995, 8, 23, 28));
        theForumUserStatistics.add(new ForumUser(3,"Andrzej Nowak", 'M', 1999, 1, 14, 189));
        theForumUserStatistics.add(new ForumUser(4,"Krystyna Kowalska", 'F', 2002, 2, 28, 1));
        theForumUserStatistics.add(new ForumUser(5,"Anna Kowal", 'F', 1987, 7, 7, 77));
        theForumUserStatistics.add(new ForumUser(6,"Bartosz Mis", 'M', 2008, 1, 2, 18));
        theForumUserStatistics.add(new ForumUser(7,"Wlodzimierz Rudy", 'M', 1997, 6, 6, 2));
    }

    public List<ForumUser> getUserList()
    {
        return new ArrayList<>(theForumUserStatistics);
    }
}
