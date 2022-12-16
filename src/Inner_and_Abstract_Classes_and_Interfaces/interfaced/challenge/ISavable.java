package Inner_and_Abstract_Classes_and_Interfaces.interfaced.challenge;

import java.util.List;

public interface ISavable {
    List<String> write();
    void read(List<String> savedValues);
}
