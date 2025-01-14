package records;

import java.util.ArrayList;
import java.util.Collection;

import course.Section;

public class Timetable {

    private String semester;
    private ArrayList<Section> sections;
    
    public Timetable() {
        this.semester = "N/A";
        this.sections = new ArrayList<Section>(0);
    }

    public Timetable(String _semester, Collection<Section> _sections) {
        this();
        this.semester = _semester;
        this.sections.addAll(_sections);
    }

    public String GetSemester() {
        return semester;
    }

    public void SetSemester(String semester) {
        this.semester = semester;
    }

    public ArrayList<Section> GetSections() {
        return sections;
    }

    public void SetSections(ArrayList<Section> sections) {
        this.sections = sections;
    }

    public String toString() {

        String timetableString = "";

        // Get meetings list from each section
        for(Section s: sections) {
            timetableString += s.toString() + "\n";
        }

        return timetableString;

    }

}
