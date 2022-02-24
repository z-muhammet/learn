package menager;

import java.util.Arrays;

import dataBase.person;
import logger.baseLogger;

public class finder {
    public int amountOfData(person person, baseLogger logger) {
        int i = 0;
        for (String id : person.getId()) {
            if (id != null) {
                i++;
            }
        }
        if (i != 0) {
            return i;
        }
        System.out.println(logger.finderNoData());
        return i;
    }

    public int aDataFind(person person, baseLogger logger, String id) {
        int search = Arrays.binarySearch(person.getId(), id);
        if (search != -1) {
            return search;
        }
        System.out.println(logger.finderNotFound());
        return -1;

    }
}
