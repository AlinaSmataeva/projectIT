package com.example.demo.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Collection {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private String theme;
    //image;
    //название и доступность полей
    public boolean NumericField1_visible;
    public String NumericField1_name;

    public boolean NumericField2_visible;
    public String NumericField2_name;

    public boolean NumericField3_visible;
    public String NumericField3_name;

    public boolean StringField1_visible;
    public String StringField1_name;

    public boolean StringField2_visible;
    public String StringField2_name;

    public boolean StringField3_visible;
    public String StringField3_name;

    public boolean TextField1_visible;
    public String TextField1_name;

    public boolean TextField2_visible;
    public String TextField2_name;

    public boolean TextField3_visible;
    public String TextField3_name;

    public boolean DateField1_visible;
    public String DateField1_name;

    public boolean DateField2_visible;
    public String DateField2_name;

    public boolean DateField3_visible;
    public String DateField3_name;

    public boolean BooleanField1_visible;
    public String BooleanField1_name;

    public boolean BooleanField2_visible;
    public String BooleanField2_name;

    public boolean BooleanField3_visible;
    public String BooleanField3_name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "collection")
    private Set<Item> items;

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name="user_id",referencedColumnName = "id",nullable = false)
    private User user;



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public boolean isNumericField1_visible() {
        return NumericField1_visible;
    }

    public void setNumericField1_visible(boolean numericField1_visible) {
        NumericField1_visible = numericField1_visible;
    }

    public String getNumericField1_name() {
        return NumericField1_name;
    }

    public void setNumericField1_name(String numericField1_name) {
        NumericField1_name = numericField1_name;
    }

    public boolean isNumericField2_visible() {
        return NumericField2_visible;
    }

    public void setNumericField2_visible(boolean numericField2_visible) {
        NumericField2_visible = numericField2_visible;
    }

    public String getNumericField2_name() {
        return NumericField2_name;
    }

    public void setNumericField2_name(String numericField2_name) {
        NumericField2_name = numericField2_name;
    }

    public boolean isNumericField3_visible() {
        return NumericField3_visible;
    }

    public void setNumericField3_visible(boolean numericField3_visible) {
        NumericField3_visible = numericField3_visible;
    }

    public String getNumericField3_name() {
        return NumericField3_name;
    }

    public void setNumericField3_name(String numericField3_name) {
        NumericField3_name = numericField3_name;
    }

    public boolean isStringField1_visible() {
        return StringField1_visible;
    }

    public void setStringField1_visible(boolean stringField1_visible) {
        StringField1_visible = stringField1_visible;
    }

    public String getStringField1_name() {
        return StringField1_name;
    }

    public void setStringField1_name(String stringField1_name) {
        StringField1_name = stringField1_name;
    }

    public boolean isStringField2_visible() {
        return StringField2_visible;
    }

    public void setStringField2_visible(boolean stringField2_visible) {
        StringField2_visible = stringField2_visible;
    }

    public String getStringField2_name() {
        return StringField2_name;
    }

    public void setStringField2_name(String stringField2_name) {
        StringField2_name = stringField2_name;
    }

    public boolean isStringField3_visible() {
        return StringField3_visible;
    }

    public void setStringField3_visible(boolean stringField3_visible) {
        StringField3_visible = stringField3_visible;
    }

    public String getStringField3_name() {
        return StringField3_name;
    }

    public void setStringField3_name(String stringField3_name) {
        StringField3_name = stringField3_name;
    }

    public boolean isTextField1_visible() {
        return TextField1_visible;
    }

    public void setTextField1_visible(boolean textField1_visible) {
        TextField1_visible = textField1_visible;
    }

    public String getTextField1_name() {
        return TextField1_name;
    }

    public void setTextField1_name(String textField1_name) {
        TextField1_name = textField1_name;
    }

    public boolean isTextField2_visible() {
        return TextField2_visible;
    }

    public void setTextField2_visible(boolean textField2_visible) {
        TextField2_visible = textField2_visible;
    }

    public String getTextField2_name() {
        return TextField2_name;
    }

    public void setTextField2_name(String textField2_name) {
        TextField2_name = textField2_name;
    }

    public boolean isTextField3_visible() {
        return TextField3_visible;
    }

    public void setTextField3_visible(boolean textField3_visible) {
        TextField3_visible = textField3_visible;
    }

    public String getTextField3_name() {
        return TextField3_name;
    }

    public void setTextField3_name(String textField3_name) {
        TextField3_name = textField3_name;
    }

    public boolean isDateField1_visible() {
        return DateField1_visible;
    }

    public void setDateField1_visible(boolean dateField1_visible) {
        DateField1_visible = dateField1_visible;
    }

    public String getDateField1_name() {
        return DateField1_name;
    }

    public void setDateField1_name(String dateField1_name) {
        DateField1_name = dateField1_name;
    }

    public boolean isDateField2_visible() {
        return DateField2_visible;
    }

    public void setDateField2_visible(boolean dateField2_visible) {
        DateField2_visible = dateField2_visible;
    }

    public String getDateField2_name() {
        return DateField2_name;
    }

    public void setDateField2_name(String dateField2_name) {
        DateField2_name = dateField2_name;
    }

    public boolean isDateField3_visible() {
        return DateField3_visible;
    }

    public void setDateField3_visible(boolean dateField3_visible) {
        DateField3_visible = dateField3_visible;
    }

    public String getDateField3_name() {
        return DateField3_name;
    }

    public void setDateField3_name(String dateField3_name) {
        DateField3_name = dateField3_name;
    }

    public boolean isBooleanField1_visible() {
        return BooleanField1_visible;
    }

    public void setBooleanField1_visible(boolean booleanField1_visible) {
        BooleanField1_visible = booleanField1_visible;
    }

    public String getBooleanField1_name() {
        return BooleanField1_name;
    }

    public void setBooleanField1_name(String booleanField1_name) {
        BooleanField1_name = booleanField1_name;
    }

    public boolean isBooleanField2_visible() {
        return BooleanField2_visible;
    }

    public void setBooleanField2_visible(boolean booleanField2_visible) {
        BooleanField2_visible = booleanField2_visible;
    }

    public String getBooleanField2_name() {
        return BooleanField2_name;
    }

    public void setBooleanField2_name(String booleanField2_name) {
        BooleanField2_name = booleanField2_name;
    }

    public boolean isBooleanField3_visible() {
        return BooleanField3_visible;
    }

    public void setBooleanField3_visible(boolean booleanField3_visible) {
        BooleanField3_visible = booleanField3_visible;
    }

    public String getBooleanField3_name() {
        return BooleanField3_name;
    }

    public void setBooleanField3_name(String booleanField3_name) {
        BooleanField3_name = booleanField3_name;
    }
}
