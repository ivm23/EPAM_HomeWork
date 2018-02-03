package taskSix;

/**
 * <p>Класс служит для хранения Записей, которые хранятся в массиве.</p?
 * <p>Класс содеожит размер поля.</p>
 */
public class Notebook {
    public Notebook() {
        notes = new Note[0];
    }

    private Note[] notes;
    private int size;

    /**
     * <p>Метод осуществляет добавление новой записи</p>
     * @param noteForAdd содержит запись, которую необходимо добавить.
     */
    public void addNote(Note noteForAdd) {
        ++size;

        if (notes.length < size) {
            Note[] temp = notes;
            notes = new Note[size * 2];
            for (int i = 0; i < size - 1; ++i) {
                notes[i] = temp[i];
            }
        }

        notes[size - 1] = noteForAdd;
    }

    /**
     * <p>Метод позволяет удалить последний элемент.</p>
     */
    public void deleteNote(int index) {
        if (0 < size && 0 <= index && index < size) {
            if (size * 2 <= notes.length) {
                Note[] temp = notes;

                notes = new Note[size - 1];

                int j = 0;
                for (int i = 0; i < size; ++i) {
                    if (i != index) {
                        notes[i] = temp[i];
                        ++j;
                    }
                }
            }
            else
                for (int i = index; i < size - 1; ++i) {
                notes[i] = notes[i+1];
                }
            --size;
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
