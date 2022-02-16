public class studyMenager {

    public void add(study studylist, int timer) {
        userOperation userOperation = new userOperation();
        studylist.setName(userOperation.setName(), timer);
        studylist.setSurName(userOperation.setSurName(), timer);
        studylist.setNumber(userOperation.setNumber(), timer);
        studylist.setClas(userOperation.setClas(), timer);
        studylist.setAttendSchool(userOperation.setAttendSchool(), timer);
        studylist.setId(timer);
    }

    public int find(study study, String id) {
        int studyNo = 0, i = 0;
        while (i < study.getId().length) {
            if (study.getId()[i] == null) {
                if (i != 0) {
                    System.out.println("Not Found pls try again...");
                    return 30;
                } else {
                    System.out.println("u not have a student...");
                    return 30;
                }
            } else if (study.getId()[i].equals(id)) {
                studyNo = i;
                return studyNo;
            }
            i++;
        }
        return 30;
    }

    public void allListstudy(study study, int timer) {
        int i = 0;
        while (null != study.getId()[i]) {
            informationStudent(i);
            i++;
        }
    }

    public void studyInfo(study study, int studyNo) {
        if (studyNo != 30) {
            informationStudent(studyNo);
        }
    }

    public void studyEdit(study study, int studyNo) {
        if (studyNo != 30) {
            informationStudent(studyNo);
            add(study, studyNo);
        }

    }

    public void informationStudent(int studyNo) {
        System.out.println(
                "Id: " + study.getId(studyNo) +
                        " Name: " + study.getName(studyNo) +
                        " SurName: " + study.getSurName(studyNo) +
                        " Class: " + study.getClas(studyNo) +
                        " School Number: " + study.getNumber(studyNo) +
                        " Attend school: " + study.getAttendSchool(studyNo));
    }
}
