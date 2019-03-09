package pl.lach.streamSolution;

import pl.lach.Logic;

import java.util.stream.IntStream;

public class StreamSolution {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).forEach(Logic::logicMethod);
    }


}
