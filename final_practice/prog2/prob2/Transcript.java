package final_practice.prog2.prob2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Transcript {
    private List<TranscriptEntry> transcriptEntries;

    public Transcript() {
    }

    public List<TranscriptEntry> getTranscriptEntries() {
        return transcriptEntries;
    }

    public void setTranscriptEntries(List<TranscriptEntry> transcriptEntries) {
        this.transcriptEntries = transcriptEntries;
    }

    public void addTranscriptEntry(LocalDate courseDate, String grade, Course course) {
        if (transcriptEntries == null) transcriptEntries = new ArrayList<>();

        transcriptEntries.add(new TranscriptEntry(courseDate, grade, course));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transcript that = (Transcript) o;
        return Objects.equals(transcriptEntries, that.transcriptEntries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transcriptEntries);
    }
}
