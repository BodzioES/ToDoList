
public class AddTask {
    private String nameTask;
    private String descriptionTask;
    private String deadline;

    public AddTask(String nameTask, String descriptionTask, String deadline ){
        this.nameTask = nameTask;
        this.descriptionTask = descriptionTask;
        this.deadline = deadline;
    }

    public String getNameTask(){
        return nameTask;
    }

    public String getDescriptionTask(){
        return descriptionTask;
    }


    public String getDeadline(){
        return deadline;
    }

    @Override
    public String toString(){
        return "Name: " + nameTask + " | Description: " + descriptionTask + " | Deadline: " + deadline;
    }
}
