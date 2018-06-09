package com.hjjc.model;

import java.io.Serializable;

/**
 * [STRATO MyBatis Generator]
 * Table: EventDateReportCodeTable
@mbggenerated do_not_delete_during_merge 2018-03-27 16:27:30
 */
public class EventDateReportCodeTable implements Serializable {
    /**
     * Column: EventDateReportCodeTable.EventCode
    @mbggenerated 2018-03-27 16:27:30
     */
    private Integer eventCode;

    /**
     * Column: EventDateReportCodeTable.EventMemo
    @mbggenerated 2018-03-27 16:27:30
     */
    private String eventMemo;

    /**
     * Column: EventDateReportCodeTable.Note
    @mbggenerated 2018-03-27 16:27:30
     */
    private String note;

    /**
     * Table: EventDateReportCodeTable
    @mbggenerated 2018-03-27 16:27:30
     */
    private static final long serialVersionUID = 1L;

    public Integer getEventCode() {
        return eventCode;
    }

    public void setEventCode(Integer eventCode) {
        this.eventCode = eventCode;
    }

    public String getEventMemo() {
        return eventMemo;
    }

    public void setEventMemo(String eventMemo) {
        this.eventMemo = eventMemo == null ? null : eventMemo.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}