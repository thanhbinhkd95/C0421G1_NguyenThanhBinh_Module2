package Case_study.utils;

import Case_study.models.Facility;

import java.util.Map;


public interface ReadAndWriteFacility  {
    void writeFile(String path, Map<Facility, Integer> collection);
    Map<Facility,Integer> readFile(String path);
}
