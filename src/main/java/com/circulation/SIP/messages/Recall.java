/* 
 * Copyright (C) 2020 Ceridwen Limited
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.circulation.SIP.messages;

import com.circulation.SIP.annotations.*;
import com.circulation.SIP.fields.FieldPolicy;
import com.circulation.SIP.types.enumerations.HoldMode;
import com.circulation.SIP.types.enumerations.HoldType;

@Command("87")
public class Recall extends Message {
    private static final long serialVersionUID = -6526613321625525741L;
    @PositionedField(start = 2, end = 2)
    private HoldMode holdMode;
    @PositionedField(start = 3, end = 20)
    private java.util.Date transactionDate;
    @TaggedField
    private java.util.Date expirationDate;
    @TaggedField
    private String pickupLocation;
    @TaggedField
    private HoldType holdType;
    @TaggedField
    private String institutionId;
    @TaggedField(FieldPolicy.REQUIRED)
    private String patronIdentifier;
    @TaggedField(FieldPolicy.NOT_REQUIRED)
    private String patronPassword;
    @TaggedField(FieldPolicy.NOT_REQUIRED)
    private String itemIdentifier;
    @TaggedField(FieldPolicy.NOT_REQUIRED)
    private String titleIdentifier;
    @TaggedField(FieldPolicy.NOT_REQUIRED)
    private String terminalPassword;
    @TaggedField
    private Boolean feeAcknowledged;

    public HoldMode getHoldMode() {
        return this.holdMode;
    }

    public void setHoldMode(HoldMode holdMode) {
        this.holdMode = holdMode;
    }

    public java.util.Date getTransactionDate() {
        return this.transactionDate;
    }

    public void setTransactionDate(java.util.Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public java.util.Date getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getPickupLocation() {
        return this.pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public HoldType getHoldType() {
        return this.holdType;
    }

    public void setHoldType(HoldType holdType) {
        this.holdType = holdType;
    }

    public String getInstitutionId() {
        return this.institutionId;
    }

    public void setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
    }

    public String getPatronIdentifier() {
        return this.patronIdentifier;
    }

    public void setPatronIdentifier(String patronIdentifier) {
        this.patronIdentifier = patronIdentifier;
    }

    public String getPatronPassword() {
        return this.patronPassword;
    }

    public void setPatronPassword(String patronPassword) {
        this.patronPassword = patronPassword;
    }

    public String getItemIdentifier() {
        return this.itemIdentifier;
    }

    public void setItemIdentifier(String itemIdentifier) {
        this.itemIdentifier = itemIdentifier;
    }

    public String getTitleIdentifier() {
        return this.titleIdentifier;
    }

    public void setTitleIdentifier(String titleIdentifier) {
        this.titleIdentifier = titleIdentifier;
    }

    public String getTerminalPassword() {
        return this.terminalPassword;
    }

    public void setTerminalPassword(String terminalPassword) {
        this.terminalPassword = terminalPassword;
    }

    public Boolean isFeeAcknowledged() {
        return this.feeAcknowledged;
    }

    public void setFeeAcknowledged(Boolean feeAcknowledged) {
        this.feeAcknowledged = feeAcknowledged;
    }
}
