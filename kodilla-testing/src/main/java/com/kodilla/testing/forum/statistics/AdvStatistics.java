package com.kodilla.testing.forum.statistics;

public class AdvStatistics
{
    private final Statistics statistics;
    private double avgPostsUsers;
    private double avgCommentsUsers;
    private double avgCommentsPosts;

    public double getAvgPostsUsers()
    {
        return avgPostsUsers;
    }

    public double getAvgCommentsUsers()
    {
        return avgCommentsUsers;
    }

    public double getAvgCommentsPosts()
    {
        return avgCommentsPosts;
    }

    public AdvStatistics(Statistics statistics)
    {
        this.statistics=statistics;
    }

    void calculateAdvStatistics(Statistics statistics)
    {
        avgPostsUsers = (double) statistics.postsCount()/statistics.usersNames().size();
        avgCommentsUsers = (double) statistics.commentsCount()/statistics.usersNames().size();
        avgCommentsPosts = (double) statistics.commentsCount()/statistics.postsCount();
    }

    void showStatistics()
    {
        System.out.println("Number of users: " + statistics.usersNames().size());
        System.out.println("Number of posts: " + statistics.postsCount());
        System.out.println("Number of comments: " + statistics.commentsCount());
        System.out.println("Average number of posts per user: " + getAvgPostsUsers());
        System.out.println("Average number of comments per user: " +getAvgCommentsUsers());
        System.out.println("Average number of comments per post: " +getAvgCommentsPosts());
    }
}
