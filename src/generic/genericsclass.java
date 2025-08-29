package generic;

public class genericsclass {
    public static void main(String[] args) {
        GenericClass g = new GenericClass(10);
        GenericClass g1 = new GenericClass("Pramod");
        GenericClass g2= new GenericClass(true);
        GenericClass g3 = new GenericClass(3.14);

        // T -> it is placeholder only -> it can be any data type.
        System.out.println(g.getData());
    }
}


class GenericClass<T>{
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
