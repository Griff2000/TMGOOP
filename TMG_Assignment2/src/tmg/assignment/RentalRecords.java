
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tmg.assignment;

import java.util.Date;

/**
 *
 * @author grify
 */
public class RentalRecords{
    
    private int recordID;
    private int customerID;
    private Date rentalDate;
    private Date returnDate; 

    public RentalRecords(int recordID, int customerID, double guitarSerialNumber, Date rentalDate, Date returnDate) {
        this.recordID = recordID;
        this.customerID = customerID;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
    }

    public int getRecordID() {
        return recordID;
    }

    public void setRecordID(int recordID) {
        this.recordID = recordID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    
    
}