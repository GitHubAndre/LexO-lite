/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lexolite.manager;

/**
 *
 * @author andrea
 */
public class ReferenceMenuTheme {

    public enum itemType {
        clazz,
        objectProperty,
        dataProperty,
        instance,
        none;
    }
    private int id;
    private itemType type;
    private String name;
    private String namespace;

    public ReferenceMenuTheme() {
        this.id = 0;
        this.name = "";
        this.type = itemType.none;
    }

    public ReferenceMenuTheme(int id, itemType type, String name, String namepsace) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.namespace = namepsace;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getType() {
        return type.toString();
    }

    public void setType(itemType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
