package teammates.ui.webapi.output;

import javax.annotation.Nullable;

import teammates.common.datatransfer.attributes.StudentAttributes;

/**
 * The API output format of {@link StudentAttributes}.
 */
public class StudentData extends ApiOutput {

    private final String email;
    private final String courseId;

    private final String name;
    @Nullable
    private String googleId;
    @Nullable
    private String lastName;
    @Nullable
    private String comments;

    private JoinState joinState;

    private final String teamName;
    private final String sectionName;

    public StudentData(StudentAttributes studentAttributes) {
        this.email = studentAttributes.getEmail();
        this.courseId = studentAttributes.getCourse();
        this.name = studentAttributes.getName();
        this.googleId = studentAttributes.getGoogleId();
        this.lastName = studentAttributes.getLastName();
        this.joinState = studentAttributes.isRegistered() ? JoinState.JOINED : JoinState.NOT_JOINED;
        this.comments = studentAttributes.getComments();
        this.teamName = studentAttributes.getTeam();
        this.sectionName = studentAttributes.getSection();
    }

    public String getEmail() {
        return email;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getName() {
        return name;
    }

    public String getGoogleId() {
        return googleId;
    }

    public String getLastName() {
        return lastName;
    }

    public String getComments() {
        return comments;
    }

    public JoinState getJoinState() {
        return joinState;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setGoogleId(String googleId) {
        this.googleId = googleId;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setJoinState(JoinState joinState) {
        this.joinState = joinState;
    }

    /**
     * Hides last name.
     */
    public void hideLastName() {
        setLastName(null);
    }

    /**
     * Hides some attributes to instructor.
     */
    public void hideInformationForInstructor() {
        setGoogleId(null);
        setComments(null);
    }
}
