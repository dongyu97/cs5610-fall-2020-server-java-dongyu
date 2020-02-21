package edu.northeastern.cs5200.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Website {
    private int id;
    private Developer developer;


    private String name;
    private String description;
    private Date created;
    private Date updated;
    private int visits;
    private Collection<Page> pages=new ArrayList<Page>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public int getVisits() {
        return visits;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }
    public void addPage(Page page){
        pages.add(page);
    }
    public void removePage(Page page){
        pages.remove(page);
    }

    public Collection<Page> getPages() {
        return pages;
    }

    public void setPages(Collection<Page> pages) {
        this.pages = pages;
    }

    public Website() {
    }
    public Website(int id,String name,String description,Date created,Date updated,int visits){
        this.id=id;
        this.name=name;
        this.description=description;
        this.created=created;
        this.updated=updated;
        this.visits=visits;
    }
}
