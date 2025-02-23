public enum Grade {
    A(90, 100), B(80, 89), C(70, 79), D(60, 69), F(0, 59);

    private final int min;
    private final int max;

    Grade(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public static Grade getGrade(int mark) {
        for (Grade grade : Grade.values()) {
            if (mark >= grade.min && mark <= grade.max) {
                return grade;
            }
        }
        return F; // Default to F if out of range
    }
}