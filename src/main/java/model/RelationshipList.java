package model;

import service.ParsePackage;

import java.util.ArrayList;

public class RelationshipList {
    public ArrayList<Relationship> relationships = new ArrayList<Relationship>();

    public ArrayList<Relationship> getRelationships() {
        return relationships;
    }

    public void setRelationships(ArrayList<Relationship> relationships) {
        this.relationships = relationships;
    }

    public void getRelationshipListInPackage(ParsePackage p) {
        this.relationships = p.setupRelationships();
    }


    public void showRelationships() {
        if (this.relationships.size() == 0) {
            System.out.println("no relationship");
        }
        else {
            for (Relationship r : this.relationships) {
                r.printInfor();
            }
        }

    }






}
