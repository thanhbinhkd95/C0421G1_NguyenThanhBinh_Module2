package Case_study.utils;

import Case_study.models.Contract;

public interface ReadAndWriteContract extends ReadAndWrite<Contract> {
    void clear(String path);
}
