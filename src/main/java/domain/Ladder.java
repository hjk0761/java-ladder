package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import util.Generator;

public class Ladder {

    private final List<Line> ladder;
    private final Height height;

    public Ladder(Height height) {
        validateHeight(height);
        this.height = height;
        this.ladder = new ArrayList<>();
    }

    public void init(int personCount, Generator generator) {
        for (int index = 0; index < height.getHeight(); ++index) {
            ladder.add(index, new Line(generator.generate(personCount)));
        }
    }

    public List<Line> getLadder() {
        return Collections.unmodifiableList(ladder);
    }

    private void validateHeight(Height height) {
        if (height.getHeight() < 1 || height.getHeight() > 50) {
            throw new IllegalArgumentException("사다리의 높이는 1 이상 50 이하여야 합니다.");
        }
    }
}
