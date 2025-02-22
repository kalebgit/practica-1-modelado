package org.equipo404.courses;

import org.equipo404.fees.Level;
import org.equipo404.learningmodes.LearningModeStrategy;

public class CourseRaw {

    private CourseType courseType;
    private Level level;
    private LearningModeStrategy learningMode;

    public CourseRaw(CourseType courseType, Level level, LearningModeStrategy learningMode) {
        this.courseType = courseType;
        this.level = level;
        this.learningMode = learningMode;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    public LearningModeStrategy getLearningMode() {
        return learningMode;
    }


    public void setLearningMode(LearningModeStrategy learningMode) {
        this.learningMode = learningMode;
    }


    @Override
    public String toString() {
        return "CourseRaw{" +
                "courseType=" + courseType +
                ", level=" + level +
                ", learningMode=" + learningMode +
                '}';
    }
}
