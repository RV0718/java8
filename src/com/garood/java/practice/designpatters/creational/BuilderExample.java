package com.garood.java.practice.designpatters.creational;

import java.util.Date;

public class BuilderExample {

    public static void main(String[] args) {
        Task task = new Task.TaskBuilder()
                .setDescription("Desc")
                .setDone(false)
                .setDueDate(new Date())
                .setSummary("Summary")
                .build();

        System.out.println(task);
    }
}

class Task {

    private final long id;
    private String summary = "";
    private String description = "";
    private boolean done = false;
    private Date dueDate;

    public Task(long id, String summary, String description, boolean done,
                Date dueDate) {
        this.id = id;
        this.summary = summary;
        this.description = description;
        this.done = done;
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", summary='" + summary + '\'' +
                ", description='" + description + '\'' +
                ", done=" + done +
                ", dueDate=" + dueDate +
                '}';
    }

    static class TaskBuilder {
        private long id;
        private String summary = "";
        private String description = "";
        private boolean done = false;
        private Date dueDate;

        public TaskBuilder setSummary(String summary) {
            this.summary = summary;
            return this;
        }

        public TaskBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public TaskBuilder setDone(boolean done) {
            this.done = done;
            return this;
        }

        public TaskBuilder setDueDate(Date dueDate) {
            this.dueDate = new Date(dueDate.getTime());
            return this;
        }

        public Task build() {
            return new Task(id, summary, description, done, dueDate);
        }
    }
}
