interface Readable {
    void read();
}
interface Writable {
    void write();
}
interface Storable{
    void store();
}
class File implements Readable,Writable,Storable{
    public void read(){
        System.err.println("read");
    }
    public void write(){
        System.err.println("write");
    }
    public void store(){
        System.err.println("store");
    }
}
class Q33 {
    public static void main(String[] args) {
        File obj = new File();
        obj.read();
        obj.store();
        obj.write();
    }
}