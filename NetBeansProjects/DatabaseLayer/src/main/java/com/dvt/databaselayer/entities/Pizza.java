/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dvt.databaselayer.entities;

import java.io.Serializable;

/**
 *
 * @author hmanganyi
 */
public class Pizza implements Serializable{
    
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
