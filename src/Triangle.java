public class Triangle {

    private String type;
    private int height;

    public Triangle(String _type) {
        //only takes type
        this.type = _type;
    }

    public Triangle(int height) {
        //only takes height
        this.height = height;
    }

    public Triangle(String _type, int _height) {
        //takes both type and height
        this.type = _type;
        this.height = _height;
    }

    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }

    //commenter out to prove the constructor arg does not use setType
    //constructor arg tag in spring.xml only uses getter methods
    //public void setType(String type) {
    //    this.type = type;
    //}

    public void draw() {
        System.out.println(getType() + " " + "Triangle Drawn" + " " + "of height: " + getHeight());
    }
}
