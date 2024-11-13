package ClassWork_044_stream.programmer_and_technologies.dao;

import ClassWork_044_stream.programmer_and_technologies.model.Programmer;

import java.util.List;

public interface Pro {

    List<Programmer> fillListProgrammers();

    void printTechnologies(List<Programmer> programmers);

    void printTechnologiesByFrequency(List<Programmer> programmers);

    void printTechnologiesByFrequencySorted(List<Programmer> programmers);

    void printTechnologiesRating(List<Programmer> programmers);
    void printMostSkilledProgrammers(List<Programmer> programmers);
}
