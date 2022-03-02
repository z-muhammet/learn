package menager;

import dataBase.customer;
import dataBase.person;

public class customerMenager extends baseMenager {

    userOperation userOperation = new userOperation();

    public void add(int noId, person person) {
        person.setRank(userOperation.mainEnterString("Rank"), noId);
        person.setdebt(userOperation.mainEnterDouble("Debt"), noId);
    }

    public void delete() {

    }

    public void edit() {

    }

    public void list() {

    }
}
