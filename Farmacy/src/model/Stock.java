/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author chamo
 */
public class Stock {
    private Double quantity;
    private Double recievePrice;
    private Double salePrice;
    private int refId;
    private String itemId;

    /**
     * @return the quantity
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the recievePrice
     */
    public Double getRecievePrice() {
        return recievePrice;
    }

    /**
     * @param recievePrice the recievePrice to set
     */
    public void setRecievePrice(Double recievePrice) {
        this.recievePrice = recievePrice;
    }

    /**
     * @return the salePrice
     */
    public Double getSalePrice() {
        return salePrice;
    }

    /**
     * @param salePrice the salePrice to set
     */
    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * @return the refId
     */
    public int getRefId() {
        return refId;
    }

    /**
     * @param refId the refId to set
     */
    public void setRefId(int refId) {
        this.refId = refId;
    }

    /**
     * @return the itemId
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * @param itemId the itemId to set
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * @return the itemId
     */
    
    
}
