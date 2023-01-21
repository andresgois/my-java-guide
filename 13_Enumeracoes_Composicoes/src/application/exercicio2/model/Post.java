package application.exercicio2.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    
    private Date moment;
    private String title;
    private String content;
    private Integer likes;
    
    private List<Comment> comment = new ArrayList<>();
    
    public Post() {}
    
    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
    
    public void addComment(Comment c) {
        this.comment.add(c);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("POST\n");
        sb.append(this.title);
        sb.append("\n");
        sb.append(this.likes+" Likes - "+this.moment);
        sb.append("\n"+this.content);
        return sb.toString();
    }
    
    
}
