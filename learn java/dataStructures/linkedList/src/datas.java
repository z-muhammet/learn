public class datas {
    private int data;
    private datas next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(datas next) {
        this.next = next;
    }

    public datas getNext() {
        return this.next;
    }

    public datas() {
        this.setData(0);
        this.setNext(null);

    }

    public datas(int value) {
        this.setData(value);
        this.setNext(null);
    }
}
