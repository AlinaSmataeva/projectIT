package com.example.demo.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String tags;
    //поля item
    public int NumericField1;
    public int NumericField2;
    public int NumericField3;
    public String StringField1;
    public String StringField2;
    public String StringField3;
    public String TextField1;
    public String TextField2;
    public String TextField3;
    public String DateField1;
    public String DateField2;
    public String DateField3;
    public boolean BooleanField1;
    public boolean BooleanField2;
    public boolean BooleanField3;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name="collection_id",referencedColumnName = "id", nullable = false)
    private Collection collection;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "item")
    private Set<Comment> comments;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "item")
    private Set<LikeModel> likeModels;

    public Set<LikeModel> getLikes() {
        return likeModels;
    }
    public void setLikes(Set<LikeModel> likeModels) {
        this.likeModels = likeModels;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getNumericField1() {
        return NumericField1;
    }

    public void setNumericField1(int numericField1) {
        NumericField1 = numericField1;
    }

    public int getNumericField2() {
        return NumericField2;
    }

    public void setNumericField2(int numericField2) {
        NumericField2 = numericField2;
    }

    public int getNumericField3() {
        return NumericField3;
    }

    public void setNumericField3(int numericField3) {
        NumericField3 = numericField3;
    }

    public String getStringField1() {
        return StringField1;
    }

    public void setStringField1(String stringField1) {
        StringField1 = stringField1;
    }

    public String getStringField2() {
        return StringField2;
    }

    public void setStringField2(String stringField2) {
        StringField2 = stringField2;
    }

    public String getStringField3() {
        return StringField3;
    }

    public void setStringField3(String stringField3) {
        StringField3 = stringField3;
    }

    public String getTextField1() {
        return TextField1;
    }

    public void setTextField1(String textField1) {
        TextField1 = textField1;
    }

    public String getTextField2() {
        return TextField2;
    }

    public void setTextField2(String textField2) {
        TextField2 = textField2;
    }

    public String getTextField3() {
        return TextField3;
    }

    public void setTextField3(String textField3) {
        TextField3 = textField3;
    }

    public String getDateField1() {
        return DateField1;
    }

    public void setDateField1(String dateField1) {
        DateField1 = dateField1;
    }

    public String getDateField2() {
        return DateField2;
    }

    public void setDateField2(String dateField2) {
        DateField2 = dateField2;
    }

    public String getDateField3() {
        return DateField3;
    }

    public void setDateField3(String dateField3) {
        DateField3 = dateField3;
    }

    public boolean isBooleanField1() {
        return BooleanField1;
    }

    public void setBooleanField1(boolean booleanField1) {
        BooleanField1 = booleanField1;
    }

    public boolean isBooleanField2() {
        return BooleanField2;
    }

    public void setBooleanField2(boolean booleanField2) {
        BooleanField2 = booleanField2;
    }

    public boolean isBooleanField3() {
        return BooleanField3;
    }

    public void setBooleanField3(boolean booleanField3) {
        BooleanField3 = booleanField3;
    }
}
