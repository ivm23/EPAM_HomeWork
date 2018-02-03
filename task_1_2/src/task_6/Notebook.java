package task_6;

import task_6.Note;

/**
 * <p>Класс служит для хранения Записей, которые хранятся в массиве.</p?
 * <p>Класс содеожит размер поля.</p>
 */
public class Notebook {
    public Notebook() {
        notes = new Note[0];
        size = 0;
    }

    private Note[] notes;
    private int size;

    /**
     * <p>Метод осуществляет добавление новой записи</p>
     * @param noteForAdd содержит запись, которую необходимо добавить.
     */
    public void addNote(Note noteForAdd) {
        Note[] temp = notes;
        notes = new Note[++size];

        for (int i = 0; i < size - 1; ++i) {
            notes[i] = temp[i];
        }
        notes[size - 1] = noteForAdd;
    }

    /**
     * <p>Метод позволяет удалить последний элемент.</p>
     */
    public void deleteNote() {
        if (size > 0) {
            Note[] temp = notes;
            notes = new Note[--size];
            for (int i = 0; i < size; ++i) {
                notes[i] = temp[i];
            }
        }
    }

    /**
     * <p>Метод осуществляет вывести все записи блокнота.</p>
     */
    public void printAllNotes() {
        for (int i =0; i < size; ++i) {
            System.out.printf("%d запись ", i);
            System.out.println(notes[i].getText());
        }
    }

    /**
     * <p>Метод позволяет изменить запись.</p>
     * @param indexOfNote запись, которую необходимо изменить.
     * @param newValue новое значение записи.
     */
    public  void changeNote(int indexOfNote, String newValue) {
        if (0 <= indexOfNote && indexOfNote < size) {
            notes[indexOfNote].setText(newValue);
        }
    }
}
