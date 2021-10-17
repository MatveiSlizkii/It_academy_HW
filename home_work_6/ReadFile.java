package home_work_6;

import java.io.IOException;


public class ReadFile {
    public static void main(String[] args) throws IOException {
//        Path fileName = Path.of("D:\\JavaProject\\Wow\\Тест Война и мир_книга .txt");
//        String actual = Files.readString(fileName);
//        System.out.println(actual);
        String actual = "-привет мир привет:    мир \nпривет...мир       привет:мир привет :мир. мир-мир...";
        String simvols = ",.:;\"!?()";
        //System.out.println(actual);
        actual = actual.replace("\n", "").replace("\r", "");
// важно он не смотрит на последний символ так как предполагается что там точка
        for (int i = 0; i < actual.length() - 1; i++) {
            for (int j = 0; j < simvols.length(); j++) {
                //нашли символ
                if (actual.charAt(i) == simvols.charAt(j)) {
                    //проверка есть ли после символа пробел, вставляем если не было
                    if (actual.charAt(i + 1) != 32) {
                        actual = actual.substring(0, i + 1) + " " + actual.substring(i + 1);
                    }
                    // удаляем символы
                    actual = actual.substring(0, i) + actual.substring(i + 1);
                    i--;
                }
            }
            //нужен иф для дефиса или тире
            if (actual.charAt(i) == 45) {
                //если обнаружили тире
                try {
                    if (actual.charAt(i - 1) == 32 || actual.charAt(i + 1) == 32) {
                        actual = actual.substring(0, i) + actual.substring(i + 1);
                    }
                } catch (StringIndexOutOfBoundsException e) {
                    actual = actual.substring(0, i) + actual.substring(i + 1);
                }
            }
            //теперь хочу чтобы параллельно удаляллись дабл пробелы, тут может быть магия с i
            if (actual.charAt(i) == 32 && actual.charAt(i + 1) == 32) {
                actual = actual.substring(0, i) + actual.substring(i+1);
                i--;
            }
        }
        //удаляем символ в конце, обычно это точка
        for (int i = 0; i < simvols.length(); i++) {
            if (actual.charAt(actual.length() - 1) == simvols.charAt(i)) {
                actual = actual.substring(0, actual.length() - 1);
                break;
            }
        }

        System.out.println(actual);
    }
            /*
    разбиение на слова важны ',.:;-"!?()'
    хоть на первый взгляд текст написан по всех провилам пунктуации лучше все равно проверить на всякие косяки
    по типу привет;мир
    важно все сделать за один прогон строки
    первое это находим всю пунктуацию
    проверяем есть ли после знака препинания пробел если нет то вставляем его
    тут же делим это на слова
    пока попробуем с листом
    а потом и с сетом
    а что делать если два знака идут сразу привет...мир
    особое внимание надо еделить тире потому что может являться и дефисом!
     */
}


