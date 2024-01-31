package com.ceica.Modelos;

public class Task extends ModeloBase {
    private String title;
    private String description;
    private String dateTime;
    private String deadLine;
    private String status;

    public Task(String title, String description, String dateTime, String deadLine, String status) {
        this.title = title;
        this.description = description;
        this.dateTime = dateTime;
        this.deadLine = deadLine;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", deadLine='" + deadLine + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    protected String getNombreTabla() {
        return null;
    }
}
