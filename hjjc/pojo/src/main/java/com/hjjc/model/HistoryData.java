package com.hjjc.model;

import java.io.Serializable;

/**
 * [STRATO MyBatis Generator]
 * Table: HistoryData
@mbggenerated do_not_delete_during_merge 2018-03-27 16:27:30
 */
public class HistoryData extends HistoryDataKey implements Serializable {
    /**
     * Column: HistoryData.CurrentA
    @mbggenerated 2018-03-27 16:27:30
     */
    private Float currentA;

    /**
     * Column: HistoryData.CurrentB
    @mbggenerated 2018-03-27 16:27:30
     */
    private Float currentB;

    /**
     * Column: HistoryData.CurrentC
    @mbggenerated 2018-03-27 16:27:30
     */
    private Float currentC;

    /**
     * Column: HistoryData.VoltA
    @mbggenerated 2018-03-27 16:27:30
     */
    private Float voltA;

    /**
     * Column: HistoryData.VoltB
    @mbggenerated 2018-03-27 16:27:30
     */
    private Float voltB;

    /**
     * Column: HistoryData.VoltC
    @mbggenerated 2018-03-27 16:27:30
     */
    private Float voltC;

    /**
     * Column: HistoryData.isAvailable
    @mbggenerated 2018-03-27 16:27:30
     */
    private Boolean isAvailable;

    /**
     * Column: HistoryData.isCalculate
    @mbggenerated 2018-03-27 16:27:30
     */
    private Boolean isCalculate;

    /**
     * Column: HistoryData.EnergyA
    @mbggenerated 2018-03-27 16:27:30
     */
    private Float energyA;

    /**
     * Column: HistoryData.EnergyB
    @mbggenerated 2018-03-27 16:27:30
     */
    private Float energyB;

    /**
     * Column: HistoryData.EnergyC
    @mbggenerated 2018-03-27 16:27:30
     */
    private Float energyC;

    /**
     * Table: HistoryData
    @mbggenerated 2018-03-27 16:27:30
     */
    private static final long serialVersionUID = 1L;

    public Float getCurrentA() {
        return currentA;
    }

    public void setCurrentA(Float currentA) {
        this.currentA = currentA;
    }

    public Float getCurrentB() {
        return currentB;
    }

    public void setCurrentB(Float currentB) {
        this.currentB = currentB;
    }

    public Float getCurrentC() {
        return currentC;
    }

    public void setCurrentC(Float currentC) {
        this.currentC = currentC;
    }

    public Float getVoltA() {
        return voltA;
    }

    public void setVoltA(Float voltA) {
        this.voltA = voltA;
    }

    public Float getVoltB() {
        return voltB;
    }

    public void setVoltB(Float voltB) {
        this.voltB = voltB;
    }

    public Float getVoltC() {
        return voltC;
    }

    public void setVoltC(Float voltC) {
        this.voltC = voltC;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Boolean getIsCalculate() {
        return isCalculate;
    }

    public void setIsCalculate(Boolean isCalculate) {
        this.isCalculate = isCalculate;
    }

    public Float getEnergyA() {
        return energyA;
    }

    public void setEnergyA(Float energyA) {
        this.energyA = energyA;
    }

    public Float getEnergyB() {
        return energyB;
    }

    public void setEnergyB(Float energyB) {
        this.energyB = energyB;
    }

    public Float getEnergyC() {
        return energyC;
    }

    public void setEnergyC(Float energyC) {
        this.energyC = energyC;
    }
}