public class study {
    private static int[] number = new int[30];
    private static String[] Name = new String[30];
    private static String[] surName = new String[30];
    private static String[] clas = new String[30];
    private static boolean[] attendSchool = new boolean[30];
    private static String[] id = new String[30];

    public static int getNumber(int timer) {
        return number[timer];
    }

    public static void setNumber(int number, int timer) {
        study.number[timer] = number;
    }

    public static String getName(int timer) {
        return Name[timer];
    }

    public static void setName(String name, int timer) {
        Name[timer] = name;
    }

    public static String getSurName(int timer) {
        return surName[timer];
    }

    public static void setSurName(String surName, int timer) {
        study.surName[timer] = surName;
    }

    public static String getClas(int timer) {
        return clas[timer];
    }

    public static void setClas(String clas, int timer) {
        study.clas[timer] = clas;
    }

    public static boolean getAttendSchool(int timer) {
        return attendSchool[timer];
    }

    public static void setAttendSchool(boolean attendSchool, int timer) {
        study.attendSchool[timer] = attendSchool;
    }

    public static String getId(int timer) {
        return id[timer];
    }

    public static void setId(int timer) {
        study.id[timer] = study.Name[timer].substring(0, 1).toLowerCase()
                + study.surName[timer].substring(0, 1).toLowerCase()
                + number[timer];
    }

    public static int[] getNumber() {
        return number;
    }

    public static String[] getName() {
        return Name;
    }

    public static String[] getSurName() {
        return surName;
    }

    public static String[] getClas() {
        return clas;
    }

    public static boolean[] getAttendSchool() {
        return attendSchool;
    }

    public static String[] getId() {
        return id;
    }

}