import java.util.Arrays;

public class Class {
    private int number;
    private String word;
    private String[] array;

    public Class() {
    }

    public Class(int number, String word, String array) {
        this.number = number;
        this.word = word;
        this.array = new String[]{array};
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "Class{" +
                "number=" + number +
                ", word='" + word + '\'' +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
