package home_work_6;

public class DeleteSimvols {
    public String deleteSimvolsAll (String actual){
        String simvols = ",.:;\"!?()-";
        actual = actual.replaceAll("[,.:;\"!?()\n\r]", " ").replaceAll(" +", " ").replaceAll(" - ", " ").replaceAll("- ", " ").replaceAll("- ", " ");
        boolean isSimvol = false;
        while (!isSimvol){
            isSimvol = true;
            for (int i = 0; i < simvols.length(); i++) {
                if (actual.charAt(0) == simvols.charAt(i)){
                    actual = actual.substring(1);
                    isSimvol = false;
                    break;
                }
            }
        }
        return actual;
    }
}
