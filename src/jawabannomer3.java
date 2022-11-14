import java.sql.SQLOutput;
import java.util.Scanner;
public class jawabannomer3 {
    int jumlahbus = 4;
    static int totaljumlahpenumpangbus = 60;
    public static String[] TopLevel = new String[15];
    public static String[] MiddleLevel = new String[15];
    public static String[] RegularStaff = new String[15];
    public static String[] Staff = new String[15];

    public static void printinfopenumpang() {
        int totalpenumpangTopLevel = 0;
        int totalsisabangku = 0;
        for (int index = 0; index < TopLevel.length; index++) {
            if (TopLevel[index] != null) {
                totalsisabangku++;
            }
        }
        int totalpenumpangMiddleLevel = 0;
        for (int index = 0; index < MiddleLevel.length; index++) {
            if (MiddleLevel[index] != null) {
                totalsisabangku++;
            }
        }
        int totalpenumpangRegularStaff = 0;
        for (int index = 0; index < RegularStaff.length; index++) {
            if (RegularStaff[index] != null) {
                totalsisabangku++;
            }
        }
        int totalpenumpangStaff = 0;
        for (int index = 0; index < Staff.length; index++) {
            if (Staff[index] != null) {
                totalsisabangku++;
            }
        }
        totalsisabangku = totaljumlahpenumpangbus - totalpenumpangTopLevel - totalpenumpangMiddleLevel - totalpenumpangRegularStaff - totalpenumpangStaff;
        System.out.println(" | Total Penumpang TopLevel: " + totalpenumpangTopLevel + " | Total Penumpang MiddleLevel: " + totalpenumpangMiddleLevel + " | Total Penumpang RegularStaff: " + totalpenumpangRegularStaff + " | Total Penumpang Staff: " + totalpenumpangStaff);
        System.out.println();
    }

    public static void CheckIndexArray(String[] myArray, String penumpang) {
        int indexnow = 0;
        for (int index = 0; index < myArray.length; index++) {
            if (myArray[indexnow] != null) {
                indexnow = index + 1;
            }
        }
        if (indexnow < myArray.length) {
            myArray[indexnow] = penumpang;
        }
    }
}