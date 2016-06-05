package TemplateMethod;

/**
 * This is basic engineer class
 * Created by Sayarasin on 6/5/2016.
 */
public abstract class BasicEngineering {

    public void papers() {
        math();
        softSkill();
        //Special paper placeholder
        specialPaper();
    }

    private void math() {
        System.out.println("Mathematics");
    }

    private void softSkill() {
        System.out.println("SoftSkills");
    }

    public abstract void specialPaper();
}
