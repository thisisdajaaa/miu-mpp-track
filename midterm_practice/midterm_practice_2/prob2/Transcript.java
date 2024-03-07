package midterm_practice.prob2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Transcript {
    List<TranscriptEntry> transcriptEntries;

    Transcript() {}

    public List<TranscriptEntry> getTranscriptEntries() {
        return Collections.unmodifiableList(transcriptEntries);
    }

    public void addTranscriptEntry(LocalDate courseDate, String grade, Course course) {
        if (transcriptEntries == null) transcriptEntries = new ArrayList<>();

        transcriptEntries.add(new TranscriptEntry(courseDate, grade, course));
    }
}
