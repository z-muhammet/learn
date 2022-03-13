public class node {
    private node back;
    private node next;
    private int _data;

    public node getBack() {
        return back;
    }

    public void setBack(node back) {
        this.back = back;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }

    public int get_data() {
        return _data;
    }

    public void set_data(int _data) {
        this._data = _data;
    }

    public node() {
        back = null;
        next = null;
        _data = 0;
    }

    public node(int data) {
        back = null;
        next = null;
        _data = data;
    }
}
