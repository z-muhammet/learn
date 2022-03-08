import java.util.Scanner;

public class datasMenager {
    private int value;
    private datas first;
    private datas temp;
    private datas last;

    public datas getLast() {
        return last;
    }

    public void setLast(datas last) {
        this.last = last;
    }

    private boolean checkFirstData() {
        if (getFirst() == null) {
            return true;
        }
        return false;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public datas getFirst() {
        return first;
    }

    public void setFirst(datas first) {
        this.first = first;
    }

    public datas getTemp() {
        return temp;
    }

    public void setTemp(datas temp) {
        this.temp = temp;
    }

    public void addfirst(datas data) {
        if (checkFirstData()) {
            setFirst(data);
            setLast(data);
        } else {
            data.setNext(getFirst());
            setFirst(data);
        }
    }

    private boolean checkData() {
        if (checkFirstData()) {
            return false;

        } else {
            temp = first;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            return true;
        }

    }

    public void addLastTemp(datas data) {
        if (checkData()) {
            temp.setNext(data);
            setLast(data);
        } else {
            addfirst(data);
        }
    }

    public void addLast(datas data) {
        if (last == null) {
            addfirst(data);
        } else {
            last.setNext(data);
            last = data;
        }
    }

    public void list() {
        datas temps = first;
        int i = 1;
        if (temps != null) {
            while (temps != null) {
                System.out.println(i + ": " + temps.getData());
                temps = temps.getNext();
                i++;
            }
        } else {
            System.out.println("this list haven't a element");
        }
    }

    public datas searchNext(int value) {
        if (checkFirstData()) {
            System.out.println("this list haven't a element");
            return null;
        } else {
            datas temps = first;
            while (temps.getData() != value && temps.getNext() != null) {
                temps = temps.getNext();
            }
            if (temps.getData() == value)
                return temps;
            else
                System.out.println("this list haven't '" + value + "' element");
            return null;
        }
    }

    public void insert(datas data, int value) {
        if (searchNext(value) == null) {

        } else {
            data.setNext(searchNext(value).getNext());
            searchNext(value).setNext(data);
        }
    }

    public void delete() {
        list();
        int indis;
        datas temps = first;

        Scanner scan = new Scanner(System.in);
        System.out.print("pls u enter deleted value's indis: ");
        indis = scan.nextInt();
        for (int i = 1; i < indis - 1; i++) {
            temps = temps.getNext();
        }
        if (temps == null) {
            System.out.println("this data is not in array");
        } else {
            temps.setNext(temps.getNext().getNext());
        }

    }
}
