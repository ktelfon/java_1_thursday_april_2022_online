package student_Vladislavs_Solims.homework.lesson_9.level_2;

public class Task8 {
}
class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class ComputerPlayer extends Player {
    public ComputerPlayer(String name) {
        super(name);

    }
}
class ComputerPlayerDemo  {
    ComputerPlayer player = new ComputerPlayer("Vlad");

}

