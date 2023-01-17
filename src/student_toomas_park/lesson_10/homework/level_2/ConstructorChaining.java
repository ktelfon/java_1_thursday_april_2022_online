package student_toomas_park.lesson_10.homework.level_2;

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount) {
        this.constructorName = constructorName;
        this.parameterCount = parameterCount;
        new ConstructorChaining("");
    }
}
