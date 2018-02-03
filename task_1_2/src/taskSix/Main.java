package taskSix;

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

        note1 = new Note("lwl");
        myNoteBook.addNote(note1);

        note1 = new Note("lwlwlw");
        myNoteBook.addNote(note1);

        myNoteBook.printAllNotes();

        myNoteBook.deleteNote(4);
        System.out.println("После удаления:");
        myNoteBook.printAllNotes();

        myNoteBook.deleteNote(2);
        System.out.println("После удаления:");
        myNoteBook.printAllNotes();

        myNoteBook.changeNote(0, "hi!");
        System.out.println("После изменения:");
        myNoteBook.printAllNotes();



    }
}
