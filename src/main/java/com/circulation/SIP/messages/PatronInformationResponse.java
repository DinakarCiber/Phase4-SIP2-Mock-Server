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
import com.circulation.SIP.types.enumerations.CurrencyType;
import com.circulation.SIP.types.enumerations.Language;
import com.circulation.SIP.types.flagfields.PatronStatus;

import java.util.Date;

@Command("64")
public class PatronInformationResponse extends Message {
    private static final long serialVersionUID = 5284231102576474180L;
    @PositionedField(start = 2, end = 15)
    private PatronStatus patronStatus = new PatronStatus();
    @PositionedField(start = 16, end = 18)
    private Language language;
    @PositionedField(start = 19, end = 36)
    private Date transactionDate;
    @PositionedField(start = 37, end = 40)
    private Integer holdItemsCount;
    @PositionedField(start = 41, end = 44)
    private Integer overdueItemsCount;
    @PositionedField(start = 45, end = 48)
    private Integer chargedItemsCount;
    @PositionedField(start = 49, end = 52)
    private Integer fineItemsCount;
    @PositionedField(start = 53, end = 56)
    private Integer recallItemsCount;
    @PositionedField(start = 57, end = 60)
    private Integer unavailableHoldsCount;
    @TaggedField
    private String institutionId;
    @TaggedField(FieldPolicy.REQUIRED)
    private String patronIdentifier;
    @TaggedField
    private String personalName;
    @TaggedField
    private Integer holdItemsLimit;
    @TaggedField
    private Integer overdueItemsLimit;
    @TaggedField
    private Integer chargedItemsLimit;
    @TaggedField
    private Boolean validPatron;
    @TaggedField
    private Boolean validPatronPassword;
    @TaggedField(FieldPolicy.NOT_REQUIRED)
    private CurrencyType currencyType;
    @TaggedField(FieldPolicy.NOT_REQUIRED)
    private String feeAmount;
    @TaggedField
    private String feeLimit;
    @TaggedField
    private String[] holdItems;
    @TaggedField
    private String[] overdueItems;
    @TaggedField
    private String[] chargedItems;
    @TaggedField
    private String[] fineItems;
    @TaggedField
    private String[] recallItems;
    @TaggedField
    private String[] unavailableHoldItems;
    @TaggedField
    private String homeAddress;
    @TaggedField
    private String emailAddress;
    @TaggedField
    private String homePhoneNumber;
    @TaggedField
    private String screenMessage;
    @TaggedField
    private String printLine;

    public String[] getChargedItems() {
        return this.chargedItems;
    }

    public Integer getChargedItemsCount() {
        if(this.chargedItemsCount == null){
            this.chargedItemsCount = 0;
        }
        return this.chargedItemsCount;
    }

    public Integer getChargedItemsLimit() {
        return this.chargedItemsLimit;
    }

    public CurrencyType getCurrencyType() {
        return this.currencyType;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public String getFeeAmount() {
        return this.feeAmount;
    }

    public String getFeeLimit() {
        return this.feeLimit;
    }

    public String[] getFineItems() {
        return this.fineItems;
    }

    public Integer getFineItemsCount() {
        return this.fineItemsCount;
    }

    public String[] getHoldItems() {
        return this.holdItems;
    }

    public Integer getHoldItemsCount() {
        return this.holdItemsCount;
    }

    public Integer getHoldItemsLimit() {
        return this.holdItemsLimit;
    }

    public String getHomeAddress() {
        return this.homeAddress;
    }

    public String getHomePhoneNumber() {
        return this.homePhoneNumber;
    }

    public String getInstitutionId() {
        return this.institutionId;
    }

    public Language getLanguage() {
        return this.language;
    }

    public String[] getOverdueItems() {
        return this.overdueItems;
    }

    public Integer getOverdueItemsCount() {
        return this.overdueItemsCount;
    }

    public Integer getOverdueItemsLimit() {
        return this.overdueItemsLimit;
    }

    public String getPatronIdentifier() {
        return this.patronIdentifier;
    }

    public PatronStatus getPatronStatus() {
        return this.patronStatus;
    }

    public String getPersonalName() {
        return this.personalName;
    }

    public String getPrintLine() {
        return this.printLine;
    }

    public String[] getRecallItems() {
        return this.recallItems;
    }

    public Integer getRecallItemsCount() {
        return this.recallItemsCount;
    }

    public String getScreenMessage() {
        return this.screenMessage;
    }

    public Date getTransactionDate() {
        return this.transactionDate;
    }

    public Integer getUnavailableHoldsCount() {
        return this.unavailableHoldsCount;
    }

    public String[] getUnavailableHoldItems() {
        return this.unavailableHoldItems;
    }

    public Boolean isValidPatron() {
        return this.validPatron;
    }

    public Boolean isValidPatronPassword() {
        return this.validPatronPassword;
    }

    public void setValidPatronPassword(Boolean validPatronPassword) {
        this.validPatronPassword = validPatronPassword;
    }

    public void setValidPatron(Boolean validPatron) {
        this.validPatron = validPatron;
    }

    public void setUnavailableHoldItems(String[] unavailableHoldItems) {
        this.unavailableHoldItems = unavailableHoldItems;
    }

    public void setUnavailableHoldsCount(Integer unavailableHoldsCount) {
        this.unavailableHoldsCount = unavailableHoldsCount;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setScreenMessage(String screenMessage) {
        this.screenMessage = screenMessage;
    }

    public void setRecallItemsCount(Integer recallItemsCount) {
        this.recallItemsCount = recallItemsCount;
    }

    public void setRecallItems(String[] recallItems) {
        this.recallItems = recallItems;
    }

    public void setPrintLine(String printLine) {
        this.printLine = printLine;
    }

    public void setPersonalName(String personalName) {
        this.personalName = personalName;
    }

    @Deprecated
    public void setPatronStatus(PatronStatus patronStatus) {
        this.patronStatus = patronStatus;
    }

    public void setPatronIdentifier(String patronIdentifier) {
        this.patronIdentifier = patronIdentifier;
    }

    public void setOverdueItemsLimit(Integer overdueItemsLimit) {
        this.overdueItemsLimit = overdueItemsLimit;
    }

    public void setOverdueItemsCount(Integer overdueItemsCount) {
        this.overdueItemsCount = overdueItemsCount;
    }

    public void setOverdueItems(String[] overdueItems) {
        this.overdueItems = overdueItems;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public void setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setHoldItemsLimit(Integer holdItemsLimit) {
        this.holdItemsLimit = holdItemsLimit;
    }

    public void setHoldItemsCount(Integer holdItemsCount) {
        this.holdItemsCount = holdItemsCount;
    }

    public void setHoldItems(String[] holdItems) {
        this.holdItems = holdItems;
    }

    public void setFineItemsCount(Integer fineItemsCount) {
        this.fineItemsCount = fineItemsCount;
    }

    public void setFineItems(String[] fineItems) {
        this.fineItems = fineItems;
    }

    public void setFeeLimit(String feeLimit) {
        this.feeLimit = feeLimit;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public void setChargedItems(String[] chargedItems) {
        this.chargedItems = chargedItems;
    }

    public void setChargedItemsCount(Integer chargedItemsCount) {
        this.chargedItemsCount = chargedItemsCount;
    }

    public void setChargedItemsLimit(Integer chargedItemsLimit) {
        this.chargedItemsLimit = chargedItemsLimit;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
