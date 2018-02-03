package task_6;
import task_6.Notebook;
import task_6.Note;

/**
*<p> Точка входа </p>
 */
public class Main {
    public static void main(String[] args) {

        Notebook myNoteBook = new Notebook();

        Note note1 = new Note("fdgsd");
        myNoteBook.addNote(note1);
        note1 = new Note("lwlwlwlwlwl");
        myNoteBook.addNote(note1);
        myNoteBook.printAllNotes();

        myNoteBook.deleteNote();
        System.out.println("После удаления:");
        myNoteBook.printAllNotes();

        myNoteBook.changeNote(0, "hi!");
        System.out.println("После изменения:");
        myNoteBook.printAllNotes();



    }
}
