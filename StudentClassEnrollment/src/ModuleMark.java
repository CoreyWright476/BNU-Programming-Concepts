public class ModuleMark {
    private Module module;
    private int mark;

    public ModuleMark(Module module, int mark) {
        this.module = module;
        this.mark = mark;
    }

    public Module getModule() {
        return module;
    }

    public int getMark() {
        return mark;
    }
}