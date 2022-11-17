package chapter9.interfaced.challenge;

import java.util.List;

public interface ISavable {
    List<String> write();
    void read(List<String> savedValues);
}
