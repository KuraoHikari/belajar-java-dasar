public class Array {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Kurao";
        stringArray[1] = "Hikari";
        stringArray[2] = "Indra";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Gede";

        System.out.println(stringArray[0]); //Gede

        String[] namaNama = {
                "kurao", "Hikari", "Indra"
        };

        namaNama[0] = null;

        int[] arrayInt = new int[]{
          1,2,3,4,5,6,7,8,9,10
        };

        long[] arrayLong = {
                10L,20L,30L
        };

        arrayLong[0] = 0;

        System.out.println(arrayLong.length);

        String[][] members = {
                {"Kurao", "Kurniawan"},
                {"Hikari", "Kanady"},
                {"Joko"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[0]);
    }
}
