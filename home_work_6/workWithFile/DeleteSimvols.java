package home_work_6.workWithFile;

public class DeleteSimvols {
    private String book;

    public DeleteSimvols(String almostBook) {
        String simvols = ",.:;\"!?()-";
        // это на случай если в начале слова будет стоять "-"
        boolean isSimvol = false;
        while (!isSimvol){
            isSimvol = true;
            for (int i = 0; i < simvols.length(); i++) {
                if (almostBook.charAt(0) == simvols.charAt(i) || almostBook.charAt(0) == 32){
                    almostBook = almostBook.substring(1);
                    isSimvol = false;
                }
            }
        }
        //в приоритете разобраться как сделать всего ва реплейса
        almostBook = almostBook
//                .replaceAll("[,.:;\"!?()\n\r]", " ")
//                .replaceAll(" - ", " ")
//                .replaceAll("- ", " ")
//                .replaceAll(" +", " ")
                .replaceAll("(\\.|,|:|;|\"|!|\\?|\\(|\\)|\n|\r| - |- | +)",
                        " ");
        //нужно еще сделать проверку на последдний символ тоже может стоять "-"
        this.book = almostBook;
    }

    public String getBook() {
        return book;
    }
}
