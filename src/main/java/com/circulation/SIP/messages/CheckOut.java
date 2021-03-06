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

import com.circulation.SIP.annotations.Command;
import com.circulation.SIP.annotations.PositionedField;
import com.circulation.SIP.annotations.TaggedField;
import com.circulation.SIP.fields.FieldPolicy;

import java.util.Date;

@Command("11")
public class CheckOut extends Message {
    private static final long serialVersionUID = 8454866593857815453L;
    @PositionedField(start = 2, end = 2)
    private Boolean SCRenewalPolicy;
    @PositionedField(start = 3, end = 3)
    private Boolean noBlock;
    @PositionedField(start = 4, end = 21)
    private Date transactionDate;
    @PositionedField(start = 22, end = 39)
    private Date nbDueDate;
    @TaggedField
    private String institutionId;
    @TaggedField(FieldPolicy.REQUIRED)
    private String patronIdentifier;
    @TaggedField(FieldPolicy.REQUIRED)
    private String itemIdentifier;
    @TaggedField(FieldPolicy.REQUIRED)
    private String terminalPassword;
    @TaggedField(FieldPolicy.NOT_REQUIRED)
    private String itemProperties;
    @TaggedField(FieldPolicy.NOT_REQUIRED)
    private String patronPassword;
    @TaggedField
    private Boolean feeAcknowledged;
    @TaggedField
    private Boolean cancel;

    public Boolean isCancel() {
        return this.cancel;
    }

    public Boolean isFeeAcknowledged() {
        return this.feeAcknowledged;
    }

    public String getInstitutionId() {
        return this.institutionId;
    }

    public String getItemIdentifier() {
        return this.itemIdentifier;
    }

    public String getItemProperties() {
        return this.itemProperties;
    }

    public Date getNbDueDate() {
        return this.nbDueDate;
    }

    public Boolean isNoBlock() {
        return this.noBlock;
    }

    public String getPatronIdentifier() {
        return this.patronIdentifier;
    }

    public String getPatronPassword() {
        return this.patronPassword;
    }

    public Boolean isSCRenewalPolicy() {
        return this.SCRenewalPolicy;
    }

    public String getTerminalPassword() {
        return this.terminalPassword;
    }

    public Date getTransactionDate() {
        return this.transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setTerminalPassword(String terminalPassword) {
        this.terminalPassword = terminalPassword;
    }

    public void setSCRenewalPolicy(Boolean SCRenewalPolicy) {
        this.SCRenewalPolicy = SCRenewalPolicy;
    }

    public void setPatronPassword(String patronPassword) {
        this.patronPassword = patronPassword;
    }

    public void setPatronIdentifier(String patronIdentifier) {
        this.patronIdentifier = patronIdentifier;
    }

    public void setNoBlock(Boolean noBlock) {
        this.noBlock = noBlock;
    }

    public void setNbDueDate(Date nbDueDate) {
        this.nbDueDate = nbDueDate;
    }

    public void setItemProperties(String itemProperties) {
        this.itemProperties = itemProperties;
    }

    public void setItemIdentifier(String itemIdentifier) {
        this.itemIdentifier = itemIdentifier;
    }

    public void setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
    }

    public void setFeeAcknowledged(Boolean feeAcknowledged) {
        this.feeAcknowledged = feeAcknowledged;
    }

    public void setCancel(Boolean cancel) {
        this.cancel = cancel;
    }
}
