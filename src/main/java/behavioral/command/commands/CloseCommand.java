package behavioral.command.commands;

public class CloseCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Close file");
    }

}
