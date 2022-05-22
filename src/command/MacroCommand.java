package command;

import java.util.Iterator;
import java.util.Stack;

public class MacroCommand implements Command {

    // stack of command
    private Stack commands = new Stack();

    public void execute() {
        Iterator it = commands.iterator();
        while (it.hasNext()) {
            ((Command) it.next()).execute();
        }
    }

    // append
    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }

    // delete last command
    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    // delete all
    public void clear() {
        commands.clear();
    }
}
