package group_id_test;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    private void doMyInit(){
        System.out.println("Classical music has been initialized");
    }
    private void doMyDestroy(){
        System.out.println("Classical music has been destroyed");
    }

    @Override
    public String getSong() {
        return "Seasons of year";
    }
}
