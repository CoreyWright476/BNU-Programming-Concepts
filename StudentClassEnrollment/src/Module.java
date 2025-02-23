public class Module {
    private String moduleName;
    private String moduleCode;

    public Module(String moduleName, String moduleCode) {
        this.moduleName = moduleName;
        this.moduleCode = moduleCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public Grade getLetterGrade(int mark) {
        return Grade.getGrade(mark);
    }
}